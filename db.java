/*
The continue statement in Java is used to skip the current iteration of a loop and move to the next iteration. 
Here’s the syntax of the continue statement for all three common types of loops:

For Loop
for (initialization; condition; update) {
    // statements
    if (condition_to_continue) {
        continue; // skips to the next iteration of the for loop
    }
    // more statements
}

While Loop
while (condition) {
    // statements
    if (condition_to_continue) {
        continue; // skips to the next iteration of the while loop
    }
    // more statements
}

Do-While Loop
do {
    // statements
    if (condition_to_continue) {
        continue; // skips to the next iteration of the do-while loop
    }
    // more statements
} while (condition);
*/

public class db {
    
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // skips the rest of the loop when i is 5
            }
            System.out.println(i); // 5 will not be printed
        }

        int j = 0;
        while (j < 10) {
            j++;
            if (j == 5) {
                continue; // skips the rest of the loop when i is 5
            }
            System.out.println(j); // 5 will not be printed
        }

        int k = 0;
        do {
            k++;
            if (k == 5) {
                continue; // skips the rest of the loop when i is 5
            }
            System.out.println(k); // 5 will not be printed
        } while (k < 10);
   
    }
}