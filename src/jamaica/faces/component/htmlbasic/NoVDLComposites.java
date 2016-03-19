package jamaica.faces.component.htmlbasic;

import javax.faces.component.UIOutput;
import javax.faces.context.FacesContext;
import jamaica.faces.component.NoVDLComposite;
import static jamaica.faces.component.NoVDLComposite.n_composite;
import jamaica.faces.component.html.HOutputText;
import static jamaica.faces.component.html.HOutputText.h_outputText;
import jamaica.faces.component.html.HPanelGroup;
import static jamaica.faces.component.html.HPanelGroup.h_panelGroup;


public class NoVDLComposites {

    /**
     * A composite component that outputs text (or the result of an
     * expression) unescaped.
     */
    public static HOutputText f_verbatim(String verbatim) {
        return h_outputText().value(verbatim).escape(false);
    }
    public static HOutputText f_verbatimx(String expression) {
        return h_outputText().valuex(expression).escape(false);
    }


    /**
     * A composite component that encloses the given output text (or the
     * result of an expression) in a html tag.
     */
    public static NoVDLComposite n_tag(String tag, String text, boolean escape) {
        return n_composite().children(
                 f_verbatim("<" + tag + ">"),
                 h_outputText().value(text).escape(escape),
                 f_verbatim("</" + tag + ">")
               );
    }
    public static NoVDLComposite n_tag(String tag, String text) {
        return n_tag(tag, text, true);
    }

    public static NoVDLComposite n_tagx(String tag, String expression, boolean escape) {
        return n_composite().children(
                 f_verbatim("<" + tag + ">"),
                 h_outputText().valuex(expression).escape(escape),
                 f_verbatim("</" + tag + ">")
               );
    }
    public static NoVDLComposite n_tagx(String tag, String expression) {
        return n_tagx(tag, expression, true);
    }

    public static NoVDLComposite n_h1(String text) { 
        return n_tag("h1", text);
    }
    public static NoVDLComposite n_h1x(String expression) {
        return n_tagx("h1", expression);
    }

    public static NoVDLComposite n_h2(String text) { 
        return n_tag("h2", text);
    }
    public static NoVDLComposite n_h2x(String expression) {
        return n_tagx("h2", expression);
    }

    public static NoVDLComposite n_h3(String text) { 
        return n_tag("h3", text);
    }
    public static NoVDLComposite n_h3x(String expression) {
        return n_tagx("h3", expression);
    }

    public static NoVDLComposite n_p(String text, boolean escape) { 
        return n_tag("p", text, escape);
    }
    public static NoVDLComposite n_p(String text) { 
        return n_p(text, true);
    }
    public static NoVDLComposite n_px(String expression, boolean escape) {
        return n_tagx("p", expression, escape);
    }
    public static NoVDLComposite n_px(String expression) {
        return n_px(expression, true);
    }

    public static UIOutput n_style(String style) {
        return f_verbatim("<style type='text/css'>" + style + "</style>");
    }
}
