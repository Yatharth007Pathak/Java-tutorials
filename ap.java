public class ap {

    public static void main(String[] args) {
        int positiveNum = 5;
        int negativeNum = -5;

        // Convert the positive number to its binary representation
        System.out.println("Binary representation of 5: " + Integer.toBinaryString(positiveNum));

        // Convert the negative number to its binary representation (two's complement)
        System.out.println("Binary representation of -5: " + Integer.toBinaryString(negativeNum));

        // Demonstrating two's complement arithmetic
        int result = positiveNum + negativeNum;
        System.out.println("Result of 5 + (-5): " + result);

        // Showing binary representation of the result
        System.out.println("Binary representation of the result: " + Integer.toBinaryString(result));
        }
    }
    
/*
Java follows the two's complement binary system to represent and manipulate integer values 
for its signed data types like byte, short, int, and long.

Two's Complement System in Java:
Signed Integer Representation: Java uses two's complement to represent both positive and negative numbers.

In this system, the most significant bit (MSB) is used as the sign bit:
0 for positive numbers.
1 for negative numbers.

How Two's Complement Works:
Positive numbers are represented in the usual binary format.
Negative numbers are represented by inverting all bits of the absolute value of the number and adding 1 to the result.

Advantages of Two's Complement:
Single Representation for Zero: There is only one representation of 0.
Efficient Arithmetic: Addition, subtraction, and multiplication can be performed without special rules for negative numbers.
Range: Two's complement provides a larger range of negative numbers compared to positive numbers.

For floating-point numbers (float and double), Java follows the IEEE 754 standard, 
which uses a different binary representation system, but for integers, it is two's complement.
*/

/*
Here's a breakdown of the code step by step, along with an explanation of the binary representations and the result:

public class ap {: Declares a public class named ap.

public static void main(String[] args) {: Defines the main method, which is the entry point of the program.

int positiveNum = 5;: Declares an integer variable positiveNum and initializes it with the value 5.

int negativeNum = -5;: Declares an integer variable negativeNum and initializes it with the value -5.

System.out.println("Binary representation of 5: " + Integer.toBinaryString(positiveNum));:

Converts positiveNum (which is 5) to its binary representation using the Integer.toBinaryString() method.
The binary representation of 5 is 101, and this is printed to the console.
System.out.println("Binary representation of -5: " + Integer.toBinaryString(negativeNum));:

Converts negativeNum (which is -5) to its binary representation.
In Java, negative numbers are represented using two's complement notation. For -5, the binary representation would be the two's complement of 5.
The binary representation of -5 (in 32-bit format) is 11111111111111111111111111111011.
int result = positiveNum + negativeNum;: Adds positiveNum (5) and negativeNum (-5), 
storing the result in the result variable. Since 5 + (-5) equals 0, the result will be 0.

System.out.println("Result of 5 + (-5): " + result);:

Prints the result of the addition, which will be 0.
System.out.println("Binary representation of the result: " + Integer.toBinaryString(result));:

Converts result (which is 0) to its binary representation.
The binary representation of 0 is 0, and this is printed to the console.


Two's Complement Explanation:
Positive Number (5):
The binary representation of 5 in standard form is 101.
However, Java stores integers in 32-bit form, so 5 in 32-bit binary would be 00000000000000000000000000000101.

Negative Number (-5):
In two's complement, the negative version of a number is obtained by inverting the bits of its positive counterpart and adding 1.
For 5, this gives:
Invert the bits: 00000000000000000000000000000101 → 11111111111111111111111111111010.
Add 1: 11111111111111111111111111111010 + 1 = 11111111111111111111111111111011.
Thus, the binary representation of -5 is 11111111111111111111111111111011 in 32-bit format.
*/