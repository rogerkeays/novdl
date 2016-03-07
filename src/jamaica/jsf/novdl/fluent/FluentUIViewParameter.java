package jamaica.jsf.novdl.fluent;


/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUIViewParameter<T extends FluentUIViewParameter> extends 
            FluentUIInput<T> {

    public void setName(String name);
    public default T name(String name) {
        setName(name); return (T) this;
    }
}
