package jamaica.faces.component.html;

import jamaica.faces.component.html.FluentHtmlOutputText;
import javax.faces.component.html.HtmlOutputText;


public class HOutputText extends HtmlOutputText
            implements FluentHtmlOutputText<HOutputText> {

    public static HOutputText h_outputText() {
        return new HOutputText();
    }
}

