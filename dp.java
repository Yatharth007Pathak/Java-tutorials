// We can use nested loops to iterate through a multidimensional array: Example with Looping through a 2D Array:

public class dp {
    
    public static void main(String[] args) {
        // Declaring and initializing a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Looping through the 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}

/*
Here’s a line-by-line breakdown of the provided Java code:

public class dn {
Defines a public class named dn. In Java, classes act as blueprints for creating objects.

public static void main(String[] args) {
Declares the main method, which is the entry point of the Java program. It is public (accessible from anywhere), 
static (can be called without creating an instance of the class), and does not return a value (void). 
The String[] args parameter allows for command-line arguments.

int[][] matrix = {
Declares and initializes a two-dimensional (2D) integer array named matrix. This array will hold rows and columns of integers.

{1, 2, 3},
The first row of the matrix, containing the elements 1, 2, and 3.

{4, 5, 6},
The second row of the matrix, containing the elements 4, 5, and 6.

{7, 8, 9}
The third row of the matrix, containing the elements 7, 8, and 9.

};
Closes the initialization of the matrix array.

for (int i = 0; i < matrix.length; i++) {
Begins the outer for loop, which iterates over the rows of the matrix. 
The loop variable i is initialized to 0 and continues as long as i is less than the number of rows in the matrix (matrix.length).

for (int j = 0; j < matrix[i].length; j++) {
Begins the inner for loop, which iterates over the columns of the current row (matrix[i]). 
The loop variable j is initialized to 0 and continues as long as j is less than the number of columns in the current row (matrix[i].length).

System.out.print(matrix[i][j] + " ");
Inside the inner loop, this line prints the current element at row i and column j of the matrix, followed by a space. 
This prints all elements in the current row on the same line.

}
Closes the inner for loop that iterates through the columns of the current row.

System.out.println();
After the inner loop completes, this line prints a newline character, moving the cursor to the next line. 
This ensures that the next row of the matrix will be printed on a new line.

}
Closes the outer for loop that iterates through the rows of the matrix.

}
Closes the main method.

}
Closes the class definition.
*/