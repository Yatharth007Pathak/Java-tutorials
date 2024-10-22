// Interfaces are also used to achieve multiple inheritance in Java.

// First Interface
interface Drivable_ {
    void drive();
}

// Second Interface
interface Flyable_ {
    void fly();
}

// Class implementing multiple interfaces
class FlyingCar implements Drivable_, Flyable_ {

    // Implementation of drive method from Drivable_ interface
    public void drive() {
        System.out.println("Driving on the road.");
    }

    // Implementation of fly method from Flyable_ interface
    public void fly() {
        System.out.println("Flying in the sky.");
    }
}

public class jk {
    public static void main(String[] args) {
        FlyingCar myFlyingCar = new FlyingCar();

        // Calling methods from both interfaces
        myFlyingCar.drive();  // Output: Driving on the road.
        myFlyingCar.fly();    // Output: Flying in the sky.
    }
}

/*
Explanation

Interfaces (Drivable and Flyable):
These interfaces declare methods (drive() and fly()) that must be implemented by any class that implements the interface.
Interfaces do not provide method bodies—just the method signature.

Class (FlyingCar):
The FlyingCar class implements both Drivable and Flyable interfaces.
Since it implements these interfaces, it must provide definitions for both drive() and fly() methods.

Main Method:
Creates an instance of FlyingCar.
Calls drive() and fly() methods, showing that the FlyingCar can inherit behavior from both interfaces.


Let's break down this code line by line:

First Interface
interface Drivable_ {
This line defines an interface named Drivable_, which will contain methods that any implementing class must define.

void drive();
This line declares method named drive() with no implementation. Any class implementing Drivable_ must provide an implementation for this method.

}
This line ends the definition of the Drivable_ interface.

Second Interface
interface Flyable_ {
This line defines another interface named Flyable_, which will contain its own method declarations.

void fly();
This line declares a method named fly(). Any class that implements Flyable_ must provide an implementation for this method.

}
This line ends the definition of the Flyable_ interface.

Class Implementing Multiple Interfaces
class FlyingCar implements Drivable_, Flyable_ {
This line defines a class named FlyingCar that implements both Drivable_ and Flyable_ interfaces, 
meaning it must provide implementations for all methods from both interfaces.

public void drive() {
This line defines the drive() method in the FlyingCar class. The public keyword makes the method accessible from other classes.

System.out.println("Driving on the road.");
This line provides the implementation of the drive() method. It prints "Driving on the road." to the console when called.

}
This line ends the implementation of the drive() method.

public void fly() {
This line defines the fly() method in the FlyingCar class. The public keyword makes the method accessible from outside the class.

System.out.println("Flying in the sky.");
This line provides the implementation of the fly() method. It prints "Flying in the sky." to the console when called.

}
This line ends the implementation of the fly() method.

}
This line ends the definition of the FlyingCar class.

Main Class
public class jk {
This line defines a public class named jk. This class contains the main() method, which is the entry point of the program.

public static void main(String[] args) {
This line defines the main() method. It's public so it can be accessed by the JVM, static so it can be invoked without an instance of the class, and it takes a String array as a parameter (command-line arguments).

FlyingCar myFlyingCar = new FlyingCar();
This line creates an instance of FlyingCar named myFlyingCar. The new FlyingCar() expression constructs a new FlyingCar object.

myFlyingCar.drive();
This line calls the drive() method on the myFlyingCar object. It prints "Driving on the road." to the console.

myFlyingCar.fly();
This line calls the fly() method on the myFlyingCar object. It prints "Flying in the sky." to the console.

}
This line ends the main() method.

}
This line ends the definition of the jk class.
*/