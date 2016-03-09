package jamaica.faces.component.html;

import jamaica.faces.component.FluentUIColumn;

public interface FluentHtmlColumn<T extends FluentHtmlColumn>
            extends FluentUIColumn<T> {

    public void setFooterClass(String footerClass);
    public default T footerClass(String footerClass) {
        setFooterClass(footerClass); return (T) this;
    }

    public void setHeaderClass(String headerClass);
    public default T headerClass(String headerClass) {
        setHeaderClass(headerClass); return (T) this;
    }

    public void setRowHeader(boolean rowHeader);
    public default T rowHeader(boolean rowHeader) {
        setRowHeader(rowHeader); return (T) this;
    }
}

