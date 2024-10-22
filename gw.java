// Alphabet Triangle with Incrementing Letters

public class gw {
    
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            char alphabet = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(alphabet + " ");
                alphabet++;
            }
            System.out.println();
        }
    }
}
