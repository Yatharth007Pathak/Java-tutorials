// Java code that allows the user to input a number and prints its multiplication table.

import java.util.Scanner;

public class ct {

    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the number
        System.out.print("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();

        // Loop to print the multiplication table
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        // Close the scanner
        scanner.close();
    }
}