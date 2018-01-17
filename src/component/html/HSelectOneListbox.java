package jamaica.faces.component.html;

import jamaica.faces.component.html.FluentHtmlSelectOneListbox;
import javax.faces.component.html.HtmlSelectOneListbox;


public class HSelectOneListbox extends HtmlSelectOneListbox
            implements FluentHtmlSelectOneListbox<HSelectOneListbox> {

    public static HSelectOneListbox h_selectOneListbox() {
        return new HSelectOneListbox();
    }
}

