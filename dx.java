public class dx {
    
    public static void main(String[] args) {
        
        int numbers[] = {23, 12,6, 7, 15, 3, 2, 56};

        int sum = 0;

        for(int number : numbers) {
            sum += number;
        }
        System.out.println("Sum is " + sum);
    }
}

/*
Here’s a line-by-line breakdown of the provided Java code:

public class dx {
Defines a public class named dx. In Java, classes are templates used to define objects and methods.

public static void main(String[] args) {
Declares the main method, which is the entry point of the Java program. 
It is public (accessible from anywhere), static (can be invoked without creating an instance of the class), and does not return a value (void). 
The String[] args parameter allows for command-line arguments.

int numbers[] = {23, 12, 6, 7, 15, 3, 2, 56};
Declares and initializes an integer array named numbers with the values {23, 12, 6, 7, 15, 3, 2, 56}. The array contains 8 elements.

int sum = 0;
Declares an integer variable named sum and initializes it to 0. 
This variable will be used to store the cumulative sum of all the elements in the numbers array.

for(int number : numbers) {
Begins a for-each loop that iterates over the numbers array. 
The variable number takes the value of each element in the array sequentially during each iteration.

sum += number;
In each iteration of the loop, the current element (number) is added to the sum variable. 
This line accumulates the total sum of the array elements.

}
Closes the for-each loop.

System.out.println("Sum is " + sum);
Prints the final sum of the array elements to the console. It prints the message "Sum is " followed by the value of sum.

}
Closes the main method.

}
Closes the class definition.
*/