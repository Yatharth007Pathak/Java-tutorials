// Java program initializes an array of integers, assigns values to its elements, and then prints those elements to the console.

public class dk {
    
    public static void main(String[] args) {

        // Declare and initialize an array using the new keyword
        int[] numbers = new int[5]; // Creates an array of 5 integers

        // Assign values to the array elements
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;

        // Print the array elements
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}

/*
Here’s a line-by-line breakdown of the provided Java code:

public class dk {
Defines a public class named dk. In Java, classes are blueprints for creating objects.

public static void main(String[] args) {
Declares the main method, which is the entry point of the Java program. It is public (accessible from anywhere), 
static (can be invoked without creating an instance of the class), and does not return a value (void). 
The String[] args parameter allows for command-line arguments.

int[] numbers = new int[5];
Declares and initializes an integer array named numbers with a capacity of 5 elements. The elements are initially set to the default value of 0.

numbers[0] = 10;
Assigns the value 10 to the first element of the numbers array (index 0).

numbers[1] = 20;
Assigns the value 20 to the second element of the numbers array (index 1).

numbers[2] = 30;
Assigns the value 30 to the third element of the numbers array (index 2).

numbers[3] = 40;
Assigns the value 40 to the fourth element of the numbers array (index 3).

numbers[4] = 50;
Assigns the value 50 to the fifth element of the numbers array (index 4).

System.out.println("Array elements:");
Prints the string "Array elements:" to the console, indicating that the following output will list the elements of the array.

for (int i = 0; i < numbers.length; i++) {
Begins a for loop that iterates over each element of the numbers array. 
The loop variable i is initialized to 0 and continues as long as i is less than the length of the array (numbers.length), which is 5.

System.out.println(numbers[i]);
Inside the for loop, this line prints the current element of the numbers array at index i to the console.

}
Closes the for loop that iterates through the elements of the numbers array.

}
Closes the main method.

}
Closes the class definition.
*/