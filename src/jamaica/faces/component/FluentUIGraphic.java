package jamaica.faces.component;

import javax.el.ValueExpression;
import javax.faces.model.DataModel;
import javax.faces.component.UIComponent;


/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUIGraphic<T extends FluentUIGraphic> 
            extends FluentUIComponent<T> {

    public void setValue(Object value);
    public default T value(Object value) { 
        setValue(value); return (T) this; 
    }
}
