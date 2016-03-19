package jamaica.faces.component.htmlbasic;

import jamaica.faces.component.FluentUIOutput;
import java.io.IOException;
import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;


/**
 * This component represents an html <style> tag for css styles.
 * The value of this component is the body of the style tag. EL
 * expressions are not expected.
 */
public class NStyle extends UIOutput
            implements FluentUIOutput<NStyle> {

    @Override
    public void encodeBegin(FacesContext faces) throws IOException {
        ResponseWriter writer = faces.getResponseWriter();
        writer.startElement("style", this);
        writer.writeAttribute("type", "text/css", null);
        writer.write(getValue().toString());
        writer.endElement("style");
    }

    public static NStyle n_style() {
        return new NStyle();
    }
}

