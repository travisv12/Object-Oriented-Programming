package Week7.Assignment4.Task1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindrome() {
        PalindromeChecker checker = new PalindromeChecker();

        assertTrue(checker.isPalindrome("radar"), "radar should be a palindrome");
        assertTrue(checker.isPalindrome("A man, a plan, a canal, Panama"),
                "Case and punctuation should be ignored");
        assertFalse(checker.isPalindrome("hello"), "hello is not a palindrome");
        assertFalse(checker.isPalindrome("openai"), "openai is not a palindrome");
    }

    @Test
    public void testEmptyAndSingleCharacterStrings() {
        PalindromeChecker checker = new PalindromeChecker();

        assertTrue(checker.isPalindrome(""), "An empty string should be a palindrome");
        assertTrue(checker.isPalindrome("a"), "A single character is always a palindrome");
    }
}
