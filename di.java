/*
In Java, an array is a collection of elements, all of the same type, that are stored in a contiguous block of memory. 
Arrays allow us to store multiple values in a single variable, and they are particularly useful for handling lists of items.

Key Features of Arrays in Java:
Fixed Size: Once an array is created, its size cannot be changed.
Homogeneous Elements: All elements in an array must be of the same data type (e.g., all integers, all strings).
Zero-Based Indexing: Array indices start at 0, meaning the first element is at index 0, the second at index 1, and so on.
Memory Efficiency: Arrays are stored in contiguous (consecutive) memory locations, which makes them efficient in terms of access time.


Declaring and Initializing Arrays. We can declare and initialize arrays in several ways:

Declaration of an array
int[] numbers;                                          // Preferred way
int numbers[];                                          // Legal but less preferred

Initialization of an array with a specific size i.e. allocating memory to array
numbers = new int[5];                                   // An array to hold 5 integers

Directly initialize an array with values
int[] numbers = {1, 2, 3, 4, 5};                        // An array with initial values

We can access elements of an array using their index:
int firstNumber = numbers[0];                           // Access the first element
numbers[2] = 10;                                        // Modify the third element

Important Points
Size: The size of an array is fixed once it is created and cannot be changed.
Default Values: Arrays of numeric types are initialized to 0, boolean arrays to false, and object arrays to null.
Length Property: We can find the length of an array using the .length property (not a method).
*/

public class di {

    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {1, 2, 3, 4, 5};

        // Print the elements of the array
        System.out.println("Elements of the array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Element at index " + i + ": " + numbers[i]);
        }

        // Calculate the sum of the elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        System.out.println("Sum of the array elements: " + sum);
    }
}

/*

Here’s a line-by-line breakdown of the provided Java code:

public class di {
Defines a public class named di. In Java, classes are the blueprint for creating objects.

public static void main(String[] args) {
Declares the main method, which is the entry point of any Java program. 
It is public (accessible from anywhere), static (can be called without creating an instance of the class), and returns no value (void). 
The String[] args parameter allows command-line arguments to be passed.

int[] numbers = {1, 2, 3, 4, 5};
Declares and initializes an integer array named numbers with five elements: 1, 2, 3, 4, and 5.

System.out.println("Elements of the array:");
Prints the string "Elements of the array:" to the console, indicating that the program will display the elements of the array.

for (int i = 0; i < numbers.length; i++) {
Starts a for loop that iterates over the numbers array. 
The loop variable i is initialized to 0, and it will continue as long as i is less than the length of the array (numbers.length).

System.out.println("Element at index " + i + ": " + numbers[i]);
Inside the loop, this line prints the current index i and the value at that index in the numbers array. 
It concatenates the strings to form a complete message.

}
Closes the for loop that iterates through the elements of the array.

int sum = 0;
Declares an integer variable sum and initializes it to 0. This variable will be used to store the cumulative sum of the array elements.

for (int i = 0; i < numbers.length; i++) {
Starts another for loop to calculate the sum of the elements in the numbers array. 
It works similarly to the previous loop, iterating through the array.

sum += numbers[i];
Inside the loop, this line adds the current element (numbers[i]) to the sum variable, accumulating the total.

}
Closes the for loop that calculates the sum of the array elements.

System.out.println("Sum of the array elements: " + sum);
Prints the total sum of the array elements to the console, showing the result of the accumulation.

}
Closes the main method.

}
Closes the class definition.
*/