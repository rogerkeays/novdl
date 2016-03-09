package jamaica.faces.component.html;

import static jamaica.faces.novdl.set_value_expression.set_value_expression;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import jamaica.faces.component.FluentUIPanel;

public interface FluentHtmlPanelGrid<T extends FluentHtmlPanelGrid>
            extends FluentUIPanel<T> {

    public void setBgcolor(String bgcolor);
    public default T bgcolor(String bgcolor) {
        setBgcolor(bgcolor); return (T) this;
    }

    public void setBodyrows(String bodyrows);
    public default T bodyrows(String bodyrows) {
        setBodyrows(bodyrows); return (T) this;
    }

    public void setBorder(int border);
    public default T border(int border) {
        setBorder(border); return (T) this;
    }

    public void setCaptionClass(String captionClass);
    public default T captionClass(String captionClass) {
        setCaptionClass(captionClass); return (T) this;
    }

    public void setCaptionStyle(String captionStyle);
    public default T captionStyle(String captionStyle) {
        setCaptionStyle(captionStyle); return (T) this;
    }

    public void setCellpadding(String cellpadding);
    public default T cellpadding(String cellpadding) {
        setCellpadding(cellpadding); return (T) this;
    }

    public void setCellspacing(String cellspacing);
    public default T cellspacing(String cellspacing) {
        setCellspacing(cellspacing); return (T) this;
    }

    public void setColumnClasses(String columnClasses);
    public default T columnClasses(String columnClasses) {
        setColumnClasses(columnClasses); return (T) this;
    }

    public void setColumns(int columns);
    public default T columns(int columns) {
        setColumns(columns); return (T) this;
    }

    public void setDir(String dir);
    public default T dir(String dir) {
        setDir(dir); return (T) this;
    }

    public void setFooterClass(String footerClass);
    public default T footerClass(String footerClass) {
        setFooterClass(footerClass); return (T) this;
    }

    public void setFrame(String frame);
    public default T frame(String frame) {
        setFrame(frame); return (T) this;
    }

    public void setHeaderClass(String headerClass);
    public default T headerClass(String headerClass) {
        setHeaderClass(headerClass); return (T) this;
    }

    public void setLang(String lang);
    public default T lang(String lang) {
        setLang(lang); return (T) this;
    }

    public void setOnclick(String onclick);
    public default T onclick(String onclick) {
        setOnclick(onclick); return (T) this;
    }

    public void setOndblclick(String ondblclick);
    public default T ondblclick(String ondblclick) {
        setOndblclick(ondblclick); return (T) this;
    }

    public void setOnkeydown(String onkeydown);
    public default T onkeydown(String onkeydown) {
        setOnkeydown(onkeydown); return (T) this;
    }

    public void setOnkeypress(String onkeypress);
    public default T onkeypress(String onkeypress) {
        setOnkeypress(onkeypress); return (T) this;
    }

    public void setOnkeyup(String onkeyup);
    public default T onkeyup(String onkeyup) {
        setOnkeyup(onkeyup); return (T) this;
    }

    public void setOnmousedown(String onmousedown);
    public default T onmousedown(String onmousedown) {
        setOnmousedown(onmousedown); return (T) this;
    }

    public void setOnmousemove(String onmousemove);
    public default T onmousemove(String onmousemove) {
        setOnmousemove(onmousemove); return (T) this;
    }

    public void setOnmouseout(String onmouseout);
    public default T onmouseout(String onmouseout) {
        setOnmouseout(onmouseout); return (T) this;
    }

    public void setOnmouseover(String onmouseover);
    public default T onmouseover(String onmouseover) {
        setOnmouseover(onmouseover); return (T) this;
    }

    public void setOnmouseup(String onmouseup);
    public default T onmouseup(String onmouseup) {
        setOnmouseup(onmouseup); return (T) this;
    }

    public void setRole(String role);
    public default T role(String role) {
        setRole(role); return (T) this;
    }

    public void setRowClasses(String rowClasses);
    public default T rowClasses(String rowClasses) {
        setRowClasses(rowClasses); return (T) this;
    }

    public void setRules(String rules);
    public default T rules(String rules) {
        setRules(rules); return (T) this;
    }

    public void setStyle(String style);
    public default T style(String style) {
        setStyle(style); return (T) this;
    }

    public void setStyleClass(String styleClass);
    public default T styleClass(String styleClass) {
        setStyleClass(styleClass); return (T) this;
    }

    public void setSummary(String summary);
    public default T summary(String summary) {
        setSummary(summary); return (T) this;
    }

    public void setTitle(String title);
    public default T title(String title) {
        setTitle(title); return (T) this;
    }

    public void setWidth(String width);
    public default T width(String width) {
        setWidth(width); return (T) this;
    }

}

