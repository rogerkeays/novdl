package jamaica.faces.novdl.html;

import jamaica.faces.component.html.FluentHtmlSelectBooleanCheckbox;
import javax.faces.component.html.HtmlSelectBooleanCheckbox;


public class HSelectBooleanCheckbox extends HtmlSelectBooleanCheckbox
            implements FluentHtmlSelectBooleanCheckbox<HSelectBooleanCheckbox> {

    public static HSelectBooleanCheckbox h_selectBooleanCheckbox() {
        return new HSelectBooleanCheckbox();
    }
}

