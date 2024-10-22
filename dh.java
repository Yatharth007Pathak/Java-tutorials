// Labeled continue in a For Loop:

public class dh {

    public static void main(String[] args) {

        // Labeled continue in a for loop
        outerForLoop:
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (i == 2 && j == 2) {
                    continue outerForLoop; // skips to the next iteration of the outer for loop
                }
                System.out.println("For Loop: i = " + i + ", j = " + j);
            }
        }
    }
}