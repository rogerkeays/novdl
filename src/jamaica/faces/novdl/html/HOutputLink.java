package jamaica.faces.novdl.html;

import jamaica.faces.component.html.FluentHtmlOutputLink;
import javax.faces.component.html.HtmlOutputLink;


public class HOutputLink extends HtmlOutputLink
            implements FluentHtmlOutputLink<HOutputLink> {

    public static HOutputLink h_outputLink() {
        return new HOutputLink();
    }
}

