package jamaica.faces.component;

import javax.el.MethodExpression;
import javax.faces.component.UIComponent;
import javax.faces.event.ActionListener;


/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUICommand<T extends FluentUICommand> extends 
            FluentUIComponent<T>, FluentActionSource2<T> {

    public void setValue(Object value);
    public default T value(Object value) {
        setValue(value); return (T) this; 
    }
}
