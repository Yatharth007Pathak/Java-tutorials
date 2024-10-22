// Java program to find the sum of all even numbers up to n without using an if condition.

import java.util.Scanner;

public class cw {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the value of n
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

        // Variable to store the sum of even numbers
        int sum = 0;

        // Loop to calculate the sum of even numbers up to n
        for (int i = 2; i <= n; i += 2) {  // Start at 2, increment by 2
            sum += i;
        }

        // Display the result
        System.out.println("The sum of even numbers up to " + n + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}