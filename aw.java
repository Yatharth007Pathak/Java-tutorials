public class aw {

    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        // Simple assignment
        a = b;
        System.out.println("a = " + a);         // Output: 5

        // Add and assign
        a += 3; 
        System.out.println("a += 3: " + a);     // Output: 8

        // Subtract and assign
        a -= 2;
        System.out.println("a -= 2: " + a);     // Output: 6

        // Multiply and assign
        a *= 4;
        System.out.println("a *= 4: " + a);     // Output: 24

        // Divide and assign
        a /= 6;
        System.out.println("a /= 6: " + a);     // Output: 4

        // Modulus and assign
        a %= 3;
        System.out.println("a %= 3: " + a);     // Output: 1

        // Bitwise AND and assign
        a &= 2;
        System.out.println("a &= 2: " + a);     // Output: 0
 
        // Bitwise OR and assign
        a |= 3;
        System.out.println("a |= 3: " + a);     // Output: 3

        // Bitwise XOR and assign
        a ^= 1;
        System.out.println("a ^= 1: " + a);     // Output: 2

        // Left Shift and assign
        a <<= 1;  
        System.out.println("a <<= 1: " + a);    // Output: 4

        // Right Shift and assign
        a >>= 1;
        System.out.println("a >>= 1: " + a);    // Output: 2

        // Unsigned right shift and assign
        a >>>= 1;
        System.out.println("a >>> 1: " + a);    // Output: 1
    }
}



/*
Assignment operators in Java are used to assign values to variables. The most basic assignment operator is =, 
but Java provides several compound assignment operators that combine arithmetic and bitwise operations with assignment.

= (Simple Assignment): This assigns the value on the right-hand side to the variable on the left-hand side.
+= (Add and Assign): This adds the right-hand operand to the left-hand operand and assigns the result to the left-hand operand.
-= (Subtract and Assign): This subtracts the right-hand operand from the left-hand operand and assigns the result to the left-hand operand.
*= (Multiply and Assign): This multiplies the left-hand operand by the right-hand operand and assigns the result to the left-hand operand.
/= (Divide and Assign): This divides the left-hand operand by the right-hand operand and assigns the result to the left-hand operand.
%= (Modulus and Assign): This calculates the remainder when the left-hand operand is divided by the right-hand operand 
and assigns the result to the left-hand operand.
&= (Bitwise AND and Assign): This performs a bitwise AND operation on the two operands and assigns the result to the left-hand operand.
|= (Bitwise OR and Assign): This performs a bitwise OR operation on the two operands and assigns the result to the left-hand operand.
^= (Bitwise XOR and Assign): This performs a bitwise XOR operation on the two operands and assigns the result to the left-hand operand.
<<= (Left Shift and Assign): This shifts the bits of the left-hand operand to the left 
by the number of positions specified by the right-hand operand and assigns the result to the left-hand operand.
>>= (Right Shift and Assign): This shifts the bits of the left-hand operand to the right 
by the number of positions specified by the right-hand operand and assigns the result to the left-hand operand.
>>>= (Unsigned Right Shift and Assign): This shifts the bits of the left-hand operand to the right, filling with zeros from the left, 
by the number of positions specified by the right-hand operand, and assigns the result to the left-hand operand.

Key Points:
Assignment operators assign values or perform arithmetic/bitwise operations and then assign the result.
Compound assignment operators (+=, -=, *=, etc.) simplify expressions by combining arithmetic/bitwise operations with assignment.
*/