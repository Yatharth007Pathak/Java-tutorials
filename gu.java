// Inverted Pyramid Alphabet Pattern

public class gu {
    
    public static void main(String[] args) {
        int rows = 5;

        for (int i = rows; i >= 1; i--) {
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