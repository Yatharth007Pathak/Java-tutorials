/*
In Java (and other programming languages), functions (called methods in Java) are blocks of code designed to perform specific tasks. 
They help organize and reuse code, make programs modular, and improve readability. 
A function (or method) is a group of statements that perform a particular action. 
It may take inputs (called parameters or arguments) and optionally return a result to the caller.

Here’s a breakdown of how functions work step by step:

Definition: The function is defined with a name, return type, and optional parameters.
Call: The function is called (invoked) from somewhere in the program.
Execution: The control is transferred to the function. The code inside the function is executed.
Return: After executing the function, control is passed back to the caller. 
If the function has a return type other than void, a value is returned to the caller.

Key Points to Remember
Reusability: Functions allow you to write a piece of code once and reuse it multiple times.
Modularity: Breaking a problem into multiple functions makes the program easier to manage and understand.
Parameters and Arguments: Functions can take inputs to be more flexible.
Return Value: Functions can return values back to the caller to be used further.
*/

public class eh {

    public static void main(String[] args) {
        greet();
        
    }

    static void greet() {
        System.out.println("Hello World");;
    
    }
}

/*
Here’s a detailed breakdown of the code:

public class eh {
This declares a public class named eh. This class contains the main logic of the program.

public static void main(String[] args) {
This is the main method where the execution of the program begins. It's the entry point for Java applications.

greet();
This calls the greet method. 
Since the method is static, it can be called directly from the main method without needing to create an instance of the class.

static void greet() {
This defines a static method named greet. The method does not return any value (void) and is marked as static, meaning it belongs to the class rather than an instance of the class. This allows it to be called without creating an object of the class.

System.out.println("Hello World");
This prints the text "Hello World" to the console.
*/
