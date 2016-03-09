package jamaica.faces.novdl.html;

import jamaica.faces.component.html.FluentHtmlSelectOneMenu;
import javax.faces.component.html.HtmlSelectOneMenu;


public class HSelectOneMenu extends HtmlSelectOneMenu
            implements FluentHtmlSelectOneMenu<HSelectOneMenu> {

    public static HSelectOneMenu h_selectOneMenu() {
        return new HSelectOneMenu();
    }
}

