package jamaica.faces.novdl.html;

import jamaica.faces.component.html.FluentHtmlOutcomeTargetButton;
import javax.faces.component.html.HtmlOutcomeTargetButton;


public class HOutcomeTargetButton extends HtmlOutcomeTargetButton
            implements FluentHtmlOutcomeTargetButton<HOutcomeTargetButton> {

    public static HOutcomeTargetButton h_button() {
        return new HOutcomeTargetButton();
    }
}

