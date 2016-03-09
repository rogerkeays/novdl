package jamaica.faces.novdl.html;

import jamaica.faces.component.html.FluentHtmlSelectManyMenu;
import javax.faces.component.html.HtmlSelectManyMenu;


public class HSelectManyMenu extends HtmlSelectManyMenu
            implements FluentHtmlSelectManyMenu<HSelectManyMenu> {

    public static HSelectManyMenu h_selectManyMenu() {
        return new HSelectManyMenu();
    }
}

