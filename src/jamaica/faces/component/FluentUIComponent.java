package jamaica.faces.component;

import static jamaica.faces.component.FSelectItem.f_selectItem;
import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import java.util.List;
import javax.el.ValueExpression;


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

    public void setParent(UIComponent parent);
    public default T parent(UIComponent parent) {
        setParent(parent); return (T) this; 
    }

    public void setRendered(boolean rendered);
    public default T rendered(boolean rendered) {
        setRendered(rendered); return (T) this; 
    }
    public default T renderedx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "rendered", expression); return (T) this;
    }

    public void setValueExpression(String name, ValueExpression binding);
    public default T valueExpression(String name, ValueExpression binding) {
        setValueExpression(name, binding);
        return (T) this;
    }

    public List<UIComponent> getChildren();
    public default T children(UIComponent... children) {
        for (UIComponent child : children) {
            getChildren().add(child);
        }
        return (T) this;
    }

    // shortcut for building a UISelect of enums
    public default T selectItems(Class<? extends Enum> e) {
        for (Enum option : e.getEnumConstants()) {
            getChildren().add(f_selectItem()
                    .itemValue(option)
                    .itemLabel(option.toString()));
        }
        return (T) this;
    }
}

