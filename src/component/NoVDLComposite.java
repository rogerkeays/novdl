package jamaica.faces.component;

import jamaica.faces.component.FluentUIPanel;
import javax.faces.component.UIPanel;


public class NoVDLComposite extends UIPanel
            implements FluentUIPanel<NoVDLComposite> {

    public static NoVDLComposite n_composite() {
        return new NoVDLComposite();
    }
}

