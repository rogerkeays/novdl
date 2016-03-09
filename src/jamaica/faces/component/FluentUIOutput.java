package jamaica.faces.component;

import javax.faces.component.UIComponent;


/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUIOutput<T extends FluentUIOutput> extends 
            FluentUIComponent<T>, FluentValueHolder<T> {

}
