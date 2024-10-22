// Methods can take parameters (also called arguments) to pass data into the method. Multiple parameters are separated by commas.

public class el {
    
    public void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        el obj = new el();
        obj.greetUser("Alice");  // Passing "Alice" as a parameter
    }
}

/*
Here’s a detailed breakdown of the code line by line:

public class el {
This declares a public class named el. The class contains methods that define its functionality.

public void greetUser(String name) {
This defines a public method named greetUser that takes a single parameter of type String called name. 
The method does not return a value (void). Its purpose is to print a greeting that includes the given name.

System.out.println("Hello, " + name + "!");
This prints the text "Hello, " followed by the value of name and an exclamation mark (!) to the console.

public static void main(String[] args) {
This is the main method where the execution of the program begins. It serves as the entry point for the Java application.

el obj = new el();
This creates an instance (object) of the el class named obj. The instance is used to call the non-static methods of the class.

obj.greetUser("Alice");
This calls the greetUser method using the obj instance, passing the string "Alice" as an argument. 
The method then prints a personalized greeting to the console.
*/