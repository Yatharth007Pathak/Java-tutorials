class Animal {}
class Dog extends Animal {}

public class az {
    
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();

        // Checking if dog is an instance of Dog
        System.out.println(dog instanceof Dog);  // Output: true

        // Checking if dog is an instance of Animal (parent class)
        System.out.println(dog instanceof Animal);  // Output: true

        // Checking if animal is an instance of Dog
        System.out.println(animal instanceof Dog);  // Output: false

        // Checking if animal is an instance of Animal
        System.out.println(animal instanceof Animal);  // Output: true

        // Checking if a null reference is an instance of Dog
        Dog nullDog = null;
        System.out.println(nullDog instanceof Dog);  // Output: false
    }
}

/*
Explanation:
dog instanceof Dog returns true because dog is an instance of the Dog class.
dog instanceof Animal also returns true because Dog is a subclass of Animal.
animal instanceof Dog returns false because animal is of type Animal, not Dog.
animal instanceof Animal returns true because animal is an instance of the Animal class.
A null reference (nullDog) always returns false when checked with instanceof.
*/


/*
The instanceof operator in Java is used to test whether an object is an instance of a particular class, subclass, or interface. 
It returns a boolean value (true or false) based on whether the object is of the specified type.

Syntax:
object instanceof classOrInterface
object: The reference or object you want to check.
classOrInterface: The class or interface against which you are checking the type of the object.

How It Works:
If the object is an instance of the class or interface on the right side, the operator returns true; otherwise, it returns false.
If object is null, instanceof will always return false, since null is not an instance of any type.

Key Points:
The instanceof operator is a useful tool in polymorphism for determining the actual type of an object at runtime.
It ensures type safety by allowing a safe check before casting an object to a specific class or interface.
It works with both class hierarchies and interfaces.
instanceof returns false when applied to null, as null is not an instance of any class.
*/