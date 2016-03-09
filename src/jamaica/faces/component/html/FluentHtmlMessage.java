package jamaica.faces.component.html;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import jamaica.faces.component.FluentUIMessage;

public interface FluentHtmlMessage<T extends FluentHtmlMessage>
            extends FluentUIMessage<T> {

    public void setDir(String dir);
    public default T dir(String dir) {
        setDir(dir); return (T) this;
    }

    public void setErrorClass(String errorClass);
    public default T errorClass(String errorClass) {
        setErrorClass(errorClass); return (T) this;
    }

    public void setErrorStyle(String errorStyle);
    public default T errorStyle(String errorStyle) {
        setErrorStyle(errorStyle); return (T) this;
    }

    public void setFatalClass(String fatalClass);
    public default T fatalClass(String fatalClass) {
        setFatalClass(fatalClass); return (T) this;
    }

    public void setFatalStyle(String fatalStyle);
    public default T fatalStyle(String fatalStyle) {
        setFatalStyle(fatalStyle); return (T) this;
    }

    public void setInfoClass(String infoClass);
    public default T infoClass(String infoClass) {
        setInfoClass(infoClass); return (T) this;
    }

    public void setInfoStyle(String infoStyle);
    public default T infoStyle(String infoStyle) {
        setInfoStyle(infoStyle); return (T) this;
    }

    public void setLang(String lang);
    public default T lang(String lang) {
        setLang(lang); return (T) this;
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

    public void setTitle(String title);
    public default T setTi(String title) {
        setTitle(title); return (T) this;
    }

    public void setTooltip(boolean tooltip);
    public default T setToIp(boolean tooltip) {
        setTooltip(tooltip); return (T) this;
    }

    public void setWarnClass(String warnClass);
    public default T warnClass(String warnClass) {
        setWarnClass(warnClass); return (T) this;
    }

    public void setWarnStyle(String warnStyle);
    public default T warnStyle(String warnStyle) {
        setWarnStyle(warnStyle); return (T) this;
    }
}

