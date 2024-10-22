// Three-dimensional arrays can be visualized as a cube or multiple two-dimensional matrices stacked together.

public class ec {

    public static void main(String[] args) {

        int[][][] cube = {
            {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
            },
            {
                {13, 14, 15, 16},
                {17, 18, 19, 20},
                {21, 22, 23, 24}
            }
        };

        int value = cube[1][2][3]; // Accesses the element at [1][2][3] (value: 24)
        System.out.println(value);

    }
}

/*
Here’s a detailed breakdown of the code line by line:

public class ec {
This declares a public class named ec. A class in Java is a blueprint for creating objects and defines the behavior of the program.

public static void main(String[] args) {
This is the main method where the program execution begins. The method has the signature required for the JVM to start the application.

int[][][] cube = { ... };
This declares and initializes a 3D array named cube. The array contains two 2D arrays, each of which has 3 rows and 4 columns.

The first 2D array:
Row 1: {1, 2, 3, 4}
Row 2: {5, 6, 7, 8}
Row 3: {9, 10, 11, 12}
The second 2D array:
Row 1: {13, 14, 15, 16}
Row 2: {17, 18, 19, 20}
Row 3: {21, 22, 23, 24}
int value = cube[1][2][3];
This accesses the value at index [1][2][3] in the 3D array. Here’s how to interpret this:

cube[1]: Refers to the second 2D array ({13, 14, 15, 16}, {17, 18, 19, 20}, {21, 22, 23, 24})
cube[1][2]: Refers to the third row of the second 2D array ({21, 22, 23, 24})
cube[1][2][3]: Refers to the fourth element of this row, which is 24.
Therefore, the value 24 is assigned to the variable value.

System.out.println(value);
This prints the value stored in the variable value (which is 24) to the console.
*/