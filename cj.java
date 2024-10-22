/*
do-while Loop:
The do-while loop is similar to the while loop.
The do-while loop executes the code block once before checking the condition. 
It guarantees that the loop will run at least once, even if the condition is false.

Syntax:
do {
    // Code to be executed
} while (condition);
*/

public class cj {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println("Iteration: " + i);
            i++;  // Increment the counter
        } while (i <= 5);
    }
}