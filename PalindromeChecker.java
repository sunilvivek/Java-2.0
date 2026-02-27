import java.util.Stack;

public class PalindromeChecker {

    public static void main(String[] args) {

        // Hardcoded string
        String word = "madam";

        // Create a stack of characters
        Stack<Character> stack = new Stack<>();

        // Push all characters into the stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop characters and build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Check palindrome
        if (word.equals(reversed)) {
            System.out.println(word + " is a Palindrome.");
        } else {
            System.out.println(word + " is NOT a Palindrome.");
        }

        System.out.println("Program exited successfully.");
    }
}