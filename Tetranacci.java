/*
 *
 * @author  Giordan Zeina
 * @version 1.3
 * @since   2025-11-17
 */

import java.util.Scanner;

public class TetranacciSequence {

    /**
     * Recursive function to calculate the nth Tetranacci term.
     * @param n the index of the Tetranacci number
     * @return the nth Tetranacci number
     */
    public static long tetranacci(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 0;
        } else if (n == 3) {
            return 1;
        } else {
            return tetranacci(n - 1) + tetranacci(n - 2) + tetranacci(n - 3) + tetranacci(n - 4);
        }
    }

    /**
     * Generates and prints the first 'count' Tetranacci numbers.
     * @param count number of Tetranacci numbers to generate
     */
    public static void generateTetranacciSequence(int count) {
        System.out.println("Tetranacci sequence:");
        for (int i = 0; i < count; i++) {
            System.out.print(tetranacci(i) + " ");
        }
        System.out.println();
    }

    /**
     * Gets the input from user
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter how many Tetranacci numbers to generate: ");
            int num = scanner.nextInt();

            if (num <= 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                generateTetranacciSequence(num);
            }
        } catch (Exception e) {
            System.out.println("Invalid input! Please enter an integer.");
        } finally {
            scanner.close();
        }
    }
}
