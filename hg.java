// Alpha-Numeric Spiral Pattern

public class hg {
    
    public static void main(String[] args) {
        int size = 4;
        int number = 1;
        char alphabet = 'A';

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 != 0) {
                    System.out.print(number + " ");
                } else {
                    System.out.print(alphabet + " ");
                }
            }
            number++;
            alphabet++;
            System.out.println();
        }
    }
}
