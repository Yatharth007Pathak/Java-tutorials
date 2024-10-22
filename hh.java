// Alpha-Numeric Butterfly Pattern

public class hh {
    
    public static void main(String[] args) {
        int rows = 5;

        // Upper part of the butterfly
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1) + " ");
            }
            for (int k = i * 2; k < rows * 2; k++) {
                System.out.print("  ");
            }
            for (int l = i; l >= 1; l--) {
                System.out.print(l + " ");
            }
            System.out.println();
        }

        // Lower part of the butterfly
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) ('A' + j - 1) + " ");
            }
            for (int k = i * 2; k < rows * 2; k++) {
                System.out.print("  ");
            }
            for (int l = i; l >= 1; l--) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
    }
}

/*
Let's break down the provided Java code line by line, explaining its functionality:

public class hh { declares a public class named hh. In Java, classes are the building blocks of programs.

public static void main(String[] args) { defines the main method where the program execution begins. 
The method can accept an array of strings as arguments.

int rows = 5; initializes an integer variable rows to 5, indicating the number of rows for the butterfly pattern.

The first for loop for (int i = 1; i <= rows; i++) iterates from 1 to 5 (inclusive), 
controlling the current row in the upper half of the butterfly.

Inside the first loop, the nested loop for (int j = 1; j <= i; j++) runs from 1 to i, printing the characters from 'A' to the 
corresponding character based on the current row. The expression (char) ('A' + j - 1) calculates the character to print, 
and System.out.print((char) ('A' + j - 1) + " "); prints it followed by a space.

The second nested loop for (int k = i * 2; k < rows * 2; k++) is responsible for printing spaces. 
It starts from i * 2 to rows * 2, creating the appropriate indentation for the butterfly shape.
Each iteration prints two spaces: System.out.print(" ");.

The third nested loop for (int l = i; l >= 1; l--) prints the descending numbers from i to 1. 
The statement System.out.print(l + " "); outputs each number followed by a space.

System.out.println(); moves the cursor to the next line after completing the current row.

The second main for loop for (int i = rows; i >= 1; i--) controls the rows for the lower half of the butterfly, iterating from 5 down to 1.

The same structure of nested loops is used in this section, replicating the character and space printing for the lower half, 
ensuring a symmetrical butterfly pattern.

The closing braces } for both the main method and the class end the program structure.
*/