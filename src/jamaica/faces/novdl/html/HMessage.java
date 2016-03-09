package jamaica.faces.novdl.html;

import jamaica.faces.component.html.FluentHtmlMessage;
import javax.faces.component.html.HtmlMessage;


public class HMessage extends HtmlMessage
            implements FluentHtmlMessage<HMessage> {

    public static HMessage h_message() {
        return new HMessage();
    }
}

