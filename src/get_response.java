package jamaica.faces;

import javax.servlet.http.HttpServletResponse;
import javax.faces.context.FacesContext;

public class get_response {

    /**
     * Unwraps the HttpServletResponse for the given FacesContext.
     */
    public static HttpServletResponse get_response(FacesContext faces) {
        return (HttpServletResponse) faces.getExternalContext().getResponse();
    }
}
