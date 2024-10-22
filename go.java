// Number Triangle Pattern with the Same Value

public class go {
    
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

/*
Here’s a breakdown of the provided Java code, line by line:

public class go {: This line defines a public class named go. In Java, every application must have at least one class definition.

public static void main(String[] args) {: This is the main method, which serves as the entry point for the Java application. 

int rows = 5;: This line declares an integer variable named rows and initializes it with the value 5. 
This variable determines the number of rows that will be printed in the pattern.

for (int i = 1; i <= rows; i++) {: This is the outer for loop that iterates through each row. 
It starts with i equal to 1 and continues until i is less than or equal to rows (i.e., 5), incrementing i by 1 in each iteration.

for (int j = 1; j <= i; j++) {: This is the inner for loop that handles the printing of numbers in the current row. 
It starts with j equal to 1 and continues until j is less than or equal to i. 
This loop determines how many times the current row number i will be printed.

System.out.print(i + " ");: This line prints the current value of i, followed by a space. 
This outputs the row number i multiple times in the current row.

}: This closing brace marks the end of the inner for loop.

System.out.println();: This line moves the cursor to next line after completing the inner loop, allowing the next row of numbers to be printed.

}: This closing brace marks the end of the outer for loop.

}: This closing brace marks the end of the main method.

}: This closing brace marks the end of the class definition.
*/