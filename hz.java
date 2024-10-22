/*
Method overriding in Java is a feature that allows a subclass to provide a specific implementation for a method that is already defined 
in its superclass. The overriding method in the subclass should have the same name, 
return type (or compatible type), and parameters as the method in the superclass. 
Method overriding is used to achieve runtime polymorphism, allowing Java to determine the appropriate method implementation at runtime.

Rules for Method Overriding
Same Method Signature: The method in the subclass must have the same name, return type (or covariant return type), 
and parameter list as the method in the superclass.
Inheritance: Method overriding occurs only in an inheritance relationship. 
The subclass inherits the method from its superclass and provides a new implementation.
@Override Annotation: The @Override annotation is often used to indicate that a method is being overridden. 
This is optional but helps catch errors at compile time.
Access Modifier: The overriding method must not have a more restrictive access modifier than the method in the superclass 
(e.g., if the superclass method is public, the overriding method cannot be protected or private).
*/

// Superclass
class Animals {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass
class Goat extends Animals {
    @Override
    void sound() {
        System.out.println("Maa");
    }
}

public class hz {
    public static void main(String[] args) {
        Animals myAnimals = new Animals(); // Creates an Animals object
        myAnimals.sound(); // Output: Some generic animal sound

        Animals myGoat = new Goat(); // Creates a Goat object but uses an Animals reference
        myGoat.sound(); // Output: Maa (method overridden in Goat class)
    }
}

/*
The code showcases inheritance and method overriding with polymorphism:
The Goat class inherits from Animals and overrides the sound method.
When calling the sound method on an Animals reference that points to a Goat object, the overridden method in Goat is executed.
This demonstrates how polymorphism allows a subclass to be treated as an instance of its superclass while still maintaining its own behavior.


Here’s a detailed breakdown:

Animals Class (Superclass):
class Animals { - Declares a base class named Animals.
void sound() { - Declares a method named sound that prints a generic animal sound.
System.out.println("Some generic animal sound"); - Prints "Some generic animal sound" to the console when the sound method is called.
} - Closes the Animals class.

Goat Class (Subclass):
class Goat extends Animals { - Declares a class named Goat that inherits from the Animals class using the extends keyword.
@Override - This annotation indicates that the sound method in the Goat class overrides the method from the Animals class.
void sound() { - Declares a method named sound that overrides the sound method from the Animals class. 
Method overriding allows the Goat class to provide its own version of the sound method.
System.out.println("Maa"); - Prints "Maa" to the console when the sound method is called on a Goat object.
} - Closes the Goat class.

hz Class (Main Class):
public class hz { - Declares a class named hz that contains the main method.
public static void main(String[] args) { - Declares the main method, which is the entry point of the program.
Animals myAnimals = new Animals(); - Creates an instance of the Animals class named myAnimals.
myAnimals.sound(); - Calls the sound method on the myAnimals object, which prints "Some generic animal sound".
Animals myGoat = new Goat(); - Creates an instance of the Goat class but assigns it to a reference variable of type Animals. 
This demonstrates polymorphism since the reference is of type Animals, but it points to a Goat object.
myGoat.sound(); - Calls the sound method on the myGoat object. Since the actual object is of type Goat, 
the overridden method in the Goat class is called, printing "Maa".
} - Closes the main method.
} - Closes the hz class.

Output of the Code:
Some generic animal sound
Maa

Explanation:
Inheritance: The Goat class extends the Animals class, which means it inherits all non-private methods of the Animals class.
Method Overriding: The Goat class overrides the sound method of the Animals class. 
When the sound method is called on a Goat object, the overridden version is executed.
Polymorphism: The line Animals myGoat = new Goat(); is an example of polymorphism. The reference variable myGoat is of type Animals, 
but it points to an object of type Goat. When myGoat.sound() is called, 
Java uses dynamic method dispatch to determine that the sound method of the Goat class should be called, not the one in Animals.
*/