// Java Program with Nested for, while, and do-while Loops:

public class dc {

    public static void main(String[] args) {

        // Nested for loop
        System.out.println("Nested For Loop:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }

        // Nested while loop
        System.out.println("\nNested While Loop:");
        int i = 1;
        while (i <= 3) {
            int j = 1;
            while (j <= 3) {
                System.out.print(i * j + " ");
                j++;
            }
            System.out.println();
            i++;
        }

        // Nested do-while loop
        System.out.println("\nNested Do-While Loop:");
        i = 1;
        do {
            int j = 1;
            do {
                System.out.print(i * j + " ");
                j++;
            } while (j <= 3);
            System.out.println();
            i++;
        } while (i <= 3);
    }
}

/*
Explanation:

For Loop:
The outer loop runs from 1 to 3, and the inner loop also runs from 1 to 3, multiplying the values of the outer and inner loop and printing them.

While Loop:
Similar to the for loop, the outer loop is controlled by i, and the inner loop is controlled by j. It prints the product of i and j values.

Do-While Loop:
The outer and inner loops work similarly to the while loop, but in this case, 
the body of the loop is executed at least once before checking the condition.

Output:
Nested For Loop:
1 2 3 
2 4 6 
3 6 9 

Nested While Loop:
1 2 3 
2 4 6 
3 6 9 

Nested Do-While Loop:
1 2 3 
2 4 6 
3 6 9
*/