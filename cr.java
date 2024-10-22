// A labeled continue allows you to skip the current iteration of an outer loop, not just the innermost loop.

public class cr {
    
    public static void main(String[] args) {
        // Labeled continue example
        outerLoop: // Label for outer loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    continue outerLoop; // Continue outer loop when i == 2 and j == 2
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}

/*
Here’s a breakdown of the provided Java code:

Class Declaration: public class cr defines a public class named cr.

Main Method: public static void main(String[] args) is the entry point of the program where execution begins.

Labeled Continue: outerLoop: is a label for the outer for loop, 
allowing the program to continue to the next iteration of this outer loop from within the inner loop.

Outer For Loop: for (int i = 1; i <= 3; i++) is the outer loop that iterates i from 1 to 3.
This loop controls the number of times the inner loop runs for each iteration of i.

Inner For Loop: for (int j = 1; j <= 3; j++) is the inner loop that iterates j from 1 to 3.
For each value of i, the inner loop runs three times, printing combinations of i and j.

If Condition: if (i == 2 && j == 2) checks if both i and j are equal to 2.
When this condition is true, the program executes the continue statement labeled with outerLoop.

Continue Statement: continue outerLoop; skips the current iteration of the inner loop and 
moves directly to the next iteration of the outer loop, effectively skipping the print statement for that specific case.

Print Statement: System.out.println("i = " + i + ", j = " + j); prints the current values of i and j as long as the continue condition is not met.
*/