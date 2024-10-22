/*
Parameters: Variables defined in the function signature. They act as placeholders for the values passed to the function.
Arguments: Actual values passed when calling the function.
*/

public class ep {

    // Method to greet the user
    public void greet(String name) { // 'name' is a parameter
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        ep obj = new ep();   // Create an instance of the class
        obj.greet("Bob");    // 'Bob' is an argument
    }
}

/*
Here’s a detailed breakdown of the code line by line:

public class ep {
This declares a public class named ep. This class contains methods that define its functionality.

public void greet(String name) {
This defines a public method named greet that takes one parameter of type String called name. 
The method is non-static and has a return type of void, indicating that it does not return any value. 
This method is designed to print a greeting message.

System.out.println("Hello, " + name);
This line prints the message "Hello, " followed by the value of the name parameter to the console.

public static void main(String[] args) {
This is the main method, which serves as the entry point for the program. The execution of the Java application begins here.

ep obj = new ep();
This creates an instance (object) of the ep class named obj. This object will be used to call the non-static method greet.

obj.greet("Bob");
This calls the greet method on the obj instance, passing the string "Bob" as an argument. 
The method will print the greeting message using the value provided.
*/