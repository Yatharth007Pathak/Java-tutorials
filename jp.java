// Anonymous Class Extending a Class

class Animaal {
    void makeSound() {
        System.out.println("Some generic animal sound.");
    }
}

public class jp {
    public static void main(String[] args) {
        // Anonymous class extending the Animaal class
        Animaal dogo = new Animaal() {
            @Override
            void makeSound() {
                System.out.println("Bark!");
            }
        };

        dogo.makeSound(); // Output: Bark!
    }
}

/*
Here's a line-by-line breakdown of the code:

class Animaal {
Declares a class named Animaal. This is a base class with a method that can be overridden by subclasses.

void makeSound() {
Defines a method makeSound() in the Animaal class that prints a generic message.

System.out.println("Some generic animal sound.");
Prints "Some generic animal sound." to the console when makeSound() is called.

}
Ends the makeSound() method.

}
Ends the Animaal class.

public class jp {
Declares a public class named jp, which contains the main() method.

public static void main(String[] args) {
Defines the main() method, which is the entry point of the program.

Animaal dogo = new Animaal() {
Creates an instance of an anonymous class that extends the Animaal class. The anonymous class overrides the makeSound() method from Animaal.

@Override
Indicates that the makeSound() method overrides the method in the Animaal class. 
This ensures that the method correctly overrides the superclass's method.

void makeSound() {
Implements the makeSound() method in the anonymous class.

System.out.println("Bark!");
Prints "Bark!" to the console when the overridden makeSound() method is called.

}
Ends the makeSound() method.

};
Ends the anonymous class that extends Animaal.

dogo.makeSound();
Calls the makeSound() method on the dogo object (the instance of the anonymous subclass).
Since the makeSound() method is overridden in the anonymous class, it prints "Bark!".

}
Ends the main() method.

}
Ends the jp class.


Summary
The Animaal class defines a method makeSound() with a generic implementation.
In the main() method, an anonymous class is created that extends Animaal and overrides the makeSound() method.
The overridden makeSound() method in the anonymous class prints "Bark!" instead of the generic animal sound.
When dogo.makeSound() is called, it prints "Bark!" to the console, demonstrating the overridden behavior of the anonymous class.
*/