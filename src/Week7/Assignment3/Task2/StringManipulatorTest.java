package Week7.Assignment3.Task2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringManipulatorTest {

    @Test
    void testConcatenate() {
        StringManipulator sm = new StringManipulator();
        assertEquals("hello world", sm.concatenate("hello ", "world"));
        assertEquals("123456", sm.concatenate("123", "456"));
    }

    @Test
    void testFindLength() {
        StringManipulator sm = new StringManipulator();
        assertEquals(11, sm.findLength("hello world"));
        assertEquals(0, sm.findLength(""));
    }

    @Test
    void testConvertToUpperCase() {
        StringManipulator sm = new StringManipulator();
        assertEquals("HELLO", sm.convertToUpperCase("hello"));
        assertEquals("WORLD", sm.convertToUpperCase("world"));
    }

    @Test
    void testConvertToLowerCase() {
        StringManipulator sm = new StringManipulator();
        assertEquals("hello", sm.convertToLowerCase("HELLO"));
        assertEquals("world", sm.convertToLowerCase("WORLD"));
    }

    @Test
    void testContainsSubstring() {
        StringManipulator sm = new StringManipulator();
        assertTrue(sm.containsSubstring("hello world", "world"));
        assertFalse(sm.containsSubstring("hello world", "java"));
    }
}
