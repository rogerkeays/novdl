package jamaica.jsf.novdl.fluent;

import jamaica.jsf.novdl.NoVDLUtil;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlColumn;

public class AddColumn extends HtmlColumn {

    public AddColumn id(String id) {
        setId(id);
        return this;
    }

    public AddColumn add(UIComponent component) {
        getChildren().add(component);
        return this;
    }

    public AddColumn footer(UIComponent footer) {
        setFooter(footer);
        return this;
    }

    public AddColumn header(UIComponent header) {
        setHeader(header);
        return this;
    }
}
