/*
A nested static class is a static class inside another class. Since it is static, it cannot access non-static members (fields or methods)
of the outer class directly. We do not need an instance of the outer class to instantiate a nested static class.

Key Characteristics:
Independent of Outer Class Instances: You can create an instance of the static nested class without creating an instance of the outer class.
No Access to Non-static Members: A static nested class cannot directly access non-static members (fields or methods) of the outer class. 
It can only access static members of the outer class.
Use Case: Nested static classes are useful when you want to logically group classes, 
but the inner class does not need access to instance variables or methods of the outer class.

Use a static nested class when you want to group classes together logically but don't want to increase the memory overhead of 
storing a reference to the outer class. It’s useful when the nested class doesn’t need to access any instance members of the outer class.
*/

class OuterClass_ {
    private static String staticMessage = "Hello from the Outer class (static)!";

    // Static nested class
    static class NestedStaticClass {
        void displayStaticMessage() {
            System.out.println(staticMessage); // Can access static members of OuterClass
        }
    }
}

public class jm {
    public static void main(String[] args) {
        // Create an instance of the static nested class
        OuterClass_.NestedStaticClass nested = new OuterClass_.NestedStaticClass();
        nested.displayStaticMessage();
    }
}

/*
Here's a line-by-line breakdown of the provided code:

class OuterClass_ {
Declares a class named OuterClass_. This is the outer class that contains static members and a static nested class.

private static String staticMessage = "Hello from the Outer class (static)!";
Declares a private static string variable staticMessage and assigns it the value "Hello from the Outer class (static)!".
The staticMessage is static, meaning it belongs to the class itself and can be accessed without creating an instance of the class.

static class NestedStaticClass {
Declares a static nested class named NestedStaticClass. Since it is static, it can be used independently of an instance of the outer class.
Unlike non-static inner classes, static nested classes do not have access to instance members of the outer class. 
They can only access static members.

void displayStaticMessage() {
Defines a method displayStaticMessage() inside the NestedStaticClass. This method will display the staticMessage from the outer class.

System.out.println(staticMessage);
Prints the staticMessage from the outer class to the console.
Since NestedStaticClass is static, it can access the static members (staticMessage) of the outer class.

}
Ends the displayStaticMessage() method.

}
Ends the NestedStaticClass.

}
Ends the OuterClass_.

public class jm {
Declares a class named jm, which contains the main() method.

public static void main(String[] args) {
Defines the main() method, which serves as the entry point of the program.

OuterClass_.NestedStaticClass nested = new OuterClass_.NestedStaticClass();
Creates an instance of the static nested class NestedStaticClass.
Since NestedStaticClass is static, it can be instantiated without creating an instance of OuterClass_.

nested.displayStaticMessage();
Calls the displayStaticMessage() method on the nested object. Prints "Hello from the Outer class (static)!" to the console.

}
Ends the main() method.

}
Ends the jm class.


Key Points
OuterClass_ contains a static member staticMessage and a static nested class NestedStaticClass.
The static nested class can access static members (staticMessage) of outer class but cannot access non-static instance members of outer class.
Static nested classes can be instantiated without creating an object of the outer class.
In the main() method, the static nested class is instantiated, and the displayStaticMessage() method is called to print the message.
*/