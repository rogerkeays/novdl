package jamaica.faces.novdl;

import java.util.Iterator;
import static javax.faces.application.StateManager.IS_BUILDING_INITIAL_STATE;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import com.sun.faces.context.StateContext;

public class mark_initial_state {

    /**
     * Mark the initial state of the component tree. This is used later for
     * partial state saving optimisations.
     */
    public static void mark_initial_state(FacesContext faces, UIViewRoot root) {
        StateContext state = StateContext.getStateContext(faces);
        if (state.isPartialStateSaving(faces, root.getViewId())) {
            try {
                faces.getAttributes().put(IS_BUILDING_INITIAL_STATE, true);
                if (!root.isTransient()) {
                    mark_initial_state_recursively(root);
                }
            } finally {
                faces.getAttributes().remove(IS_BUILDING_INITIAL_STATE);
            }
        }
    }
    private static void mark_initial_state_recursively(final UIComponent component) {
        component.markInitialState();
        for (Iterator<UIComponent> children = component.getFacetsAndChildren(); children.hasNext();) {
            UIComponent child = children.next();
            if (!child.isTransient()) {
                mark_initial_state_recursively(child);
            }
        }
    }   
}
