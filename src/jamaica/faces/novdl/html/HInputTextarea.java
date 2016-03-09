package jamaica.faces.novdl.html;

import jamaica.faces.component.html.FluentHtmlInputTextarea;
import javax.faces.component.html.HtmlInputTextarea;


public class HInputTextarea extends HtmlInputTextarea
            implements FluentHtmlInputTextarea<HInputTextarea> {

    public static HInputTextarea h_inputTextarea() {
        return new HInputTextarea();
    }
}

