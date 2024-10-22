// Long Input: To read a long integer (long), use nextLong().

import java.util.Scanner;

public class bp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a long value
        System.out.print("Enter a long value: ");
        long longNumber = scanner.nextLong();  // Reads a long value

        System.out.println("Long: " + longNumber);

        scanner.close();
    }
}

// This code reads a long integer value from the user.

/*
Enter a long value: 1234567890123
Long: 1234567890123
*/