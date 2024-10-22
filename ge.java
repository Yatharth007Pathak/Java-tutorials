// Diamond Pattern

public class ge {
    
    public static void main(String[] args) {
        int rows = 5;

        // Upper part of the diamond
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = rows - 1; i >= 1; i--) {
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

public class ge {: This line defines a public class named ge. In Java, every application must have at least one class definition.

public static void main(String[] args) {: This is the main method, which serves as the entry point for the Java application. 

int rows = 5;: This line declares an integer variable named rows and initializes it with the value 5. 
This variable represents the number of rows for the diamond pattern that will be printed.

// Upper part of the diamond: This is a comment indicating that the following code block will handle the upper part of the diamond shape.

for (int i = 1; i <= rows; i++) {: This is the outer for loop for the upper part of the diamond. 
It starts with i = 1 and runs until i is less than or equal to rows (i.e., 5), incrementing i by 1 in each iteration.

for (int j = i; j < rows; j++) {: This is the first inner for loop,
which prints spaces before the stars in each row of the upper part of the diamond. 
It starts with j = i and runs until j is less than rows, effectively adding spaces to center-align the stars.

System.out.print(" ");: This line prints a single space character without moving to the next line, 
creating the leading spaces required for centering.

for (int k = 1; k <= (2 * i - 1); k++) {: This is the second inner for loop, which prints the stars (*) for each row of the upper part. 
It starts with k = 1 and runs until k is less than or equal to (2 * i - 1), ensuring an increasing number of stars.

System.out.print("*");: This line prints a star (*) without moving to the next line. 
It is used within the second inner loop to print all the stars for the current row.

System.out.println();: After completing the inner loops for a given row in the upper part, 
this line moves the cursor to the next line to start printing the next row.

// Lower part of the diamond: This is a comment indicating that the following code block will handle the lower part of the diamond shape.

for (int i = rows - 1; i >= 1; i--) {: This is the outer for loop for the lower part of the diamond. 
It starts with i = rows - 1 (i.e., 4) and runs as long as i is greater than or equal to 1, decrementing i by 1 in each iteration.

for (int j = rows; j > i; j--) {: This is the first inner for loop for the lower part, which prints spaces before the stars. 
It starts with j = rows and runs until j is greater than i, effectively adding spaces to center-align the stars.

System.out.print(" ");: This line prints a single space character without moving to the next line, 
creating the leading spaces required for the lower part of the diamond.

for (int k = 1; k <= (2 * i - 1); k++) {: This is the second inner for loop for the lower part, which prints the stars. 
It starts with k = 1 and runs until k is less than or equal to (2 * i - 1), ensuring a decreasing number of stars.

System.out.print("*");: This line prints a star (*) without moving to the next line. 
It is used within the second inner loop to print all the stars for the current row of the lower part.

System.out.println();: After completing the inner loops for a given row in the lower part, 
this line moves the cursor to the next line to start printing the next row.

}: This closing brace marks the end of the outer loop for the lower part of the diamond.

}: This closing brace marks the end of the main method.

}: This closing brace marks the end of the class definition.
*/
