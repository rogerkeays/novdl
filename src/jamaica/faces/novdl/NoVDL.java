package jamaica.faces.novdl;

import com.sun.faces.application.ApplicationAssociate;
import com.sun.faces.context.StateContext;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.PostAddToViewEvent;
import javax.faces.view.ViewDeclarationLanguage;
import javax.faces.view.ViewMetadata;
import java.io.IOException;
import java.util.Map;
import javax.faces.component.UIComponent;

import static java.lang.Boolean.TRUE;
import static javax.faces.application.StateManager.IS_BUILDING_INITIAL_STATE;
import javax.faces.context.ExternalContext;

public class NoVDL extends ViewDeclarationLanguageWrapper {

    @Override
    public void buildView(FacesContext faces, UIViewRoot root) throws IOException {
        if (!hasJavaImplementation(root.getViewId())) {
            super.buildView(faces, root);
            return;
        }

        /*
        if (contextAttributes.containsKey(root)) {
            StateContext stateCtx = StateContext.getStateContext(context);
            // Disable events from being intercepted by the StateContext by
            // virtue of re-applying the handlers. 
            try {
                stateCtx.setTrackViewModifications(false);
                // testBuild(context, root);
            } finally {
                stateCtx.setTrackViewModifications(true);
            }
            return;
        }
        root.setViewId(root.getViewId());
        */

        // Populate UIViewRoot
        Map<Object, Object> attributes = faces.getAttributes();
        attributes.put(IS_BUILDING_INITIAL_STATE, TRUE);
        try {
            Activity activity = (Activity) Class.forName(
                    getClassName(root.getViewId())).newInstance();
            faces.getExternalContext().getRequestMap().put("activity", activity);
            activity.init(faces);
            if (faces.getResponseComplete()) {
                return;
            }
            activity.buildView(faces, root);
            NoVDLUtil.assignIDRecursively(faces, root);
            StateContext.getStateContext(faces).startTrackViewModifications(faces, root);                    
        } catch (Exception e) {
            throw new IOException(e);
        } finally {
            attributes.remove(IS_BUILDING_INITIAL_STATE);
        }
        faces.getApplication().publishEvent(faces, PostAddToViewEvent.class, UIViewRoot.class, root);
        NoVDLUtil.markInitialStateRecursively(faces, root);
        attributes.put(root, TRUE);
    }


    @Override
    public ViewMetadata getViewMetadata(FacesContext faces, String viewID) {
        if (hasJavaImplementation(viewID)) {
            return new ViewMetadataImpl(viewID);
        }
        return super.getViewMetadata(faces, viewID);
    }


    @Override
    public boolean viewExists(FacesContext faces, String viewID) {
        if (hasJavaImplementation(viewID)) {
            return true;
        } else {
            return super.viewExists(faces, viewID);
        }
    }


    /**
     * Check if the given view ID has a java implementation of the View 
     * interface.
     */
    private boolean hasJavaImplementation(String viewID) {
        try {
            return Activity.class.isAssignableFrom(
                    Class.forName(getClassName(viewID)));
        } catch (ClassNotFoundException e) {
            return false; 
        }
    }


    /**
     * Convert a viewID to a class name. This method presumes you are using
     * some sort of suffix-mapping, without actually caring what suffix you
     * use. The class name is the derived from the uri after the first /.
     */
    public static String getClassName(String viewID) {
        String className = viewID;
        if (className.startsWith("/")) {
            className = className.substring(1);
        }
        className = className.replace('/', '.');
        return className.substring(0, className.lastIndexOf('.'));
    }


    /**
     * Execute a facelets template, applying the template to the given
     * component.
     */
    public static void applyFacelet(FacesContext faces, UIComponent component,
            String template) throws IOException {
        ApplicationAssociate.getInstance(faces.getExternalContext())
                .getFaceletFactory().getFacelet(faces, template)
                .apply(faces, component);
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
