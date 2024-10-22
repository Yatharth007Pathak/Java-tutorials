/*
An interface is a fully abstract class. It inculdes a group of abstract methods (methods without a body).
We use the interface keyword to create an interface in Java. like abstract classes, we cannot create objects of interfaces.
To use interfaces, other classes must implement it. We use the implements keyword to implement an interface
*/

interface Drawable {
    void draw(); // Method without a body
}

class Circle implements Drawable {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

public class ji {
    public static void main(String[] args) {
        Drawable d = new Circle();
        d.draw();
    }
}

/*
Let's break down the code line by line:

interface Drawable {
This line defines an interface named Drawable. An interface is like a contract that specifies a set of methods that a class must implement.

void draw(); // Method without a body
This line declares a method named draw(), which returns nothing (void). Since this is in an interface, it has no body, 
meaning it does not contain any implementation. Any class that implements Drawable must provide its own definition of this method.

}
This line ends the definition of the Drawable interface.

class Circle implements Drawable {
This line defines a class named Circle that implements the Drawable interface, 
meaning it will provide the implementation for all methods declared in Drawable.

public void draw() {
This line defines the draw() method in the Circle class. The public keyword makes it accessible from other classes,
and it overrides the method from the Drawable interface.

System.out.println("Drawing a circle");
This line provides the implementation for the draw() method. It prints "Drawing a circle" to the console when called.

}
This line ends the implementation of the draw() method.

}
This line ends the definition of the Circle class.

public class ji {
This line defines a public class named ji. This class contains the main() method, which is the entry point of the program.

public static void main(String[] args) {
This line defines the main() method. It's marked as public so it can be accessed by the JVM, 
static so it can run without creating an instance of the class, and it takes a String array as a parameter (the command-line arguments).

Drawable d = new Circle();
This line creates a reference d of type Drawable and assigns it a new instance of Circle. 
This demonstrates polymorphism, where a reference to an interface can point to an object of a class that implements the interface.

d.draw();
This line calls the draw() method on the Circle instance through the Drawable reference d. It prints "Drawing a circle" to the console.

}
This line ends the main() method.

}
This line ends the definition of the ji class.

Summary
The Drawable interface defines a method called draw().
The Circle class implements this interface and provides a specific implementation for draw().
The main() method creates a Circle object, and the draw() method is called, printing "Drawing a circle".
*/