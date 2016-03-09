package jamaica.faces.novdl.html;

import jamaica.faces.component.html.FluentHtmlInputText;
import javax.faces.component.html.HtmlInputText;


public class HInputText extends HtmlInputText
            implements FluentHtmlInputText<HInputText> {

    public static HInputText h_inputText() {
        return new HInputText();
    }
}

