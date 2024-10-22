// Functional Interface Using Function<T, R>

import java.util.function.Function;

public class jt {
    public static void main(String[] args) {
        // Using Function to convert a string to uppercase
        Function<String, String> toUpperCase = (str) -> str.toUpperCase();

        // Applying the function
        String result = toUpperCase.apply("hello");
        System.out.println(result); // Output: HELLO
    }
}

/*

The program demonstrates the use of the Function functional interface to convert a string to uppercase.
A lambda expression defines the logic for the conversion.
The apply() method is called with the input string "hello", and the result (in uppercase) is printed to the console.


Here's a line-by-line breakdown of the code:

import java.util.function.Function;
Imports the Function interface from the java.util.function package. 
This interface represents a function that takes one argument and produces a result.

public class jt {
Declares a public class named jt, which contains the main() method.

public static void main(String[] args) {
Defines the main() method, which serves as the entry point of the program.

Function<String, String> toUpperCase = (str) -> str.toUpperCase();
Creates a Function instance named toUpperCase that takes a String as input and returns a String.
The lambda expression (str) -> str.toUpperCase() defines the logic for converting the input string to uppercase using the toUpperCase() method.

String result = toUpperCase.apply("hello");
Calls the apply() method on the toUpperCase function with the argument "hello".
The result, which is the uppercase version of the string, is stored in the variable result.

System.out.println(result);
Prints the value of result to the console. This line outputs: HELLO.

}
Ends the main() method.

}
Ends the jt class.
*/