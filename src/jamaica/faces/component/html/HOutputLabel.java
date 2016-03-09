package jamaica.faces.component.html;

import jamaica.faces.component.html.FluentHtmlOutputLabel;
import javax.faces.component.html.HtmlOutputLabel;


public class HOutputLabel extends HtmlOutputLabel
            implements FluentHtmlOutputLabel<HOutputLabel> {

    public static HOutputLabel h_outputLabel() {
        return new HOutputLabel();
    }
}

