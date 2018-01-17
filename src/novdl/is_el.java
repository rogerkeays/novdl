package jamaica.faces.novdl;

import java.util.Date;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class is_el {
 
    /**
     * Determine if the given object is an EL expression. i.e. it is a String
     * starting with ${ or #{
     */
    public static boolean is_el(Object object) {
        return object instanceof String && (
                ((String) object).startsWith("${") || 
                ((String) object).contains("#{"));
    }


    @Test
    public static void test_valid_$el_string_returns_true() {
        assertTrue(is_el("${this.is.el}"));
    }

    @Test
    public static void test_valid_hash_el_string_returns_true() {
        assertTrue(is_el("#{this.is.el}"));
    }

    @Test
    public static void test_invalid_el_string_return_false() {
        assertFalse(is_el("this is not el"));
    }

    @Test
    public static void test_non_string_returns_false() {
        assertFalse(is_el(new Date()));
    }
}
