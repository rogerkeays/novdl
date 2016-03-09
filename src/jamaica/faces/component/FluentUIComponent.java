package jamaica.faces.component;

import java.util.List;
import javax.el.ValueExpression;
import javax.faces.component.UIComponent;


/**
 * This interface adds fluent methods on top of the standard 
 * UIComponentBase methods.
 */
public interface FluentUIComponent<T extends FluentUIComponent> 
            extends FluentStateHolder<T> {

    public void setId(String id);
    public default T id(String id) {
        setId(id); return (T) this; 
    }

    public void setInView(boolean isInView);
    public default T inView(boolean isInView) {
        setInView(isInView); return (T) this; 
    }

    public void setParent(UIComponent parent);
    public default T parent(UIComponent parent) {
        setParent(parent); return (T) this; 
    }

    public void setRendered(boolean rendered);
    public default T rendered(boolean rendered) {
        setRendered(rendered); return (T) this; 
    }

    public void setRendererType(String rendererType);
    public default T rendererType(String rendererType) {
        setRendererType(rendererType); return (T) this; 
    }

    public void setValueExpression(String name, ValueExpression binding);
    public default T valueExpression(String name, ValueExpression binding) {
        setValueExpression(name, binding);
        return (T) this;
    }

    public List<UIComponent> getChildren();
    public default T add(UIComponent... children) {
        for (UIComponent child : children) {
            getChildren().add(child);
        }
        return (T) this;
    }
}

