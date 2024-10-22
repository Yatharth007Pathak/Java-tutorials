public class dd {

    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();           
        }
    }
}

/*
Here’s a breakdown of the Java code provided:

Class Declaration: public class dd defines a public class named dd.

Main Method: public static void main(String[] args) is the starting point of the program where the execution begins.

Outer For Loop: for (int i = 0; i < 5; i++) is the outer loop that iterates i from 0 to 4 (a total of 5 iterations).

For each value of i, it controls how many times the inner loop runs.

Inner For Loop: for (int j = 0; j < i; j++) is the inner loop that runs j from 0 to i - 1 for each iteration of i.

The number of iterations for the inner loop increases with each iteration of the outer loop.

Print Inside Inner Loop: System.out.print(j + " "); prints the current value of j followed by a space.

This prints numbers in a row without moving to the next line.

New Line After Inner Loop: System.out.println(); moves the cursor to the next line after each complete execution of the inner loop.

This ensures that each set of numbers printed by the inner loop appears on a new line.

Output Explanation:
For i = 0: The inner loop does not run, so a blank line is printed.
For i = 1: The inner loop runs once, printing 0.
For i = 2: The inner loop runs twice, printing 0 1.
For i = 3: The inner loop runs three times, printing 0 1 2.
For i = 4: The inner loop runs four times, printing 0 1 2 3.

In summary, the program prints an increasing sequence of numbers in each row, 
starting from an empty line and gradually printing more numbers as i increases.
*/