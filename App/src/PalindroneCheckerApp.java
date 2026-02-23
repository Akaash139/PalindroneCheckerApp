import java.util.Scanner;
import java.util.Stack;

/**
 * ============================================================
 * MAIN CLASS - PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 5: Stack-Based Palindrome Checker
 *
 * Description:
 * This implementation checks whether a given string
 * is a palindrome using Stack (LIFO principle).
 */

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // Create Stack
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        boolean isPalindrome = true;

        // Compare original characters with popped characters
        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        scanner.close();
    }
}