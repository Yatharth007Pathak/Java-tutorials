public class ag {

    public static void main(String[] args) {
        
        // Primitive data types
        byte aByte = 100;
        short aShort = 10000;
        int anInt = 100000;
        long aLong = 100000L;
        float aFloat = 10.99f;
        double aDouble = 99.99d;
        boolean aBoolean = true;
        char aChar = 'A';

        // Reference data types
        String aString = "Hello, World!";
        int[] anArray = {1, 2, 3, 4, 5};

        // Print primitive data types
        System.out.println("byte: " + aByte);
        System.out.println("short: " + aShort);
        System.out.println("int: " + anInt);
        System.out.println("long: " + aLong);
        System.out.println("float: " + aFloat);
        System.out.println("double: " + aDouble);
        System.out.println("boolean: " + aBoolean);
        System.out.println("char: " + aChar);

        // Print reference data types
        System.out.println("String: " + aString);
        System.out.println("Array: " + java.util.Arrays.toString(anArray));
    }
}


/*
Java data types 
Java has two categories of data types: primitive data types and reference/object data types

Primitive Data Types
These are the most basic data types in Java and are not objects. There are 8 primitive data types:

byte        Size: 8-bit          Default value: 0              Range: -128 to 127
short       Size: 16-bit         Default value: 0              Range: -32,768 to 32,767
int         Size: 32-bit         Default value: 0              Range: -2^31 to 2^31 - 1
long        Size: 64-bit         Default value: 0L             Range: -2^63 to 2^63 - 1
float       Size: 32-bit         Default value: 0.0f           Range: approximately ±3.40282347E+38F (6-7 significant decimal digits)
double      Size: 64-bit         Default value: 0.0d           Range: approximately ±1.79769313486231570E+308 (15 significant decimal digits)
boolean     Size: 1-bit          Default value: false          Values: true or false
char        Size: 16-bit         Default value: '\u0000'       Range: '\u0000' (or 0) to '\uffff' (or 65,535 inclusive)

Reference Data Types
These are more complex types that are derived from classes. They include:
Classes: e.g., String, Scanner
Interfaces
Arrays
Reference data types hold references to objects, unlike primitive types, which hold actual values.

1 byte = 8 bits

boolean stores true or false values.
byte stores whole numbers from -128 to 127.
short stores whole numbers from -32768 to 32767.
int stores whole numbers from -2^32 to 2^31 - 1.
long stores whole numbers from -2^63 to 2^63 - 1.
float stores fractonal numbers. Sufficient for storing 6 to 7 decimal digits.
double stores fractional numbers. Sufficient for storing 15 decimal digits.
char stores a single character/ ASCII values.

In Java, a char value is always enclosed in single quotes ('A'), and it represents only one character at a time.
In Java, String values are enclosed in double quotes ("Hello"). 
A String can hold multiple characters and provides many methods for manipulating text, such as concatenation, comparison, substring, etc.
*/

/*
Here's a line-by-line explanation of the code:

public class ag {
This line declares a public class named ag. In Java, the class is a blueprint for objects, 
and public means this class can be accessed from other classes.

public static void main(String[] args) {
This line defines the main method, which is the entry point for any Java application. 
public means the method can be accessed from outside the class, static means it belongs to the class rather than instances, 
void indicates the method does not return a value, and String[] args is an array of String objects used for command-line arguments.

// Primitive data types
This is a comment indicating that the following lines of code will declare and initialize primitive data types.

byte aByte = 100;
This line declares a byte variable named aByte and initializes it with the value 100. The byte type is an 8-bit integer.

short aShort = 10000;
This line declares a short variable named aShort and initializes it with the value 10000. The short type is a 16-bit integer.

int anInt = 100000;
This line declares an int variable named anInt and initializes it with the value 100000. The int type is a 32-bit integer.

long aLong = 100000L;
This line declares a long variable named aLong and initializes it with the value 100000. 
The L suffix indicates that the number is a long, which is a 64-bit integer.

float aFloat = 10.99f;
This line declares a float variable named aFloat and initializes it with the value 10.99. 
The f suffix specifies that the number is a float, which is a single-precision 32-bit floating-point number.

double aDouble = 99.99d;
This line declares a double variable named aDouble and initializes it with the value 99.99. 
The d suffix specifies that the number is a double, which is a double-precision 64-bit floating-point number.

boolean aBoolean = true;
This line declares a boolean variable named aBoolean and initializes it with the value true. 
The boolean type can hold only two values: true or false.

char aChar = 'A';
This line declares a char variable named aChar and initializes it with the character 'A'. 
The char type is used to store a single 16-bit Unicode character.

// Reference data types
This is a comment indicating that the following lines of code will declare and initialize reference data types.

String aString = "Hello, World!";
This line declares a String variable named aString and initializes it with the value "Hello, World!".
String is a reference data type that holds a sequence of characters.

int[] anArray = {1, 2, 3, 4, 5};
This line declares an array of int named anArray and initializes it with the values {1, 2, 3, 4, 5}. 
Arrays are reference data types that store multiple values of the same type.

// Print primitive data types
This is a comment indicating that the following lines of code will print the values of primitive data types.

System.out.println("byte: " + aByte);
This line prints the value of the aByte variable prefixed with "byte: " to the console, followed by a new line.

System.out.println("short: " + aShort);
This line prints the value of the aShort variable prefixed with "short: " to the console, followed by a new line.

System.out.println("int: " + anInt);
This line prints the value of the anInt variable prefixed with "int: " to the console, followed by a new line.

System.out.println("long: " + aLong);
This line prints the value of the aLong variable prefixed with "long: " to the console, followed by a new line.

System.out.println("float: " + aFloat);
This line prints the value of the aFloat variable prefixed with "float: " to the console, followed by a new line.

System.out.println("double: " + aDouble);
This line prints the value of the aDouble variable prefixed with "double: " to the console, followed by a new line.

System.out.println("boolean: " + aBoolean);
This line prints the value of the aBoolean variable prefixed with "boolean: " to the console, followed by a new line.

System.out.println("char: " + aChar);
This line prints the value of the aChar variable prefixed with "char: " to the console, followed by a new line.

// Print reference data types
This is a comment indicating that the following lines of code will print the values of reference data types.

System.out.println("String: " + aString);
This line prints the value of the aString variable prefixed with "String: " to the console, followed by a new line.

System.out.println("Array: " + java.util.Arrays.toString(anArray));
This line prints the value of the anArray variable prefixed with "Array: ". java.util.Arrays.toString(anArray) 
is used to convert the array to a string representation that displays its contents.

}
This closing brace signifies the end of the main method.

}
This closing brace signifies the end of the ag class.
*/