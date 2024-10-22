// Alpha-Numeric Pyramid Pattern

public class he {
    
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if (k % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print((char) ('A' + i - 1) + " ");
                }
            }
            System.out.println();
        }
    }
}
