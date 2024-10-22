// Alpha-Numeric Right-Angled Triangle Pattern

public class hb {
    
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 0) {
                    System.out.print(j + " ");  // Numbers at even positions
                } else {
                    System.out.print((char) ('A' + i - 1) + " ");  // Letters at odd positions
                }
            }
            System.out.println();
        }
    }
}
