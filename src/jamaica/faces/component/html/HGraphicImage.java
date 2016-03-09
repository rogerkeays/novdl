package jamaica.faces.component.html;

import jamaica.faces.component.html.FluentHtmlGraphicImage;
import javax.faces.component.html.HtmlGraphicImage;


public class HGraphicImage extends HtmlGraphicImage
            implements FluentHtmlGraphicImage<HGraphicImage> {

    public static HGraphicImage h_graphicImage() {
        return new HGraphicImage();
    }
}

