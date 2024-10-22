/*
In Java, a multidimensional array is an array of arrays. 
The most common form is a two-dimensional array, but we can have arrays with more than two dimensions as well.

Key Points
Declaration: Use multiple pairs of brackets to declare a multidimensional array.
Initialization: You can initialize it directly using nested curly braces.
Accessing Elements: Use multiple indices to access specific elements based on their dimensions.
*/

// Two-Dimensional Array:

public class dm {

    public static void main(String[] args) {
        // Declaring and initializing a 2D array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing an element
        int value = matrix[1][2]; // Accesses the element at row 1, column 2
        System.out.println("The value at matrix[1][2] is: " + value);
    }
}

/*
Here’s a line-by-line breakdown of the provided Java code:

public class dl {
Defines a public class named dl. In Java, classes serve as blueprints for creating objects.

public static void main(String[] args) {
Declares the main method, which is the entry point of the Java program. It is public (accessible from anywhere), 
static (can be called without creating an instance of the class), and does not return a value (void). 
The String[] args parameter allows for command-line arguments.

int[][] matrix = {
Declares and initializes a 2D integer array named matrix. The array is structured to hold rows and columns.

{1, 2, 3},
The first row of the matrix, containing the elements 1, 2, and 3.

{4, 5, 6},
The second row of the matrix, containing the elements 4, 5, and 6.

{7, 8, 9}
The third row of the matrix, containing the elements 7, 8, and 9.

};
Closes the initialization of the matrix array.

int value = matrix[1][2];
Accesses the element at row 1 and column 2 of the matrix array (which is the number 6) and assigns it to the integer variable value.

System.out.println("The value at matrix[1][2] is: " + value);
Prints a message to the console, displaying the value retrieved from the matrix at the specified indices. 
In this case, it will print "The value at matrix[1][2] is: 6".

}
Closes the main method.

}
Closes the class definition.
*/