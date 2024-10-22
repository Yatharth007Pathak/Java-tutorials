/*
Abstraction is the concept of hiding implementation details and showing only essential information or functionality to the user.
Abstraction allows us to hide unnecessary details and onlly show the needed information.
This allowws us to manage complexity by omitting or hiding details with a simpler, higher level idea.
It can be achieved through abstract classes or interfaces.
*/

abstract class Aniimal {
    abstract void sound(); // Abstract method (no body)

    void sleep() {
        System.out.println("Sleeping...");
    }
}

class Cat_ extends Aniimal {
    void sound() {
        System.out.println("Meow");
    }
}

public class jg {
    public static void main(String[] args) {
        Aniimal myCat = new Cat_();
        myCat.sound();
        myCat.sleep();
    }
}

/*
Here’s a breakdown of the code, line by line:

abstract class Aniimal {
Defines an abstract class named Aniimal. An abstract class cannot be instantiated directly and is meant to be extended.

abstract void sound();
Declares an abstract method named sound(), which must be implemented by any subclass. Abstract methods do not have a body.

void sleep() {
Declares a concrete method sleep(), which can be used by any subclass of Aniimal.

System.out.println("Sleeping...");
Prints "Sleeping..." to the console when sleep() is called.

}
Ends the sleep() method.

}
Ends the Aniimal class.

class Cat_ extends Aniimal {
Defines a class named Cat_ that inherits from the Aniimal abstract class.

void sound() {
Implements the abstract sound() method from the Aniimal class.

System.out.println("Meow");
Prints "Meow" to the console when sound() is called.

}
Ends the sound() method.

}
Ends the Cat_ class.

public class jg {
Defines the main class named jg.

public static void main(String[] args) {
Defines the main method, which serves as the entry point of the Java program.

Aniimal myCat = new Cat_();
Creates an instance of the Cat_ class but stores it in a reference of type Aniimal.
Demonstrates polymorphism, where an abstract class reference holds an object of a subclass.

myCat.sound();
Calls the sound() method on the myCat object.
Prints "Meow" to the console since the Cat_ class provides the implementation.

myCat.sleep();
Calls the sleep() method from the Aniimal class.
Prints "Sleeping..." to the console.

}
Ends the main() method.

}
Ends the jg class.


In the given code, abstraction is demonstrated using the following:

Abstract Class (Aniimal):
The class Aniimal is declared as abstract. An abstract class is used to represent a general concept (Aniimal) that cannot be instantiated 
directly but can be extended by other classes. The abstract class contains a mix of abstract methods and concrete methods.

Abstract Method (sound()):
The method sound() in Aniimal is abstract, meaning it does not have an implementation in the abstract class. Instead, it serves as a 
blueprint for subclasses, forcing them to provide their specific implementation of sound(). This allows the subclasses to define the 
actual behavior, ensuring that all subclasses have a sound() method, but the specific implementation can differ.

Concrete Method (sleep()):
The sleep() method in Aniimal is a concrete method, providing common functionality for all subclasses. This demonstrates how 
abstraction allows for shared functionality across all subclasses while also enabling specialization through abstract methods.

Subclasses Providing Implementation (Cat_):
The class Cat_ extends Aniimal and provides a specific implementation of the sound() method, fulfilling the requirement of the abstract class.
By inheriting from Aniimal, Cat_ is abstracting away the general behavior of animals (sleep()) 
and focusing on its specific behavior (Meow as its sound).
*/