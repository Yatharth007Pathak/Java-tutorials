public class ai {

    public static void main(String[] args) {
        
        int count = 12;

        long longCount = count;

        System.out.println(count);
        System.out.println(longCount);
    }
    
}


/* 
Data types implicit conversion in java 

In Java, implicit type conversion, also known as type coercion or automatic type conversion, 
happens when the compiler automatically converts one data type into another.
This generally happens when a smaller data type is assigned to a larger data type, 
and the conversion is considered safe because there is no risk of data loss. 
The key points to understand about implicit type conversion in Java include:

Widening Conversion: Java automatically converts a smaller data type to a larger data type (e.g., int to long, float to double). 
This is known as widening conversion and is safe because it does not lose information.

Promotion in Expressions: When an expression involves multiple data types, Java promotes the smaller type to the larger type to avoid data loss. 
For example, in an arithmetic operation involving an int and a double, the int is converted to double.

Java allows implicit conversion only when there is no data loss. The general rule is that a smaller data type can be converted 
to a larger data type automatically because the larger type can hold all possible values of the smaller type.
Conversion from a larger type to a smaller type (e.g., double to int) is not done automatically because it may lead to loss of data. 
For such conversions, explicit casting is required.

Implicit conversion is allowed from integer types (byte, short, int, long) to floating-point types (float, double), 
since floating-point types can represent larger ranges and more precision.

Rules of Conversion:
byte → short → int → long → float → double
char → int → long → float → double

Automatic Type Promotion Table:
From	             To
byte	  short, int, long, float, double
short	  int, long, float, double
char	  int, long, float, double
int	      long, float, double
long	  float, double
float	  double
*/

/*

Here's a line-by-line explanation of the code:

public class ai {
This line declares a public class named ai. In Java, this class is a container for the code, 
and public means it can be accessed from other classes.

public static void main(String[] args) {
This line defines the main method, which is the entry point for the Java application. 
public allows the method to be accessed from outside the class, static means it belongs to the class rather than an instance, 
void indicates the method does not return a value, and String[] args is an array of String objects used for command-line arguments.

int count = 12;
This line declares an int variable named count and initializes it with the value 12. The int type is used for integer values.

long longCount = count;
This line declares a long variable named longCount and initializes it with the value of the count variable. 
This demonstrates type promotion where the int value (count) is automatically converted to long. 
In Java, int can be automatically promoted to long because long has a larger range.

System.out.println(count);
This line prints the value of the count variable (12) to the console, followed by a new line.

System.out.println(longCount);
This line prints the value of the longCount variable (12) to the console, followed by a new line. 
The value remains the same as count but is now stored in a long variable.

}
This closing brace marks the end of the main method.

}
This closing brace marks the end of the ai class.
*/