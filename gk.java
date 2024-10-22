// Inverted Right-Angled Triangle Number Pattern

public class gk {
    
    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

/*

Here’s a breakdown of the provided Java code, line by line:

public class gk {: This line defines a public class named gk. In Java, every application must have at least one class definition.

public static void main(String[] args) {: This is the main method, which serves as the entry point for the Java application. 

int rows = 5;: This line declares an integer variable named rows and initializes it with the value 5. 
This variable determines the number of rows that will be printed in the pattern.

for (int i = rows; i >= 1; i--) {: This is the outer for loop that iterates through each row of the pattern in reverse order. 
It starts with i equal to rows (5) and continues until i is greater than or equal to 1, decrementing i by 1 in each iteration.

for (int j = 1; j <= i; j++) {: This is the inner for loop that iterates through the numbers in the current row. 
It starts with j = 1 and continues until j is less than or equal to i, incrementing j by 1 in each iteration.

System.out.print(j + " ");: This line prints the current value of j, followed by a space. This outputs the numbers for the current row.

}: This closing brace marks the end of the inner for loop.

System.out.println();: This line moves the cursor to the next line after completing the inner loop, allowing the next row of numbers to be printed.

}: This closing brace marks the end of the outer for loop.

}: This closing brace marks the end of the main method.

}: This closing brace marks the end of the class definition.
*/