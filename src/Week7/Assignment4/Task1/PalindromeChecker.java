package Week7.Assignment4.Task1;

public class PalindromeChecker {

    public boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) return true;

        String cleaned = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();

        return cleaned.equals(reversed);
    }
}

