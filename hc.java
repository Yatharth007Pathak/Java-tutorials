// Alpha-Numeric Checkerboard Pattern

public class hc {
    
    public static void main(String[] args) {
        int rows = 5;
        char alphabet = 'A';
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print(alphabet + " ");
                } else {
                    System.out.print(number + " ");
                }
            }
            alphabet++;
            number++;
            System.out.println();
        }
    }
}
