package jamaica.faces.novdl;

import javax.faces.component.UIComponent;
import javax.faces.view.facelets.FaceletContext;
import javax.faces.view.facelets.TagAttribute;
import javax.faces.view.facelets.TagConfig;
import javax.faces.view.facelets.TagHandler;


/**
 * This tag executes a method expression which creates a composite component.
 * The new component is then added to the view.
 */
public class CompositeTag extends TagHandler {
    private final TagAttribute method;
    
    public CompositeTag(TagConfig config) {
        super(config);
        this.method = this.getRequiredAttribute("method");
    }

    @Override
    public void apply(FaceletContext facelets, UIComponent parent) {

        // only process if the parent is new to the tree
        if (parent.getParent() == null) {
            parent.getChildren().add((UIComponent)
                    method.getMethodExpression(facelets, null, new Class[] {}).
                    invoke(facelets.getFacesContext().getELContext(), null));
        }
    }
}
