package jamaica.faces.component;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUISelectItem<T extends FluentUISelectItem> extends 
            FluentUIInput<T> {

    public FacesContext getFacesContext();

    public void setItemDescription(String itemDescription);
    public default T itemDescription(String itemDescription) {
        setItemDescription(itemDescription); return (T) this;
    }
    public default T itemDescriptionx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "itemDescription", expression); return (T) this;
    }

    public void setItemDisabled(boolean itemDisabled);
    public default T itemDisabled(boolean itemDisabled) {
        setItemDisabled(itemDisabled); return (T) this;
    }
    public default T itemDisabledx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "itemDisabled", expression); return (T) this;
    }

    public void setItemEscaped(boolean itemEscaped);
    public default T itemEscaped(boolean itemEscaped) {
        setItemEscaped(itemEscaped); return (T) this;
    }
    public default T itemEscapedx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "itemEscaped", expression); return (T) this;
    }

    public void setItemLabel(String itemLabel);
    public default T itemLabel(String itemLabel) {
        setItemLabel(itemLabel); return (T) this;
    }
    public default T itemLabelx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "itemLabel", expression); return (T) this;
    }

    public void setItemValue(Object itemValue);
    public default T itemValue(Object itemValue) {
        setItemValue(itemValue); return (T) this;
    }
    public default T itemValuex(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "itemValue", expression); return (T) this;
    }

    public void setNoSelectionOption(boolean noSelectionOption);
    public default T noSelectionOption(boolean noSelectionOption) {
        setNoSelectionOption(noSelectionOption); return (T) this;
    }
    public default T noSelectionOptionx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "noSelectionOption", expression); return (T) this;
    }

    public void setValue(Object value);
    public default T value(Object value) {
        setValue(value); return (T) this;
    }
    public default T valuex(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "value", expression); return (T) this;
    }
}
