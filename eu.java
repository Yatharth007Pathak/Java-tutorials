// Calling Methods with Parameters: You can also call methods that accept parameters by passing the required arguments.

public class eu {
    
    // Method that takes parameters
    public void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        // Creating an object of ParameterMethodExample
        eu example = new eu();

        // Calling the method with a parameter
        example.greetUser("Alice");
    }
}

/*
Here’s a detailed breakdown of the code line by line:

public class eu {
This declares a public class named eu. The class is empty and does not contain any methods or attributes.

}
This closing brace indicates the end of the eu class.

public class ParameterMethodExample {
This declares another public class named ParameterMethodExample. This class contains a method that accepts parameters and the main method.

// Method that takes parameters
This is a comment indicating that the following method is designed to take parameters.

public void greetUser(String name) {
This defines a public instance method named greetUser that takes a single parameter of type String called name. 
It has a return type of void, meaning it does not return any value.

System.out.println("Hello, " + name + "!");
This line prints a greeting message to the console that includes the value of the name parameter. 
When called, it will output something like "Hello, Alice!" if "Alice" is passed as an argument.

}
This closing brace indicates the end of the greetUser method.

public static void main(String[] args) {
This is the main method, which serves as the entry point for the Java application. The execution of the program begins here.

// Creating an object of ParameterMethodExample
This is a comment explaining that the next line creates an instance of the ParameterMethodExample class.

eu example = new eu();
This line creates a new object of the eu class named example. This object will be used to call the greetUser method.

// Calling the method with a parameter
This is a comment indicating that the following line will call the greetUser method with a parameter.

example.greetUser("Alice");
This calls the greetUser method on the example object, passing the string "Alice" as an argument. 
This will execute the method and print "Hello, Alice!" to the console.

}
This closing brace indicates the end of the main method.

}
This closing brace indicates the end of the ParameterMethodExample class.
*/