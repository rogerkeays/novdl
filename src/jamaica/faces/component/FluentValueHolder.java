package jamaica.faces.component;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.component.ValueHolder;
import javax.faces.convert.Converter;


/**
 * This interface adds fluent methods on top of the standard
 * methods.
 */
public interface FluentValueHolder<T extends FluentValueHolder> 
        extends ValueHolder {

    public FacesContext getFacesContext();

    public default T converter(Converter converter) {
        setConverter(converter); return (T) this;
    }

    public default T value(Object value) {
        setValue(value); return (T) this;
    }
    public default T valuex(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "value", expression); return (T) this;
    }
}
