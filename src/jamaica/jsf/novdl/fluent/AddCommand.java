package jamaica.jsf.novdl.fluent;

import jamaica.jsf.novdl.NoVDLUtil;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.event.ActionListener;

public class AddCommand extends HtmlCommandButton {

    public AddCommand() {}
    public AddCommand(Object value) {
        value(value);
    }

    public AddCommand id(String id) {
        setId(id);
        return this;
    }

    public AddCommand add(UIComponent component) {
        getChildren().add(component);
        return this;
    }

    public AddCommand actionListener(ActionListener action) {
        addActionListener(action);
        return this;
    }

    public AddCommand image(String image) {
        setImage(image);
        return this;
    }

    public AddCommand value(Object value) {
        if (!NoVDLUtil.setValueExpression(this, getFacesContext(), "value", value)) {
            setValue(value);
        }
        return this;
    }
}
