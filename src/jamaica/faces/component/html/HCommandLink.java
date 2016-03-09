package jamaica.faces.component.html;

import jamaica.faces.component.html.FluentHtmlCommandLink;
import javax.faces.component.html.HtmlCommandLink;


public class HCommandLink extends HtmlCommandLink
            implements FluentHtmlCommandLink<HCommandLink> {

    public static HCommandLink h_commandLink() {
        return new HCommandLink();
    }
}

