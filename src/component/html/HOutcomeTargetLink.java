package jamaica.faces.component.html;

import jamaica.faces.component.html.FluentHtmlOutcomeTargetLink;
import javax.faces.component.html.HtmlOutcomeTargetLink;


public class HOutcomeTargetLink extends HtmlOutcomeTargetLink
            implements FluentHtmlOutcomeTargetLink<HOutcomeTargetLink> {

    public static HOutcomeTargetLink h_link() {
        return new HOutcomeTargetLink();
    }
}

