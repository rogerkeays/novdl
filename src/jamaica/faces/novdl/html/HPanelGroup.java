package jamaica.faces.novdl.html;

import jamaica.faces.component.html.FluentHtmlPanelGroup;
import javax.faces.component.html.HtmlPanelGroup;


public class HPanelGroup extends HtmlPanelGroup
            implements FluentHtmlPanelGroup<HPanelGroup> {

    public static HPanelGroup h_panelGroup() {
        return new HPanelGroup();
    }
}

