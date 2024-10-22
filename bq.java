// Reading Delimited Input: We can specify a custom delimiter using useDelimiter(). For example, if we want to read comma-separated values:

import java.util.Scanner;

public class bq {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Set comma as the delimiter
        scanner.useDelimiter(",");

        // Read comma-separated values
        System.out.print("Enter comma-separated values: ");
        String value1 = scanner.next();
        String value2 = scanner.next();

        System.out.println("Value 1: " + value1);
        System.out.println("Value 2: " + value2);

        scanner.close();
    }
}

// This code reads comma-separated values by setting the delimiter.

/*
Enter comma-separated values: apple,banana
Value 1: apple
Value 2: banana

*/