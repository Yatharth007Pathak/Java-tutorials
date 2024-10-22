// Inverted Pyramid Pattern

public class gd {

    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Here’s a breakdown of the provided Java code, line by line:

public class gd {: This line defines a public class named gd. In Java, every application must have at least one class definition.

public static void main(String[] args) {: This is the main method, which serves as the entry point for the Java application. 

int rows = 5;: This line declares an integer variable named rows and initializes it with the value 5. 
This variable represents the number of rows for the inverted pyramid pattern that will be printed.

for (int i = rows; i >= 1; i--) {: This is the outer for loop, which controls the number of rows in the inverted pyramid. 
It starts with i = rows (i.e., 5) and runs as long as i is greater than or equal to 1. The value of i decrements by 1 in each iteration.

for (int j = rows; j > i; j--) {: This is the first inner for loop, which prints spaces before the stars in each row. 
It starts with j = rows and runs until j is greater than i. 
The loop decrements j by 1 in each iteration, effectively adding spaces to align the stars in an inverted pyramid shape.

System.out.print(" ");: This line prints a single space character without moving to the next line. 
This creates the leading spaces required to align the stars in an inverted manner.

for (int k = 1; k <= (2 * i - 1); k++) {: This is the second inner for loop, which prints the stars (*) for each row. 
It starts with k = 1 and runs until k is less than or equal to (2 * i - 1). 
This formula ensures a decreasing number of stars in each row, forming an inverted pyramid shape. 
The number of stars decreases by 2 in each subsequent row.

System.out.print("*");: This line prints a star (*) without moving to the next line. 
It is used within the second inner loop to print all the stars for the current row.

System.out.println();: After completing the inner loops for a given row, this line moves the cursor to the next line, 
allowing the next row of the inverted pyramid to be printed.

}: This closing brace marks the end of the outer for loop.

}: This closing brace marks the end of the main method.

}: This closing brace marks the end of the class definition.

Summary:
*/