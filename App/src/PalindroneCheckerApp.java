import java.util.Scanner;

/**
 * ============================================================
 * MAIN CLASS - PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 4: Character Array Based Palindrome Check
 *
 * Description:
 * This implementation checks whether a given string is
 * a palindrome by converting the string into a character
 * array and comparing elements using the two-pointer technique.
 *
 * Concepts Used:
 * - Scanner
 * - String
 * - char[]
 * - Two-pointer approach
 * - Loop control
 */

public class PalindroneCheckerApp {

    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // Convert string to character array
        char[] characters = input.toCharArray();

        // Initialize two pointers
        int start = 0;
        int end = characters.length - 1;

        boolean isPalindrome = true;

        // Compare characters from both ends
        while (start < end) {

            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Display result
        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }

        scanner.close();
    }
}