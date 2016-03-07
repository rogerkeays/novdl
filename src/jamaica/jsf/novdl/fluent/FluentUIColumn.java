package jamaica.jsf.novdl.fluent;

import javax.faces.component.UIComponent;


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
