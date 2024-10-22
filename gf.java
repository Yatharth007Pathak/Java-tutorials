// Hollow Square Pattern

public class gf {
    
    public static void main(String[] args) {
        int size = 5;

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*
Here’s a breakdown of the provided Java code, line by line:

public class gf {: This line defines a public class named gf. In Java, every application must have at least one class definition.

public static void main(String[] args) {: This is the main method, which serves as the entry point for the Java application. 

int size = 5;: This line declares an integer variable named size and initializes it with the value 5. 
This variable represents the size (or dimensions) of the square that will be printed.

for (int i = 1; i <= size; i++) {: This is the outer for loop, which controls the number of rows in the square. 
It starts with i = 1 and runs until i is less than or equal to size (i.e., 5), incrementing i by 1 in each iteration.

for (int j = 1; j <= size; j++) {: This is the inner for loop, which controls the number of columns in each row of the square. 
It starts with j = 1 and runs until j is less than or equal to size, incrementing j by 1 in each iteration.

if (i == 1 || i == size || j == 1 || j == size) {: This line checks whether the current position is on the border of the square. 
It evaluates to true if:

i is 1 (the first row)
i is equal to size (the last row)
j is 1 (the first column)
j is equal to size (the last column)
System.out.print("* ");: If the condition in the if statement is true, 
this line prints a star (*) followed by a space without moving to the next line. This is used to create the border of the square.

else {: This marks the beginning of the else block, which executes when the current position is not on the border.

System.out.print(" ");: This line prints two space characters without moving to the next line. 
This is used to fill the interior of the square with spaces.

}: This closing brace marks the end of the if-else statement.

}: This closing brace marks the end of the inner for loop.

System.out.println();: This line moves the cursor to the next line after completing a row, allowing the next row of the square to be printed.

}: This closing brace marks the end of the outer for loop.

}: This closing brace marks the end of the main method.

}: This closing brace marks the end of the class definition.
*/