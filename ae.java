public class ae {
    
    public static void main(String[] args) {
    
        System.out.print("one");
        System.out.print("two");
        System.out.print("three");
    }
}

// System.out.println(); results [new line]

/*

Here's a line-by-line explanation of the code:

public class ae {
This line declares a public class named ae. In Java, class is a container for the code and public means the class is accessible from outside.

public static void main(String[] args) {
This line defines the main method, which is the entry point of the Java application. 
public means the method is accessible from outside the class, static means it belongs to the class rather than an instance of the class,
void indicates it does not return a value, and String[] args is an array of String objects used for command-line arguments.

System.out.print("one");
This line prints the string "one" to the console. System.out refers to the standard output stream, 
and print outputs the text without adding a new line after it.

System.out.print("two");
This line prints the string "two" to the console immediately after the previous text, 
because print does not add a new line. So "two" will appear right after "one".

System.out.print("three");
This line prints the string "three" to the console immediately after the previous text. "three" will appear right after "two".

}
This closing brace signifies the end of the main method.

}
This closing brace signifies the end of the ae class.
*/