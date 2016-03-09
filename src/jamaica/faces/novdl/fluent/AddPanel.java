package jamaica.faces.novdl.fluent;

import jamaica.faces.novdl.NoVDLUtil;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlPanelGroup;

public class AddPanel extends HtmlPanelGroup {

    public AddPanel id(String id) {
        setId(id);
        return this;
    }

    public AddPanel add(UIComponent component) {
        getChildren().add(component);
        return this;
    }
    public AddPanel add(String string) {
        return add(new AddOutput(string));
    }

    public AddPanel layout(String layout) {
        setLayout(layout);
        return this;
    }

    public AddPanel rendered(String rendered) {
        if (!NoVDLUtil.setValueExpression(this, getFacesContext(), "rendered", rendered)) {
          throw new IllegalArgumentException("Expected a value expression, got " + rendered);
        }
        return this;
    }

    public AddPanel style(String style) {
        setStyle(style);
        return this;
    }
}
