// continue statement usage

public class cp {
    
    public static void main(String[] args) {
        // Continue statement in a loop
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue; // Skip iteration when i equals 3
            }
            System.out.println("Iteration: " + i);
        }
    }
}