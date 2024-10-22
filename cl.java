/*
Nested Loops:
A loop inside another loop is called a nested loop. You can nest any type of loop.
*/

public class cl {
    public static void main(String[] args) {
        // Nested loop example
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i = " + i + ", j = " + j);
            }
        }
    }
}