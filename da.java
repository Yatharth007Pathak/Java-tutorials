/*
In Java, the break statement is used to terminate the innermost loop or switch statement it appears in. 
Here's the syntax for the break statement in the three common types of loops:

For Loop
for (initialization; condition; update) {
    // statements
    if (condition_to_break) {
        break; // exits the for loop
    }
}

While Loop
while (condition) {
    // statements
    if (condition_to_break) {
        break; // exits the while loop
    }
}

Do-While Loop
do {
    // statements
    if (condition_to_break) {
        break; // exits the do-while loop
    }
} while (condition);

In all these loops, the break statement immediately exits the loop when it's encountered.
*/

public class da {

    public static void main(String[] args) {
        
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // loop terminates when i is 5
            }
            System.out.println(i);
        }

        int j = 0;
        while (j < 10) {
            if (j == 5) {
                break; // loop terminates when i is 5
            }
            System.out.println(j);
            j++;
        }

        int k = 0;
        do {
            if (k == 5) {
                break; // loop terminates when i is 5
            }
            System.out.println(k);
            k++;
        } while (k < 10);

    }
}