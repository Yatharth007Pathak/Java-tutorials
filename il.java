/*
A class declared as final cannot be subclassed. 
This is useful when you want to prevent any further inheritance of a class and ensure its integrity.

Key Points for Final Classes:
Final classes cannot be extended, preventing inheritance and ensuring that no modifications can be made to their structure.
*/


final class FinalClass {
    void display() {
        System.out.println("This is a final class.");
    }
}

// class SubClass extends FinalClass { // This will cause a compilation error
// }

public class il {
    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.display(); // Output: This is a final class.
    }
}

/*

The provided Java code demonstrates the use of the final keyword in the context of class declaration. 
Here’s a breakdown of the code, its structure, and functionality.

Code Breakdown
final class FinalClass {
This line declares a class named FinalClass, which is marked as final. This means that FinalClass cannot be subclassed. 
No other class can extend or inherit from FinalClass.

void display() {
This line declares a method named display within the FinalClass.

System.out.println("This is a final class.");
Inside the display method, this line prints the message "This is a final class." to the console.

}
Closes the FinalClass.

Commented Code for Subclassing
// class SubClass extends FinalClass { // This will cause a compilation error
This line is commented out. If it were active, it would attempt to declare a class named SubClass that extends FinalClass. 
Since FinalClass is declared as final, this would result in a compilation error.

// }
Closing brace for the commented-out SubClass.

Main Class
public class il {
Declares a public class named il, which contains the main method.

public static void main(String[] args) {
Declares the main method, which is the entry point for the program.

FinalClass finalClass = new FinalClass();
Creates an instance of FinalClass named finalClass.

finalClass.display(); // Output: This is a final class.
Calls the display method on the finalClass object. This invokes the display method from FinalClass, 
printing "This is a final class." to the console.

}
Closes the main method.

}
Closes the il class.

Explanation of the final Keyword
final class FinalClass: The final keyword indicates that the class cannot be extended. 
This is useful when you want to prevent inheritance and ensure that the implementation of the class remains unchanged.

Effect on Subclassing: If you try to create a subclass (like SubClass in the commented-out code), 
the Java compiler will produce an error indicating that you cannot extend a final class. 
This ensures that the behavior and structure of FinalClass remain intact and cannot be modified by any subclasses.
*/