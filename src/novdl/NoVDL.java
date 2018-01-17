package jamaica.faces.novdl;

import com.sun.faces.context.StateContext;
import static jamaica.faces.novdl.assign_id.assign_id_recursively;
import static jamaica.faces.novdl.get_view_class_name.get_view_class_name;
import static jamaica.faces.novdl.has_java_implementation.has_java_implementation;
import static jamaica.faces.novdl.mark_initial_state.mark_initial_state;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.PostAddToViewEvent;
import javax.faces.view.ViewDeclarationLanguage;
import javax.faces.view.ViewMetadata;
import java.io.IOException;
import java.util.Map;
import static java.lang.Boolean.TRUE;
import static javax.faces.application.StateManager.IS_BUILDING_INITIAL_STATE;
import javax.faces.context.ExternalContext;


/**
 * NoVDL ViewDeclarationLanguage implementation. This implementation works by
 * handling views which are mapped to Java classes and passing the rest to the
 * parent (default) view declaration language.
 */
public class NoVDL extends ViewDeclarationLanguageWrapper {

    @Override
    public void buildView(FacesContext faces, UIViewRoot root) throws IOException {
        if (!has_java_implementation(root.getViewId())) {
            super.buildView(faces, root);
            return;
        }

        // build the view and handle events
        Map<Object, Object> attributes = faces.getAttributes();
        attributes.put(IS_BUILDING_INITIAL_STATE, TRUE);
        try {
            Activity activity = (Activity) Class.forName(
                    get_view_class_name(root.getViewId())).newInstance();
            faces.getExternalContext().getRequestMap().put("activity", activity);
            activity.init(faces);
            if (faces.getResponseComplete()) {
                return;
            }
            activity.buildView(faces, root);
            assign_id_recursively(faces, root);
            StateContext.getStateContext(faces).startTrackViewModifications(faces, root);                    
        } catch (Exception e) {
            throw new IOException(e);
        } finally {
            attributes.remove(IS_BUILDING_INITIAL_STATE);
        }
        faces.getApplication().publishEvent(faces, PostAddToViewEvent.class, 
                UIViewRoot.class, root);
        mark_initial_state(faces, root);
        attributes.put(root, TRUE);
    }


    @Override
    public ViewMetadata getViewMetadata(FacesContext faces, String view_id) {
        if (has_java_implementation(view_id)) {
            return new ViewMetadataImpl(view_id);
        }
        return super.getViewMetadata(faces, view_id);
    }


    @Override
    public boolean viewExists(FacesContext faces, String view_id) {
        if (has_java_implementation(view_id)) {
            return true;
        } else {
            return super.viewExists(faces, view_id);
        }
    }


    /**
     * Create a NoVDL implementation which falls back to the given parent
     * for views that don't have a Java implementation.
     */
    public NoVDL(ViewDeclarationLanguage parent) {
       this.parent = parent;
    }
    @Override
    public ViewDeclarationLanguage getWrapped() {
      return parent;
    }
    ViewDeclarationLanguage parent;
}
