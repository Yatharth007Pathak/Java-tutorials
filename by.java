/*
Ternary Operator
The ternary operator is a shorthand for if-else statements, used to assign a value based on a condition. 
It is a compact way to write a conditional expression.

Syntax:
variable = (condition) ? value_if_true : value_if_false;
*/

public class by {
    
    public static void main(String[] args) {
        int a = 5, b = 10;

        // Ternary operator
        int max = (a > b) ? a : b;

        System.out.println("The maximum value is: " + max);
    }
}
