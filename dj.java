/*
Arrays in Java are a fundamental data structure that allows you to store multiple values of the same type in a single variable.

We declare an array by specifying the type of its elements followed by square brackets.
int[] numbers;                            // Declares an array of integers

We can initialize an array using the new keyword or by using an array initializer.
numbers = new int[5];                     // Creates an array of 5 integers using new keyword
int[] moreNumbers = {1, 2, 3, 4, 5};      // Creates and initializes an array using array initializer

We can access elements in an array using their index (zero-based).
int firstNumber = moreNumbers[0];         // Accesses the first element
moreNumbers[1] = 10;                      // Modifies the second element
*/

public class dj {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Print all elements
        for (int number : numbers) {
            System.out.println(number);
        }

        // Calculate the sum
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println("Sum: " + sum);
    }
}

/*
Here's a line-by-line breakdown of the provided Java code:

public class dj {
Defines a public class named dj. In Java, a class is a blueprint for creating objects.

public static void main(String[] args) {
Declares the main method, which serves as the entry point of the Java program. 
The method is public (accessible from anywhere), static (can be invoked without an instance of the class), and returns no value (void). 
The String[] args parameter allows the program to accept command-line arguments.

int[] numbers = {1, 2, 3, 4, 5};
Declares and initializes an integer array named numbers with five elements: 1, 2, 3, 4, and 5.

for (int number : numbers) {
Begins a for-each loop that iterates over each element in the numbers array. In this loop, each element is referred to as number.

System.out.println(number);
Inside the loop, this line prints the current element (number) to the console.

}
Closes the for-each loop that prints the elements of the array.

int sum = 0;
Declares an integer variable sum and initializes it to 0. This variable will hold the cumulative sum of the array elements.

for (int number : numbers) {
Begins another for-each loop to calculate the sum of the elements in the numbers array. Each element is referred to as number.

sum += number;
Inside this loop, this line adds the current element (number) to the sum variable, accumulating the total.

}
Closes the for-each loop that calculates the sum of the array elements.

System.out.println("Sum: " + sum);
Prints the total sum of the array elements to the console, displaying the result of the accumulation.

}
Closes the main method.

}
Closes the class definition.
*/