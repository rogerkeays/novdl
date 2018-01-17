package jamaica.faces.component;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;


/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUIInput<T extends FluentUIInput> extends 
            FluentUIOutput<T>, FluentEditableValueHolder<T> {

    public void setConverterMessage(String message);
    public default T converterMessage(String message) {
        setConverterMessage(message); return (T) this;
    }
    public default T converterMessagex(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "converterMessage", expression); return (T) this;
    }

    public void setRequiredMessage(String message);
    public default T requiredMessage(String message) {
        setRequiredMessage(message); return (T) this;
    }
    public default T requiredMessagex(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "requiredMessage", expression); return (T) this;
    }

    public void setValidatorMessage(String message);
    public default T validatorMessage(String message) {
        setValidatorMessage(message); return (T) this;
    }
    public default T validatorMessagex(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "validatorMessage", expression); return (T) this;
    }
}
