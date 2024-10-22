// Checkerboard Alphabet Pattern

public class gy {
    
    public static void main(String[] args) {
        int size = 5;
        char alphabet = 'A';

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(alphabet + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
            alphabet++;
        }
    }
}
