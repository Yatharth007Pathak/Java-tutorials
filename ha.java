// Alphabet V-Shape Pattern

public class ha {
    
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= 2 * rows - 1; j++) {
                if (j == i || j == 2 * rows - i) {
                    System.out.print((char) ('A' + i - 1) + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}

/*
Code Breakdown

public class ha {: Defines a public class named ha.

public static void main(String[] args) {: This is the main method where execution starts.

int rows = 5;: Declares a variable rows and initializes it to 5, indicating the number of rows for the pattern.

for (int i = 1; i <= rows; i++) {: This loop runs for each row from 1 to 5.

for (int j = 1; j <= 2 * rows - 1; j++) {: This loop runs through columns from 1 to 9 (i.e., 2 * 5 - 1).

if (j == i || j == 2 * rows - i) {: This condition checks if j matches the current row index i 
or the mirrored position on the right side (2 * rows - i).

System.out.print((char) ('A' + i - 1) + " ");: If the condition is true, 
it prints the corresponding letter for the current row (e.g., 'A' for row 1, 'B' for row 2).

else { System.out.print(" "); }: If the condition is false, it prints two spaces.

}: Marks the end of the inner for loop.

System.out.println();: Moves to the next line after finishing one row.

}: Marks the end of the outer for loop.

}: Ends the main method and class.
*/