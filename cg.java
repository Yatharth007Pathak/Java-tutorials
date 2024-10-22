/*
Loops in Java are control flow structures that allow a block of code to be executed repeatedly based on a specified condition. 
They are used to automate repetitive tasks and reduce code duplication. 
Each loop runs as long as the condition is true, and when the condition becomes false, the loop terminates.
Java offers several types of loops:
for loop       while loop       do-while loop       break and continue statement 
nested loops       enhanced for Loop       labeled break and continue statements 

Loops are fundamental in Java for managing repetitive tasks and are essential for creating scalable and efficient programs.

for loop: Useful when the number of iterations is known.
while loop: Useful when the number of iterations is not known beforehand.
do-while loop: Ensures the loop runs at least once.
break and continue: Control flow inside loops.
Nested loops: Loop within a loop for complex iterations.
Enhanced for loop: Simplifies iteration over arrays and collections.
Labeled break/continue: Provides control over nested loops.

In Java loops, there are several key components that dictate how the loop operates.
Initialization Expression: Sets up the loop control variable.
Test Expression (Condition): Determines if the loop continues or terminates.
Update Expression: Modifies the loop control variable after each iteration.
Body of the Loop: Contains the code to be executed repeatedly.
These components are essential for controlling the flow of loops in Java.
*/

public class cg {

    public static void main(String[] args) {

        // For loop
        System.out.println("1. For loop:");
        for (int i = 1; i <= 3; i++) {
            System.out.println("Iteration: " + i);
        }

        // While loop
        System.out.println("\n2. While loop:");
        int j = 1;
        while (j <= 3) {
            System.out.println("Iteration: " + j);
            j++;
        }

        // Do-while loop
        System.out.println("\n3. Do-While loop:");
        int k = 1;
        do {
            System.out.println("Iteration: " + k);
            k++;
        } while (k <= 3);

        // Break and Continue in a loop
        System.out.println("\n4. Break and Continue:");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Break at 3");
                break;  // Exits the loop when i == 3
            }
            System.out.println("Iteration: " + i);
        }

        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Continue at 3");
                continue;  // Skips iteration when i == 3
            }
            System.out.println("Iteration: " + i);
        }

        // Nested Loops
        System.out.println("\n5. Nested Loops:");
        for (int i = 1; i <= 3; i++) {
            for (int m = 1; m <= 3; m++) {
                System.out.println("i = " + i + ", m = " + m);
            }
        }

        // Enhanced for loop (for-each)
        System.out.println("\n6. Enhanced For Loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("Number: " + num);
        }

        // Labeled Break and Continue in Nested Loops
        System.out.println("\n7. Labeled Break and Continue:");
        
        // Labeled Break
        outerLoop:
        for (int i = 1; i <= 3; i++) {
            for (int m = 1; m <= 3; m++) {
                if (i == 2 && m == 2) {
                    System.out.println("Breaking outer loop at i = " + i + ", m = " + m);
                    break outerLoop;  // Breaks the outer loop
                }
                System.out.println("i = " + i + ", m = " + m);
            }
        }

        // Labeled Continue
        outerLoop2:
        for (int i = 1; i <= 3; i++) {
            for (int m = 1; m <= 3; m++) {
                if (i == 2 && m == 2) {
                    System.out.println("Continuing outer loop at i = " + i + ", m = " + m);
                    continue outerLoop2;  // Skips the rest of the inner loop and continues outer loop
                }
                System.out.println("i = " + i + ", m = " + m);
            }
        }
    }
}

/*
Here’s a detailed breakdown of the Java code that demonstrates various types of loops and control flow mechanisms:

1. For Loop
System.out.println("1. For loop:");
This is a regular for loop that iterates three times. The loop starts with i = 1 and increments i on each iteration until i <= 3.
Output:
Iteration: 1
Iteration: 2
Iteration: 3

2. While Loop
System.out.println("\n2. While loop:");
The while loop continues as long as the condition (j <= 3) is true. Here, j starts at 1 and increments in each iteration.
Output:
Iteration: 1
Iteration: 2
Iteration: 3

3. Do-While Loop
System.out.println("\n3. Do-While loop:");
This loop executes the block at least once because the condition is checked after the execution (do-while). 
Here, k starts at 1 and increments in each iteration.
Output:
Iteration: 1
Iteration: 2
Iteration: 3

4. Break and Continue in Loops
Break:
System.out.println("\n4. Break and Continue:");
The loop breaks when i == 3. This terminates the loop early, skipping any further iterations.
Output:
Iteration: 1
Iteration: 2
Break at 3
Continue:
The continue statement skips the iteration when i == 3 and moves to the next iteration.
Output:
Iteration: 1
Iteration: 2
Continue at 3
Iteration: 4
Iteration: 5

5. Nested Loops
System.out.println("\n5. Nested Loops:");
This is an example of nested loops, where for each iteration of the outer loop (i), the inner loop (m) runs three times.
Output:
i = 1, m = 1
i = 1, m = 2
i = 1, m = 3
i = 2, m = 1
i = 2, m = 2
i = 2, m = 3
i = 3, m = 1
i = 3, m = 2
i = 3, m = 3

6. Enhanced For Loop (For-each)
System.out.println("\n6. Enhanced For Loop:");
The enhanced for loop (or for-each) is used to iterate over arrays or collections. It prints each element of the numbers array.
Output:
Number: 1
Number: 2
Number: 3
Number: 4
Number: 5

7. Labeled Break and Continue in Nested Loops
Labeled Break:
System.out.println("\n7. Labeled Break and Continue:");
The labeled break terminates both the inner and outer loops when i == 2 and m == 2.
Output:
i = 1, m = 1
i = 1, m = 2
i = 1, m = 3
i = 2, m = 1
Breaking outer loop at i = 2, m = 2
Labeled Continue:
The labeled continue skips the current inner loop iteration when i == 2 and m == 2 and resumes the outer loop.
Output:
i = 1, m = 1
i = 1, m = 2
i = 1, m = 3
i = 2, m = 1
Continuing outer loop at i = 2, m = 2
i = 3, m = 1
i = 3, m = 2
i = 3, m = 3

Summary of Output:
For loop:
Iteration: 1, 2, 3
While loop:
Iteration: 1, 2, 3
Do-While loop:
Iteration: 1, 2, 3
Break at 3, Continue at 3
Breaks and skips as expected.
Nested loops:
i = 1 to 3, m = 1 to 3.
Enhanced for:
Prints numbers 1 to 5.
Labeled break and continue:
Halts or skips at specific conditions in the nested loops.
*/