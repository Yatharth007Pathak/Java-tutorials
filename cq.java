// A labeled break allows you to break out of not just the innermost loop but an outer loop as well.

public class cq {

    public static void main(String[] args) {
        // Labeled break example
        outerLoop: // Label for outer loop
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    break outerLoop; // Break out of both loops
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}

/*
Here’s a breakdown of the provided Java code:

Class Declaration: public class cq defines a public class named cq.

Main Method: public static void main(String[] args) is the entry point of the program where execution begins.

Labeled Break: outerLoop: is a label for the outer for loop. This label allows the program to break out of both loops when needed.

Outer For Loop: for (int i = 1; i <= 3; i++) is the outer loop that iterates i from 1 to 3.
This controls the number of times the inner loop runs for each iteration of i.

Inner For Loop: for (int j = 1; j <= 3; j++) is the inner loop that iterates j from 1 to 3.
For each value of i, the inner loop runs three times, printing combinations of i and j.

If Condition: if (i == 2 && j == 2) checks if both i and j are equal to 2.
When this condition is true, the program executes the break statement labeled with outerLoop.

Break Statement: break outerLoop; exits both the inner and outer loops when the condition (i == 2 && j == 2) is met, 
effectively stopping further iterations.

Print Statement: System.out.println("i = " + i + ", j = " + j); prints the current values of i and j as long as the break condition is not met.
*/