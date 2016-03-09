package jamaica.faces.component;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUIParameter<T extends FluentUIParameter> extends 
            FluentUIComponent<T> {

    public FacesContext getFacesContext();

    public void setDisable(boolean disable);
    public default T disable(boolean disable) {
        setDisable(disable); return (T) this;
    }
    public default T disablex(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "disable", expression); return (T) this;
    }

    public void setName(String name);
    public default T name(String name) {
        setName(name); return (T) this;
    }
    public default T namex(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "name", expression); return (T) this;
    }

    public void setValue(Object value);
    public default T value(Object value) {
        setValue(value); return (T) this;
    }
    public default T valuex(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "value", expression); return (T) this;
    }
}
