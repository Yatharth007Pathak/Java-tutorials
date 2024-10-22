/*
If we want to access class members without creating an instance of the class, we need to declare the class members static.
static variables can be accessed by calling the class name of the claass. There is no need to create an instance of the class 
for accessing the static variables because static variable are the class variables and are shared among all the class instances.

Key Points About static Keyword
Memory Management: Static variables and methods reside in the method area of the memory and are shared among all instances.
Access: Static methods can be called without creating an instance of the class, and they can only access static variables and methods.
Usage: Commonly used for utility methods, constants, and shared data that should be accessible across all instances.
*/

class Counter {
    // Static variable to keep track of count
    static int count = 0;

    // Static method to increment the count
    static void increment() {
        count++;
    }

    // Static method to display the current count
    static void displayCount() {
        System.out.println("Current Count: " + count);
    }
}

public class iz {
    public static void main(String[] args) {
        // Increment the count
        Counter.increment();
        Counter.displayCount(); // Display count after first increment
        
        // Increment the count again
        Counter.increment();
        Counter.displayCount(); // Display count after second increment
    }
}

/*
Here’s a pointwise breakdown of the provided Java code, line by line:

class Counter {
Defines a public class named Counter.

static int count = 0;
Declares a static variable count of type int initialized to 0. 
This variable is shared across all instances of the class and keeps track of the count.

static void increment() {
Begins the definition of a static method increment() that increments the value of count.

count++;
Increments the value of the count variable by 1.

}
Ends the increment() method.

static void displayCount() {
Begins the definition of a static method displayCount() that displays the current value of count.

System.out.println("Current Count: " + count);
Prints the message "Current Count: " followed by the current value of the count variable.

}
Ends the displayCount() method.

}
Ends the Counter class.

public class iz {
Defines a public class named iz.

public static void main(String[] args) {
Defines the main method, which serves as the entry point for the Java application.

Counter.increment();
Calls the static method increment() from the Counter class to increment the count by 1.

Counter.displayCount();
Calls the static method displayCount() from the Counter class to display the current count after the first increment.

Counter.increment();
Calls the static method increment() again to increment the count by another 1.

Counter.displayCount();
Calls the static method displayCount() again to display the current count after the second increment.

}
Ends the main method.

}
Ends the iz class.
*/