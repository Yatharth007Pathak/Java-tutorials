/*
In Java, methods are blocks of code or collection of statements or a set of code grouped together 
that perform specific tasks and can be called upon from other parts of the program. 
They allow you to break down the logic into reusable units, making code modular, maintainable, and easier to understand.
It is used to achieve the reusability of code. Calling a method in Java involves invoking it to execute the code defined within that method.
A method parameter is a value accepted by the method.

Types of Methods
Predefined Methods: These are methods that are already defined in Java's standard libraries (e.g., System.out.println(), Math.random()).
User-defined Methods: These are methods that you create to perform specific tasks.

Syntax of a Method
returnType methodName(parameters) {
    // Method body (code to be executed)
    return value; // Optional, based on the return type
}

Components of a Method ->

Access Modifier (optional): Determines the visibility or accessibility of the method from other classes. Common Access Modifiers are-
public: The method is accessible from any other class.
protected: The method is accessible within its own package and by subclasses.
private: The method is only accessible within the same class.
No modifier (default/package-private): The method is accessible only within the same package.

Return Type: Specifies the type of value the method will return (e.g., int, String, double, boolean). 
If the method does not return any value, the return type is void.

Method Name: The name of the method. It should follow Java's naming conventions (typically in camelCase), 
and the method name should describe what the method does.

Parameters (optional): Input values that the method takes to perform its task, also called arguments. Parameters are defined 
in parentheses after the method name. They include a data type and a variable name. Multiple parameters are separated by commas.

Method Body: The block of code inside the method that performs the action. The method body is enclosed within curly braces { }. 
This is where the logic of the method resides, such as calculations, loops, or condition checks.

Return Statement (optional): If the method has a return type other than void, it must include a return statement 
that returns a value of the specified type. The return statement exits the method and sends the specified value back to the caller.

Key Points About Methods in Java
Return Type: A method must specify a return type, and if it doesn't return anything, use void.
Parameters: Methods can accept parameters, and they are passed to the method when it is called.
Static Methods: Methods that belong to the class and can be called without creating an object.
Overloading: Multiple methods can have the same name but must have different parameter lists.
*/


public class eg {
    
    // Method with all components
    public int multiply(int a, int b) {  // public (access modifier), int (return type), multiply (method name), int a, int b (parameters)
        int result = a * b;  // Method body
        return result;       // Return statement
    }

    public static void main(String[] args) {
        eg obj = new eg();
        int product = obj.multiply(5, 10);  // Calling the method
        System.out.println("Product: " + product);
    }
}

/*
Components of method
Access Modifier: Controls the visibility (e.g., public, private).
Return Type: Specifies the data type of the value returned by the method (or void if no value is returned).
Method Name: Identifies the method (should be descriptive and follow naming conventions).
Parameters: Input values passed to the method (can be zero or more).
Method Body: Contains the code that defines what the method does.
Return Statement: Sends the result back to the caller if the method returns a value.
*/

/*
Here’s a detailed breakdown of the code line by line:

public class eg {
This declares a public class named eg. In Java, a class is a blueprint from which individual objects are created.

public int multiply(int a, int b) {
This defines a method named multiply that takes two integer parameters a and b. 
The method is public, meaning it can be accessed from outside the class. The method will return an integer value.

int result = a * b;
Inside the multiply method, this line calculates the product of a and b, storing the result in the variable result.

return result;
This returns the value of result to the caller of the method, which will be the product of the two integers.

public static void main(String[] args) {
This is the main method where the execution of the program begins. It is the entry point for the Java application.

eg obj = new eg();
This creates a new instance of the eg class and assigns it to the variable obj. 
This instance can now be used to call the non-static methods of the class.

int product = obj.multiply(5, 10);
This calls the multiply method on the obj instance, passing 5 and 10 as arguments. 
The return value (the product of 5 and 10, which is 50) is stored in the variable product.

System.out.println("Product: " + product);
This prints the string "Product: " followed by the value of product (which is 50) to the console.
*/