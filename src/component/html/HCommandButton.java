package jamaica.faces.component.html;

import jamaica.faces.component.html.FluentHtmlCommandButton;
import javax.faces.component.html.HtmlCommandButton;


public class HCommandButton extends HtmlCommandButton
            implements FluentHtmlCommandButton<HCommandButton> {

    public static HCommandButton h_commandButton() {
        return new HCommandButton();
    }
}

