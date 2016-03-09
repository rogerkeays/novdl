package jamaica.faces.novdl;

import com.sun.faces.application.ApplicationAssociate;
import jamaica.core.io.UncheckedIOException;
import java.io.IOException;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;

public class build_from_facelet {

    /**
     * Build a partial component tree from a facelets template, applying the result
     * to the given parent component.
     */
    public static void build_from_facelet(FacesContext faces, 
                UIComponent parent, String template) {
        try {
            ApplicationAssociate.getInstance(faces.getExternalContext())
                    .getFaceletFactory().getFacelet(faces, template)
                    .apply(faces, parent);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}
