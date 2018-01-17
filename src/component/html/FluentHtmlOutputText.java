package jamaica.faces.component.html;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import jamaica.faces.component.FluentUIOutput;

public interface FluentHtmlOutputText<T extends FluentHtmlOutputText>
            extends FluentUIOutput<T> {

    public void setDir(String dir);
    public default T dir(String dir) {
        setDir(dir); return (T) this;
    }
    public default T dirx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "dir", expression); return (T) this;
    }

    public void setEscape(boolean escape);
    public default T escape(boolean escape) {
        setEscape(escape); return (T) this;
    }
    public default T escapex(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "escape", expression); return (T) this;
    }

    public void setLang(String lang);
    public default T lang(String lang) {
        setLang(lang); return (T) this;
    }
    public default T langx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "lang", expression); return (T) this;
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

    public void setTitle(String title);
    public default T title(String title) {
        setTitle(title); return (T) this;
    }
    public default T titlex(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "title", expression); return (T) this;
    }
}

