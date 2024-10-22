/*
StringBuilder and StringBuffer
If you need to modify a string frequently, it's more efficient to use StringBuilder or StringBuffer:

StringBuilder: Used for creating mutable strings, not thread-safe but faster.
StringBuffer: Similar to StringBuilder, but thread-safe (synchronized).
*/

public class fp {

    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(", World!");
        System.out.println(sb.toString()); // Outputs: "Hello, World!"

    }
}

/*
Here’s a breakdown of the provided Java code, line by line:

public class fp {: This line defines a public class named fp. In Java, every application must have at least one class definition.

public static void main(String[] args) {: This is the main method, which serves as the entry point for the Java application. 
The method is declared as public (accessible from anywhere), static (can be called without creating an instance of the class), 
and it takes an array of String arguments.

StringBuilder sb = new StringBuilder("Hello");: This line declares a StringBuilder object named sb and initializes it with the string "Hello". 
The StringBuilder class is used to create mutable strings, which means you can modify the content without creating a new object.

sb.append(", World!");: This line appends the string ", World!" to the existing StringBuilder object sb. 
The append() method modifies the original object by adding the specified string to the end of it.

System.out.println(sb.toString());: This line converts the StringBuilder object sb to a String using the toString() method 
and prints the result to the console. It outputs "Hello, World!", which is the result of the previous append operation.

}: This closing brace marks the end of the main method.

}: This closing brace marks the end of the class definition.

Summary:
*/