package jamaica.faces.novdl.html;

import jamaica.faces.component.html.FluentHtmlPanelGrid;
import javax.faces.component.html.HtmlPanelGrid;


public class HPanelGrid extends HtmlPanelGrid
            implements FluentHtmlPanelGrid<HPanelGrid> {

    public static HPanelGrid h_panelGrid() {
        return new HPanelGrid();
    }
}

