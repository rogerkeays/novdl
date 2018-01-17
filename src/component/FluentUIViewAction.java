package jamaica.faces.component;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUIViewAction<T extends FluentUIViewAction> extends 
            FluentUIComponent<T>, FluentActionSource2<T> {

    public void setOnPostback(boolean onPostback);
    public default T onPostback(boolean onPostback) {
        setOnPostback(onPostback); return (T) this;
    }
    public default T onPostbackx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "onPostback", expression); return (T) this;
    }

    public void setPhase(String phase);
    public default T phase(String phase) {
        setPhase(phase); return (T) this;
    }
    public default T phasex(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "phase", expression); return (T) this;
    }
}
