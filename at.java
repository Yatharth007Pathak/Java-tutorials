public class at {
    
    public static void main(String[] args) {
        int a = 10, b = 20;

        // Equal to
        System.out.println("a == b: " + (a == b));  // Output: false

        // Not equal to
        System.out.println("a != b: " + (a != b));  // Output: true

        // Greater than
        System.out.println("a > b: " + (a > b));    // Output: false

        // Less than
        System.out.println("a < b: " + (a < b));    // Output: true

        // Greater than or equal to
        System.out.println("a >= b: " + (a >= b));  // Output: false

        // Less than or equal to
        System.out.println("a <= b: " + (a <= b));  // Output: true
    }
}


/*
Relational operators in Java are used to compare two values. 
They return a boolean result, either true or false, based on the relationship between the operands. 
These operators are often used in conditional statements like if, while, or for loops to control the flow of the program.

== (Equal to): Returns true if the values of the two operands are equal.
!= (Not equal to): Returns true if the values of the two operands are not equal.
> (Greater than): Returns true if the value of the first operand is greater than the value of the second operand.
< (Less than): Returns true if the value of the first operand is less than the value of the second operand.
>= (Greater than or equal to): Returns true if the value of the first operand is greater than or equal to the value of the second operand.
<= (Less than or equal to): Returns true if the value of the first operand is less than or equal to the value of the second operand.

Key Points:
Relational operators return a boolean value (true or false).
They are typically used in conditions to control the flow of a program, such as in if, while, or for statements.
Both primitive types (e.g., int, char, float) and objects can be compared using relational operators,
though for objects, == and != compare references (for content comparison, .equals() is used).
*/