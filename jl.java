/*
An inner class is a non-static nested class that has access to the members (including private ones) of the enclosing (outer) class. 
Inner classes are associated with an instance of the outer class.
Since the inner class exists within the outer class, we must instantiate the outer class first, in order to instantiate the inner class.

Key Characteristics:
Instance Dependent: Inner classes are tied to instance of the outer class. We need an object of the outer class to instantiate an inner class.
Access to Outer Class Members: Inner classes can access the fields and methods (even private ones) of the outer class.
Commonly Used: Inner classes are useful when you want to logically group classes that will only be used in the context of the outer class.

Use an inner class when it makes sense to have an object tied to an instance of the outer class, 
such as when the inner class needs to access or modify the outer class's instance variables.
*/

class OuterClass {
    private String message = "Hello from the Outer class!";

    // Inner class
    class InnerClass {
        void displayMessage() {
            System.out.println(message); // Can access private members of OuterClass
        }
    }

    // Method to create an instance of the InnerClass
    void createInnerClassInstance() {
        InnerClass inner = new InnerClass();
        inner.displayMessage();
    }
}

public class jl {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.createInnerClassInstance(); // Calls inner class method via outer class
    }
}

/*
Here's a breakdown of the provided code, line by line:

class OuterClass {
Declares a class named OuterClass. This is the outer class that contains both its own members and an inner class.

private String message = "Hello from the Outer class!";
Declares a private string variable message and assigns it the value "Hello from the Outer class!".
The message variable is private, meaning it is accessible only within the OuterClass.

class InnerClass {
Declares an inner class named InnerClass within the OuterClass. Inner classes have access to all members (even private) of the outer class.

void displayMessage() {
Defines a method displayMessage() inside the InnerClass. This method will display the message from the outer class.

System.out.println(message);
Prints the message string from the outer class to the console. 
Since InnerClass is an inner class, it can access even the private members of OuterClass.

}
Ends the displayMessage() method.

}
Ends the InnerClass.

void createInnerClassInstance() {
Declares a method in the OuterClass named createInnerClassInstance().

InnerClass inner = new InnerClass();
Creates an instance of the inner class InnerClass within the OuterClass.

inner.displayMessage();
Calls the displayMessage() method of the InnerClass, which prints the message to the console.

}
Ends the createInnerClassInstance() method.

}
Ends the OuterClass.

public class jl {
Declares a class named jl, which contains the main() method, the entry point of the program.

public static void main(String[] args) {
Defines the main() method, which is the starting point for the execution of the Java program.

OuterClass outer = new OuterClass();
Creates an instance of the OuterClass named outer.

Outer.createInnerClassInstance();
Calls the createInnerClassInstance() method on the outer object.
This triggers the creation of an InnerClass instance and calls the displayMessage() method, which prints the message from the outer class.

}
Ends the main() method.

}
Ends the jl class.


Summary
OuterClass contains a private member message and an inner class InnerClass.
The inner class can access the private members of the outer class and is used here to print the outer class's message.
The createInnerClassInstance() method in OuterClass creates an instance of InnerClass and calls its displayMessage() method.
In the main() method, an instance of OuterClass is created, and its method createInnerClassInstance() is called to display the message.
*/