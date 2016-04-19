package jamaica.faces.novdl;

import static jamaica.faces.novdl.assign_id.assign_id_recursively;
import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.view.facelets.ComponentHandler;
import javax.faces.view.facelets.FaceletContext;
import javax.faces.view.facelets.TagAttribute;
import javax.faces.view.facelets.TagConfig;
import javax.faces.view.facelets.TagHandler;


/**
 * This tag adds the given component to the tree. It musy only be executed 
 * from the attach.xhtml facelet tag, because adding components to the tree
 * is more complicated than you think. See http://grepcode.com/file/repo1.maven.org/maven2/com.sun.faces/jsf-impl/2.2.0/com/sun/faces/facelets/tag/jsf/ComponentTagHandlerDelegateImpl.java?av=f

 * 
 * To add a composite component to your view, use the following tag, which
 * wraps and calls this one:
 *
 *   <n:attach component="${expression}"/>
 * 
 */
public class CompositeTag extends TagHandler {
    private final TagAttribute component;
    
    public CompositeTag(TagConfig config) {
        super(config);
        this.component = this.getRequiredAttribute("component");
    }

    // see ComponentTagHandlerDelegateImpl for algorithm to add a component to the tree
    // http://grepcode.com/file/repo1.maven.org/maven2/com.sun.faces/jsf-impl/2.2.0/com/sun/faces/facelets/tag/jsf/ComponentTagHandlerDelegateImpl.java?av=f
    @Override
    public void apply(FaceletContext facelets, UIComponent parent) throws IOException {
        if (ComponentHandler.isNew(parent)) {
            UIComponent c = (UIComponent) component.getObject(facelets);
            parent.getChildren().add(c);
            assign_id_recursively(facelets.getFacesContext(), c);
        }
        nextHandler.apply(facelets, parent);
    }
}
