// Looping Through a Two-Dimensional Array: We can use nested loops to iterate through each element of a two-dimensional array.

public class eb {
    
    public static void main(String[] args) {
        // Initialize a 2D array
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Loop through the 2D array and print each element
        System.out.println("Elements of the matrix:");
        for (int i = 0; i < matrix.length; i++) { // Iterate over rows
            for (int j = 0; j < matrix[i].length; j++) { // Iterate over columns
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }
    }
}

/*
Here's a detailed breakdown of the code:

public class eb {
This declares a public class named eb. A class in Java is a blueprint that contains fields and methods.

public static void main(String[] args) {
This is the main method of the program, where the execution starts. It takes an array of String arguments but does not use them in this case.

int[][] matrix = { ... };
This declares and initializes a 2D array matrix with 3 rows and 4 columns. The array is populated with the following values:

Row 1: {1, 2, 3, 4}
Row 2: {5, 6, 7, 8}
Row 3: {9, 10, 11, 12}
System.out.println("Elements of the matrix:");
This prints a message "Elements of the matrix:" to indicate that the matrix elements will be displayed next.

for (int i = 0; i < matrix.length; i++) {
This is the start of an outer for loop that iterates over each row of the 2D array. 
matrix.length gives the number of rows in the matrix, which is 3 in this case.

for (int j = 0; j < matrix[i].length; j++) {
This is an inner for loop that iterates over each column of the current row. 
matrix[i].length gives the number of columns in the current row, which is 4.

System.out.print(matrix[i][j] + " ");
Inside the inner loop, this statement prints each element in the current row followed by a space. 
The matrix[i][j] accesses the element at the i-th row and j-th column.

System.out.println();
This prints a newline after each row to separate the rows in the output. After the inner loop completes, 
it moves to the next row and prints the next set of elements on a new line.
*/