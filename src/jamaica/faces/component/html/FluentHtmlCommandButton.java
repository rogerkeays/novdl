package jamaica.faces.component.html;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import jamaica.faces.component.FluentUICommand;

public interface FluentHtmlCommandButton<T extends FluentHtmlCommandButton>
            extends FluentUICommand<T> {

    public void setAccesskey(String accesskey);
    public default T accesskey(String accesskey) {
        setAccesskey(accesskey); return (T) this;
    }

    public void setAlt(String alt);
    public default T alt(String alt) {
        setAlt(alt); return (T) this;
    }

    public void setDir(String dir);
    public default T dir(String dir) {
        setDir(dir); return (T) this;
    }

    public void setDisabled(boolean disabled);
    public default T disabled(boolean disabled) {
        setDisabled(disabled); return (T) this;
    }

    public void setImage(String image);
    public default T image(String image) {
        setImage(image); return (T) this;
    }

    public void setLabel(String label);
    public default T label(String label) {
        setLabel(label); return (T) this;
    }

    public void setLang(String lang);
    public default T lang(String lang) {
        setLang(lang); return (T) this;
    }

    public void setOnblur(String onblur);
    public default T onblur(String onblur) {
        setOnblur(onblur); return (T) this;
    }

    public void setOnchange(String onchange);
    public default T onchange(String onchange) {
        setOnchange(onchange); return (T) this;
    }

    public void setOnclick(String onclick);
    public default T onclick(String onclick) {
        setOnclick(onclick); return (T) this;
    }

    public void setOndblclick(String ondblclick);
    public default T ondblclick(String ondblclick) {
        setOndblclick(ondblclick); return (T) this;
    }

    public void setOnfocus(String onfocus);
    public default T onfocus(String onfocus) {
        setOnfocus(onfocus); return (T) this;
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

    public void setOnselect(String onselect);
    public default T onselect(String onselect) {
        setOnselect(onselect); return (T) this;
    }

    public void setReadonly(boolean readonly);
    public default T readonly(boolean readonly) {
        setReadonly(readonly); return (T) this;
    }

    public void setRole(String role);
    public default T role(String role) {
        setRole(role); return (T) this;
    }

    public void setStyle(String style);
    public default T style(String style) {
        setStyle(style); return (T) this;
    }

    public void setStyleClass(String styleClass);
    public default T styleClass(String styleClass) {
        setStyleClass(styleClass); return (T) this;
    }

    public void setTabindex(String tabindex);
    public default T tabindex(String tabindex) {
        setTabindex(tabindex); return (T) this;
    }

    public void setTitle(String title);
    public default T title(String title) {
        setTitle(title); return (T) this;
    }

    public void setType(String type);
    public default T type(String type) {
        setType(type); return (T) this;
    }
}

