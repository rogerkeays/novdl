package jamaica.faces.novdl;

import static java.lang.Boolean.TRUE;
import static javax.faces.application.StateManager.IS_BUILDING_INITIAL_STATE;
import static javax.faces.component.visit.VisitContext.createVisitContext;
import static javax.faces.component.visit.VisitResult.ACCEPT;

import java.util.Iterator;

import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.component.UniqueIdVendor;
import javax.faces.component.visit.VisitCallback;
import javax.faces.component.visit.VisitContext;
import javax.faces.component.visit.VisitResult;
import javax.faces.context.FacesContext;

import com.sun.faces.context.StateContext;
import javax.el.ELContext;
import javax.el.ExpressionFactory;

public final class NoVDLUtil {
    
    public static void assignIDRecursively(final FacesContext context, UIComponent root) {
        root.visitTree(createVisitContext(context), new VisitCallback() {
            @Override
            public VisitResult visit(VisitContext visitContext, UIComponent target) {
                assignID(context, target);
                return ACCEPT;
            }
        });
    }
    
    private static void assignID(FacesContext context, UIComponent component) {
        
        if (component.getId() == null) {
            UIViewRoot root = context.getViewRoot();
            if (root != null) {
                
                UniqueIdVendor idVendor = root;
                
                UIComponent namingContainer = component.getParent().getNamingContainer();
                if (namingContainer instanceof UniqueIdVendor) {
                    idVendor = (UniqueIdVendor) namingContainer;
                }
                
                component.setId(idVendor.createUniqueId(context, null));
            }            
        }         
    }
    
    public static void markInitialStateRecursively(FacesContext context, UIViewRoot root) {
        StateContext stateCtx = StateContext.getStateContext(context);
        if (stateCtx.isPartialStateSaving(context, root.getViewId())) {
            try {
                context.getAttributes().put(IS_BUILDING_INITIAL_STATE, TRUE);
                if (!root.isTransient()) {
                    markInitialState(root);
                }
            } finally {
                context.getAttributes().remove(IS_BUILDING_INITIAL_STATE);
            }
        }
    }
    
    private static void markInitialState(final UIComponent component) {
        component.markInitialState();
        for (Iterator<UIComponent> children = component.getFacetsAndChildren(); children.hasNext();) {
            UIComponent child = children.next();
            if (!child.isTransient()) {
                markInitialState(child);
            }
        }
    } 
 

    /**
     * Determine if the given object is an EL expression. i.e. it is a String
     * starting with ${ or #{
     */
    public static boolean isEL(Object object) {
        return object instanceof String && (
                ((String) object).startsWith("${") || 
                ((String) object).contains("#{"));
    }


    /**
     * Try to set a value expression for a component property using the
     * given object and return true if this was successful.
     */
    public static boolean setValueExpression(UIComponent component, 
                FacesContext faces, String property, Object value) {
        if (!isEL(value)) {
            return false;
        } else {
            ELContext context = faces.getELContext();
            ExpressionFactory ex = faces.getApplication().getExpressionFactory();
            component.setValueExpression(property, 
                    ex.createValueExpression(context, (String) value, Object.class));
            return true;
        }
    }
}
