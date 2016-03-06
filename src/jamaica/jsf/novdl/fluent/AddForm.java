package jamaica.jsf.novdl.fluent;

import javax.faces.component.UIComponent;
import javax.faces.component.UIForm;
import javax.faces.component.html.HtmlForm;

public class AddForm extends HtmlForm {

    public AddForm id(String id) {
        setId(id);
        return this;
    }

    public AddForm add(UIComponent component) {
        getChildren().add(component);
        return this;
    }
}
