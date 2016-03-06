package jamaica.jsf.novdl.fluent;

import jamaica.jsf.novdl.NoVDLUtil;
import javax.faces.component.UISelectItem;
import javax.faces.component.UISelectOne;
import javax.faces.convert.Converter;

public class AddSelect extends UISelectOne {

    public AddSelect() {}
    public AddSelect(Object value) {
        value(value);
    }

    public AddSelect id(String id) {
        setId(id);
        return this;
    }

    public AddSelect add(UISelectItem item) {
        getChildren().add(item);
        return this;
    }

    public AddSelect add(Class<? extends Enum> e) {
        for (Enum option : e.getEnumConstants()) {
            getChildren().add(new AddOption(option, option.toString()));
        }
        return this;
    }

    public AddSelect converter(Converter converter) {
        setConverter(converter);
        return this;
    }

    public AddSelect value(Object value) {
        if (!NoVDLUtil.setValueExpression(this, getFacesContext(), "value", value)) {
            setValue(value);
        }
        return this;
    }
}
