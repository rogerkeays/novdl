package jamaica.faces.novdl.html;

import jamaica.faces.component.html.FluentHtmlSelectOneRadio;
import javax.faces.component.html.HtmlSelectOneRadio;


public class HSelectOneRadio extends HtmlSelectOneRadio
            implements FluentHtmlSelectOneRadio<HSelectOneRadio> {

    public static HSelectOneRadio h_selectOneRadio() {
        return new HSelectOneRadio();
    }
}

