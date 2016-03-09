package jamaica.faces.component.html;

import jamaica.faces.component.FluentUISelectMany;

public interface FluentHtmlSelectManyCheckbox<T extends FluentHtmlSelectManyCheckbox>
            extends FluentUISelectMany<T> {

    public void setAccesskey(String accesskey);
    public default T accesskey(String accesskey) {
        setAccesskey(accesskey); return (T) this;
    }

    public void setBorder(int border);
    public default T border(int border) {
        setBorder(border); return (T) this;
    }

    public void setDir(String dir);
    public default T dir(String dir) {
        setDir(dir); return (T) this;
    }

    public void setDisabled(boolean disabled);
    public default T disabled(boolean disabled) {
        setDisabled(disabled); return (T) this;
    }

    public void setDisabledClass(String disabledClass);
    public default T disabledClass(String disabledClass) {
        setDisabledClass(disabledClass); return (T) this;
    }

    public void setEnabledClass(String enabledClass);
    public default T enabledClass(String enabledClass) {
        setEnabledClass(enabledClass); return (T) this;
    }

    public void setLabel(String label);
    public default T label(String label) {
        setLabel(label); return (T) this;
    }

    public void setLang(String lang);
    public default T lang(String lang) {
        setLang(lang); return (T) this;
    }

    public void setLayout(String layout);
    public default T layout(String layout) {
        setLayout(layout); return (T) this;
    }

    public void setOnblur(String onblur);
    public default T onblur(String onblur) {
        setOnblur(onblur); return (T) this;
    }

    public void setOnchange(String onchange);
    public default T onchange(String onchange) {
        setOnchange(onchange); return (T) this;
    }

    public void setOnclick(String onclick);
    public default T onclick(String onclick) {
        setOnclick(onclick); return (T) this;
    }

    public void setOndblclick(String ondblclick);
    public default T ondblclick(String ondblclick) {
        setOndblclick(ondblclick); return (T) this;
    }

    public void setOnfocus(String onfocus);
    public default T onfocus(String onfocus) {
        setOnfocus(onfocus); return (T) this;
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

    public void setOnselect(String onselect);
    public default T onselect(String onselect) {
        setOnselect(onselect); return (T) this;
    }

    public void setReadonly(boolean readonly);
    public default T readonly(boolean readonly) {
        setReadonly(readonly); return (T) this;
    }

    public void setRole(String role);
    public default T role(String role) {
        setRole(role); return (T) this;
    }

    public void setSelectedClass(String selectedClass);
    public default T selectedClass(String selectedClass) {
        setSelectedClass(selectedClass); return (T) this;
    }

    public void setStyle(String style);
    public default T style(String style) {
        setStyle(style); return (T) this;
    }

    public void setStyleClass(String styleClass);
    public default T styleClass(String styleClass) {
        setStyleClass(styleClass); return (T) this;
    }

    public void setTabindex(String tabindex);
    public default T tabindex(String tabindex) {
        setTabindex(tabindex); return (T) this;
    }

    public void setTitle(String title);
    public default T title(String title) {
        setTitle(title); return (T) this;
    }

    public void setUnselectedClass(String unselectedClass);
    public default T unselectedClass(String unselectedClass) {
        setUnselectedClass(unselectedClass); return (T) this;
    }
}

