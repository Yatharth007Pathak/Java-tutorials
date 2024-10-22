// Floating-point Numbers: To read a floating-point number (float or double), we nextFloat() or nextDouble().

import java.util.Scanner;

public class bl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a float value
        System.out.print("Enter a float value: ");
        float floatNumber = scanner.nextFloat();  // Reads a float value

        // Read a double value
        System.out.print("Enter a double value: ");
        double doubleNumber = scanner.nextDouble();  // Reads a double value

        System.out.println("Float: " + floatNumber);
        System.out.println("Double: " + doubleNumber);

        scanner.close();
    }
}

// This code reads both float and double values.

/*
Enter a float value: 12.34
Enter a double value: 45.6789
Float: 12.34
Double: 45.6789
*/