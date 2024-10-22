public class bc {

    public static void main(String[] args) {
        int a = 5;
        int b = -20;
        
        // Left shift
        System.out.println("Left Shift (a << 2): " + (a << 2));  // Output: 20
        
        // Right shift (positive number)
        System.out.println("Right Shift (a >> 2): " + (a >> 2));  // Output: 1
        
        // Right shift (negative number)
        System.out.println("Right Shift (b >> 2): " + (b >> 2));  // Output: -5
        
        // Unsigned right shift (positive number)
        System.out.println("Unsigned Right Shift (a >>> 2): " + (a >>> 2));  // Output: 1
        
        // Unsigned right shift (negative number)
        System.out.println("Unsigned Right Shift (b >>> 2): " + (b >>> 2));  // Output: 1073741821
    }
}


/*
Shift operators in Java are used to shift the bits of a number left or right. 
These operators work on binary representations of integers and can be used for low-level bitwise operations. 
Java provides three types of shift operators:

Left Shift (<<): The left shift operator shifts the bits of the number to the left by a specified number of positions. 
For each shift, the leftmost bits are discarded, and zeros are added to the right.
Syntax: a << n 
Shifts all the bits in a to the left by n positions.

Right Shift (>>): The right shift operator shifts the bits of the number to the right by a specified number of positions. 
The leftmost bits are filled based on the sign of the original number:
If the number is positive, the leftmost bits are filled with zeros. 
If the number is negative, the leftmost bits are filled with ones (sign extension).
Syntax: a >> n
Shifts all the bits in a to the right by n positions.

Unsigned Right Shift (>>>):
The unsigned right shift operator (>>>) shifts the bits of the number to the right, 
but it fills the leftmost bits with zeros regardless of whether the number is positive or negative.
Syntax: a >>> n
Shifts all the bits in a to the right by n positions and fills the leftmost bits with zeros.

Key Points:
The left shift (<<) operator multiplies the number by 2^n where n is the number of shifted positions.
The right shift (>>) operator divides the number by 2^n and retains the sign (positive or negative).
The unsigned right shift (>>>) operator fills the leftmost bits with zeros, 
making it suitable for handling unsigned numbers or large bit manipulations.
*/