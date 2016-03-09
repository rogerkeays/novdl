package jamaica.faces.novdl.fluent;

import jamaica.faces.novdl.NoVDLUtil;
import static jamaica.faces.component.html.FluentHtmlColumn.h_column;
import javax.faces.component.UIColumn;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlDataTable;

public class AddTable extends HtmlDataTable {

    public AddTable() {}
    public AddTable(Object value) {
        value(value);
    }

    public AddTable id(String id) {
        setId(id);
        return this;
    }

    public AddTable add(UIComponent component) {
        if (!(component instanceof UIColumn)) {
            component = h_column().add(component);
        }
        getChildren().add(component);
        return this;
    }
    public AddTable add(String string) {
        return add(new AddOutput(string));
    }

    public AddTable columnClasses(String columnClasses) {
        setColumnClasses(columnClasses);
        return this;
    }

    public AddTable value(Object value) {
        if (!NoVDLUtil.setValueExpression(this, getFacesContext(), "value", value)) {
            setValue(value);
        }
        return this;
    }

    public AddTable var(String var) {
        setVar(var);
        return this;
    }

    public AddTable width(String width) {
        setWidth(width);
        return this;
    }
}
