// Functional Interface with Lambda Expression

@FunctionalInterface
interface Greeting_ {
    void sayHello(String name);
}

public class js {
    public static void main(String[] args) {
        // Using a lambda expression to implement the functional interface
        Greeting_ greet = (name) -> {
            System.out.println("Hello, " + name);
        };

        // Calling the method
        greet.sayHello("Alice");
    }
}

/*
The program defines a functional interface Greeting_ with a single abstract method sayHello().
In the main() method, a lambda expression is used to implement the sayHello() method, printing a greeting message.
The method is called with the name "Alice", resulting in the output Hello, Alice printed to the console.

Here's a line-by-line breakdown of the code:

@FunctionalInterface
This annotation indicates that the Greeting_ interface is a functional interface, meaning it contains exactly one abstract method.

interface Greeting_ {
Declares a functional interface named Greeting_.

void sayHello(String name);
Defines an abstract method sayHello that takes a String parameter name and returns no value (void). 
This method will be implemented using a lambda expression.

}
Ends the Greeting_ interface.

public class js {
Declares a public class named js, which contains the main() method.

public static void main(String[] args) {
Defines the main() method, which serves as the entry point of the program.

Greeting_ greet = (name) -> {
Creates a variable greet of type Greeting_ and assigns it a lambda expression that implements the sayHello method. 
The lambda takes one parameter, name.

System.out.println("Hello, " + name);
Inside the lambda body, this line prints a greeting message that includes the name parameter.

};
Ends the lambda expression.

greet.sayHello("Alice");
Calls the sayHello method on the greet instance, passing the string "Alice" as an argument. This prints Hello, Alice to the console.

}
Ends the main() method.

}
Ends the js class.
*/