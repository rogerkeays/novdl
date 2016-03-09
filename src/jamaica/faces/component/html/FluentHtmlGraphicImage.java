package jamaica.faces.component.html;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import jamaica.faces.component.FluentUIGraphic;

public interface FluentHtmlGraphicImage<T extends FluentHtmlGraphicImage>
            extends FluentUIGraphic<T> {

    public void setAlt(String alt);
    public default T alt(String alt) {
        setAlt(alt); return (T) this;
    }
    public default T altx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "alt", expression); return (T) this;
    }

    public void setDir(String dir);
    public default T dir(String dir) {
        setDir(dir); return (T) this;
    }
    public default T dirx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "dir", expression); return (T) this;
    }

    public void setHeight(String height);
    public default T height(String height) {
        setHeight(height); return (T) this;
    }
    public default T heightx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "height", expression); return (T) this;
    }

    public void setIsmap(boolean ismap);
    public default T ismap(boolean ismap) {
        setIsmap(ismap); return (T) this;
    }
    public default T ismapx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "ismap", expression); return (T) this;
    }

    public void setLang(String lang);
    public default T lang(String lang) {
        setLang(lang); return (T) this;
    }
    public default T langx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "lang", expression); return (T) this;
    }

    public void setLongdesc(String longdesc);
    public default T longdesc(String longdesc) {
        setLongdesc(longdesc); return (T) this;
    }
    public default T longdescx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "longdesc", expression); return (T) this;
    }

    public void setOnclick(String onclick);
    public default T onclick(String onclick) {
        setOnclick(onclick); return (T) this;
    }
    public default T onclickx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "onclick", expression); return (T) this;
    }

    public void setOndblclick(String ondblclick);
    public default T ondblclick(String ondblclick) {
        setOndblclick(ondblclick); return (T) this;
    }
    public default T ondblclickx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "ondblclick", expression); return (T) this;
    }

    public void setOnkeydown(String onkeydown);
    public default T onkeydown(String onkeydown) {
        setOnkeydown(onkeydown); return (T) this;
    }
    public default T onkeydownx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "onkeydown", expression); return (T) this;
    }

    public void setOnkeypress(String onkeypress);
    public default T onkeypress(String onkeypress) {
        setOnkeypress(onkeypress); return (T) this;
    }
    public default T onkeypressx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "onkeypress", expression); return (T) this;
    }

    public void setOnkeyup(String onkeyup);
    public default T onkeyup(String onkeyup) {
        setOnkeyup(onkeyup); return (T) this;
    }
    public default T onkeyupx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "onkeyup", expression); return (T) this;
    }

    public void setOnmousedown(String onmousedown);
    public default T onmousedown(String onmousedown) {
        setOnmousedown(onmousedown); return (T) this;
    }
    public default T onmousedownx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "onmousedown", expression); return (T) this;
    }

    public void setOnmousemove(String onmousemove);
    public default T onmousemove(String onmousemove) {
        setOnmousemove(onmousemove); return (T) this;
    }
    public default T onmousemovex(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "onmousemove", expression); return (T) this;
    }

    public void setOnmouseout(String onmouseout);
    public default T onmouseout(String onmouseout) {
        setOnmouseout(onmouseout); return (T) this;
    }
    public default T onmouseoutx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "onmouseout", expression); return (T) this;
    }

    public void setOnmouseover(String onmouseover);
    public default T onmouseover(String onmouseover) {
        setOnmouseover(onmouseover); return (T) this;
    }
    public default T onmouseoverx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "onmouseover", expression); return (T) this;
    }

    public void setOnmouseup(String onmouseup);
    public default T onmouseup(String onmouseup) {
        setOnmouseup(onmouseup); return (T) this;
    }
    public default T onmouseupx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "onmouseup", expression); return (T) this;
    }

    public void setRole(String role);
    public default T role(String role) {
        setRole(role); return (T) this;
    }
    public default T rolex(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "role", expression); return (T) this;
    }

    public void setStyle(String style);
    public default T style(String style) {
        setStyle(style); return (T) this;
    }
    public default T stylex(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "style", expression); return (T) this;
    }

    public void setStyleClass(String styleClass);
    public default T styleClass(String styleClass) {
        setStyleClass(styleClass); return (T) this;
    }
    public default T styleClassx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "styleClass", expression); return (T) this;
    }

    public void setTitle(String title);
    public default T title(String title) {
        setTitle(title); return (T) this;
    }
    public default T titlex(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "title", expression); return (T) this;
    }

    public void setUsemap(String usemap);
    public default T usemap(String usemap) {
        setUsemap(usemap); return (T) this;
    }
    public default T usemapx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "usemap", expression); return (T) this;
    }

    public void setWidth(String width);
    public default T width(String width) {
        setWidth(width); return (T) this;
    }
    public default T widthx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "width", expression); return (T) this;
    }
}

