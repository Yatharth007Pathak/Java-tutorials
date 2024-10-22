public class au {
    
    public static void main(String[] args) {
        boolean a = true, b = false;

        // Logical AND (&&)
        System.out.println("a && b: " + (a && b));  // Output: false (both must be true)

        // Logical OR (||)
        System.out.println("a || b: " + (a || b));  // Output: true (one must be true)

        // Logical NOT (!)
        System.out.println("!a: " + (!a));          // Output: false (reverses true to false)
        System.out.println("!b: " + (!b));          // Output: true (reverses false to true)

        // Example of short-circuit behavior
        int x = 5, y = 10;
        System.out.println((x > y) && (++x > 0));  // Output: false, ++x is not evaluated because x > y is false
        System.out.println("x after short-circuit: " + x);  // Output: 5, x is not incremented

        System.out.println((x < y) || (++x > 0));  // Output: true, ++x is not evaluated because x < y is true
        System.out.println("x after short-circuit: " + x);  // Output: 5, x is not incremented
    }
}


/*
Logical operators in Java are used to perform logical operations on boolean expressions. 
They are mainly used in decision-making and control structures like if-else, loops, etc. 
Logical operators evaluate multiple conditions and return a boolean result (true or false).

&& (Logical AND): Returns true if both operands are true. If any one of the operands is false, it returns false.
|| (Logical OR): Returns true if either of the operands is true. If both operands are false, it returns false.
! (Logical NOT): Reverses the value of the operand. If the operand is true, it returns false, and if the operand is false, it returns true.

Short-circuit Behavior:
&& (AND): If the first condition is false, the second condition is not evaluated because the result is already determined to be false.
|| (OR): If the first condition is true, the second condition is not evaluated because the result is already determined to be true.

Key Points:
Logical AND (&&) returns true only if both conditions are true.
Logical OR (||) returns true if at least one condition is true.
Logical NOT (!) negates the boolean value.
Short-circuiting improves efficiency by avoiding the evaluation of further conditions when the result is already determined.
*/