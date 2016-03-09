package jamaica.faces.component.html;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import jamaica.faces.component.FluentUIOutcomeTarget;

public interface FluentHtmlOutcomeTargetLink<T extends FluentHtmlOutcomeTargetLink>
            extends FluentUIOutcomeTarget<T> {

    public void setAccesskey(String accesskey);
    public default T accesskey(String accesskey) {
        setAccesskey(accesskey); return (T) this;
    }
    public default T accesskeyx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "accesskey", expression); return (T) this;
    }

    public void setCharset(String charset);
    public default T charset(String charset) {
        setCharset(charset); return (T) this;
    }
    public default T charsetx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "charset", expression); return (T) this;
    }

    public void setCoords(String coords);
    public default T coords(String coords) {
        setCoords(coords); return (T) this;
    }
    public default T coordsx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "coords", expression); return (T) this;
    }

    public void setDir(String dir);
    public default T dir(String dir) {
        setDir(dir); return (T) this;
    }
    public default T dirx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "dir", expression); return (T) this;
    }

    public void setDisabled(boolean disabled);
    public default T disabled(boolean disabled) {
        setDisabled(disabled); return (T) this;
    }
    public default T disabledx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "disabled", expression); return (T) this;
    }

    public void setHreflang(String hreflang);
    public default T hreflang(String hreflang) {
        setHreflang(hreflang); return (T) this;
    }
    public default T hreflangx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "hreflang", expression); return (T) this;
    }

    public void setLang(String lang);
    public default T lang(String lang) {
        setLang(lang); return (T) this;
    }
    public default T langx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "lang", expression); return (T) this;
    }

    public void setOnblur(String onblur);
    public default T onblur(String onblur) {
        setOnblur(onblur); return (T) this;
    }
    public default T onblurx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "onblur", expression); return (T) this;
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

    public void setOnfocus(String onfocus);
    public default T onfocus(String onfocus) {
        setOnfocus(onfocus); return (T) this;
    }
    public default T onfocusx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "onfocus", expression); return (T) this;
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

    public void setRel(String rel);
    public default T rel(String rel) {
        setRel(rel); return (T) this;
    }
    public default T relx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "rel", expression); return (T) this;
    }

    public void setRev(String rev);
    public default T rev(String rev) {
        setRev(rev); return (T) this;
    }
    public default T revx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "rev", expression); return (T) this;
    }

    public void setRole(String role);
    public default T role(String role) {
        setRole(role); return (T) this;
    }
    public default T rolex(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "role", expression); return (T) this;
    }

    public void setShape(String shape);
    public default T shape(String shape) {
        setShape(shape); return (T) this;
    }
    public default T shapex(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "shape", expression); return (T) this;
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

    public void setTabindex(String tabindex);
    public default T tabindex(String tabindex) {
        setTabindex(tabindex); return (T) this;
    }
    public default T tabindexx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "tabindex", expression); return (T) this;
    }

    public void setTarget(String target);
    public default T target(String target) {
        setTarget(target); return (T) this;
    }
    public default T targetx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "target", expression); return (T) this;
    }

    public void setTitle(String title);
    public default T title(String title) {
        setTitle(title); return (T) this;
    }
    public default T titlex(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "title", expression); return (T) this;
    }

    public void setType(String type);
    public default T type(String type) {
        setType(type); return (T) this;
    }
    public default T typex(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "type", expression); return (T) this;
    }
}

