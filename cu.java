// Java program that takes a number n as input and calculates the sum of the first n natural numbers.

import java.util.Scanner;

public class cu {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the value of n
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

        // Variable to store the sum of natural numbers
        int sum = 0;

        // Loop to calculate the sum of natural numbers
        for (int i = 1; i <= n; i++) {
            sum += i;  // Add i to sum
        }

        // Display the result
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);

        // Close the scanner
        scanner.close();
    }
}