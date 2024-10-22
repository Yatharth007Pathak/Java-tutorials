import java.util.Scanner;

public class bh {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Ask for user input
        System.out.print("Enter your name: ");
        String name = sc.nextLine();  // Read a line of text (String)

        System.out.print("Enter your age: ");
        int age = sc.nextInt();  // Read an integer (int)

        // Output the user's input
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);

        // Close the scanner to avoid resource leaks
        sc.close();
    }
}

/*
Key Methods of Scanner:
nextLine(): Reads an entire line of input (String).
nextInt(): Reads an integer value.
nextFloat(): Reads a floating input.
nextDouble(): Reads a double value.
nextBoolean(): Reads a boolean value.
*/