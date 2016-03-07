
package jamaica.jsf.novdl.fluent;

import javax.faces.component.StateHolder;


/**
 * This interface adds fluent methods on top of the standard
 * methods.
 */
public interface FluentStateHolder<T extends FluentStateHolder> 
        extends StateHolder {

    public default T transientt(boolean transientt) {
        setTransient(transientt); return (T) this;
    }
}
