package jamaica.jsf.novdl.fluent;

import jamaica.jsf.novdl.NoVDLUtil;
import javax.faces.component.UIComponent;
import javax.faces.component.UIOutput;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.convert.Converter;

public class AddText extends HtmlOutputText {

    public AddText() {
        setEscape(true);
    }
    public AddText(Object value) {
        this();
        value(value);
    }

    public AddText id(String id) {
        setId(id);
        return this;
    }

    public AddText add(UIComponent component) {
        getChildren().add(component);
        return this;
    }

    public AddText converter(Converter converter) {
        setConverter(converter);
        return this;
    }

    public AddText value(Object value) {
        if (!NoVDLUtil.setValueExpression(this, getFacesContext(), "value", value)) {
            setValue(value);
        }
        return this;
    }

    public AddText style(String style) {
        setStyle(style);
        return this;
    }
}
