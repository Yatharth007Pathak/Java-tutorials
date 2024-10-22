/*
In Java, the Math class provides a set of static methods for performing mathematical operations. 
It is part of the java.lang package, so you don’t need to import it explicitly. 
The Math class includes functions for basic arithmetic, trigonometric calculations, logarithmic functions, and more.

Here’s an overview of some commonly used functions in the Math library along with examples.
Common Math Functions->

Basic Arithmetic Functions
Math.abs(x): Returns the absolute value of x.
Math.max(a, b): Returns the maximum of a and b.
Math.min(a, b): Returns the minimum of a and b.
Math.addExact(a, b): Returns the sum of a and b, throwing an exception on overflow.
Math.subtractExact(a, b): Returns the difference of a and b, throwing an exception on overflow.
Math.multiplyExact(a, b): Returns the product of a and b, throwing an exception on overflow.
Math.incrementExact(x): Increments the value by 1, throwing an exception on overflow.

Exponential and Logarithmic Functions
Math.sqrt(x): Returns the square root of x.
Math.pow(x, y): Returns x raised to the power of y.
Math.exp(x): Returns e raised to the power of x.
Math.log(x): Returns the natural logarithm (base e) of x.
Math.log10(x): Returns the base 10 logarithm of x.

Trigonometric Functions
Math.sin(x): Returns the sine of angle x (in radians).
Math.cos(x): Returns the cosine of angle x (in radians).
Math.tan(x): Returns the tangent of angle x (in radians).
Math.asin(x): Returns the arcsine of x.
Math.acos(x): Returns the arccosine of x.
Math.atan(x): Returns the arctangent of x.

Random Numbers
Math.random(): Returns a pseudorandom double value between 0.0 and 1.0.

Rounding Numbers
Math.floor(x): Rounds down to the nearest whole number.
Math.ceil(x): Rounds up to the nearest whole number.
Math.round(x): Rounds to the nearest whole number, with ties rounding up.

Constants
Math.PI: The value of π (pi).
Math.E: The value of e (Euler's number).
*/

public class fb {

    public static void main(String[] args) {

        // Absolute Value
        System.out.println("Absolute value of -10: " + Math.abs(-10));

        // Maximum and Minimum
        System.out.println("Max of 10 and 20: " + Math.max(10, 20));
        System.out.println("Min of 10 and 20: " + Math.min(10, 20));

        // Power and Square Root
        System.out.println("2 raised to the power of 3: " + Math.pow(2, 3));
        System.out.println("Square root of 16: " + Math.sqrt(16));

        // Exponential and Logarithmic Functions
        System.out.println("e^2: " + Math.exp(2));
        System.out.println("Natural logarithm of e: " + Math.log(Math.E));
        System.out.println("Base 10 logarithm of 100: " + Math.log10(100));

        // Trigonometric Functions
        System.out.println("Sine of 90 degrees (in radians): " + Math.sin(Math.toRadians(90)));
        System.out.println("Cosine of 0 degrees (in radians): " + Math.cos(Math.toRadians(0)));
        System.out.println("Tangent of 45 degrees (in radians): " + Math.tan(Math.toRadians(45)));

        // Random Number
        System.out.println("Random number between 0.0 and 1.0: " + Math.random());

        // Constants
        System.out.println("Value of PI: " + Math.PI);
        System.out.println("Value of e: " + Math.E);
    }
}
