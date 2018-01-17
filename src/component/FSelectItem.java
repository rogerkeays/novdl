package jamaica.faces.component;

import javax.faces.component.UISelectItem;

public class FSelectItem extends UISelectItem 
        implements FluentUISelectItem<FSelectItem> {

    public static FSelectItem f_selectItem() {
        return new FSelectItem();
    }
}
