// This program finds and prints the minimum and maximum values from an integer array numbers

public class dy {
    
    public static void main(String[] args) {
        
        int numbers[] = {23, 12,6, 7, 15, 3, 2, 56};

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int number : numbers) {
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
        }
        System.out.println("minimum is " + min);
        System.out.println("maximum is " + max);

    }
}

/*
Here’s a line-by-line breakdown of the provided Java code:

public class dy {
Defines a public class named dy. In Java, a class is used to define the structure and behavior of objects.

public static void main(String[] args) {
Declares the main method, which is the entry point of the Java program. 
It is public (accessible from anywhere), static (can be invoked without creating an instance of the class), and does not return a value (void). 
The String[] args parameter allows for command-line arguments.

int numbers[] = {23, 12, 6, 7, 15, 3, 2, 56};
Declares and initializes an integer array named numbers with the values {23, 12, 6, 7, 15, 3, 2, 56}. The array contains 8 elements.

int min = Integer.MAX_VALUE;
Declares an integer variable min and initializes it to Integer.MAX_VALUE, 
which represents the largest possible integer value in Java. This will be used to track the smallest number in the array.

int max = Integer.MIN_VALUE;
Declares an integer variable max and initializes it to Integer.MIN_VALUE, 
which represents the smallest possible integer value in Java. This will be used to track the largest number in the array.

for(int number : numbers) {
Begins a for-each loop that iterates over the numbers array. 
The variable number holds the value of each element in the array during each iteration.

if (number < min) {
Checks if the current element (number) is smaller than the current min value. If it is, the code inside the block is executed.

min = number;
Updates the min variable to hold the value of number, making it the smallest encountered value so far.

}
Closes the if block.

if (number > max) {
Checks if the current element (number) is larger than the current max value. If it is, the code inside the block is executed.

max = number;
Updates the max variable to hold the value of number, making it the largest encountered value so far.

}
Closes the if block.

}
Closes the for-each loop.

System.out.println("minimum is " + min);
Prints the final minimum value (min) to the console, prefixed by the message "minimum is ".

System.out.println("maximum is " + max);
Prints the final maximum value (max) to the console, prefixed by the message "maximum is ".

}
Closes the main method.

}
Closes the class definition. 
*/