package jamaica.faces.component;


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
