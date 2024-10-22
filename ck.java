/*
break and continue Statements:
break: Exits the loop entirely.
continue: Skips the current iteration and moves to the next iteration of the loop.
*/

public class ck {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            
            // Continue statement: Skip the iteration when i equals 5
            if (i == 5) {
                System.out.println("Skipping number: " + i);
                continue; // Skips the rest of the loop and moves to the next iteration
            }

            // Break statement: Exit the loop when i equals 8
            if (i == 8) {
                System.out.println("Breaking the loop at number: " + i);
                break; // Exits the loop
            }

            System.out.println("Number: " + i);
        }

        System.out.println("Loop terminated.");
    }
}

/*
Here’s a breakdown of the provided Java code:

Class Declaration: public class ck defines a public class named ck.

Main Method: public static void main(String[] args) is the entry point of the program where execution begins.

For Loop: for (int i = 1; i <= 10; i++) initializes a loop that iterates from 1 to 10, incrementing i by 1 in each iteration.

Condition to Skip: if (i == 5) checks if i equals 5. If true, it executes the block below.

Skipping Output: System.out.println("Skipping number: " + i) prints a message indicating that 5 is being skipped.

Continue Statement: continue; causes the loop to skip the remaining code in this iteration and jump to the next iteration.

Condition to Break: if (i == 8) checks if i equals 8. If true, it executes the block below.

Breaking Output: System.out.println("Breaking the loop at number: " + i) prints a message indicating that the loop will break at 8.

Break Statement: break; exits the loop immediately.

Print Number: System.out.println("Number: " + i); prints the current value of i for all numbers except 5 and before 8.

Loop Termination Message: After exiting the loop, System.out.println("Loop terminated."); prints a message indicating that the loop has ended.

This code effectively skips the number 5 during iteration and exits the loop when reaching the number 8, 
while printing the values from 1 to 10 except for 5 and stopping before 8.
*/