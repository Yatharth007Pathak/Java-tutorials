// Instance methods belong to an object of a class. To call an instance method, you need to create an object of that class.

public class es {

    // Instance method
    public void displayMessage() {
        System.out.println("This is an instance method.");
    }

    public static void main(String[] args) {
        // Creating an object of MethodExample
        es example = new es();

        // Calling the instance method using the object
        example.displayMessage();
    }
}


/*
Here’s a detailed breakdown of the code line by line:

public class es {
This declares a public class named es. The class is empty and does not contain any methods or attributes.

}
This closing brace indicates the end of the es class.

// Instance method
This is a comment indicating that the following method is an instance method.

public void displayMessage() {
This defines a public instance method named displayMessage. 
It does not take any parameters and has a return type of void, indicating it does not return any value.

System.out.println("This is an instance method.");
This line prints the message "This is an instance method." to the console when the method is called.

}
This closing brace indicates the end of the displayMessage method.

public static void main(String[] args) {
This is the main method, which serves as the entry point for the Java application. The execution of the program begins here.

// Creating an object of MethodExample
This is a comment explaining that the next line creates an instance of the MethodExample class.

es example = new es();
This line creates a new object of the es class named example. This object will be used to call the instance method displayMessage.

// Calling the instance method using the object
This is a comment indicating that the following line will call the instance method.

example.displayMessage();
This calls the displayMessage method on the example object, which will execute the code inside the method and print the message to the console.

}
This closing brace indicates the end of the main method.

}
This closing brace indicates the end of the MethodExample class.
*/