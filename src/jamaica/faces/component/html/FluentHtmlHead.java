package jamaica.faces.component.html;

import jamaica.faces.component.FluentUIOutput;

public interface FluentHtmlHead<T extends FluentHtmlHead>
            extends FluentUIOutput<T> {

    public void setDir(String dir);
    public default T dir(String dir) {
        setDir(dir); return (T) this;
    }

    public void setLang(String lang);
    public default T lang(String lang) {
        setLang(lang); return (T) this;
    }

    public void setXmlns(String xmlns);
    public default T xmlns(String xmlns) {
        setXmlns(xmlns); return (T) this;
    }
}

