package jamaica.faces.component.html;

import jamaica.faces.component.html.FluentHtmlForm;
import javax.faces.component.html.HtmlForm;


public class HForm extends HtmlForm
            implements FluentHtmlForm<HForm> {

    public static HForm h_form() {
        return new HForm();
    }
}

