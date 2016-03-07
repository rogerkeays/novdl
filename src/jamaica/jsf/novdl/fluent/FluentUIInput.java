package jamaica.jsf.novdl.fluent;

import javax.faces.component.UIComponent;


/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUIInput<T extends FluentUIInput> extends 
            FluentUIOutput<T>, FluentEditableValueHolder<T> {

    public void setConverterMessage(String message);
    public default T converterMessage(String message) {
        setConverterMessage(message); return (T) this;
    }

    public void setRequiredMessage(String message);
    public default T requredMessage(String message) {
        setRequiredMessage(message); return (T) this;
    }

    public void setValidatorMessage(String message);
    public default T validatorMessage(String message) {
        setValidatorMessage(message); return (T) this;
    }
}
