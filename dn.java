// Three-Dimensional Array:

public class dn {
    
    public static void main(String[] args) {
        // Declaring and initializing a 3D array
        int[][][] cube = {
            {
                {1, 2}, 
                {3, 4}
            },
            {
                {5, 6}, 
                {7, 8}
            }
        };

        // Accessing an element
        int value = cube[1][0][1]; // Accesses the element at the second 2D array, first row, second column
        System.out.println("The value at cube[1][0][1] is: " + value);
    }
}

/*
Here’s a line-by-line breakdown of the provided Java code:

public class dm {
Defines a public class named dm. In Java, classes are the blueprint for creating objects.

public static void main(String[] args) {
Declares the main method, which serves as the entry point of the Java program. It is public (accessible from anywhere), 
static (can be called without creating an instance of the class), and does not return a value (void). 
The String[] args parameter allows command-line arguments.

int[][][] cube = {
Declares and initializes a three-dimensional (3D) integer array named cube. This array can be visualized as a collection of 2D arrays.

{
Starts the first 2D array within the cube.

{1, 2},
The first row of the first 2D array, containing the elements 1 and 2.

{3, 4}
The second row of the first 2D array, containing the elements 3 and 4.

},
Closes the first 2D array and prepares to start the second one.

{
Starts the second 2D array within the cube.

{5, 6},
The first row of the second 2D array, containing the elements 5 and 6.

{7, 8}
The second row of the second 2D array, containing the elements 7 and 8.

}
Closes the second 2D array.

};
Closes the initialization of the cube array.

int value = cube[1][0][1];
Accesses the element at the second 2D array (index 1), first row (index 0), second column (index 1) of the cube array. 
This corresponds to the value 6 and assigns it to the integer variable value.

System.out.println("The value at cube[1][0][1] is: " + value);
Prints a message to the console, displaying the value retrieved from the cube at the specified indices. 
In this case, it will print "The value at cube[1][0][1] is: 6".

}
Closes the main method.

}
Closes the class definition.
*/