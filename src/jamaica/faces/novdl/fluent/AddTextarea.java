package jamaica.faces.novdl.fluent;

import jamaica.faces.novdl.NoVDLUtil;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlInputText;
import javax.faces.component.html.HtmlInputTextarea;
import javax.faces.convert.Converter;
import javax.faces.validator.Validator;

public class AddTextarea extends HtmlInputTextarea {

    public AddTextarea() {}
    public AddTextarea(String value) {
        value(value);
    }

    public AddTextarea id(String id) {
        setId(id);
        return this;
    }

    public AddTextarea add(UIComponent component) {
        getChildren().add(component);
        return this;
    }

    public AddTextarea converter(Converter converter) {
        setConverter(converter);
        return this;
    }

    public final AddTextarea value(Object value) {
        if (!NoVDLUtil.setValueExpression(this, getFacesContext(), "value", value)) {
            setValue(value);
        }
        return this;
    }

    public AddTextarea validator(Validator validator) {
        addValidator(validator);
        return this;
    }

    public AddTextarea required(Boolean required) {
        setRequired(required);
        return this;
    }

    public AddTextarea cols(int size) {
        setCols(size);
        return this;
    }

    public AddTextarea rows(int size) {
        setRows(size);
        return this;
    }

    public AddTextarea submittedValue(Object value) {
        setSubmittedValue(value);
        return this;
    }

    public AddTextarea label(String label) {
        setLabel(label);
        return this;
    }
}
