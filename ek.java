// If a method does not return any value, it uses the void return type.

public class ek {
    
    // A method that prints a message
    public void greet() {
        System.out.println("Hello, welcome!");
    }

    public static void main(String[] args) {
        ek obj = new ek();
        obj.greet();  // Calling the greet method
    }
}

/*
Here’s a detailed breakdown of the code line by line:

public class ek {
This declares a public class named ek, which contains methods and the main logic of the program.

public void greet() {
This defines a public method named greet. The method is non-static and has a return type of void, which means it does not return any value. 
This method is intended to print a greeting message.

System.out.println("Hello, welcome!");
This prints the text "Hello, welcome!" to the console.

public static void main(String[] args) {
This is the main method where the execution of the program begins. It serves as the entry point for the Java application.

ek obj = new ek();
This creates an instance (object) of the ek class named obj. This instance can now be used to call non-static methods of the class.

obj.greet();
This calls the greet method using the obj instance. Since the method is non-static, it must be called through an instance of the class.
*/