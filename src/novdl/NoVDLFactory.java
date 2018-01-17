package jamaica.faces.novdl;

import javax.faces.view.ViewDeclarationLanguage;
import javax.faces.view.ViewDeclarationLanguageFactory;

public class NoVDLFactory extends ViewDeclarationLanguageFactory {

    @Override
    public ViewDeclarationLanguage getViewDeclarationLanguage(String viewID) {
        ViewDeclarationLanguage fallback = parent.getViewDeclarationLanguage(viewID);
        return new NoVDL(fallback);
    }


    /**
     * Creates a factory which uses the given parent factory to get the
     * fallback VDL for views that do not have a Java implementation.
     */
    public NoVDLFactory(ViewDeclarationLanguageFactory parent) {
        this.parent = parent;
    }
    private ViewDeclarationLanguageFactory parent;

    @Override
    public ViewDeclarationLanguageFactory getWrapped() {
        return parent;
    }
}
