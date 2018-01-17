package jamaica.faces.component.html;

import jamaica.faces.component.html.FluentHtmlHead;
import javax.faces.component.html.HtmlHead;


public class HHead extends HtmlHead
            implements FluentHtmlHead<HHead> {

    public static HHead h_head() {
        return new HHead();
    }
}

