package jamaica.faces;

import javax.servlet.http.HttpServletRequest;
import javax.faces.context.FacesContext;

public class get_request {

    /**
     * Unwraps the HttpServletRequest for the given FacesContext.
     */
    public static HttpServletRequest get_request(FacesContext faces) {
        return (HttpServletRequest) faces.getExternalContext().getRequest();
    }
}
