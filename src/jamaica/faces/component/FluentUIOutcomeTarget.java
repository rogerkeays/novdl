package jamaica.faces.component;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;


/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUIOutcomeTarget<T extends FluentUIOutcomeTarget> extends 
            FluentUIOutput<T> {

    public FacesContext getFacesContext();

    public void setDisableClientWindow(boolean disableClientWindow);
    public default T disableClientWindow(boolean disableClientWindow) {
        setDisableClientWindow(disableClientWindow); return (T) this;
    }
    public default T disableClientWindowx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "disableClientWindow", expression); return (T) this;
    }

    public void setIncludeViewParams(boolean includeViewParams);
    public default T includeViewParams(boolean includeViewParams) {
        setIncludeViewParams(includeViewParams); return (T) this;
    }
    public default T includeViewParamsx(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "includeViewParams", expression); return (T) this;
    }

    public void setOutcome(String outcome);
    public default T outcome(String outcome) {
        setOutcome(outcome); return (T) this;
    }
    public default T outcomex(String expression) {
        set_value_expression(getFacesContext(), (UIComponent) this,
                "outcome", expression); return (T) this;
    }
}
