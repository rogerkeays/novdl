package jamaica.faces.component;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUIViewParameter<T extends FluentUIViewParameter> extends 
            FluentUIInput<T> {

    public void setName(String name);
    public default T name(String name) {
        setName(name); return (T) this;
    }
}
