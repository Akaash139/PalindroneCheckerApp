import java.util.Scanner;

/**
 * ============================================================
 * MAIN CLASS - PalindromeCheckerApp
 * ============================================================
 *
 * Use Case 3: Palindrome Check Using String Reverse
 *
 * Description:
 * This implementation checks whether a given string is
 * a palindrome by reversing the string and comparing it
 * with the original.
 *
 * Concepts Used:
 * - Scanner (User Input)
 * - String
 * - for loop
 * - charAt()
 * - equals() method
 * - String concatenationmadam
 */

public class PalindroneCheckerApp {

    /**
     * Application entry point for UC3.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Create Scanner object
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a word: ");
        String original = scanner.nextLine();

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed strings
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome.");
        } else {
            System.out.println(original + " is NOT a Palindrome.");
        }

        scanner.close();
    }
}