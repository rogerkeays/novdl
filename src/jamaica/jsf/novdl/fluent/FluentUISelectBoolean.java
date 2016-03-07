package jamaica.jsf.novdl.fluent;


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
