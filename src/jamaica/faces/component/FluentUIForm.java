package jamaica.faces.component;

import javax.faces.component.UIComponent;


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

