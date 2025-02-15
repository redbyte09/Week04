import com.stringoperatins.StringUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    StringUtils utils = new StringUtils(); // Create an instance of StringUtils

    @Test
    void testReverse() {
        assertEquals("olleh", utils.reverse("hello"));
        assertNull(utils.reverse(null)); // Check for null input
    }

    @Test
    void testIsPalindrome() {
        assertTrue(utils.isPalindrome("madam"));
        assertFalse(utils.isPalindrome("hello"));
    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", utils.toUpperCase("hello"));
        assertNull(utils.toUpperCase(null)); // Check for null input
    }
}
