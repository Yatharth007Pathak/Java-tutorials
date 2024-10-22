/*
The this and super keywords in Java serve different purposes, although both are used in the context of OOP and inheritance. 
Here’s a breakdown of the key differences between them:

Definition:
this: Implicit reference variable keyword which refers to the current instance of the class where it is used.
super: Implicit reference variable keyword which refers to the superclass (immediate parent class) of the current object.

Usage Context:
this: Can be used in constructors and instance methods to refer to the current object.
super: Can be used in constructors and instance methods of a subclass to refer to the superclass.

Accessing Members:
this: Can be used to access instance variables and methods of the current class. 
For example, this.name refers to the instance variable name of the current object.
super: Can be used to access instance variables and methods of the superclass. 
For example, super.name refers to the name variable in the superclass.

Calling Constructors:
this: Cannot be used to call a superclass constructor.
super: Can be used to invoke a superclass constructor using super(). This is often done to initialize the superclass part of the subclass.

Accessing Overridden Methods:
this: Calls the method of the current class. If a method is overridden in the subclass, using this.methodName() will call the subclass's method.
super: Can be used to call an overridden method in the superclass. 
For example, super.methodName() will call the superclass's version of that method.

Avoiding Naming Conflicts:
this: Used to resolve naming conflicts between instance variables and parameters of the same name. 
For example, this.value distinguishes the instance variable from the parameter.
super: Not used to resolve naming conflicts, as it refers specifically to the superclass.
*/

class Animmal {
    String name = "Animal";

    void sound() {
        System.out.println("Some generic sound");
    }
}

class Lion extends Animmal {
    String name = "Lion";

    void sound() {
        super.sound(); // Calls Animmal's sound method
        System.out.println("Growl");
    }

    void display() {
        System.out.println("Superclass name: " + super.name); // Accessing Animmal's name
        System.out.println("Subclass name: " + this.name);    // Accessing Lion's name
    }
}

public class ig {
    public static void main(String[] args) {
        Lion myLion = new Lion();
        myLion.sound(); // Calls Lion's sound method
        myLion.display(); // Shows names from superclass and subclass
    }
}

/*
Here’s a detailed breakdown of the code:

Animmal Class (Superclass)
class Animmal { - Declares a class named Animmal.
String name = "Animal"; - Declares a member variable name and initializes it with the value "Animal". 
This variable represents the name of the animal.
void sound() { - Defines a method named sound.
System.out.println("Some generic sound"); - Prints a generic sound message.
} - Closes the sound method.
} - Closes the Animmal class.

Lion Class (Subclass)
class Lion extends Animmal { - Declares a class named Lion that inherits from the Animmal class.
String name = "Lion"; - Declares a member variable name in the Lion class and initializes it with the value "Lion". 
This variable shadows the name variable in the superclass (Animmal).
void sound() { - Defines the sound method that overrides the superclass's sound method.
super.sound(); - Calls the sound method of the superclass (Animmal), which prints "Some generic sound".
System.out.println("Growl"); - Prints "Growl", representing the specific sound of a lion.
} - Closes the overridden sound method.
void display() { - Defines a method named display.
System.out.println("Superclass name: " + super.name); - Uses the super keyword to access the name variable from the superclass (Animmal). 
This prints "Animal".
System.out.println("Subclass name: " + this.name); - Uses this to access the name variable from the current class (Lion). This prints "Lion".
} - Closes the display method.
} - Closes the Lion class.

ig Class (Main Class)
public class ig { - Declares a class named ig that contains the main method.
public static void main(String[] args) { - Declares the main method, which is the entry point of the program.
Lion myLion = new Lion(); - Creates an instance of the Lion class named myLion.
myLion.sound(); - Calls the sound method on the myLion instance. This executes the overridden sound method in the Lion class, printing:
Some generic sound
Growl
myLion.display(); - Calls the display method on the myLion instance. This prints:
Superclass name: Animal
Subclass name: Lion
} - Closes the main method.
} - Closes the ig class.

Explanation
Inheritance: The Lion class inherits from the Animmal class, allowing it to access its properties and methods.
Method Overriding: The Lion class overrides the sound method from the Animmal class, providing its specific implementation. 
When myLion.sound() is called, it executes the overridden method in the Lion class.
Variable Shadowing: The name variable in the Lion class shadows the name variable in the Animmal class.
Using super.name accesses the variable from the superclass, while this.name accesses the variable from the current class.
Polymorphism: This example illustrates polymorphism, where the same method name (sound) behaves differently based on the object's class.
*/