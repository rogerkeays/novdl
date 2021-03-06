package jamaica.faces.component;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.component.EditableValueHolder;
import javax.faces.event.ValueChangeListener;
import javax.faces.validator.Validator;


/**
 * This interface adds fluent methods on top of the standard 
 * methods.
 */
public interface FluentEditableValueHolder<T extends FluentEditableValueHolder> 
        extends EditableValueHolder {

    public default T validator(Validator validator) {
        addValidator(validator); return (T) this;
    }

    public default T valueChangeListener(ValueChangeListener listener) {
        addValueChangeListener(listener); return (T) this;
    }

    public default T immediate(boolean immediate) {
        setImmediate(immediate); return (T) this;
    }
    public default T immediatex(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "immediate", expression); return (T) this;
    }

    public default T required(boolean required) {
        setRequired(required); return (T) this;
    }
    public default T requiredx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "required", expression); return (T) this;
    }
}
