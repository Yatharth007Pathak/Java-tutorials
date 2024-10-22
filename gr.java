// Right-Angled Triangle Alphabet Pattern

public class gr {
    
    public static void main(String[] args) {
        int rows = 5;
        char alphabet = 'A';

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(alphabet + " ");
            }
            alphabet++;
            System.out.println();
        }
    }
}