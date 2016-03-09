package jamaica.faces.component;

import javax.el.MethodExpression;
import javax.faces.component.ActionSource2;


/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentActionSource2<T extends FluentActionSource2> 
            extends ActionSource2 {

    public default T actionExpression(MethodExpression actionExpression) { 
        setActionExpression(actionExpression); return (T) this; 
    }
}
