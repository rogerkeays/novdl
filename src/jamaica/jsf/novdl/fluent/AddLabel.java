package jamaica.jsf.novdl.fluent;

import jamaica.jsf.novdl.NoVDLUtil;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlOutputLabel;
import javax.faces.convert.Converter;

public class AddLabel extends HtmlOutputLabel {

    public AddLabel() {}
    public AddLabel(Object value) {
        value(value);
    }

    public AddLabel id(String id) {
        setId(id);
        return this;
    }

    public AddLabel add(UIComponent component) {
        getChildren().add(component);
        return this;
    }

    public AddLabel converter(Converter converter) {
        setConverter(converter);
        return this;
    }

    public AddLabel for_(String for_) {
        setFor(for_);
        return this;
    }

    public AddLabel value(Object value) {
        if (!NoVDLUtil.setValueExpression(this, getFacesContext(), "value", value)) {
            setValue(value);
        }
        return this;
    }
}
