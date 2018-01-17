package jamaica.faces.component;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import java.util.Locale;
import javax.el.MethodExpression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;


/**
 * This interface adds fluent methods on top of the standard methods.
 */
public interface FluentUIViewRoot<T extends FluentUIViewRoot> extends 
            FluentUIComponent<T> {

    public void setAfterPhaseListener(MethodExpression newAfterPhase);
    public default T afterPhaseListener(MethodExpression newAfterPhase) {
        setAfterPhaseListener(newAfterPhase); return (T) this;
    }

    public void setBeforePhaseListener(MethodExpression newBeforePhase);
    public default T beforePhaseListener(MethodExpression newBeforePhase) {
        setBeforePhaseListener(newBeforePhase); return (T) this;
    }

    public void setLocale(Locale locale);
    public default T locale(Locale locale) {
        setLocale(locale); return (T) this;
    }
    public default T localex(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "locale", expression); return (T) this;
    }

    public void setRenderKitId(String renderKitId);
    public default T renderKitId(String renderKitId) {
        setRenderKitId(renderKitId); return (T) this;
    }
    public default T renderKitIdx(String expression) {
        set_value_expression(FacesContext.getCurrentInstance(), (UIComponent) this,
                "renderKitId", expression); return (T) this;
    }

    public void addComponentResource(FacesContext context, UIComponent componentResource);
    public default T componentResource(FacesContext context, UIComponent componentResource) {
        addComponentResource(context, componentResource); return (T) this;
    }

    public void addComponentResource(FacesContext context, UIComponent componentResource, String target);
    public default T componentResource(FacesContext context, UIComponent componentResource, String target) {
        addComponentResource(context, componentResource, target); return (T) this;
    }
}
