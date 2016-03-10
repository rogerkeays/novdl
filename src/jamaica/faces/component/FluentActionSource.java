package jamaica.faces.component;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.component.ActionSource;
import javax.faces.event.ActionListener;


/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentActionSource<T extends FluentActionSource> 
            extends ActionSource {

    public default T actionListener(ActionListener listener) { 
        addActionListener(listener); return (T) this; 
    }

    public default T immediate(boolean immediate) { 
        setImmediate(immediate); return (T) this; 
    }
    public default T immediatex(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "immediate", expression); return (T) this;
    }
}
