//  Java program that takes a number n as input and calculates the sum of all even numbers up to n

import java.util.Scanner;

public class cv {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the value of n
        System.out.print("Enter a positive integer (n): ");
        int n = scanner.nextInt();

        // Variable to store the sum of even numbers
        int sum = 0;

        // Loop to calculate the sum of even numbers up to n
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {  // Check if the number is even
                sum += i;  // Add the even number to sum
            }
        }

        // Display the result
        System.out.println("The sum of even numbers up to " + n + " is: " + sum);

        // Close the scanner
        scanner.close();
    }
}