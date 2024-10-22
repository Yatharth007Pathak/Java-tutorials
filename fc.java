/*
In Java, the Math class provides methods for rounding numbers, including floor(), ceil(), and round(). 
Each of these methods serves a different purpose in terms of how they handle decimal values. 
Here’s a detailed overview of each method along with examples.

Math.floor()
Description: This method returns the largest integer value less than or equal to the argument, 
effectively rounding down to the nearest whole number.
Return Type: Returns a double.

Math.ceil()
Description: This method returns the smallest integer value greater than or equal to the argument, 
effectively rounding up to the nearest whole number.
Return Type: Returns a double.

Math.round()
Description: This method rounds the argument to the nearest integer. 
If the fractional part is 0.5 or greater, it rounds up; otherwise, it rounds down.
Return Type: Returns a long for double input and int for float input.
*/

public class fc {
    
    public static void main(String[] args) {

        // floor value
        double value1 = 5.7;
        double value2 = -2.3;
        System.out.println("Floor of " + value1 + " is: " + Math.floor(value1)); // Outputs: 5.0
        System.out.println("Floor of " + value2 + " is: " + Math.floor(value2)); // Outputs: -3.0

        // ceil value
        double value3 = 5.3;
        double value4 = -2.7;
        System.out.println("Ceil of " + value1 + " is: " + Math.ceil(value3)); // Outputs: 6.0
        System.out.println("Ceil of " + value2 + " is: " + Math.ceil(value4)); // Outputs: -2.0

        // round value
        double value5 = 5.5;
        double value6 = 5.4;
        double value7 = -2.5;
        System.out.println("Round of " + value1 + " is: " + Math.round(value5)); // Outputs: 6
        System.out.println("Round of " + value2 + " is: " + Math.round(value6)); // Outputs: 5
        System.out.println("Round of " + value3 + " is: " + Math.round(value7)); // Outputs: -2

    }
}