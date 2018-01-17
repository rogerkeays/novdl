package jamaica.faces.novdl;

import static jamaica.faces.novdl.is_el.is_el;
import javax.el.ELContext;
import javax.el.ExpressionFactory;
import javax.el.ValueExpression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

public class set_value_expression {
  
    /**
     * Set a value expression for a component property using the given 
     * EL expression.
     */
    public static ValueExpression set_value_expression(FacesContext faces, 
                UIComponent component, String property, String expression) {
        if (!is_el(expression)) {
            throw new IllegalArgumentException("expression is not valid EL");
        } else {
            ELContext context = faces.getELContext();
            ValueExpression ex = faces.getApplication().getExpressionFactory()
                    .createValueExpression(context, expression, Object.class);
            component.setValueExpression(property, ex);
            return ex;
        }
    }
}
