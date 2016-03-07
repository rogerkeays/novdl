
package jamaica.jsf.novdl.fluent;

import javax.faces.component.UIComponent;


/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUIOutcomeTarget<T extends FluentUIOutcomeTarget> extends 
            FluentUIOutput<T> {

    public void setDisableClientWindow(boolean disableClientWindow);
    public default T disableClientWindow(boolean disableClientWindow) {
        setDisableClientWindow(disableClientWindow); return (T) this;
    }

    public void setIncludeViewParams(boolean includeViewParams);
    public default T includeViewParams(boolean includeViewParams) {
        setIncludeViewParams(includeViewParams); return (T) this;
    }

    public void setOutcome(String outcome);
    public default T outcome(String outcome) {
        setOutcome(outcome); return (T) this;
    }
}
