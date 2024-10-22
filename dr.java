// new keyword is used to create arrays and demonstrates the default values assigned to different types of arrays in Java

public class dr {

    public static void main(String[] args) {
        // Declare and initialize arrays using the new keyword
        int[] intArray = new int[5];                  // Default value is 0
        double[] doubleArray = new double[5];         // Default value is 0.0
        boolean[] booleanArray = new boolean[5];      // Default value is false
        String[] stringArray = new String[5];         // Default value is null

        // Print default values of the integer array
        System.out.println("Default values in intArray:");
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]); // Outputs: 0
        }

        // Print default values of the double array
        System.out.println("\nDefault values in doubleArray:");
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]); // Outputs: 0.0
        }

        // Print default values of the boolean array
        System.out.println("\nDefault values in booleanArray:");
        for (int i = 0; i < booleanArray.length; i++) {
            System.out.println(booleanArray[i]); // Outputs: false
        }

        // Print default values of the String array
        System.out.println("\nDefault values in stringArray:");
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]); // Outputs: null
        }
    }
}

/*
Here’s a line-by-line breakdown of the provided Java code:

public class dr {
Defines a public class named dr. In Java, classes are the templates for creating objects.

public static void main(String[] args) {
Declares the main method, which serves as the entry point of the Java program. 
It is public (accessible from anywhere), static (can be called without creating an instance of the class), and does not return a value (void). 
The String[] args parameter allows for command-line arguments.

int[] intArray = new int[5];
Declares and initializes an integer array named intArray with a capacity of 5 elements. 
The elements are automatically initialized to their default value of 0.

double[] doubleArray = new double[5];
Declares and initializes a double array named doubleArray with a capacity of 5 elements. 
The elements are automatically initialized to their default value of 0.0.

boolean[] booleanArray = new boolean[5];
Declares and initializes a boolean array named booleanArray with a capacity of 5 elements. 
The elements are automatically initialized to their default value of false.

String[] stringArray = new String[5];
Declares and initializes a String array named stringArray with a capacity of 5 elements. 
The elements are automatically initialized to their default value of null.

System.out.println("Default values in intArray:");
Prints the string "Default values in intArray:" to the console, 
indicating that the following output will display the default values of the integer array.

for (int i = 0; i < intArray.length; i++) {
Begins a for loop that iterates over each element of the intArray. 
The loop variable i is initialized to 0 and continues as long as i is less than the length of the array (intArray.length), which is 5.

System.out.println(intArray[i]);
Inside the for loop, this line prints the current element of the intArray at index i to the console.

}
Closes the for loop that iterates through the elements of the intArray.

System.out.println("\nDefault values in doubleArray:");
Prints a newline character followed by the string "Default values in doubleArray:" to the console, 
indicating that the next output will display the default values of the double array.

for (int i = 0; i < doubleArray.length; i++) {
Begins a for loop that iterates over each element of the doubleArray.

System.out.println(doubleArray[i]);
Inside the for loop, this line prints the current element of the doubleArray at index i to the console.

}
Closes the for loop that iterates through the elements of the doubleArray.

System.out.println("\nDefault values in booleanArray:");
Prints a newline character followed by the string "Default values in booleanArray:" to the console, 
indicating that the next output will display the default values of the boolean array.

for (int i = 0; i < booleanArray.length; i++) {
Begins a for loop that iterates over each element of the booleanArray.

System.out.println(booleanArray[i]);
Inside the for loop, this line prints the current element of the booleanArray at index i to the console.

}
Closes the for loop that iterates through the elements of the booleanArray.

System.out.println("\nDefault values in stringArray:");
Prints a newline character followed by the string "Default values in stringArray:" to the console, 
indicating that the next output will display the default values of the String array.

for (int i = 0; i < stringArray.length; i++) {
Begins a for loop that iterates over each element of the stringArray.

System.out.println(stringArray[i]);
Inside the for loop, this line prints the current element of the stringArray at index i to the console.

}
Closes the for loop that iterates through the elements of the stringArray.

}
Closes the main method.

}
Closes the class definition.
*/