/*
This program simulates a scenario where it repeatedly asks the user if they have understood something. 
The loop continues until the user inputs true to indicate that they have understood.
*/

import java.util.Scanner;

public class cx {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        boolean hasLearnt = false;

        while(!hasLearnt) {
            System.out.println("Went to school, tried to learn");
            System.out.println("Have you understood?");
            hasLearnt= sc.nextBoolean();
        }
        sc.close();
    }
}

/*
Here’s a pointwise breakdown of the Java code provided:

Import Statement: import java.util.Scanner; imports the Scanner class from the java.util package, allowing the program to take user input.

Class Declaration: public class cx defines a public class named cx.

Main Method: public static void main(String[] args) is the entry point of the program where execution starts.

Scanner Object Creation: Scanner sc = new Scanner(System.in); 
creates a Scanner object sc that takes input from the user via the standard input (keyboard).

Boolean Variable Initialization: boolean hasLearnt = false; initializes a boolean variable hasLearnt to false. 
This will track whether the user has understood or learned something.

While Loop: while(!hasLearnt) runs a loop that continues as long as hasLearnt is false. 
The !hasLearnt condition means the loop runs until hasLearnt becomes true.

First Print Statement: System.out.println("Went to school, tried to learn"); 
prints the message that simulates someone going to school and trying to learn.

Second Print Statement: System.out.println("Have you understood?"); prints a message asking the user whether they have understood.

User Input: hasLearnt = sc.nextBoolean(); takes the user's boolean input (true or false) using the Scanner, and assigns it to hasLearnt. 
If the user inputs true, the loop ends; otherwise, it continues.

Scanner Close: sc.close(); closes the Scanner object to free up system resources.
*/