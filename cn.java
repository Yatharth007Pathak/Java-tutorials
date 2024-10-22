/*
Labeled break and continue Statements:
Java allows labels to be applied to loops, enabling control over which loop to break out of or continue.

In Java, labeled break and labeled continue provide more control when breaking out of or continuing nested loops. 
They allow you to specify which loop to break or continue, instead of always affecting the innermost loop. 

Labeled break: When you want to exit an outer loop or multiple nested loops immediately, based on a condition in an inner loop.
Labeled continue: When you want to skip the current iteration of an outer loop and immediately move to the next iteration, 
without continuing the inner loops.
*/

public class cn {
    public static void main(String[] args) {

        // Outer loop labeled as outerLoop
        outerLoop: 
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop, iteration i = " + i);
            
            // Inner loop
            for (int j = 1; j <= 3; j++) {

                // Continue the outer loop when j equals 2
                if (j == 2) {
                    System.out.println("Skipping inner loop when j = " + j);
                    continue outerLoop;  // Skips the current iteration of the outer loop
                }

                // Break the outer loop when i equals 2 and j equals 1
                if (i == 2 && j == 1) {
                    System.out.println("Breaking outer loop at i = " + i + " and j = " + j);
                    break outerLoop;  // Breaks out of the outer loop
                }

                System.out.println("Inner loop, iteration j = " + j);
            }
        }

        System.out.println("Loops terminated.");
    }
}

/*
Here’s a breakdown of the Java code that demonstrates the use of labeled loops with continue and break statements:

public class cn {
This defines a public class named cn.

public static void main(String[] args) {
The entry point of the program.

Outer loop
outerLoop:
This label (outerLoop) is associated with the outer for loop. It allows for more control over the loop from within nested loops.
for (int i = 1; i <= 3; i++) {
The outer loop iterates from 1 to 3. For each iteration, it prints the current iteration of i.

Inner Loop
for (int j = 1; j <= 3; j++) {
The inner loop also iterates from 1 to 3. This loop will execute for each iteration of the outer loop.

Continue Statement
if (j == 2) {
This checks if j equals 2.
System.out.println("Skipping inner loop when j = " + j);
If true, it prints a message indicating that the inner loop is being skipped.
continue outerLoop;
This statement causes the program to skip the current iteration of the outer loop and move to the next iteration of the outer loop,
effectively ignoring the rest of the inner loop for that i.

Break Statement
if (i == 2 && j == 1) {
This checks if both i equals 2 and j equals 1.
System.out.println("Breaking outer loop at i = " + i + " and j = " + j);
If true, it prints a message indicating the break condition.
break outerLoop;
This statement exits the outer loop entirely, stopping all iterations.

Inner Loop Iteration Output
System.out.println("Inner loop, iteration j = " + j);
If none of the above conditions are met, this line prints the current iteration of j.

Termination Message
System.out.println("Loops terminated.");
This line is executed after the loops terminate, signaling the end of the loop execution.
Execution Flow and Output

The execution will follow these steps:

First Iteration of the Outer Loop (i = 1):

j = 1: Prints "Inner loop, iteration j = 1".
j = 2: Prints "Skipping inner loop when j = 2" and continues to the next iteration of the outer loop.
j = 3: Prints "Inner loop, iteration j = 3".
Second Iteration of the Outer Loop (i = 2):

j = 1: Prints "Breaking outer loop at i = 2 and j = 1" and breaks out of the outer loop entirely.
The outer loop terminates before it can proceed to i = 3.

The final output of the program will be:
Outer loop, iteration i = 1
Inner loop, iteration j = 1
Skipping inner loop when j = 2
Outer loop, iteration i = 2
Breaking outer loop at i = 2 and j = 1
Loops terminated.

Summary
The labeled continue skips the current iteration of the outer loop when j is 2.
The labeled break exits the outer loop entirely when both i is 2 and j is 1.
*/