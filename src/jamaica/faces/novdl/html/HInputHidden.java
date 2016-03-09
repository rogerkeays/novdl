package jamaica.faces.novdl.html;

import jamaica.faces.component.html.FluentHtmlInputHidden;
import javax.faces.component.html.HtmlInputHidden;


public class HInputHidden extends HtmlInputHidden
            implements FluentHtmlInputHidden<HInputHidden> {

    public static HInputHidden h_inputHidden() {
        return new HInputHidden();
    }
}

