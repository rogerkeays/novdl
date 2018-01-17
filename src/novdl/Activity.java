package jamaica.faces.novdl;

import java.io.IOException;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

/**
 * Implement this interface to create JSF Views in Java. The 
 * get_view_class_name function is used to map view ids to their Java
 * implementations.
 */
public interface Activity {

    /**
     * init is called before the view is built. If you have some security
     * conditions to check, you should do them in this method. You should
     * be able to set response headers in this method, and if necessary,
     * use FacesContext.setResponseComplete()
     */
    public void init(FacesContext faces);


    /**
     * Build the JSF view under the given view root.
     */
    public void buildView(FacesContext faces, UIViewRoot root);
}
