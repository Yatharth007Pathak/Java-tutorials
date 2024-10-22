// Static methods belong to the class, rather than an instance of the class. They can be called without creating an object of the class.

public class en {
    
    // Static method
    public static void sayHello() {
        System.out.println("Hello from a static method!");
    }

    public static void main(String[] args) {
        // Call the static method without creating an object
        en.sayHello();
    }
}

/*
Breakdown:
public class en {
This declares a public class named en, which contains a static method and the main method.

public static void sayHello() {
This defines a static method named sayHello. Since it is marked as static, 
it belongs to the class rather than an instance of the class, which means it can be called without creating an object of the class.

System.out.println("Hello from a static method!");
This prints the text "Hello from a static method!" to the console.

public static void main(String[] args) {
This is the main method where the program execution begins. It is the entry point for the Java application.

en.sayHello();
This calls the sayHello static method directly using the class name (en). 
Since the method is static, there is no need to create an instance of the class.
*/