package jamaica.faces.novdl.html;

import jamaica.faces.component.html.FluentHtmlMessages;
import javax.faces.component.html.HtmlMessages;


public class HMessages extends HtmlMessages
            implements FluentHtmlMessages<HMessages> {

    public static HMessages h_messages() {
        return new HMessages();
    }
}

