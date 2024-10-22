public class as {

    public static void main(String[] args) {
        int a = 15, b = 4;

        // Addition
        int sum = a + b;
        System.out.println("Sum: " + sum);  // Output: 19
        System.out.println("Sum: " + (a + b));  // Output: 19

        // Subtraction
        int difference = a - b;
        System.out.println("Difference: " + difference);  // Output: 11

        // Multiplication
        int product = a * b;
        System.out.println("Product: " + product);  // Output: 60

        // Division
        int quotient = a / b;
        System.out.println("Quotient: " + quotient);  // Output: 3

        // Modulus
        int remainder = a % b;
        System.out.println("Remainder: " + remainder);  // Output: 3

        // Increment and Decrement
        int x = 10;
        System.out.println("Original x: " + x);  // Output: 10
        System.out.println("Post-increment: " + x++);  // Output: 10
        System.out.println("After Post-increment: " + x);  // Output: 11
        System.out.println("Pre-increment: " + ++x);  // Output: 12
        System.out.println("Post decrement: " + x--);  // Output: 12
        System.out.println("After Post-decrement: " + x);  // Output: 11
        System.out.println("Pe-decrement: " + --x);  // Output: 10
    }
}

/*
Arithmetic operators in Java are used to perform basic mathematical operations such as addition, subtraction,  multiplication, 
division, and modulus. These operators work with both integer and floating-point types (e.g., int, double, float).

Addition (+): Adds two operands.
Subtraction (-): Subtracts the second operand from the first.
Multiplication (*): Multiplies two operands.
Division (/): Divides the first operand by the second.
Modulus (%): Returns the remainder when the first operand is divided by the second.
Increment (++): Increases the value of the operand by 1.
Post-increment (a++): First uses the current value of a in an expression, then increments a.
Pre-increment (++a): First increments a, then uses the new value in the expression.
Decrement (--): Decreases the value of the operand by 1.
Post-decrement (a--): First uses the current value of a, then decrements a.
Pre-decrement (--a): First decrements a, then uses the new value.

Key Points:
Division (/) with integers results in an integer, discarding any remainder.
Modulus (%) gives the remainder of a division.
Increment (++) and Decrement (--) can be used in both post and pre forms,
affecting when the increment or decrement occurs relative to other operations.
*/