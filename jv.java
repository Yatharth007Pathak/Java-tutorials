/*
In Java, lambda expressions provide a concise way to represent instances of functional interfaces (interfaces with a single abstract method). 
They enable you to implement methods in a clear and expressive manner, improving readability and reducing boilerplate code.

Key Features of Lambda Expressions:
Concise Syntax: Lambda expressions allow you to write code in a more compact way, avoiding the verbosity of anonymous classes.
No Need for Explicit Types: The compiler can infer the types of parameters based on the functional interface.
Functional Style: They facilitate functional programming in Java, especially with the use of streams.
Functional Interfaces: They can only be used with functional interfaces, which can be created using the @FunctionalInterface annotation.
No Need for Boilerplate Code: Lambda expressions eliminate the need for separate class implementations for functional interfaces.
Access to Variables: They can access variables from the enclosing context, 
provided those variables are final or effectively final (unchanged after assignment).

The syntax of a lambda expression is as follows:
(parameters) -> expression

or for multiple statements:
(parameters) -> {
    // body of the lambda
}

Parameters: The parameters required by the method (can be zero or more).
Arrow Token (->): Separates the parameters from the body.
Method Body: Contains the code to be executed (can be a single expression or a block of statements).
*/

@FunctionalInterface
interface Greetiing {
    void sayHello(String name);
}

public class jv {
    public static void main(String[] args) {
        // Using a lambda expression to implement the Greeting interface
        Greetiing greet = (name) -> System.out.println("Hello, " + name);
        
        // Calling the method
        greet.sayHello("Alice");
    }
}

/*
The program defines a functional interface Greetiing with a single abstract method sayHello().
In the main() method, a lambda expression is used to implement the sayHello() method, printing a greeting message.
The method is called with the name "Alice", resulting in the output Hello, Alice printed to the console.

Here's a line-by-line breakdown of the code:

@FunctionalInterface
This annotation indicates that the Greetiing interface is a functional interface, meaning it contains exactly one abstract method.

interface Greetiing {
Declares a functional interface named Greetiing.

void sayHello(String name);
Defines an abstract method sayHello that takes a String parameter name and returns no value (void). 
This method will be implemented using a lambda expression.

}
Ends the Greetiing interface.

public class jv {
Declares a public class named jv, which contains the main() method.

public static void main(String[] args) {
Defines the main() method, which serves as the entry point of the program.

Greetiing greet = (name) -> System.out.println("Hello, " + name);
Creates a variable greet of type Greetiing and assigns it a lambda expression that implements the sayHello method. 
The lambda takes one parameter, name, and directly prints the greeting message using the expression System.out.println("Hello, " + name).

greet.sayHello("Alice");
Calls the sayHello method on the greet instance, passing the string "Alice" as an argument. This prints Hello, Alice to the console.

}
Ends the main() method.

}
Ends the jv class.
*/