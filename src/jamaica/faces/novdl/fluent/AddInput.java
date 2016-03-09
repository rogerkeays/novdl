package jamaica.faces.novdl.fluent;

import jamaica.faces.novdl.NoVDLUtil;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.convert.Converter;
import javax.faces.validator.Validator;

public class AddInput extends HtmlInputText {

    public AddInput() {}
    public AddInput(String value) {
        value(value);
    }

    public AddInput id(String id) {
        setId(id);
        return this;
    }

    public AddInput add(UIComponent component) {
        getChildren().add(component);
        return this;
    }

    public AddInput converter(Converter converter) {
        setConverter(converter);
        return this;
    }

    public final AddInput value(Object value) {
        if (!NoVDLUtil.setValueExpression(this, getFacesContext(), "value", value)) {
            setValue(value);
        }
        return this;
    }

    public AddInput validator(Validator validator) {
        addValidator(validator);
        return this;
    }

    public AddInput required(Boolean required) {
        setRequired(required);
        return this;
    }

    public AddInput size(int size) {
        setSize(size);
        return this;
    }

    public AddInput submittedValue(Object value) {
        setSubmittedValue(value);
        return this;
    }

    public AddInput label(String label) {
        setLabel(label);
        return this;
    }
}
