package jamaica.faces.component;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUISelectMany<T extends FluentUISelectMany> extends 
            FluentUIInput<T> {

    public void setSelectedValues(Object[] selectedValues);
    public default T selectedValues(Object[] selectedValues) {
        setSelectedValues(selectedValues); return (T) this;
    }
}
