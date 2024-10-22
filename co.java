// break statement usage

public class co {
    
    public static void main(String[] args) {
        // Break statement in a loop
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break; // Break out of the loop when i equals 6
            }
            System.out.println("Iteration: " + i);
        }
    }
}