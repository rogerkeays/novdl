package jamaica.jsf.novdl.fluent.html;

import jamaica.jsf.novdl.fluent.FluentUIColumn;
import javax.faces.component.html.HtmlColumn;

/**
 * Fluent implementation of HtmlColumn.
 */
public class FluentHtmlColumn extends HtmlColumn 
            implements FluentUIColumn<FluentHtmlColumn> {

    public FluentHtmlColumn footerClass(String footerClass) {
        setFooterClass(footerClass);
        return this;
    }

    public FluentHtmlColumn headerClass(String headerClass) {
        setHeaderClass(headerClass);
        return this;
    }

    // factory methods
    public static FluentHtmlColumn h_column() {
        return new FluentHtmlColumn();
    }
}
