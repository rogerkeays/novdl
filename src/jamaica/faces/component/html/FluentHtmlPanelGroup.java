package jamaica.faces.component.html;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import jamaica.faces.component.FluentUIPanel;

public interface FluentHtmlPanelGroup<T extends FluentHtmlPanelGroup>
            extends FluentUIPanel<T> {

    public void setLayout(String layout);
    public default T layout(String layout) {
        setLayout(layout); return (T) this;
    }

    public void setOnclick(String onclick);
    public default T onclick(String onclick) {
        setOnclick(onclick); return (T) this;
    }

    public void setOndblclick(String ondblclick);
    public default T ondblclick(String ondblclick) {
        setOndblclick(ondblclick); return (T) this;
    }

    public void setOnkeydown(String onkeydown);
    public default T onkeydown(String onkeydown) {
        setOnkeydown(onkeydown); return (T) this;
    }

    public void setOnkeypress(String onkeypress);
    public default T onkeypress(String onkeypress) {
        setOnkeypress(onkeypress); return (T) this;
    }

    public void setOnkeyup(String onkeyup);
    public default T onkeyup(String onkeyup) {
        setOnkeyup(onkeyup); return (T) this;
    }

    public void setOnmousedown(String onmousedown);
    public default T onmousedown(String onmousedown) {
        setOnmousedown(onmousedown); return (T) this;
    }

    public void setOnmousemove(String onmousemove);
    public default T onmousemove(String onmousemove) {
        setOnmousemove(onmousemove); return (T) this;
    }

    public void setOnmouseout(String onmouseout);
    public default T onmouseout(String onmouseout) {
        setOnmouseout(onmouseout); return (T) this;
    }

    public void setOnmouseover(String onmouseover);
    public default T onmouseover(String onmouseover) {
        setOnmouseover(onmouseover); return (T) this;
    }

    public void setOnmouseup(String onmouseup);
    public default T onmouseup(String onmouseup) {
        setOnmouseup(onmouseup); return (T) this;
    }

    public void setStyle(String style);
    public default T style(String style) {
        setStyle(style); return (T) this;
    }

    public void setStyleClass(String styleClass);
    public default T styleClass(String styleClass) {
        setStyleClass(styleClass); return (T) this;
    }
}

