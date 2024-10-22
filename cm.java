/*
Enhanced for Loop (for-each Loop):
The enhanced for loop is designed for iterating over arrays and collections like ArrayList. 
It simplifies the syntax of traversing through each element.

Syntax:
for (dataType item : array/collection) {
    // Code to be executed for each item
}
*/

public class cm {

    public static void main(String[] args) {
        
        int[] numbers = {1, 2, 3, 4, 5};

        for (int number : numbers) {
            System.out.println("Number: " + number);
        }
    }
}

/*
This Java code demonstrates the use of the enhanced for loop (also known as the for-each loop) to iterate through an array. 
Here's a breakdown of how it works:

Class Definition
public class cm {
This defines a public class named cm.

Main Method
public static void main(String[] args) {
The entry point of the program where execution begins.

Array Declaration and Initialization
int[] numbers = {1, 2, 3, 4, 5};
An integer array named numbers is created and initialized with values 1 through 5.

Enhanced For Loop
for (int number : numbers) {
This loop iterates through each element in the numbers array. In each iteration, the current element is assigned to the variable number.

Print Statement
System.out.println("Number: " + number);
This line prints the current value of number during each iteration of the loop.
*/