package jamaica.faces.novdl;

import static jamaica.faces.novdl.get_view_class_name.get_view_class_name;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class has_java_implementation {

    /**
     * Check if the given view ID has a java implementation of the Activity 
     * interface.
     */
    public static boolean has_java_implementation(String view_id) {
        try {
            return Activity.class.isAssignableFrom(
                    Class.forName(get_view_class_name(view_id)));
        } catch (ClassNotFoundException e) {
            return false; 
        }
    }


    @Test
    public static void test_activity_class_has_java_implementation() {
        assertTrue(has_java_implementation(
                "/jamaica/faces/novdl/Activity.xhtml"));
    }

    @Test 
    public static void text_invalid_view_is_has_no_implementation() {
        assertFalse(has_java_implementation("/some/other/view.xhtml"));
    }
}
