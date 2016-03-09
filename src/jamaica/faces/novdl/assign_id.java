package jamaica.faces.novdl;

import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.component.UniqueIdVendor;
import static javax.faces.component.visit.VisitContext.createVisitContext;
import static javax.faces.component.visit.VisitResult.ACCEPT;

class assign_id {

    /**
     * Assigns a unique id to the given component. Use assign_id_recursively to
     * process the subtree also.
     */
    static void assign_id(FacesContext faces, UIComponent component) {
        if (component.getId() == null) {
            UIComponent container = component.getParent().getNamingContainer();
            if (container instanceof UniqueIdVendor) {
                component.setId(((UniqueIdVendor) container)
                        .createUniqueId(faces, null));
            } else {
                component.setId(faces.getViewRoot()
                        .createUniqueId(faces, null));
            }
        }
    }
    static void assign_id_recursively(FacesContext faces, UIComponent root) {
        root.visitTree(createVisitContext(faces), (visit, target) -> {
            assign_id(faces, target);
            return ACCEPT;
        });
    }
} 
