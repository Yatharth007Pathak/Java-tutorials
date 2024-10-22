public class aq {

    public static void main(String[] args) {
        // Positive integer
        int positiveNum = 10;
        System.out.println("Positive Number: " + positiveNum);
        System.out.println("Binary Representation: " + Integer.toBinaryString(positiveNum));

        // Negative integer
        int negativeNum = -10;
        System.out.println("\nNegative Number: " + negativeNum);
        System.out.println("Binary Representation: " + Integer.toBinaryString(negativeNum));

        // Zero
        int zero = 0;
        System.out.println("\nNumber: " + zero);
        System.out.println("Binary Representation: " + Integer.toBinaryString(zero));

        // Demonstrating large positive number
        int largeNum = 12345;
        System.out.println("\nLarge Positive Number: " + largeNum);
        System.out.println("Binary Representation: " + Integer.toBinaryString(largeNum));

        // Demonstrating large negative number
        int largeNegativeNum = -12345;
        System.out.println("\nLarge Negative Number: " + largeNegativeNum);
        System.out.println("Binary Representation: " + Integer.toBinaryString(largeNegativeNum));
    }
}

/*
The Integer.toBinaryString() method in Java is used to convert an integer into its binary (base-2) string representation. 
Here's a quick breakdown of how it works and when to use it:

Syntax:
String binaryString = Integer.toBinaryString(intValue);
intValue: This is the integer you want to convert to a binary string.
The method returns a string containing the binary representation of the integer, without any leading zeroes for positive numbers.

For Positive Numbers: It directly converts the integer to binary and omits leading zeros.

For Negative Numbers: It returns the two's complement representation of the negative integer.
*/

/*
Code Breakdown:
public class aq {: Declares a public class named aq.

public static void main(String[] args) {: Defines the main method, which is the entry point for the Java program.

int positiveNum = 10;: Declares an integer variable positiveNum and assigns it the value 10.

System.out.println("Positive Number: " + positiveNum);: Prints the value of positiveNum (which is 10).

System.out.println("Binary Representation: " + Integer.toBinaryString(positiveNum));:

Converts the positiveNum (10) to its binary representation using Integer.toBinaryString().
The binary representation of 10 is 1010.
int negativeNum = -10;: Declares an integer variable negativeNum and assigns it the value -10.

System.out.println("\nNegative Number: " + negativeNum);: Prints the value of negativeNum (-10).

System.out.println("Binary Representation: " + Integer.toBinaryString(negativeNum));:

Converts negativeNum (-10) to its binary representation using two's complement.
The binary representation of -10 is 11111111111111111111111111110110 (in 32-bit two's complement form).
int zero = 0;: Declares an integer variable zero and assigns it the value 0.

System.out.println("\nNumber: " + zero);: Prints the value 0.

System.out.println("Binary Representation: " + Integer.toBinaryString(zero));:

Converts 0 to its binary representation.
The binary representation of 0 is 0.
int largeNum = 12345;: Declares an integer variable largeNum and assigns it the value 12345.

System.out.println("\nLarge Positive Number: " + largeNum);: Prints the value of largeNum (12345).

System.out.println("Binary Representation: " + Integer.toBinaryString(largeNum));:

Converts 12345 to its binary representation.
The binary representation of 12345 is 11000000111001.
int largeNegativeNum = -12345;: Declares an integer variable largeNegativeNum and assigns it the value -12345.

System.out.println("\nLarge Negative Number: " + largeNegativeNum);: Prints the value of largeNegativeNum (-12345).

System.out.println("Binary Representation: " + Integer.toBinaryString(largeNegativeNum));:

Converts largeNegativeNum (-12345) to its binary representation using two's complement.
The binary representation of -12345 is 11111111111111111111100000011111.
*/