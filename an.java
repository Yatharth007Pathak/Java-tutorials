public class an {

    public static void main(String[] args) {
        
        double d = 12345.6789;
        float f = (float)d;

        int age = 150;
        byte newAge = (byte)age;

        long l = 32768L;
        short s = (short)l;

        System.out.println(d);
        System.out.println(f);
        System.out.println(age);
        System.out.println(newAge); 
        System.out.println(l);
        System.out.println(s);
    }
    
}


// Narrowing conversions can potentially lose information about the overall magnitude of a numeric value and/or precision

/*
Here's a line-by-line explanation of the code:

public class an {
This line declares a public class named an. In Java, this class acts as a container for the code, 
and public means it is accessible from other classes.

public static void main(String[] args) {
This line defines the main method, which is the entry point for the Java application. 
public allows the method to be accessed from outside the class, static means it belongs to the class rather than an instance, 
void indicates the method does not return a value, and String[] args is an array of String objects used for command-line arguments.

double d = 12345.6789;
This line declares a double variable named d and initializes it with the value 12345.6789. 
The double type is used for double-precision 64-bit floating-point numbers.

float f = (float)d;
This line declares a float variable named f and initializes it with the value of d after explicitly casting it from double to float. 
The (float) cast is used because float has less precision compared to double, so this conversion may lead to a loss of precision.

int age = 150;
This line declares an int variable named age and initializes it with the value 150. The int type is used for 32-bit integer values.

byte newAge = (byte)age;
This line declares a byte variable named newAge and initializes it with the value of age after explicitly casting it from int to byte. 
The (byte) cast is used because byte has a smaller range (-128 to 127) compared to int. Since 150 is outside this range, 
the cast will result in overflow and wrap around.

long l = 32768L;
This line declares a long variable named l and initializes it with the value 32768L. 
The L suffix indicates that the number is a long, which is a 64-bit integer.

short s = (short)l;
This line declares a short variable named s and initializes it with the value of l after explicitly casting it from long to short. 
The (short) cast is used because short has a smaller range (-32,768 to 32,767) compared to long. 
Since 32768 is outside this range, the cast will result in overflow and wrap around.

System.out.println(d);
This line prints the value of the d variable (12345.6789) to the console, followed by a new line.

System.out.println(f);
This line prints the value of the f variable. Due to the conversion from double to float, 
there may be a slight difference in precision compared to d.

System.out.println(age);
This line prints the value of the age variable (150) to the console, followed by a new line.

System.out.println(newAge);
This line prints the value of the newAge variable. Due to the conversion from int to byte, 
the value will be the result of overflow, and the actual printed value might not be 150.

System.out.println(l);
This line prints the value of the l variable (32768) to the console, followed by a new line.

System.out.println(s);
This line prints the value of the s variable. Due to the conversion from long to short, 
the value will be the result of overflow, and the actual printed value might not be 32768.

}
This closing brace marks the end of the main method.

}
This closing brace marks the end of the an class.
*/