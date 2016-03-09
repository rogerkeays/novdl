package jamaica.faces.novdl.html;

import jamaica.faces.component.html.FluentHtmlDoctype;
import javax.faces.component.html.HtmlDoctype;


public class HDoctype extends HtmlDoctype
            implements FluentHtmlDoctype<HDoctype> {

    public static HDoctype h_doctype() {
        return new HDoctype();
    }
}

