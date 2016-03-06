package jamaica.jsf.novdl.fluent;

import jamaica.jsf.novdl.NoVDLUtil;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlPanelGrid;

public class AddPanelGrid extends HtmlPanelGrid {

    public AddPanelGrid id(String id) {
        setId(id);
        return this;
    }

    public AddPanelGrid add(UIComponent component) {
        getChildren().add(component);
        return this;
    }
    public AddPanelGrid add(String text) {
        return add(new AddOutput(text));
    }

    public AddPanelGrid columnClasses(String columnClasses) {
        setColumnClasses(columnClasses);
        return this;
    }

    public AddPanelGrid columns(int columns) {
        setColumns(columns);
        return this;
    }

    public AddPanelGrid rendered(String rendered) {
        if (!NoVDLUtil.setValueExpression(this, getFacesContext(), "rendered", rendered)) {
          throw new IllegalArgumentException("Expected a value expression, got " + rendered);
        }
        return this;
    }

    public AddPanelGrid style(String style) {
        setStyle(style);
        return this;
    }
}
