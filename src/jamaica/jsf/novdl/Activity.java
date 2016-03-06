package jamaica.jsf.novdl;

import java.io.IOException;

import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

public interface Activity {

    public void init(FacesContext faces);

    public void buildView(FacesContext faces, UIViewRoot root) throws IOException;
}
