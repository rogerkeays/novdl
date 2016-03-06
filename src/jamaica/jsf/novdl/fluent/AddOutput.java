package jamaica.jsf.novdl.fluent;

import jamaica.jsf.novdl.NoVDLUtil;
import javax.faces.component.UIComponent;
import javax.faces.component.UIOutput;
import javax.faces.convert.Converter;

public class AddOutput extends UIOutput {

    public AddOutput() {}
    public AddOutput(Object value) {
        value(value);
    }

    public AddOutput id(String id) {
        setId(id);
        return this;
    }

    public AddOutput add(UIComponent component) {
        getChildren().add(component);
        return this;
    }

    public AddOutput converter(Converter converter) {
        setConverter(converter);
        return this;
    }

    public AddOutput value(Object value) {
        if (!NoVDLUtil.setValueExpression(this, getFacesContext(), "value", value)) {
            setValue(value);
        }
        return this;
    }
}
