package jamaica.faces.component;

import javax.el.ValueExpression;
import javax.faces.model.DataModel;
import javax.faces.component.UIComponent;


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

    public void setRows(int rows);
    public default T rows(int rows) { 
        setRows(rows); return (T) this; 
    }

    public void setRowStatePreserved(boolean preserveComponentState);
    public default T rowStatePreserved(boolean preserveComponentState) { 
        setRowStatePreserved(preserveComponentState); return (T) this; 
    }

    public void setValue(Object value);
    public default T value(Object value) { 
        setValue(value); return (T) this; 
    }

    public void setVar(String var);
    public default T var(String var) { 
        setVar(var); return (T) this; 
    }
}
