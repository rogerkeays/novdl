package jamaica.faces.component.html;

import jamaica.faces.component.html.FluentHtmlInputFile;
import javax.faces.component.html.HtmlInputFile;


public class HInputFile extends HtmlInputFile
            implements FluentHtmlInputFile<HInputFile> {

    public static HInputFile h_inputFile() {
        return new HInputFile();
    }
}

