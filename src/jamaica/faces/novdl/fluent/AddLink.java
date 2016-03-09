package jamaica.faces.novdl.fluent;

import jamaica.faces.novdl.NoVDLUtil;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlOutputLink;

public class AddLink extends HtmlOutputLink {

    public AddLink() {}
    public AddLink(Object value) {
        value(value);
    }

    public AddLink id(String id) {
        setId(id);
        return this;
    }

    public AddLink add(UIComponent component) {
        getChildren().add(component);
        return this;
    }

    public AddLink disabled(Boolean disabled) {
        setDisabled(disabled);
        return this;
    }

    public AddLink value(Object value) {
        if (!NoVDLUtil.setValueExpression(this, getFacesContext(), "value", value)) {
            setValue(value);
        }
        return this;
    }

    public AddLink rendered(String rendered) {
        if (!NoVDLUtil.setValueExpression(this, getFacesContext(), "rendered", rendered)) {
          throw new IllegalArgumentException("Expected a value expression, got " + rendered);
        }
        return this;
    }

    public AddLink style(String style) {
        setStyle(style);
        return this;
    }

    public AddLink rendered(Boolean rendered) {
        setRendered(rendered);
        return this;
    }
}
