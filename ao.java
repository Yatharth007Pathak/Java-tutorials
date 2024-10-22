public class ao {

    public static void main(String[] args) {
        
        int age = 123;
        byte newAge = (byte)age;
        
        int Age = 150;
        byte NewAge = (byte)Age;

        System.out.println(age);
        System.out.println(newAge);

        System.out.println(Age);
        System.out.println(NewAge); 
    }
}

/*
Here's a breakdown of the code step by step:

public class ao {: This declares a public class named ao. In Java, every program must be enclosed within a class, 
and the class name must match the file name if it is public.

public static void main(String[] args) {: This defines the main method, which is the entry point for any Java program.
The public keyword means it can be accessed from outside the class, static means it belongs to the class rather than instances, 
void indicates it does not return any value, and String[] args is an array of strings used for command-line arguments.

int age = 123;: Here, an integer variable age is initialized with the value 123.

byte newAge = (byte)age;: This line casts the integer age to a byte type and stores it in the newAge variable. 
Since a byte can hold values between -128 and 127, casting may result in data loss, but in this case, the value is within range.

int Age = 150;: A new integer variable Age is initialized with the value 150. Note the capitalization difference; 
Age is treated as a separate variable from age.

byte NewAge = (byte)Age;: This line casts the integer Age to a byte type and stores it in NewAge. 
Since 150 is outside the range of a byte, this will result in overflow and data wrapping.

System.out.println(age);: This prints the value of age (123) to the console.

System.out.println(newAge);: This prints the value of newAge, which is 123 (since casting 123 to byte does not cause overflow).

System.out.println(Age);: This prints the value of Age (150) to the console.

System.out.println(NewAge);: This prints the value of NewAge, which will be -106 due to the overflow that occurred when casting 150 to a byte.

In the line byte NewAge = (byte)Age;, the integer value 150 is cast to a byte. A byte in Java can store values in the range of -128 to 127. 
Since 150 is outside this range, overflow occurs.

Here’s how the overflow works:

Java uses two's complement representation for storing integers, which means numbers outside the byte range will wrap around.
When you try to store 150 in a byte, it first reduces the number modulo 256 (since a byte can store 256 distinct values, from -128 to 127).
Mathematically: 150 − 256 = −106
The result of the modulo operation is -106, which is why NewAge ends up with this value.
Thus, when 150 is cast to a byte, the value overflows and wraps around to -106.
*/