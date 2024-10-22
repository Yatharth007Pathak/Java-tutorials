/*
if-else Statement
The if-else statement provides an alternative path if the condition is false. If the if condition is false, the else block gets executed.

Syntax:
if (condition) {
    // Code to be executed if the condition is true
} else {
    // Code to be executed if the condition is false
}
*/

public class bu {
    
    public static void main(String[] args) {
        int x = 10;

        // Check if x is greater than 15
        if (x > 15) {
            System.out.println("x is greater than 15");
        } else {
            System.out.println("x is less than or equal to 15");
        }
    }
}
