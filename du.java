/*
The for-each loop (also called an enhanced for loop) in Java is used to iterate over arrays or collections, 
providing a more readable and convenient syntax compared to a traditional for loop. 
It allows you to traverse the array or collection without having to manage the loop counter.

Syntax
for (dataType element : arrayOrCollection) {
    // Code to be executed for each element
}

dataType: The type of elements stored in the array or collection.
element: A temporary variable that holds each value from the array/collection during iteration.
arrayOrCollection: The array or collection you are looping through.

Key Points
No Index: The for-each loop does not use an index, so you can’t access elements by index within the loop.
Read-Only: You cannot modify the array elements directly inside a for-each loop. If you need to modify elements, use a traditional for loop.
Works with Collections: The for-each loop also works with collections like ArrayList, HashSet, etc.
*/

public class du {
    
    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50};

        // Using for-each loop to iterate over the array
        System.out.println("Array elements:");
        for (int number : numbers) {
            System.out.println(number);
        }

    }
}

/*
How the for-each Loop Works
Array or Collection: In the example, the array numbers is used.
Element: The for-each loop extracts each element of the array and assigns it to the variable number.
Iteration: The loop automatically iterates over each element, and you don’t need to worry about managing the index manually.
*/

/*
Here’s a line-by-line breakdown of the provided Java code:

public class du {
Defines a public class named du. In Java, classes serve as the blueprint for creating objects.

public static void main(String[] args) {
Declares the main method, which is the entry point of the Java program. It is public (accessible from anywhere), 
static (can be invoked without an instance of the class), and does not return a value (void). 
The String[] args parameter allows for command-line arguments.

int[] numbers = {10, 20, 30, 40, 50};
Declares and initializes an integer array named numbers with the values 10, 20, 30, 40, and 50. 
This array contains 5 elements, and its size is determined by the number of values provided.

System.out.println("Array elements:");
Prints the string "Array elements:" to the console, indicating that the following output will list the elements of the array.

for (int number : numbers) {
Begins a for-each loop that iterates over the elements of the numbers array. 
The variable number takes on the value of each element in the array sequentially during each iteration.

System.out.println(number);
Inside the for-each loop, this line prints the current element (number) of the numbers array to the console. It prints each element one by one.

}
Closes the for-each loop.

}
Closes the main method.

}
Closes the class definition.
*/