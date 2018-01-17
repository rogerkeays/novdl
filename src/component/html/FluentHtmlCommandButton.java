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
    public default T accesskeyx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "accesskey", expression); return (T) this;
    }

    public void setAlt(String alt);
    public default T alt(String alt) {
        setAlt(alt); return (T) this;
    }
    public default T altx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "alt", expression); return (T) this;
    }

    public void setDir(String dir);
    public default T dir(String dir) {
        setDir(dir); return (T) this;
    }
    public default T dirx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "dir", expression); return (T) this;
    }

    public void setDisabled(boolean disabled);
    public default T disabled(boolean disabled) {
        setDisabled(disabled); return (T) this;
    }
    public default T disabledx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "disabled", expression); return (T) this;
    }

    public void setImage(String image);
    public default T image(String image) {
        setImage(image); return (T) this;
    }
    public default T imagex(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "image", expression); return (T) this;
    }

    public void setLabel(String label);
    public default T label(String label) {
        setLabel(label); return (T) this;
    }
    public default T labelx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "label", expression); return (T) this;
    }

    public void setLang(String lang);
    public default T lang(String lang) {
        setLang(lang); return (T) this;
    }
    public default T langx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "lang", expression); return (T) this;
    }

    public void setOnblur(String onblur);
    public default T onblur(String onblur) {
        setOnblur(onblur); return (T) this;
    }
    public default T onblurx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "onblur", expression); return (T) this;
    }

    public void setOnchange(String onchange);
    public default T onchange(String onchange) {
        setOnchange(onchange); return (T) this;
    }
    public default T onchangex(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "onchange", expression); return (T) this;
    }

    public void setOnclick(String onclick);
    public default T onclick(String onclick) {
        setOnclick(onclick); return (T) this;
    }
    public default T onclickx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "onclick", expression); return (T) this;
    }

    public void setOndblclick(String ondblclick);
    public default T ondblclick(String ondblclick) {
        setOndblclick(ondblclick); return (T) this;
    }
    public default T ondblclickx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "ondblclick", expression); return (T) this;
    }

    public void setOnfocus(String onfocus);
    public default T onfocus(String onfocus) {
        setOnfocus(onfocus); return (T) this;
    }
    public default T onfocusx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "onfocus", expression); return (T) this;
    }

    public void setOnkeydown(String onkeydown);
    public default T onkeydown(String onkeydown) {
        setOnkeydown(onkeydown); return (T) this;
    }
    public default T onkeydownx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "onkeydown", expression); return (T) this;
    }

    public void setOnkeypress(String onkeypress);
    public default T onkeypress(String onkeypress) {
        setOnkeypress(onkeypress); return (T) this;
    }
    public default T onkeypressx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "onkeypress", expression); return (T) this;
    }

    public void setOnkeyup(String onkeyup);
    public default T onkeyup(String onkeyup) {
        setOnkeyup(onkeyup); return (T) this;
    }
    public default T onkeyupx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "onkeyup", expression); return (T) this;
    }

    public void setOnmousedown(String onmousedown);
    public default T onmousedown(String onmousedown) {
        setOnmousedown(onmousedown); return (T) this;
    }
    public default T onmousedownx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "onmousedown", expression); return (T) this;
    }

    public void setOnmousemove(String onmousemove);
    public default T onmousemove(String onmousemove) {
        setOnmousemove(onmousemove); return (T) this;
    }
    public default T onmousemovex(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "onmousemove", expression); return (T) this;
    }

    public void setOnmouseout(String onmouseout);
    public default T onmouseout(String onmouseout) {
        setOnmouseout(onmouseout); return (T) this;
    }
    public default T onmouseoutx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "onmouseout", expression); return (T) this;
    }

    public void setOnmouseover(String onmouseover);
    public default T onmouseover(String onmouseover) {
        setOnmouseover(onmouseover); return (T) this;
    }
    public default T onmouseoverx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "onmouseover", expression); return (T) this;
    }

    public void setOnmouseup(String onmouseup);
    public default T onmouseup(String onmouseup) {
        setOnmouseup(onmouseup); return (T) this;
    }
    public default T onmouseupx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "onmouseup", expression); return (T) this;
    }

    public void setOnselect(String onselect);
    public default T onselect(String onselect) {
        setOnselect(onselect); return (T) this;
    }
    public default T onselectx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "onselect", expression); return (T) this;
    }

    public void setReadonly(boolean readonly);
    public default T readonly(boolean readonly) {
        setReadonly(readonly); return (T) this;
    }
    public default T readonlyx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "readonly", expression); return (T) this;
    }

    public void setRole(String role);
    public default T role(String role) {
        setRole(role); return (T) this;
    }
    public default T rolex(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "role", expression); return (T) this;
    }

    public void setStyle(String style);
    public default T style(String style) {
        setStyle(style); return (T) this;
    }
    public default T stylex(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "style", expression); return (T) this;
    }

    public void setStyleClass(String styleClass);
    public default T styleClass(String styleClass) {
        setStyleClass(styleClass); return (T) this;
    }
    public default T styleClassx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "styleClass", expression); return (T) this;
    }

    public void setTabindex(String tabindex);
    public default T tabindex(String tabindex) {
        setTabindex(tabindex); return (T) this;
    }
    public default T tabindexx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "tabindex", expression); return (T) this;
    }

    public void setTitle(String title);
    public default T title(String title) {
        setTitle(title); return (T) this;
    }
    public default T titlex(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "title", expression); return (T) this;
    }

    public void setType(String type);
    public default T type(String type) {
        setType(type); return (T) this;
    }
    public default T typex(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "type", expression); return (T) this;
    }
}

