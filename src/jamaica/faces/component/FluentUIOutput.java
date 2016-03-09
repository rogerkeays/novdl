package jamaica.faces.component;

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
}
