package jamaica.jsf.novdl.fluent;

import javax.faces.component.ValueHolder;
import javax.faces.convert.Converter;


/**
 * This interface adds fluent methods on top of the standard
 * methods.
 */
public interface FluentValueHolder<T extends FluentValueHolder> 
        extends ValueHolder {

    public default T converter(Converter converter) {
        setConverter(converter); return (T) this;
    }

    public default T value(Object value) {
        setValue(value); return (T) this;
    }
}
