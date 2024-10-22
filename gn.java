// Diamond Number Pattern

public class gn {
    
    public static void main(String[] args) {
        int rows = 5;

        // Upper part of the diamond
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = rows - 1; i >= 1; i--) {
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

public class gn {: This line defines a public class named gn. In Java, every application must have at least one class definition.

public static void main(String[] args) {: This is the main method, which serves as the entry point for the Java application.

int rows = 5;: This line declares an integer variable named rows and initializes it with the value 5. 
This variable determines the number of rows for the upper part of the diamond pattern.

// Upper part of the diamond: This comment indicates that the following code will generate the upper part of the diamond.

for (int i = 1; i <= rows; i++) {: This is the outer for loop that iterates through each row of the upper part of the diamond. 
It starts with i = 1 and continues until i is less than or equal to rows (i.e., 5), incrementing i by 1 in each iteration.

for (int j = i; j < rows; j++) {: This is the first inner for loop that handles the printing of spaces before the numbers in the 
current row of the upper part. It starts with j equal to i and continues until j is less than rows. 
This loop determines how many spaces are printed to align the numbers properly.

System.out.print(" ");: This line prints a space for each iteration of the inner loop, 
effectively creating the necessary indentation for the current row.

for (int k = 1; k <= i; k++) {: This is the second inner for loop that prints the numbers in the current row of the upper part. 
It starts with k = 1 and continues until k is less than or equal to i, incrementing k by 1 in each iteration.

System.out.print(k + " ");: This line prints the current value of k, followed by a space. This outputs the numbers for the current row.

}: This closing brace marks the end of the second inner for loop.

System.out.println();: This line moves the cursor to the next line after completing the inner loops, 
allowing the next row of numbers to be printed.

}: This closing brace marks the end of the outer for loop for the upper part of the diamond.

// Lower part of the diamond: This comment indicates that the following code will generate the lower part of the diamond.

for (int i = rows - 1; i >= 1; i--) {: This is the outer for loop that iterates through each row of the lower part of the diamond. 
It starts with i equal to rows - 1 (i.e., 4) and continues until i is greater than or equal to 1, decrementing i by 1 in each iteration.

for (int j = rows; j > i; j--) {: This is the first inner for loop that handles the printing of spaces before the numbers 
in the current row of the lower part. It starts with j equal to rows and continues until j is greater than i. 
This loop determines how many spaces are printed to align the numbers properly.

System.out.print(" ");: This line prints a space for each iteration of the inner loop, 
effectively creating the necessary indentation for the current row.

for (int k = 1; k <= i; k++) {: This is the second inner for loop that prints the numbers in the current row of the lower part. 
It starts with k = 1 and continues until k is less than or equal to i, incrementing k by 1 in each iteration.

System.out.print(k + " ");: This line prints the current value of k, followed by a space. This outputs the numbers for the current row.

}: This closing brace marks the end of the second inner for loop.

System.out.println();: This line moves the cursor to next line after completing the inner loops, allowing the next row of numbers to be printed.

}: This closing brace marks the end of the outer for loop for the lower part of the diamond.

}: This closing brace marks the end of the main method.

}: This closing brace marks the end of the class definition.
*/