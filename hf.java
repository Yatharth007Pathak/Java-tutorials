// Alpha-Numeric Zigzag Pattern

public class hf {
    
    public static void main(String[] args) {
        int rows = 5;
        char alphabet = 'A';

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (i % 2 != 0) {
                    System.out.print(alphabet++ + " ");
                } else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
