package jamaica.faces.novdl.html;

import jamaica.faces.component.html.FluentHtmlInputSecret;
import javax.faces.component.html.HtmlInputSecret;


public class HInputSecret extends HtmlInputSecret
            implements FluentHtmlInputSecret<HInputSecret> {

    public static HInputSecret h_inputSecret() {
        return new HInputSecret();
    }
}

