// Inverted Right-Angled Triangle Alphabet Pattern

public class gs {
    
    public static void main(String[] args) {
        int rows = 5;

        for (char i = 'A'; i < 'A' + rows; i++) {
            for (char j = 'A'; j <= 'A' + rows - i - 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}