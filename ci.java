/*
while Loop:
The while loop evaluates the condition before executing the loop body. It runs as long as the condition remains true.
It is useful when the number of iterations is not known beforehand.

Syntax:
while (condition) {
    // Code to be executed
}
*/

public class ci {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 5) {
            System.out.println("Iteration: " + i);
            i++;  // Increment the counter
        }
    }
}