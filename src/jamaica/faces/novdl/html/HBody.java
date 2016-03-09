package jamaica.faces.novdl.html;

import jamaica.faces.component.html.FluentHtmlBody;
import javax.faces.component.html.HtmlBody;


public class HBody extends HtmlBody implements FluentHtmlBody<HBody> {

    public static HBody h_body() {
        return new HBody();
    }
}

