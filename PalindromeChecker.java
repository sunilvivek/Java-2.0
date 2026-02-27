public class PalindromeChecker {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "racecar";

        // Convert string to character array
        char[] chars = word.toCharArray();

        // Initialize two pointers
        int start = 0;
        int end = chars.length - 1;

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Two-pointer comparison
        while (start < end) {
            if (chars[start] != chars[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

        System.out.println("Program exited successfully.");
    }
}