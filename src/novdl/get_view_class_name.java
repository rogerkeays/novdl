package jamaica.faces.novdl;

import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class get_view_class_name {

    /**
     * Convert a viewID to a class name. This method presumes you are using
     * some sort of suffix-mapping, without actually caring what suffix you
     * use. The class name is the derived from the viewID after the first /.
     */
    public static String get_view_class_name(String viewID) {
        String className = viewID;
        if (className.startsWith("/")) {
            className = className.substring(1);
        }
        className = className.replace('/', '.');
        return className.substring(0, className.lastIndexOf('.'));
    }


    @Test
    public static void test_view_class_name_matches_view_id() {
        assertEquals("com.bar.foo.Class", 
                get_view_class_name("/com/bar/foo/Class.xhtml"));
    }

    @Test
    public static void test_jsp_path_mapping_is_accepted() {
        assertEquals("com.bar.foo.Class", 
                get_view_class_name("/com/bar/foo/Class.jsp"));
    }
}

