public class aj {
    

    public static void main(String[] args) {

        int myInt = 100;
        long myLong = myInt; // int to long
        float myFloat = myLong; // long to float
        double myDouble = myFloat; // float to double
    
        System.out.println("Int value: " + myInt);
        System.out.println("Long value: " + myLong);
        System.out.println("Float value: " + myFloat);
        System.out.println("Double value: " + myDouble);
        }
}


// Widening Conversion 

/*
When assigning a value of one type to a variable of another type, implicit conversion happens if the target type is larger or more general.


Here's a line-by-line explanation of the code:

public class aj {
This line declares a public class named aj. In Java, this class serves as a container for the code, 
and public means it is accessible from other classes.

public static void main(String[] args) {
This line defines the main method, which is the entry point for the Java application. 
public allows the method to be accessed from outside the class, static means it belongs to the class rather than an instance, 
void indicates the method does not return a value, and String[] args is an array of String objects used for command-line arguments.

int myInt = 100;
This line declares an int variable named myInt and initializes it with the value 100. The int type is used for integer values.

long myLong = myInt; // int to long
This line declares a long variable named myLong and initializes it with the value of the myInt variable. 
This demonstrates type promotion where the int value (myInt) is automatically converted to long. 
In Java, int can be automatically promoted to long because long has a larger range.

float myFloat = myLong; // long to float
This line declares a float variable named myFloat and initializes it with the value of the myLong variable. 
This shows type promotion where the long value (myLong) is converted to float. 
float has a smaller precision compared to long, so this conversion may lead to a loss of precision.

double myDouble = myFloat; // float to double
This line declares a double variable named myDouble and initializes it with the value of the myFloat variable.
This demonstrates type promotion where the float value (myFloat) is converted to double. 
double has a larger precision compared to float, so this conversion is safe and may not lead to loss of information.

System.out.println("Int value: " + myInt);
This line prints the value of the myInt variable prefixed with "Int value: " to the console, followed by a new line.

System.out.println("Long value: " + myLong);
This line prints the value of the myLong variable prefixed with "Long value: " to the console, followed by a new line.

System.out.println("Float value: " + myFloat);
This line prints the value of the myFloat variable prefixed with "Float value: " to the console, followed by a new line.

System.out.println("Double value: " + myDouble);
This line prints the value of the myDouble variable prefixed with "Double value: " to the console, followed by a new line.

}
This closing brace marks the end of the main method.

}
This closing brace marks the end of the aj class.
*/