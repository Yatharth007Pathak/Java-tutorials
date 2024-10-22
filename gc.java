// Pyramid Pattern

public class gc {
    
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
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

public class gc {: This line defines a public class named gc. In Java, every application must have at least one class definition.

public static void main(String[] args) {: This is the main method, which serves as the entry point for the Java application. 
The method is declared as public (accessible from anywhere), static (can be called without creating an instance of the class), 
and it takes an array of String arguments.

int rows = 5;: This line declares an integer variable named rows and initializes it with the value 5. 
This variable represents the number of rows for the pyramid pattern that will be printed.

for (int i = 1; i <= rows; i++) {: This is the outer for loop, which controls the number of rows in the pyramid. 
It starts with i = 1 and runs until i is less than or equal to rows (i.e., 5), incrementing i by 1 in each iteration.

for (int j = i; j < rows; j++) {: This is the first inner for loop, which prints spaces before the stars in each row. 
It starts with j = i and runs until j is less than rows. 
It increments j by 1 in each iteration, effectively adding spaces to align the stars into a pyramid shape.

System.out.print(" ");: This line prints a single space character without moving to the next line. 
This creates the leading spaces required to center-align the stars for each row of the pyramid.

for (int k = 1; k <= (2 * i - 1); k++) {: This is the second inner for loop, which prints the stars (*) for each row. 
It starts with k = 1 and runs until k is less than or equal to (2 * i - 1). 
This formula ensures an increasing number of stars in each row, making the shape of a pyramid. 
The number of stars increases by 2 in each subsequent row.

System.out.print("*");: This line prints a star (*) without moving to the next line. 
It is used within the second inner loop to print all the stars for the current row.

System.out.println();: After completing the inner loops for a given row, this line moves the cursor to the next line, 
allowing the next row of the pyramid to be printed.

}: This closing brace marks the end of the outer for loop.

}: This closing brace marks the end of the main method.

}: This closing brace marks the end of the class definition.
*/