/*
Here’s the syntax for labeled break for all three types of loops in Java:

Labeled Break in a For Loop
labelName: 
for (initialization; condition; update) {
    // inner loop or statements
    if (condition_to_break) {
        break labelName; // breaks out of the labeled outer for loop
    }
}

Labeled Break in a While Loop
labelName: 
while (condition) {
    // inner loop or statements
    if (condition_to_break) {
        break labelName; // breaks out of the labeled outer while loop
    }
}

Labeled Break in a Do-While Loop
labelName: 
do {
    // inner loop or statements
    if (condition_to_break) {
        break labelName; // breaks out of the labeled outer do-while loop
    }
} while (condition);
*/

public class dg {

    public static void main(String[] args) {

        // Labeled break in a for loop
        outerForLoop: 
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    System.out.println("Breaking out of outerForLoop");
                    break outerForLoop; // breaks out of the outer for loop
                }
                System.out.println("For Loop: i = " + i + ", j = " + j);
            }
        }

        System.out.println();

        // Labeled break in a while loop
        int k = 1;
        outerWhileLoop: 
        while (k <= 3) {
            int l = 1; // Declare l inside the loop block
            while (l <= 3) {
                if (k == 2 && l == 2) {
                    System.out.println("Breaking out of outerWhileLoop");
                    break outerWhileLoop; // breaks out of the outer while loop
                }
                System.out.println("While Loop: k = " + k + ", l = " + l);
                l++;
            }
            k++;
        }

        System.out.println();

        // Labeled break in a do-while loop
        int m = 1;
        outerDoWhileLoop: 
        do {
            int n = 1; // Declare n inside the loop block
            do {
                if (m == 2 && n == 2) {
                    System.out.println("Breaking out of outerDoWhileLoop");
                    break outerDoWhileLoop; // breaks out of the outer do-while loop
                }
                System.out.println("Do-While Loop: m = " + m + ", n = " + n);
                n++;
            } while (n <= 3);
            m++;
        } while (m <= 3);
    }
}