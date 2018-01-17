package jamaica.faces.component.html;

import jamaica.faces.component.html.FluentHtmlOutputFormat;
import javax.faces.component.html.HtmlOutputFormat;


public class HOutputFormat extends HtmlOutputFormat
            implements FluentHtmlOutputFormat<HOutputFormat> {

    public static HOutputFormat h_outputFormat() {
        return new HOutputFormat();
    }
}

