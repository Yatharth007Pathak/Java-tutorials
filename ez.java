// Java does not support default values for parameters directly. However, you can achieve similar functionality by overloading methods.

public class ez {

    // Method with one parameter
    public void display(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Overloaded method with no parameters
    public void display() {
        display("Guest"); // Calls the other display method with a default value
    }

    public static void main(String[] args) {
        ez example = new ez();

        // Calling the method with one parameter
        example.display("Alice");

        // Calling the overloaded method with no parameters
        example.display();
    }
}

/*
Here’s a detailed breakdown of the code line by line:

public class ez {
This declares a public class named ez. The class contains methods for displaying messages.

public void display(String name) {
This defines a public instance method named display that takes one parameter of type String, called name. 
This method will be used to greet the user with their name.

System.out.println("Hello, " + name + "!");
This line prints a greeting message to the console in the format "Hello, [name]!", where [name] 
is replaced with the value of the name parameter.

}
This closing brace indicates the end of the first display method.

public void display() {
This defines another public instance method named display, but without any parameters. 
This method is an example of method overloading since it has the same name as the previous display method but different parameters.

display("Guest");
This line calls the first display method (the one that takes a String parameter) and passes "Guest" as an argument. 
This means that if no name is provided, it will greet the user as "Guest".

}
This closing brace indicates the end of the second display method.

public static void main(String[] args) {
This is the main method, which serves as the entry point for the Java application. Execution of the program begins here.

ez example = new ez();
This line creates a new instance of the ez class named example. This object will be used to call the display methods.

example.display("Alice");
This line calls the display method on the example object, passing "Alice" as an argument. The method prints: Hello Alice!

example.display();
This line calls the second display method (the one without parameters). It prints: Hello, Guest!

}
This closing brace indicates the end of the main method.

}
This closing brace indicates the end of the ez class.
*/