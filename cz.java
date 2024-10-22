/*
Java program that uses three different types of loops to print numbers:
for loop to print numbers from 1 to 5.
while loop to print numbers from 6 to 10.
do-while loop to print numbers from 11 to 15.
*/

public class cz {
    
    public static void main(String[] args) {

        // Using for loop to print numbers 1 to 5
        System.out.println("Using for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        // Using while loop to print numbers 6 to 10
        System.out.println("Using while loop:");
        int j = 6;
        while (j <= 10) {
            System.out.println(j);
            j++;
        }

        // Using do-while loop to print numbers 11 to 15
        System.out.println("Using do-while loop:");
        int k = 11;
        do {
            System.out.println(k);
            k++;
        } while (k <= 15);
    }
}

/*
 Explanation:
for loop: Prints numbers from 1 to 5 by incrementing i each time.
while loop: Prints numbers from 6 to 10 by checking the condition j <= 10 and incrementing j in each iteration.
do-while loop: Prints numbers from 11 to 15 by executing the loop body at least once and then checking the condition k <= 15.
*/