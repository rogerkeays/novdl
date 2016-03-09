package jamaica.faces.novdl.fluent;

import jamaica.faces.novdl.NoVDLUtil;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlCommandLink;
import javax.faces.event.ActionListener;

public class AddCommandLink extends HtmlCommandLink {

    public AddCommandLink() {}
    public AddCommandLink(Object value) {
        value(value);
    }

    public AddCommandLink id(String id) {
        setId(id);
        return this;
    }

    public AddCommandLink add(UIComponent component) {
        getChildren().add(component);
        return this;
    }

    public AddCommandLink actionListener(ActionListener action) {
        addActionListener(action);
        return this;
    }

    public AddCommandLink value(Object value) {
        if (!NoVDLUtil.setValueExpression(this, getFacesContext(), "value", value)) {
            setValue(value);
        }
        return this;
    }
}
