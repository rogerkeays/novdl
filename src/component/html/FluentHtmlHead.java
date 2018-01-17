package jamaica.faces.component.html;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import jamaica.faces.component.FluentUIOutput;

public interface FluentHtmlHead<T extends FluentHtmlHead>
            extends FluentUIOutput<T> {

    public void setDir(String dir);
    public default T dir(String dir) {
        setDir(dir); return (T) this;
    }
    public default T dirx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "dir", expression); return (T) this;
    }

    public void setLang(String lang);
    public default T lang(String lang) {
        setLang(lang); return (T) this;
    }
    public default T langx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "lang", expression); return (T) this;
    }

    public void setXmlns(String xmlns);
    public default T xmlns(String xmlns) {
        setXmlns(xmlns); return (T) this;
    }
    public default T xmlnsx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "xmlns", expression); return (T) this;
    }
}

