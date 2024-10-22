/*
Types of Functions

Parameterless Functions: These functions do not accept any input.
Functions with Parameters: Accept input values.
Functions with Return Values: Perform an operation and return a value.
Static Functions: Methods that belong to the class rather than an instance.
*/

public class eq {
    
    // Parameterless Function
    public void greet() {
        System.out.println("Hello! This is a parameterless function.");
    }

    // Function with Parameters
    public void greetUser(String name) {
        System.out.println("Hello, " + name + "! This function accepts parameters.");
    }

    // Function with Return Value
    public int add(int a, int b) {
        return a + b; // Returns the sum of two integers
    }

    // Static Function
    public static void staticMessage() {
        System.out.println("This is a static function.");
    }

    public static void main(String[] args) {
        eq obj = new eq(); // Create an instance of the class

        // Call the parameterless function
        obj.greet();

        // Call the function with parameters
        obj.greetUser("Alice");

        // Call the function with return value and print the result
        int sum = obj.add(5, 10);
        System.out.println("The sum is: " + sum);

        // Call the static function without creating an instance
        eq.staticMessage();
    }
}

/*
Here’s a detailed breakdown of the code line by line:

public class eq {
This declares a public class named eq. This class contains several methods that demonstrate different types of functions.

public void greet() {
This defines a public method named greet. It doesn't take any parameters and has a return type of void, indicating it does not return any value.

System.out.println("Hello! This is a parameterless function.");
This line prints a greeting message indicating that it is a parameterless function.

public void greetUser(String name) {
This defines a public method named greetUser that takes 1 parameter of type String called name. This method will print a personalized greeting.

System.out.println("Hello, " + name + "! This function accepts parameters.");
This line prints a message that includes the value of the name parameter, demonstrating how to use method parameters.

public int add(int a, int b) {
This defines a public method named add that takes two integer parameters, a and b. 
The method returns an integer value, which will be the sum of a and b.

return a + b;
This line returns the sum of the two integer parameters to the caller of the method.

public static void staticMessage() {
This defines a static method named staticMessage. Being static, it can be called without creating an instance of the class.

System.out.println("This is a static function.");
This line prints a message indicating that this is a static function.

public static void main(String[] args) {
This is the main method, serving as the entry point for the Java application.

eq obj = new eq();
This creates an instance (object) of the eq class named obj, allowing access to the non-static methods of the class.

obj.greet();
This calls the greet method on the obj instance, printing the message from the parameterless function.

obj.greetUser("Alice");
This calls the greetUser method on the obj instance, passing the string "Alice" as an argument. It prints a personalized greeting message.

int sum = obj.add(5, 10);
This calls the add method on the obj instance, passing 5 and 10 as arguments. 
The result (the sum, which is 15) is stored in the variable sum.

System.out.println("The sum is: " + sum);
This prints the sum obtained from the add method to the console.

eq.staticMessage();
This calls the static method staticMessage directly using the class name eq, demonstrating that it can be invoked without creating an instance.
*/