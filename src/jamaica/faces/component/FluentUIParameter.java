package jamaica.faces.component;


/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUIParameter<T extends FluentUIParameter> extends 
            FluentUIComponent<T> {

    public void setDisable(boolean disable);
    public default T disable(boolean disable) {
        setDisable(disable); return (T) this;
    }

    public void setName(String name);
    public default T name(String name) {
        setName(name); return (T) this;
    }

    public void setValue(Object value);
    public default T value(Object value) {
        setValue(value); return (T) this;
    }
}
