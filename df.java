public class df {

    public static void main(String[] args) {
        
        for (int i = 0; i <= 10; i++) {
            int j = 0;
            while (j <=10) {
                System.out.print(j + " ");
                j++;
            }
            System.out.println();
        }
    }
}

/*
Here’s a pointwise breakdown of the provided Java code:

Class Declaration: public class df defines a public class named df.

Main Method: public static void main(String[] args) is the entry point of the program where execution begins.

Outer For Loop: for (int i = 0; i <= 10; i++) is the outer loop that iterates from i = 0 to i = 10. 
It controls the number of lines to be printed. This loop runs 11 times (from 0 to 10 inclusive), resulting in 11 rows being printed.

Inner While Loop: while (j <= 10) is the inner loop that prints numbers from 0 to 10 on each line.
The variable j is initialized to 0 at the beginning of each iteration of the outer loop.
The inner loop continues printing numbers until j becomes greater than 10.

Print Statement: System.out.print(j + " "); prints the current value of j followed by a space, without moving to the next line. 
This ensures that all numbers from 0 to 10 are printed on the same row.

Increment j: j++ increments the value of j by 1 in each iteration of the while loop.

New Line: System.out.println(); moves the cursor to the next line after the inner loop finishes, 
ensuring that each row of numbers is printed on a new line.
*/