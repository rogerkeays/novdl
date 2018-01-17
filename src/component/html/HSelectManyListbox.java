package jamaica.faces.component.html;

import jamaica.faces.component.html.FluentHtmlSelectManyListbox;
import javax.faces.component.html.HtmlSelectManyListbox;


public class HSelectManyListbox extends HtmlSelectManyListbox
            implements FluentHtmlSelectManyListbox<HSelectManyListbox> {

    public static HSelectManyListbox h_selectManyListbox() {
        return new HSelectManyListbox();
    }
}

