// Right-Angled Triangle Pattern

public class ga {
    
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

/*
Here’s a breakdown of the provided Java code, line by line:

public class ga {: This line defines a public class named ga. In Java, every application must have at least one class definition.

public static void main(String[] args) {: This is the main method, which serves as the entry point for the Java application. 
The method is declared as public (accessible from anywhere), static (can be called without creating an instance of the class), 
and it takes an array of String arguments.

int rows = 5;: This line declares an integer variable named rows and initializes it with the value 5. 
This variable represents the number of rows for the pattern that will be printed.

for (int i = 1; i <= rows; i++) {: This is the outer for loop, which controls the number of rows to be printed. 
The loop starts with i = 1 and runs as long as i is less than or equal to rows (i.e., 5). It increments i by 1 in each iteration.

for (int j = 1; j <= i; j++) {: This is the inner for loop, which controls the number of stars (*) printed in each row. 
The loop starts with j = 1 and runs as long as j is less than or equal to i. It increments j by 1 in each iteration.

System.out.print("* ");: This line prints a star (*) followed by a space, without moving to the next line. 
This is done repeatedly within the inner loop to print multiple stars on the same line.

System.out.println();: After the inner loop completes for a given value of i, 
this line moves the cursor to the next line to start printing stars for the next row.

}: This closing brace marks the end of the outer for loop.

}: This closing brace marks the end of the main method.

}: This closing brace marks the end of the class definition.
*/