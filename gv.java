// Alphabet Diamond Pattern

public class gv {

    public static void main(String[] args) {
        int rows = 5;

        // Upper part of the diamond
        for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            char alphabet = 'A';
            for (int k = 1; k <= i; k++) {
                System.out.print(alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            char alphabet = 'A';
            for (int k = 1; k <= i; k++) {
                System.out.print(alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }
    }
}
