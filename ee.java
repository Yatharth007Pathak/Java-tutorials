// Example with a string, where trying to access an invalid index throws a StringIndexOutOfBoundsException.

public class ee {
    
    public static void main(String[] args) {
        String text = "Hello";

        try {
            // Attempt to access an invalid index
            char ch = text.charAt(5); // String length is 5, valid indices are 0 to 4
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught a StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}

/*
Here’s a detailed breakdown of the code:

public class ee {
This declares a public class named ee. In Java, a class contains the program's logic and serves as a blueprint for objects.

public static void main(String[] args) {
This is the main method where the program execution begins. It’s the entry point for the Java application.

String text = "Hello";
This declares and initializes a String variable named text with the value "Hello". 
The string has a length of 5 characters, with valid indices ranging from 0 to 4.

try {
This begins a try block to handle any exceptions that might occur during the execution of the code inside the block.

char ch = text.charAt(5);
This attempts to access the character at index 5 of the string text. Since the string has only 5 characters (H, e, l, l, o) 
and valid indices are 0 to 4, trying to access index 5 will throw a StringIndexOutOfBoundsException.

} catch (StringIndexOutOfBoundsException e) {
This catch block catches the StringIndexOutOfBoundsException that occurs when trying to access an invalid index in the string. 
If the exception is thrown, the program jumps to this block to handle it.

System.out.println("Caught a StringIndexOutOfBoundsException: " + e.getMessage());
This prints a message indicating that a StringIndexOutOfBoundsException was caught. 
The e.getMessage() method returns a message describing the exception, usually indicating the invalid index.
*/