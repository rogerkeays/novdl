package jamaica.faces.component;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.el.ValueExpression;
import javax.faces.model.DataModel;


/**
 * This interface adds fluent methods on top of the standard UIData
 * methods.
 */
public interface FluentUIData<T extends FluentUIData> 
            extends FluentUIComponent<T> {

    public void setFirst(int first);
    public default T first(int first) {
        setFirst(first); return (T) this; 
    }
    public default T firstx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "first", expression); return (T) this;
    }

    public void setFooter(UIComponent footer);
    public default T footer(UIComponent footer) {
        setFooter(footer); return (T) this; 
    }

    public void setHeader(UIComponent header);
    public default T header(UIComponent header) {
        setHeader(header); return (T) this; 
    }

    public void setRowIndex(int rowIndex);
    public default T rowIndex(int rowIndex) {
        setRowIndex(rowIndex); return (T) this; 
    }
    public default T rowIndexx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "rowIndex", expression); return (T) this;
    }

    public void setRows(int rows);
    public default T rows(int rows) { 
        setRows(rows); return (T) this; 
    }
    public default T rowsx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "rows", expression); return (T) this;
    }

    public void setRowStatePreserved(boolean preserveComponentState);
    public default T rowStatePreserved(boolean preserveComponentState) { 
        setRowStatePreserved(preserveComponentState); return (T) this; 
    }
    public default T rowStatePreservedx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "rowStatePreserved", expression); return (T) this;
    }

    public void setValue(Object value);
    public default T value(Object value) { 
        setValue(value); return (T) this; 
    }
    public default T valuex(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "value", expression); return (T) this;
    }

    public void setVar(String var);
    public default T var(String var) { 
        setVar(var); return (T) this; 
    }
}
