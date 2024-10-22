// The super keyword allows you to call methods from the superclass that have been overridden in the subclass.

class Animals {
    void sound() {
        System.out.println("Some generic animal sound");
    }
}

class Goat extends Animals {
    @Override
    void sound() {
        super.sound(); // Calls the superclass method
        System.out.println("Maa");
    }
}

public class ic {
    public static void main(String[] args) {
        Goat myGoat = new Goat(); // Creates a Goat object but uses an Animals reference
        myGoat.sound(); // Output: Maa (method overridden in Goat class)
    }
}

/*
Here’s a detailed breakdown:

Animals Class (Superclass):
class Animals { - Declares a base class named Animals.
void sound() { - Defines a method named sound that prints a generic animal sound.
System.out.println("Some generic animal sound"); - Outputs "Some generic animal sound" to the console when the sound method is called.
} - Closes the Animals class.

Goat Class (Subclass):
class Goat extends Animals { - Declares a class named Goat that inherits from the Animals class using the extends keyword.
@Override - An annotation that indicates the sound method is being overridden from the superclass.
void sound() { - Overrides the sound method from the Animals class to provide a specific implementation for the Goat class.
super.sound(); - Calls the sound method of the superclass (Animals). 
This allows the Goat class to first execute the generic sound method before executing its own specific behavior.
System.out.println("Maa"); - Outputs "Maa" to the console, which is the specific sound a goat makes.
} - Closes the Goat class.
ic Class (Main Class):

public class ic { - Declares a class named ic that contains the main method.
public static void main(String[] args) { - Declares the main method, which is the entry point of the program.
Goat myGoat = new Goat(); - Creates an instance of the Goat class named myGoat.
myGoat.sound(); - Calls the sound method on the myGoat object. 
Since this method is overridden in the Goat class, it will execute the overridden version.
} - Closes the main method.
} - Closes the ic class.

Output of the Code:
Some generic animal sound
Maa

Explanation:
Inheritance: The Goat class inherits from the Animals class, allowing it to use and override the sound method.
Method Overriding: The Goat class provides its specific implementation of the sound method, 
which first calls the superclass's method to print the generic sound and then adds its own behavior by printing "Maa".
Use of super: The super keyword is used to call the sound method of the superclass (Animals). 
This allows the Goat class to leverage the existing functionality of the superclass while also extending it by adding its specific sound.
*/