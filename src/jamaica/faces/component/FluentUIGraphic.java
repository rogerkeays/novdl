package jamaica.faces.component;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.faces.model.DataModel;


/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUIGraphic<T extends FluentUIGraphic> 
            extends FluentUIComponent<T> {

    public FacesContext getFacesContext();

    public void setValue(Object value);
    public default T value(Object value) { 
        setValue(value); return (T) this; 
    }
    public default T valuex(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "value", expression); return (T) this;
    }
}
