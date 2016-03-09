package jamaica.faces.novdl.html;

import jamaica.faces.component.html.FluentHtmlSelectManyCheckbox;
import javax.faces.component.html.HtmlSelectManyCheckbox;


public class HSelectManyCheckbox extends HtmlSelectManyCheckbox
            implements FluentHtmlSelectManyCheckbox<HSelectManyCheckbox> {

    public static HSelectManyCheckbox h_selectManyCheckbox() {
        return new HSelectManyCheckbox();
    }
}

