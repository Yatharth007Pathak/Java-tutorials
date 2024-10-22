/*
An abstract class in Java is a class that cannot be instantiated on its own (as we cannot create objectss of abstract class). 
We use the abstract keyword to declare an abstract class. It is meant to be extended by other classes ,i.e we can create subclasses from it. 
We can then access members of the abstract class using the object of the subclass.
It can have abstract methods (methods without a body) as well as concrete methods (methods with a body). 
Abstract classes are used to provide a common base and define methods that must be implemented by derived classes.
If the abstract class includes any abstract method, then all the child classes inherited from the abstract superclass 
must provide the implementation of the abstract method.

Key Points:

Abstract Methods: Declared without a body, subclasses must implement them.
Concrete Methods: Abstract classes can also have methods with full definitions.
Instantiation: You cannot create an instance of an abstract class directly.
Usage: Abstract classes are used when you want to provide some shared code but also ensure that certain methods are defined in the subclasses.

Abstract classes are useful for defining a blueprint for other classes, 
particularly when there is shared behavior or characteristics across different types of objects.
*/

abstract class Animal__ {
    // Abstract method (does not have a body)
    abstract void sound();

    // Regular method
    void eat() {
        System.out.println("This animal is eating");
    }
}

class Dog__ extends Animal__ {
    // Providing implementation of the abstract method
    void sound() {
        System.out.println("The dog barks");
    }
}

public class jf {
    public static void main(String[] args) {
        Dog__ dog = new Dog__();
        dog.sound(); // Output: The dog barks
        dog.eat();   // Output: This animal is eating
    }
}

/*
Let's go through this code line by line:

abstract class Animal__ {: Defines an abstract class named Animal__. An abstract class cannot be instantiated directly. 
It is typically used to provide a common base class for other classes, with methods that may or may not be fully implemented.

abstract void sound(): Declares an abstract method named sound. An abstract method does not have a body and must be overridden in a subclass. 
This defines that all subclasses of Animal__ must provide their own implementation of sound().

void eat() { System.out.println("This animal is eating"); }: Defines a concrete (regular) method called eat that prints "This animal is eating".
Unlike abstract methods, regular methods have a body and can be inherited as is by subclasses.


class Dog__ extends Animal__ {: Declares a class called Dog__ that extends the abstract class Animal__. 
This means Dog__ inherits the properties and methods of Animal__.

void sound() { System.out.println("The dog barks"); }: This method provides the implementation of the abstract method sound from Animal__. 
Here, it prints "The dog barks". Since Animal__ defined sound as abstract, Dog__ must implement it.

public class jf: Declares a public class named jf, which contains the main method. This class is the entry point for the Java application.

public static void main(String[] args) {: This is the main method, which is the entry point for a Java program. 
The JVM calls this method to start the execution of the program.

Dog__ dog = new Dog__();: Creates an instance of the Dog__ class. This object can now access the methods defined in both Dog__ and Animal__.

dog.sound(): Calls the sound method of the Dog__ class, which prints "The dog barks" to the console.

dog.eat() }: Calls the eat method from the superclass Animal__, which prints "This animal is eating".

Summary
Animal__ is an abstract class with an abstract method sound() and a concrete method eat().
Dog__ extends Animal__, providing an implementation of the abstract sound() method.
In the main method, an instance of Dog__ is created, and both the sound() and eat() methods are called, resulting in the outputs:
"The dog barks"
"This animal is eating"
*/