// Multidimensional arrays in Java are arrays of arrays, allowing you to store data in a tabular format, such as matrices or grids.

public class dz {

    public static void main(String[] args) {
        
        // Initializes a 3x4 array
        int[][] matrix = {
            {11, 12, 13, 14},
            {15, 16, 17, 18},
            {19, 20, 21, 22}
        };

        int value = matrix[1][2];   // Accesses the element at row 2, column 3(value: 17)
        System.out.println(value);  // Prints the value 17

        System.out.println(matrix[2][3]);  // Prints the value at row 3, column 4 (value: 22)
        System.out.println(matrix[1][4]);  // IndexOutOfBoundsException
        
    }
}

/*
Here’s a line-by-line breakdown of the code in pointwise format:

public class dz {
This declares a public class named dz. In Java, a class is a blueprint from which objects are created, 
and the code inside this class defines its behavior.

public static void main(String[] args) {
This is the main method, the entry point of any Java program. It’s where the execution begins. 
public means the method can be accessed from anywhere, static means it belongs to the class rather than an instance, and void means it doesn’t return any value. String[] args is an array for command-line arguments.

int[][] matrix = { ... };
This defines a 2D integer array named matrix and initializes it with values. 
The array has 3 rows and 4 columns, where each inner array represents a row:

Row 1: {11, 12, 13, 14}
Row 2: {15, 16, 17, 18}
Row 3: {19, 20, 21, 22}
int value = matrix[1][2];
This extracts the value located at row 1, column 2 of the matrix. 
Arrays in Java are zero-indexed, meaning that matrix[1][2] refers to the third element of the second row, which is 17. 
The value 17 is assigned to the variable value.

System.out.println(value);
This prints the value stored in the value variable (which is 17) to the console.

System.out.println(matrix[2][3]);
This directly prints the element at row 2, column 3 of the matrix. 
Referring to matrix[2][3] points to the value in the third row, fourth column, which is 22.

System.out.println(matrix[1][4]);
This attempts to access the element at row 1, column 4, but there is no column 4 in the second row (it only has indices 0 to 3). 
This will result in an ArrayIndexOutOfBoundsException, as the array index 4 is out of bounds.
*/