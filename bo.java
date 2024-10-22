// Byte and Short Input: To read byte and short values, we can use nextByte() and nextShort() respectively.

import java.util.Scanner;

public class bo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a byte value
        System.out.print("Enter a byte value: ");
        byte byteValue = scanner.nextByte();  // Reads a byte value

        // Read a short value
        System.out.print("Enter a short value: ");
        short shortValue = scanner.nextShort();  // Reads a short value

        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);

        scanner.close();
    }
}

// This code reads both a byte and a short value from the user.

/*
Enter a byte value: 12
Enter a short value: 1500
Byte: 12
Short: 1500
*/