/*
In Java, conditional statements can be combined with logical operators to form more complex conditions. The common logical operators are:

AND (&&): Returns true if both conditions are true.
OR (||): Returns true if at least one condition is true.
NOT (!): Reverses the boolean value of a condition. 
*/

public class cf {
    
    public static void main(String[] args) {
        int age = 25;
        boolean hasLicense = true;

        // AND (&&) example: Checking if both conditions are true
        if (age >= 18 && hasLicense) {
            System.out.println("You are eligible to drive.");
        } else {
            System.out.println("You are not eligible to drive.");
        }

        int number = 10;

        // OR (||) example: Checking if at least one condition is true
        if (number > 0 || number % 2 == 0) {
            System.out.println("The number is positive or even.");
        } else {
            System.out.println("The number is negative and odd.");
        }

        // NOT (!) example: Reversing a condition
        boolean isRaining = false;
        if (!isRaining) {
            System.out.println("It is not raining, you can go outside.");
        } else {
            System.out.println("It is raining, better to stay inside.");
        }
    }
}