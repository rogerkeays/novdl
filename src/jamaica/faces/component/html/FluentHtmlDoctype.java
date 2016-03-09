package jamaica.faces.component.html;

import jamaica.faces.component.FluentUIOutput;

public interface FluentHtmlDoctype<T extends FluentHtmlDoctype>
            extends FluentUIOutput<T> {

    public void setPublic(String _public);
    public default T public0(String _public) {
        setPublic(_public); return (T) this;
    }

    public void setRootElement(String rootElement);
    public default T rootElement(String rootElement) {
        setRootElement(rootElement); return (T) this;
    }

    public void setSystem(String system);
    public default T system(String system) {
        setSystem(system); return (T) this;
    }
}

