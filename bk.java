// Integer Input: To read an integer (int), use nextInt().

import java.util.Scanner;

public class bk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();  // Reads an integer

        System.out.println("Integer: " + number);

        scanner.close();
    }
}

// This code reads an integer value from the user.

/*
Enter an integer: 25
Integer: 25
*/