// Inverted Pyramid Number Pattern

public class gm {
    
    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}

/*
 Here’s a breakdown of the provided Java code, line by line:

public class gm {: This line defines a public class named gm. In Java, every application must have at least one class definition.

public static void main(String[] args) {: This is the main method, which serves as the entry point for the Java application. 

int rows = 5;: This line declares an integer variable named rows and initializes it with the value 5. 
This variable determines the number of rows that will be printed in the pattern.

for (int i = rows; i >= 1; i--) {: This is the outer for loop that iterates through each row of the pattern in reverse order. 
It starts with i equal to rows (5) and continues until i is greater than or equal to 1, decrementing i by 1 in each iteration.

for (int j = rows; j > i; j--) {: This is the first inner for loop that handles the printing of spaces before the numbers in the current row. 
It starts with j equal to rows and continues until j is greater than i. 
This loop determines how many spaces are printed to align the numbers properly.

System.out.print(" ");: This line prints a space for each iteration of the inner loop, 
effectively creating the necessary indentation for the current row.

for (int k = 1; k <= i; k++) {: This is the second inner for loop that prints the numbers in the current row. 
It starts with k = 1 and continues until k is less than or equal to i, incrementing k by 1 in each iteration.

System.out.print(k + " ");: This line prints the current value of k, followed by a space. This outputs the numbers for the current row.

}: This closing brace marks the end of the second inner for loop.

System.out.println();: This line moves the cursor to next line after completing the inner loops, allowing the next row of numbers to be printed.

}: This closing brace marks the end of the outer for loop.

}: This closing brace marks the end of the main method.

}: This closing brace marks the end of the class definition.
*/