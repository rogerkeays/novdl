package jamaica.faces.component;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;


/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUISelectBoolean<T extends FluentUISelectBoolean> extends 
            FluentUIInput<T> {

    public void setSelected(boolean selected);
    public default T selected(boolean selected) {
        setSelected(selected); return (T) this;
    }
}
