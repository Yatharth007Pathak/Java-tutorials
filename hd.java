// Alpha-Numeric Diamond Pattern

public class hd {
    
    public static void main(String[] args) {
        int rows = 4;

        // Upper part of the diamond
        for (int i = 1; i <= rows; i++) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                if (k % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print((char) ('A' + i - 1) + " ");
                }
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = rows - 1; i >= 1; i--) {
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
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
