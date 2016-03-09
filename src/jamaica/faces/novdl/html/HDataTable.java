package jamaica.faces.novdl.html;

import javax.faces.model.DataModel;
import javax.faces.component.html.HtmlDataTable;
import jamaica.faces.component.html.FluentHtmlDataTable;


public class HDataTable extends HtmlDataTable
            implements FluentHtmlDataTable<HDataTable> {

    public HDataTable dataModel(DataModel model) {
        setDataModel(model); return this;
    }

    public static HDataTable h_dataTable() {
        return new HDataTable();
    }
}

