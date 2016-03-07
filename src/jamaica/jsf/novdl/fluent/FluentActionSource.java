
package jamaica.jsf.novdl.fluent;

import javax.faces.component.ActionSource;
import javax.faces.event.ActionListener;


/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentActionSource<T extends FluentActionSource> 
            extends ActionSource {

    public default T actionListener(ActionListener listener) { 
        addActionListener(listener); return (T) this; 
    }

    public default T immediate(boolean immediate) { 
        setImmediate(immediate); return (T) this; 
    }
}
