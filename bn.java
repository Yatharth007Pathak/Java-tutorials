// Character Input: Scanner doesn't have a direct method to read a single character, but we can use next().charAt(0) to achieve this.

import java.util.Scanner;

public class bn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a character
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);  // Reads the first character of input

        System.out.println("Character: " + character);

        scanner.close();
    }
}

// This code reads a single character from the user.

/*
Enter a character: A
Character: A
*/