import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * ============================================================
 * MAIN CLASS - PalindromeCheckerApp
 * ============================================================
 *
 * UC6: Queue + Stack Based Palindrome Check
 *
 * Goal:
 * Demonstrate FIFO vs LIFO using Queue and Stack.
 *
 * Flow:
 * 1. Enqueue characters into Queue.
 * 2. Push characters into Stack.
 * 3. Compare dequeue (Queue) with pop (Stack).
 *
 * Key Concepts:
 * - Queue (FIFO principle)
 * - Stack (LIFO principle)
 * - Enqueue & Dequeue operations
 * - push() & pop() operations
 * - Logical comparison
 *
 * Data Structures Used:
 * Queue, Stack

 */

public class PalindroneCheckerApp {

    public static void main(String[] args) {

        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String input = scanner.nextLine();

        // Create Queue (FIFO)
        Queue<Character> queue = new LinkedList<>();

        // Create Stack (LIFO)
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (char c : input.toCharArray()) {
            queue.add(c);   // Enqueue operation
            stack.push(c);  // Push operation
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop
        while (!queue.isEmpty()) {

            char fromQueue = queue.remove();  // Dequeue
            char fromStack = stack.pop();     // Pop

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
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