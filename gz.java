// Alphabet Rhombus Pattern

public class gz {
    
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            char alphabet = 'A';
            for (int k = 1; k <= rows; k++) {
                System.out.print(alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }
    }
}

/*
Here’s a breakdown of the provided Java code, line by line:

public class gz {: This line defines a public class named gz. In Java, every application must have at least one class definition.

public static void main(String[] args) {: This is the main method, which serves as the entry point for the Java application. 

int rows = 5;: This line declares an integer variable named rows and initializes it with the value 5. 
This variable determines the number of rows to be printed in the pattern.

for (int i = 1; i <= rows; i++) {: This is the outer for loop that iterates through each row. 
It starts with i equal to 1 and continues until i is less than or equal to rows (i.e., 5), incrementing i by 1 in each iteration.

for (int j = rows; j > i; j--) {: This inner for loop handles the printing of spaces before the letters in the current row. 
It starts with j equal to rows and continues until j is greater than i. 
This loop determines how many spaces are printed to align the letters properly.

System.out.print(" ");: This line prints a single space for each iteration of the inner loop, 
creating the necessary indentation for the current row.

char alphabet = 'A';: This line initializes a character variable named alphabet with the value 'A'. 
This variable will be used to print the letters in the current row.

for (int k = 1; k <= rows; k++) {: This is the second inner for loop that prints the letters in the current row. 
It starts with k equal to 1 and continues until k is less than or equal to rows (i.e., 5), incrementing k by 1 in each iteration.

System.out.print(alphabet + " ");: This line prints the current value of alphabet, followed by a space. 
It outputs the character corresponding to the current value of alphabet.

alphabet++;: This line increments the value of alphabet by 1, so the next iteration will print the next letter in the alphabet.

}: This closing brace marks the end of the second inner for loop.

System.out.println();: This line moves the cursor to next line after completing the inner loops, allowing the next row of letters to be printed.

}: This closing brace marks the end of the outer for loop.

}: This closing brace marks the end of the main method.

}: This closing brace marks the end of the class definition.
*/