/*
Interface: A completely abstract class that is used to specify a behavior that classes must implement.
Similar to abstract classes, interfaces help us to achieve abstraction in Java.
All the methods inside an interface are implicitly public and all fields are implicitly public static final.
*/

interface Drivable {
    void drive();
}

class Auto implements Drivable {
    @Override
    public void drive() {
        System.out.println("The auto is driving.");
    }
}

public class jj {
    public static void main(String[] args) {
        Drivable myAuto = new Auto();
        myAuto.drive();
    }
}

/*
Let's break down this code line by line:

interface Drivable {
This line defines an interface named Drivable. An interface specifies a set of methods that any implementing class must provide.

void drive();
This line declares a method named drive() with no implementation. 
Any class implementing Drivable must provide a concrete implementation for this method.

}
This line ends the definition of the Drivable interface.

class Auto implements Drivable {
This line defines a class named Auto that implements the Drivable interface. 
This means Auto will provide an implementation for all methods declared in Drivable.

@Override
This is an annotation indicating that the following method is overriding a method from an interface or superclass.

public void drive() {
This line defines the drive() method in the Auto class, providing the implementation for the method declared in the Drivable interface. 
The public keyword makes the method accessible from outside the class.

System.out.println("The auto is driving.");
This line provides the body of the drive() method. It prints "The auto is driving." to the console when called.

}
This line ends the implementation of the drive() method.

}
This line ends the definition of the Auto class.

public class jj {
This line defines a public class named jj. This class contains the main() method, which is the entry point for the program.

public static void main(String[] args) {
This line defines the main() method. It is public so the JVM can call it, static so it can be invoked without creating an instance
 of the class, and it takes a String array as its parameter to handle command-line arguments.

Drivable myAuto = new Auto();
This line declares a reference variable myAuto of type Drivable and assigns it a new instance of the Auto class. 
This is an example of polymorphism, where an interface reference points to an object of a class that implements it.

myAuto.drive();
This line calls the drive() method on the Auto instance through the Drivable reference myAuto. It prints "The auto is driving." to the console.

}
This line ends the main() method.

}
This line ends the definition of the jj class.


Summary
The Drivable interface declares a drive() method.
The Auto class implements the Drivable interface and provides an implementation of the drive() method.
The main() method creates an instance of Auto and calls its drive() method, resulting in the message 
"The auto is driving." being printed to the console.
*/