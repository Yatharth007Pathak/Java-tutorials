/*
In Java, a class can contain another class known as nested class. It's possible to create a nested class without giving any name.
A nested class that doesn't have any name is known as an anonymous class.
Anonymous classes are declared and instantiated at the same time, either by extending a class or by implementing an interface.
In Java, anonymous classes (also called anonymous inner classes) are a way to create a one-time-use class that is defined 
and instantiated in a single expression.  

Key Features of Anonymous Classes:
No Name: Anonymous classes do not have a name, and you cannot reuse them. They are typically used for one-off implementations.
Implements Interfaces or Extends Classes: They are commonly used to provide a quick implementation of an interface 
or to extend an abstract class without formally defining a new class.
Compact: They are written as part of the statement where they are needed, making the code more concise, 
especially when dealing with event listeners or simple callback functions.
Scope: They can access variables (including final or effectively final) from the enclosing context, such as methods and outer class variables.

Syntax for anonymous class implementing an interface
new InterfaceName() {
    // Implementation of interface methods
};

Syntax for anonymous class extending a class
new ClassName() {
    // Override class methods
};

Limitations of Anonymous Classes:
Cannot Have Constructors: Since anonymous classes don’t have names, they cannot define constructors. 
However, you can pass arguments to the superclass constructor if needed.
Not Reusable: Anonymous classes are one-off, meaning they cannot be reused elsewhere in the code.
Limited Readability: Anonymous classes can make the code harder to read and maintain if used excessively, especially for more complex logic.

Use Cases:
Event Listeners: Commonly used in GUI applications for handling events like button clicks or key presses.
Quick Implementation: Useful for providing quick implementations of interfaces, 
especially when using Java functional interfaces like Runnable or Comparable.
Callback Methods: Frequently used in scenarios where callback methods are needed, such as asynchronous tasks or background thread execution.
*/

public class jn {
    public static void main(String[] args) {
        // Creating a thread using an anonymous class implementing Runnable interface
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running.");
            }
        });

        // Starting the thread
        thread.start();
    }
}

/*
Here's a line-by-line breakdown of the code:

public class jn {
Declares a public class named jn, which contains the main() method.

public static void main(String[] args) {
Defines the main() method, which is the entry point of the program.

Thread thread = new Thread(new Runnable() {
Creates a new Thread object.
An anonymous class is created that implements the Runnable interface inside the new Thread() constructor.
This approach provides the functionality of the Runnable interface without needing to create a separate class.

@Override
Indicates that the run() method overrides the method in the Runnable interface. 
This annotation ensures that the method correctly overrides the interface method.

public void run() {
Implements the run() method from the Runnable interface. The code inside this method defines the task that the thread will execute when started.

System.out.println("Thread is running.");
Prints "Thread is running." to the console when the thread is executed.

}
Ends the run() method.

}
Ends the anonymous class implementing Runnable.

});
Ends the Thread constructor, which now contains the Runnable implementation.

thread.start();
Calls the start() method of the Thread object.
This causes the thread to begin executing the run() method in a separate thread of execution, 
meaning "Thread is running." will be printed asynchronously.

}
Ends the main() method.

}
Ends the jn class.


Summary
The program creates a new thread using an anonymous class that implements the Runnable interface.
The run() method inside the anonymous class defines the task for the thread to execute (System.out.println("Thread is running.");).
The start() method is called on the Thread object, which runs the task in a separate thread, printing "Thread is running.".
Using an anonymous class allows the thread's behavior to be specified directly without creating a separate class to implement Runnable.
*/