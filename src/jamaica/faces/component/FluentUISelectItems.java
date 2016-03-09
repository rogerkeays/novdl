package jamaica.faces.component;


/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUISelectItems<T extends FluentUISelectItems> extends 
            FluentUIInput<T> {

    public void setValue(Object value);
    public default T value(Object value) {
        setValue(value); return (T) this;
    }
}
