// Hollow Alphabet Square Pattern

public class gx {
    
    public static void main(String[] args) {
        int size = 5;
        char alphabet = 'A';

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size; j++) {
                if (i == 1 || i == size || j == 1 || j == size) {
                    System.out.print(alphabet + " ");
                } else {
                    System.out.print("  ");
                }
            }
            alphabet++;
            System.out.println();
        }
    }
}
