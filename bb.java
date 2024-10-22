public class bb {

    public static void main(String[] args) {
        // Unary plus and minus
        int x = 10;
        int y = -x;
        System.out.println("Unary minus: " + y);  // Output: -10

        // Increment operators
        int a = 5;
        System.out.println("Pre-increment: " + ++a);  // Output: 6
        System.out.println("Post-increment: " + a++);  // Output: 6 (then a becomes 7)
        System.out.println("Value of a after post-increment: " + a);  // Output: 7

        // Decrement operators
        int b = 5;
        System.out.println("Pre-decrement: " + --b);  // Output: 4
        System.out.println("Post-decrement: " + b--);  // Output: 4 (then b becomes 3)
        System.out.println("Value of b after post-decrement: " + b);  // Output: 3

        // Logical complement
        boolean flag = true;
        System.out.println("Logical complement: " + !flag);  // Output: false

        // Bitwise complement
        int c = 5;  // Binary: 00000000 00000000 00000000 00000101
        System.out.println("Bitwise complement: " + ~c);  // Output: -6
    }
}


/*
Unary operators in Java are operators that require only one operand. They are used to perform various operations such as
incrementing or decrementing a value, negating a boolean expression, or inverting the sign of a number.

Unary Plus (+): The unary plus operator indicates a positive value. 
It doesn't change the value of the operand and is generally redundant, but it can be used for code readability.
Unary Minus (-): The unary minus operator is used to negate a number (change its sign from positive to negative or vice versa).
Increment Operator (++): The increment operator increases the value of a variable by 1. It can be used in two ways:
Pre-increment (++a): Increments the value before using it in an expression.
Post-increment (a++): Uses the value in the expression first, then increments it.
Decrement Operator (--): The decrement operator decreases the value of a variable by 1. Similar to the increment operator, it has two forms:
Pre-decrement (--a): Decreases the value before using it in an expression.
Post-decrement (a--): Uses the value first, then decreases it.
Logical Complement (!): The logical complement operator is used to invert a boolean value. 
If a boolean expression is true, applying the ! operator will change it to false, and vice versa.
Bitwise Complement (~): The bitwise complement operator inverts each bit of the number. 
It turns 1s into 0s and 0s into 1s. This operator only works with integer types (e.g., int, long).

Key Points:
Unary operators work with a single operand.
++ and -- can be used before (pre) or after (post) a variable, which affects the order of operation.
The ! operator flips the boolean value from true to false or vice versa.
The ~ operator flips all bits of an integer (bitwise inversion).
*/