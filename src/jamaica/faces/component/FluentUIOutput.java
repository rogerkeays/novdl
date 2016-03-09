package jamaica.faces.component;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.context.FacesContext;
import javax.faces.component.UIComponent;
import javax.faces.component.UIOutput;


/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUIOutput<T extends FluentUIOutput> extends 
            FluentUIComponent<T>, FluentValueHolder<T> {

    public static UIOutput f_verbatim(String verbatim) {
        UIOutput out = new UIOutput();
        out.setValue(verbatim);
        return out;
    }
    public static UIOutput f_verbatimx(String expression) {
        UIOutput out = new UIOutput();
        set_value_expression(FacesContext.getCurrentInstance(), out,
                "value", expression);
        return out;
    }
}
