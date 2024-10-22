public class av {

    public static void main(String[] args) {
        int a = 5;  // 0101 in binary
        int b = 3;  // 0011 in binary

        // Bitwise AND
        System.out.println("a & b: " + (a & b));  // Output: 1 (0001 in binary)

        // Bitwise OR
        System.out.println("a | b: " + (a | b));  // Output: 7 (0111 in binary)

        // Bitwise XOR
        System.out.println("a ^ b: " + (a ^ b));  // Output: 6 (0110 in binary)

        // Bitwise NOT
        System.out.println("~a: " + (~a));        // Output: -6 (inverted bits)

        // Left shift
        System.out.println("a << 1: " + (a << 1));  // Output: 10 (1010 in binary)

        // Right shift
        System.out.println("a >> 1: " + (a >> 1));  // Output: 2 (0010 in binary)

        // Unsigned right shift
        System.out.println("a >>> 1: " + (a >>> 1));  // Output: 2 (0010 in binary)
    }
}

/*
Bitwise operators in Java are used to perform operations on individual bits of integer types like int, long, short, char, and byte. 
They treat the operands as sequences of binary digits (bits) and manipulate them at the bit level. 
These operators are often used in low-level programming, where performance optimization or specific control over hardware is required.

Bitwise AND (&): Performs a binary AND on each pair of corresponding bits of two operands. 
If both bits are 1, the result is 1; otherwise, it's 0.
Bitwise OR (|): Performs a binary OR on each pair of corresponding bits of two operands. 
If at least one bit is 1, the result is 1; otherwise, it's 0.
Bitwise XOR (^): Performs a binary XOR on each pair of corresponding bits of two operands. 
If one bit is 1 and the other is 0, the result is 1; otherwise, it's 0.
Bitwise NOT (~): Inverts all the bits of the operand (changes 1 to 0 and 0 to 1).
Left Shift (<<): Shifts the bits of the first operand to the left by the number of positions specified by the second operand.
Each shift to the left multiplies the number by 2.
Right Shift (>>): Shifts the bits of the first operand to the right by the number of positions specified by the second operand.
Each shift to the right divides the number by 2, preserving the sign.
Unsigned Right Shift (>>>): Similar to >>, but does not preserve the sign of the number. It fills the leftmost bits with zeros.

Key Points:
Bitwise AND (&) results in a 1 only if both corresponding bits are 1.
Bitwise OR (|) results in a 1 if at least one corresponding bit is 1.
Bitwise XOR (^) results in a 1 only if one bit is 1 and the other is 0.
Bitwise NOT (~) inverts all bits.
Left shift (<<) shifts bits to the left, effectively multiplying by 2 for each shift.
Right shift (>>) shifts bits to the right, effectively dividing by 2 while preserving the sign.
Unsigned right shift (>>>) shifts bits to the right without sign extension.
*/