package jamaica.faces.component;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;


/**
 * This interface adds fluent methods on top of the standard UIColumn 
 * methods.
 */
public interface FluentUIColumn<T extends FluentUIColumn> 
            extends FluentUIComponent<T> {

    public void setFooter(UIComponent footer);
    public default T footer(UIComponent footer) {
        setFooter(footer); return (T) this; 
    }

    public void setHeader(UIComponent header);
    public default T header(UIComponent header) {
        setHeader(header); return (T) this; 
    }
}
