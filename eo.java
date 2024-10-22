// Defining and Calling a Function

public class eo {
    
    // Definition of a method called greet
    public void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Definition of a method called add that returns a result
    public int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        eo obj = new eo();  // Create an instance of the class

        // Calling the greet method
        obj.greet("Alice");

        // Calling the add method and storing the result
        int result = obj.add(5, 10);
        System.out.println("The sum is: " + result);
    }
}

/*
How It Works:

Definition: Methods greet() and add() are defined inside the class FunctionExample.
greet(String name): Takes a parameter name of type String and prints a greeting.
add(int a, int b): Takes two integer parameters a and b, calculates the sum, and returns it.

Call:
obj.greet("Alice"); calls the greet() method, printing "Hello, Alice!".
int result = obj.add(5, 10); calls the add() method, calculates 5 + 10, returns 15, and stores it in the variable result.

Execution: When each method is called, the control is transferred to the method’s body. 
Once the body is executed, the control returns to the caller.

Here’s a detailed breakdown of the code line by line:

public class eo {
This declares a public class named eo. The class contains methods to greet a user and perform addition.

public void greet(String name) {
This defines a public method named greet that takes one parameter of type String called name. 
The method is non-static and does not return any value (void). It is used to print a personalized greeting.

System.out.println("Hello, " + name + "!");
This prints the string "Hello, " followed by the value of name and an exclamation mark (!) to the console.

public int add(int a, int b) {
This defines a public method named add that takes two integer parameters, a and b. The method returns the sum of the two integers.

return a + b;
This returns the result of adding a and b to the caller of the method.

public static void main(String[] args) {
This is the main method where the program execution begins. It serves as the entry point for the Java application.

eo obj = new eo();
This creates an instance (object) of the eo class named obj. This instance is used to call non-static methods of the class.

obj.greet("Alice");
This calls the greet method on the obj instance, passing "Alice" as an argument. It prints the message "Hello, Alice!" to the console.

int result = obj.add(5, 10);
This calls the add method on the obj instance, passing 5 and 10 as arguments. The result of the addition (15) is stored in the variable result.

System.out.println("The sum is: " + result);
This prints the string "The sum is: " followed by the value of result to the console.
*/