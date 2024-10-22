//  Boolean Input: To read a boolean value (true or false), use nextBoolean().

import java.util.Scanner;

public class bm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a boolean value
        System.out.print("Enter a boolean value (true/false): ");
        boolean boolValue = scanner.nextBoolean();  // Reads a boolean value

        System.out.println("Boolean: " + boolValue);

        scanner.close();
    }
}

// This code reads a boolean value from the user.

/*
Enter a boolean value (true/false): true
Boolean: true
*/