package jamaica.faces.component.html;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import jamaica.faces.component.FluentUIColumn;

public interface FluentHtmlColumn<T extends FluentHtmlColumn>
            extends FluentUIColumn<T> {

    public void setFooterClass(String footerClass);
    public default T footerClass(String footerClass) {
        setFooterClass(footerClass); return (T) this;
    }
    public default T footerClassx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "footerClass", expression); return (T) this;
    }

    public void setHeaderClass(String headerClass);
    public default T headerClass(String headerClass) {
        setHeaderClass(headerClass); return (T) this;
    }
    public default T headerClassx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "headerClass", expression); return (T) this;
    }

    public void setRowHeader(boolean rowHeader);
    public default T rowHeader(boolean rowHeader) {
        setRowHeader(rowHeader); return (T) this;
    }
    public default T rowHeaderx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "rowHeader", expression); return (T) this;
    }
}

