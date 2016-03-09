package jamaica.faces.novdl;

import java.beans.BeanInfo;
import java.io.IOException;

import javax.faces.FacesWrapper;
import javax.faces.application.Resource;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.view.StateManagementStrategy;
import javax.faces.view.ViewDeclarationLanguage;
import javax.faces.view.ViewMetadata;

// Remove this for JSF 2.2
public abstract class ViewDeclarationLanguageWrapper extends ViewDeclarationLanguage implements FacesWrapper<ViewDeclarationLanguage> {

    @Override
    public UIViewRoot restoreView(FacesContext context, String viewId) {
        return getWrapped().restoreView(context, viewId);
    }

    @Override
    public void renderView(FacesContext context, UIViewRoot view) throws IOException {
        getWrapped().renderView(context, view);
    }

    @Override
    public ViewMetadata getViewMetadata(FacesContext context, String viewId) {
        return getWrapped().getViewMetadata(context, viewId);
    }

    @Override
    public StateManagementStrategy getStateManagementStrategy(FacesContext context, String viewId) {
        return getWrapped().getStateManagementStrategy(context, viewId);
    }

    @Override
    public Resource getScriptComponentResource(FacesContext context, Resource componentResource) {
        return getWrapped().getScriptComponentResource(context, componentResource);
    }

    @Override
    public BeanInfo getComponentMetadata(FacesContext context, Resource componentResource) {
        return getWrapped().getComponentMetadata(context, componentResource);
    }

    @Override
    public UIViewRoot createView(FacesContext context, String viewId) {
        return getWrapped().createView(context, viewId);
    }

    @Override
    public void buildView(FacesContext context, UIViewRoot root) throws IOException {
        getWrapped().buildView(context, root);
    }
}
