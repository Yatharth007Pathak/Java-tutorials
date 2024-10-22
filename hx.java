class Animalia {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Wolf extends Animalia {
    void bark() {
        System.out.println("The wolf barks.");
    }
}

public class hx {
    public static void main(String[] args) {
        Wolf myWolf = new Wolf();
        myWolf.eat();  // Method inherited from Animalia class
        myWolf.bark();  // Method in Wolf class
    }
}

/*
The Wolf class inherits from the Animalia class, showing an example of inheritance in Java. 
The Wolf object (myWolf) has access to methods from both Animalia (eat) and its own class (bark). 
This allows the Wolf class to share common functionality while adding its own unique behavior. 
This demonstrates how inheritance helps in code reuse and extending the behavior of existing classes.

Here's a detailed breakdown of the code:

Animalia Class:
class Animalia { - Declares a class named Animalia, which will serve as the base class for other animals.
void eat() { - Defines a method named eat with no return type (void). 
This method can be called by any instance of the class to indicate that the animal is eating.
System.out.println("This animal eats food."); - Prints "This animal eats food." to the console when the eat method is called.
} - Closes the Animalia class.

Wolf Class:
class Wolf extends Animalia { - Declares a class named Wolf that inherits from the Animalia class. 
The Wolf class has access to all non-private methods and attributes of Animalia.
void bark() { - Defines a method named bark that prints a message to indicate that the wolf is barking.
System.out.println("The wolf barks."); - Prints "The wolf barks." to the console when the bark method is called.
} - Closes the Wolf class.

hx Class (Main Class):
public class hx { - Declares a class named hx, which contains the main method.
public static void main(String[] args) { - Declares the main method, which is the entry point of the program.
Wolf myWolf = new Wolf(); - Creates an instance of the Wolf class named myWolf. This instance has access to methods in both the Animalia class and the Wolf class.
myWolf.eat(); - Calls the eat method on the myWolf instance. Since the Wolf class inherits from Animalia, this method is accessible and prints "This animal eats food.".
myWolf.bark(); - Calls the bark method on the myWolf instance. This method belongs to the Wolf class and prints "The wolf barks.".
} - Closes the main method.
} - Closes the hx class.

Output of the Code:
This animal eats food.
The wolf barks.

Explanation:
Inheritance: The Wolf class extends the Animalia class, meaning it inherits the eat method from Animalia.
Method Call:
When myWolf.eat() is called, it prints "This animal eats food.", demonstrating the inherited behavior from the Animalia class.
When myWolf.bark() is called, it prints "The wolf barks.", which is specific to the Wolf class.
*/