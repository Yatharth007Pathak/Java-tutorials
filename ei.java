/*
the greet() method is non-static, which means it can only be called on an instance of the ei class. 
Since the main method is static, it cannot directly call non-static methods.
*/

public class ei {  

    public static void main(String[] args) {
        ei obj = new ei();  // Create an instance of the class
        obj.greet();        // Call the greet() method using the instance
        
    }

    public void greet() {
        System.out.println("Hello World");;
    
    }
}

/*
Here’s a detailed breakdown of the code line by line:

public class ei {
This declares a public class named ei. The class contains methods that define its behavior.

public static void main(String[] args) {
This is the main method, the entry point for the program's execution. The Java Virtual Machine (JVM) starts the execution from this method.

ei obj = new ei();
This creates an instance (object) of the class ei named obj. Using this object, you can call non-static methods of the class.

obj.greet();
This calls the greet method using the obj instance. Since the greet method is non-static, it must be called through an object of the class.

public void greet() {
This defines a public method named greet. It doesn't return any value (void). 
It can be accessed from outside the class using an instance of the class.

System.out.println("Hello World");
This prints the text "Hello World" to the console.
*/