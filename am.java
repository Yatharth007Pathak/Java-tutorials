public class am {

    public static void main(String[] args) {
        
        long count = 12;
        int countInt = (int)count;

        int age = 123;
        byte newAge = (byte)age;

        System.out.println(count);
        System.out.println(countInt);
        System.out.println(age);
        System.out.println(newAge); 
    }
}


/* 
Implicit conversion from floating-point types (float, double) to integer types (int, long) is not allowed 
because it can lead to loss of precision. This requires explicit casting.
Explicit conversion is done manually by the programer. If we do not perform casting then the compiler reports a compile-time error.

Data types explicit conversion in java also known as type casting is the process of converting one data type into another by explicitly 
specifying the desired type in the code. This is required when we need to convert between incompatible data types or when narrowing
conversions are involved, where there is a potential loss of information

Explicit type conversion in Java, also known as casting, is when we manually convert one data type into another. 
This is often necessary when converting from a larger data type to a smaller data type,
because implicit conversion may result in loss of precision or overflow, 
and Java requires the programmer to acknowledge and handle this possibility explicitly.
*/

/*
Here's a line-by-line explanation of the code:

public class am {
This line declares a public class named am. 
In Java, this class acts as a container for the code, and public means it is accessible from other classes.

public static void main(String[] args) {
This line defines the main method, which is the entry point for the Java application. 
public allows the method to be accessed from outside the class, static means it belongs to the class rather than an instance, 
void indicates the method does not return a value, and String[] args is an array of String objects used for command-line arguments.

long count = 12;
This line declares a long variable named count and initializes it with the value 12. The long type is used for 64-bit integer values.

int countInt = (int)count;
This line declares an int variable named countInt and initializes it with the value of count after explicitly casting it from long to int. 
The (int) cast is necessary because long has a larger range than int, so this explicit cast is used to convert the long value to int.

int age = 123;
This line declares an int variable named age and initializes it with the value 123. The int type is used for 32-bit integer values.

byte newAge = (byte)age;
This line declares a byte variable named newAge and initializes it with the value of age after explicitly casting it from int to byte. 
The (byte) cast is necessary because byte has a smaller range than int, so this explicit cast is used to convert the int value to byte. 
Since 123 is within the range of a byte (-128 to 127), it can be safely cast.

System.out.println(count);
This line prints the value of the count variable (12) to the console, followed by a new line.

System.out.println(countInt);
This line prints the value of the countInt variable (12) to the console, followed by a new line. 
Since count was converted to int, the value remains 12.

System.out.println(age);
This line prints the value of the age variable (123) to the console, followed by a new line.

System.out.println(newAge);
This line prints the value of the newAge variable (123) to the console, followed by a new line. 
The value 123 is within the range of a byte, so the cast was successful and the value remains 123.

}
This closing brace marks the end of the main method.

}
This closing brace marks the end of the am class.
*/