// Mirror Number Right-Angled Triangle Pattern

public class gp {
    
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print("  ");
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

public class gp {: This line defines a public class named gp. In Java, every application must have at least one class definition.

public static void main(String[] args) {: This is the main method, which serves as the entry point for the Java application. 

int rows = 5;: This line declares an integer variable named rows and initializes it with the value 5. 
This variable determines the number of rows to be printed in the pattern.

for (int i = 1; i <= rows; i++) {: This is the outer for loop that iterates through each row. 
It starts with i equal to 1 and continues until i is less than or equal to rows (i.e., 5), incrementing i by 1 in each iteration.

for (int j = 1; j <= rows - i; j++) {: This is first inner for loop that handles the printing of spaces before the numbers in the current row.
It starts with j equal to 1 and continues until j is less than or equal to rows - i. 
This loop determines how many spaces are printed to align the numbers properly.

System.out.print(" ");: This line prints two spaces for each iteration of inner loop, creating the necessary indentation for the current row.

for (int k = 1; k <= i; k++) {: This is the second inner for loop that prints the numbers in the current row. 
It starts with k equal to 1 and continues until k is less than or equal to i, incrementing k by 1 in each iteration.

System.out.print(k + " ");: This line prints the current value of k, followed by a space. This outputs the numbers for the current row.

}: This closing brace marks the end of the second inner for loop.

System.out.println();: This line moves the cursor to next line after completing the inner loops, allowing the next row of numbers to be printed.

}: This closing brace marks the end of the outer for loop.

}: This closing brace marks the end of the main method.

}: This closing brace marks the end of the class definition.
*/