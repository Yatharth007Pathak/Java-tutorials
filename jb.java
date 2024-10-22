/*
Static methods
• The static members and methods belong to the class rather than the instance of the class. When the implementation of the particular method 
is not dependent on the instance variables and instance methods, In this case, we can make that method to be static.
• Static methods can be called without creating an instance of the class. They can only access static variables and call other static methods.
• They are accessed by the name of the class.
• The keywords such as this and super are not used in the body of the static method.
• The modification of the static field value is not allowed.

*/


class MathUtils {
    static int square(int number) { // Static method
        return number * number;
    }
}

public class jb {
    public static void main(String[] args) {
        int result = MathUtils.square(5); // Call static method without creating an object
        System.out.println("Square: " + result); // Output: Square: 25
    }
}

/*
The square method is static and can be called directly using the class name MathUtils.


Here’s a pointwise breakdown of the provided Java code, line by line:

class MathUtils {
Defines a public class named MathUtils.

static int square(int number) {
Begins the definition of a static method named square that takes an integer parameter number.

return number * number;
Returns the square of the given number by multiplying it by itself.

}
Ends the square() method.

}
Ends the MathUtils class.

public class jb {
Defines a public class named jb.

public static void main(String[] args) {
Defines the main method, which serves as the entry point for the Java application.

int result = MathUtils.square(5);
Calls the static method square() from the MathUtils class with the argument 5 and assigns the returned value (25) to the variable result.

System.out.println("Square: " + result);
Prints the message "Square: " followed by the value of result, which is 25.

}
Ends the main method.

}
Ends the jb class.
*/