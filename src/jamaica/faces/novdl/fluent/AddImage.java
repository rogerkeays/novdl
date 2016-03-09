package jamaica.faces.novdl.fluent;

import jamaica.faces.novdl.NoVDLUtil;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlGraphicImage;

public class AddImage extends HtmlGraphicImage {

    public AddImage() {}
    public AddImage(Object value) {
        value(value);
    }

    public AddImage id(String id) {
        setId(id);
        return this;
    }

    public AddImage add(UIComponent component) {
        getChildren().add(component);
        return this;
    }

    public AddImage value(Object value) {
        if (!NoVDLUtil.setValueExpression(this, getFacesContext(), "value", value)) {
            setValue(value);
        }
        return this;
    }
}
