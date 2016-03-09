
package jamaica.faces.component;

import javax.faces.component.StateHolder;


/**
 * This interface adds fluent methods on top of the standard
 * methods.
 */
public interface FluentStateHolder<T extends FluentStateHolder> 
        extends StateHolder {

    public default T transient0(boolean transient0) {
        setTransient(transient0); return (T) this;
    }
}
