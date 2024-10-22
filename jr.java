/*
In Java, functional interfaces are interfaces that have exactly one abstract method but can have multiple default or static methods. 
They are used primarily in lambda expressions and method references, enabling more functional programming constructs in Java.

Functional interfaces are defined with the @FunctionalInterface annotation. This annotation tells the compiler that the interface is 
intended to be functional, and it will enforce that the interface only has one abstract method.

Key Points:
Single Abstract Method (SAM): Functional interfaces have only one abstract method.
Lambda Expressions: They are often used with lambda expressions to pass functionality as arguments.
Method References: Functional interfaces can also be used with method references.
@FunctionalInterface Annotation: This annotation is optional but helps to ensure the interface is functional.

Some commonly used built-in functional interfaces in Java include:
Runnable: Has the abstract method run().
Callable<T>: Has the abstract method call().
Comparator<T>: Has the abstract method compare(T o1, T o2).
Function<T, R>: Has the abstract method R apply(T t).
Predicate<T>: Has the abstract method boolean test(T t).

Functional interfaces in Java are interfaces with exactly 1 abstract method, making them suitable for lambda expressions and method references.
Java 8 introduced built-in functional interfaces like Function, Predicate, Runnable, Consumer, etc.,
which are frequently used in functional-style programming.
The @FunctionalInterface annotation ensures that the interface follows the rules of functional interfaces, 
enforcing that it has only one abstract method.
*/


// Define a functional interface
@FunctionalInterface
interface Calculator__ {
    int operate(int a, int b); // Abstract method
}

public class jr {
    public static void main(String[] args) {
        // Using a lambda expression to implement addition
        Calculator__ add = (a, b) -> a + b;
        System.out.println("Addition: " + performOperation(5, 3, add)); // Output: 8

        // Using a lambda expression to implement subtraction
        Calculator__ subtract = (a, b) -> a - b;
        System.out.println("Subtraction: " + performOperation(5, 3, subtract)); // Output: 2

        // Using a lambda expression to implement multiplication
        Calculator__ multiply = (a, b) -> a * b;
        System.out.println("Multiplication: " + performOperation(5, 3, multiply)); // Output: 15

        // Using a lambda expression to implement division
        Calculator__ divide = (a, b) -> a / b;
        System.out.println("Division: " + performOperation(6, 3, divide)); // Output: 2
    }

    // Method that accepts the Calculator functional interface
    private static int performOperation(int a, int b, Calculator__ calculator) {
        return calculator.operate(a, b); // Calls the operate method
    }
}

/*
Here's a line-by-line breakdown of the code:

@FunctionalInterface
This annotation indicates that the Calculator__ interface is a functional interface. A functional interface has exactly one abstract method.

interface Calculator__ {
Declares a functional interface named Calculator__.

int operate(int a, int b);
Defines an abstract method operate(int a, int b), which takes two integers as parameters and returns an integer. 
This method will be implemented using lambda expressions.

}
Ends the Calculator__ interface.

public class jr {
Declares a public class named jr, which contains the main() method.

public static void main(String[] args) {
Defines the main() method, which is the entry point of the program.

Calculator__ add = (a, b) -> a + b;
Creates a variable add of type Calculator__ and assigns it a lambda expression that implements the operate() method for addition. 
The lambda expression takes two parameters a and b, and returns their sum.

System.out.println("Addition: " + performOperation(5, 3, add));
Calls the performOperation() method with the values 5 and 3 and the add lambda. The result is printed to the console.
This line outputs: Addition: 8.

Calculator__ subtract = (a, b) -> a - b;
Creates a variable subtract of type Calculator__ and assigns it a lambda expression for subtraction, returning the difference of a and b.

System.out.println("Subtraction: " + performOperation(5, 3, subtract));
Calls performOperation() with the values 5 and 3 and the subtract lambda. The result is printed to the console.
This line outputs: Subtraction: 2.

Calculator__ multiply = (a, b) -> a * b;
Creates a variable multiply of type Calculator__ and assigns it a lambda expression for multiplication, returning the product of a and b.

System.out.println("Multiplication: " + performOperation(5, 3, multiply));
Calls performOperation() with the values 5 and 3 and the multiply lambda. The result is printed to the console. 
This line outputs: Multiplication: 15.

Calculator__ divide = (a, b) -> a / b;
Creates a variable divide of type Calculator__ and assigns it a lambda expression for division, returning the quotient of a and b.

System.out.println("Division: " + performOperation(6, 3, divide));
Calls performOperation() with the values 6 and 3 and the divide lambda. The result is printed to the console. 
This line outputs: Division: 2.

}
Ends the main() method.

private static int performOperation(int a, int b, Calculator__ calculator) {
Declares a private static method named performOperation, which takes two integers and a Calculator__ instance as parameters. 
It returns an integer result.

return calculator.operate(a, b);
Calls the operate() method on the calculator object (which can be any implementation of the Calculator__ interface) 
with a and b as arguments, and returns the result.

}
Ends the performOperation() method.

}
Ends the jr class.


Summary
The code defines a functional interface Calculator__ with a single abstract method operate().
In the main() method, several lambda expressions implement the operate() method for different arithmetic operations: 
addition, subtraction, multiplication, and division.
Each lambda expression is assigned to a variable of type Calculator__.
The performOperation() method is called with the respective lambda expressions to execute the operations, 
and the results are printed to the console.
*/