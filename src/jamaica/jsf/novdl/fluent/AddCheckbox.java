package jamaica.jsf.novdl.fluent;

import jamaica.jsf.novdl.NoVDLUtil;
import javax.faces.component.UIComponent;
import javax.faces.component.UISelectBoolean;
import javax.faces.convert.Converter;
import javax.faces.validator.Validator;

public class AddCheckbox extends UISelectBoolean {

    public AddCheckbox() {}
    public AddCheckbox(String value) {
        value(value);
    }

    public AddCheckbox id(String id) {
        setId(id);
        return this;
    }

    public AddCheckbox add(UIComponent component) {
        getChildren().add(component);
        return this;
    }

    public AddCheckbox converter(Converter converter) {
        setConverter(converter);
        return this;
    }

    public final AddCheckbox value(Object value) {
        if (!NoVDLUtil.setValueExpression(this, getFacesContext(), "value", value)) {
            setValue(value);
        }
        return this;
    }

    public AddCheckbox validator(Validator validator) {
        addValidator(validator);
        return this;
    }

    public AddCheckbox required(Boolean required) {
        setRequired(required);
        return this;
    }

    public AddCheckbox submittedValue(Object value) {
        setSubmittedValue(value);
        return this;
    }
}
