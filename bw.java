/*
Nested if Statement
Conditional statements can be nested, meaning you can have an if statement inside another if statement. 
This allows for multiple layers of conditions.

Syntax:
if (condition1) {
    if (condition2) {
        // Code if both conditions are true
    }
}
*/

public class bw {
    
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        // Nested if statement
        if (x == 10) {
            if (y == 20) {
                System.out.println("x is 10 and y is 20");
            }
        }
    }
}
