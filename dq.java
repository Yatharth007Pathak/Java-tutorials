/*
In Java, the new keyword is used to create new objects and allocate memory for them. 
It is essential for creating instances of classes, arrays, and other data structures. 
Here’s a detailed explanation of how and when to use the new keyword:

Creating Objects: When we create an instance of a class, you use the new keyword followed by the class constructor.
Creating Arrays: The new keyword is also used to create arrays in Java. We specify the type and the size of the array.
Creating Multidimensional Arrays: We can use the new keyword to create multidimensional arrays as well.
Default Values: When we create an object or an array using the new keyword, 
Java allocates memory for it and initializes the elements with default values:
Numeric types (e.g., int, double) are initialized to 0. Boolean types are initialized to false. Object references are initialized to null.
Using new with Interfaces: We cannot create instances of interfaces directly. 
However, we can create anonymous inner classes that implement interfaces using the new keyword.
Memory Management: When we use the new keyword, Java allocates memory on the heap. 
The garbage collector automatically manages memory, freeing up memory when objects are no longer referenced.
*/

public class dq {
    
    public static void main(String[] args) {
        
        // Declare and initialize an array using the new keyword
        String[] fruits = new String[3]; // Creates an array to hold 3 fruit names

        // Assign values to the array elements
        fruits[0] = "Apple";
        fruits[1] = "Banana";
        fruits[2] = "Cherry";

        // Print the array elements
        System.out.println("Fruits in the array:");
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}
