package jamaica.jsf.novdl.fluent;

import javax.faces.component.UISelectItem;

public class AddOption extends UISelectItem {
    public AddOption(Object value, String label)  {
        setItemLabel(label);
        setItemValue(value);
    }
}
