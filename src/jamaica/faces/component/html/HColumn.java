package jamaica.faces.component.html;

import jamaica.faces.component.html.FluentHtmlColumn;
import javax.faces.component.html.HtmlColumn;


public class HColumn extends HtmlColumn
            implements FluentHtmlColumn<HColumn> {

    public static HColumn h_column() {
        return new HColumn();
    }
}

