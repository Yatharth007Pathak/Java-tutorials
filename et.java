/*
Static methods belong to the class itself and can be called without creating an object.
You can call them directly using the class name or from other static methods.
*/


public class et {

    // Static method
    public static void showMessage() {
        System.out.println("This is a static method.");
    }

    public static void main(String[] args) {
        // Calling the static method directly using the class name
        et.showMessage();
        
        // Alternatively, you can also call it from another static method
        anotherStaticMethod();
    }

    public static void anotherStaticMethod() {
        showMessage(); // Calling static method without class name
    }
}

/*
Here’s a detailed breakdown of the code line by line:

public class et {
This declares a public class named et. The class is empty and does not contain any methods or attributes.

}
This closing brace indicates the end of the et class.


// Static method
This is a comment indicating that the following method is a static method.

public static void showMessage() {
This defines a public static method named showMessage. 
It does not take any parameters and has a return type of void, indicating it does not return any value.

System.out.println("This is a static method.");
This line prints the message "This is a static method." to the console when the method is called.

}
This closing brace indicates the end of the showMessage method.

public static void main(String[] args) {
This is the main method, which serves as the entry point for the Java application. The execution of the program begins here.

// Calling the static method directly using the class name
This is a comment explaining that the next line will call the static method using the class name.

et.showMessage();
This line calls the static method showMessage directly using the class name et, which executes the method and prints the message to the console.

// Alternatively, you can also call it from another static method
This is a comment indicating that the next line will demonstrate another way to call the static method.

anotherStaticMethod();
This calls another static method defined in the same class.

public static void anotherStaticMethod() {
This defines a public static method named anotherStaticMethod. It does not take any parameters and has a return type of void.

showMessage();
This line calls the showMessage method without using the class name, as it is in the same class. 
This will execute the showMessage method again and print the message to the console.

}
This closing brace indicates the end of the anotherStaticMethod.

}
This closing brace indicates the end of the StaticMethodExample class.
*/