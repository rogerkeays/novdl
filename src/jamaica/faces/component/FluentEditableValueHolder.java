
package jamaica.faces.component;

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

    public default T localValueSet(boolean localValueSet) {
        setLocalValueSet(localValueSet); return (T) this;
    }

    public default T required(boolean required) {
        setRequired(required); return (T) this;
    }

    public default T submittedValue(Object submittedValue) {
        setSubmittedValue(submittedValue); return (T) this;
    }

    public default T valid(boolean valid) {
        setValid(valid); return (T) this;
    }
}
