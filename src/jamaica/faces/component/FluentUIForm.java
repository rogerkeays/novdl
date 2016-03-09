package jamaica.faces.component;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;


/**
 * This interface adds fluent methods on top of the standard UIForm
 * methods.
 */
public interface FluentUIForm<T extends FluentUIForm> 
            extends FluentUIComponent<T> {

    public void setPrependId(boolean prependId);
    public default T prependId(boolean prependId) {
        setPrependId(prependId); return (T) this;
    }

    public void setSubmitted(boolean submitted);
    public default T submitted(boolean submitted) {
        setSubmitted(submitted); return (T) this;
    }
}

