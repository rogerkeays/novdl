package jamaica.faces.component;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.component.StateHolder;


/**
 * This interface adds fluent methods on top of the standard
 * methods.
 */
public interface FluentStateHolder<T extends FluentStateHolder> 
        extends StateHolder {

    public FacesContext getFacesContext();

    public default T transient0(boolean transient0) {
        setTransient(transient0); return (T) this;
    }
    public default T transientx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "transient", expression); return (T) this;
    }
}
