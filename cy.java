// do-while loop executes at least once, even if the condition is false from the beginning.

public class cy {

    public static void main(String[] args) {
        int count = 10;

        // Do-while loop
        do {
            System.out.println("This will print at least once, even if the condition is false.");
            count++;
        } while (count < 10);  // The condition is false from the start (count is 10)

        System.out.println("Loop exited because count is " + count);
    }
}