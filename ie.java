/*
The super keyword can be used to access instance variables of the superclass 
when there is a naming conflict between superclass and subclass variables.
*/

class Annimal {
    String name = "Animal";
}

class Horse extends Annimal {
    String name = "Horse";

    void displayNames() {
        System.out.println("Superclass name: " + super.name); // Access superclass variable
        System.out.println("Subclass name: " + this.name);   // Access subclass variable
    }
}

public class ie {
    public static void main(String[] args) {
        Horse myHorse = new Horse();
        myHorse.displayNames();
    }
}

/*
Here’s a detailed breakdown of the code:

Annimal Class (Superclass):
class Annimal { - Declares a class named Annimal.
String name = "Animal"; - Declares a member variable name and initializes it with the value "Animal". This variable is part of the Annimal class.

Horse Class (Subclass):
class Horse extends Annimal { - Declares a class named Horse that inherits from the Annimal class using the extends keyword.
String name = "Horse"; - Declares a member variable name in the Horse class and initializes it with the value "Horse". 
This variable shadows the name variable in the superclass (Annimal), meaning that within the Horse class, 
the name variable refers to this subclass variable.
void displayNames() { - Defines a method named displayNames that prints the names of the superclass and subclass.
System.out.println("Superclass name: " + super.name); - Uses the super keyword to access the name variable from the superclass (Annimal). 
This prints "Animal".
System.out.println("Subclass name: " + this.name); - Uses this (implicitly) to access the name variable from the current class (Horse). 
This prints "Horse".
} - Closes the displayNames method.
ie Class (Main Class):

public class ie { - Declares a class named ie that contains the main method.
public static void main(String[] args) { - Declares the main method, which serves as the entry point of the program.
Horse myHorse = new Horse(); - Creates an instance of the Horse class named myHorse.
myHorse.displayNames(); - Calls the displayNames method on the myHorse instance, which prints the names from both the superclass and the subclass.
} - Closes the main method.
} - Closes the ie class.
Output of the Code:
When the program is run, the output will be:

kotlin
Copy code
Superclass name: Animal
Subclass name: Horse
Explanation:
Inheritance: The Horse class extends the Annimal class, allowing it to inherit its properties and methods. 
However, the name variable in the Horse class shadows the name variable in the Annimal class.

Variable Shadowing: In this code, both the superclass and subclass have a name variable. 
In the Horse class, when you access name directly (like in this.name), it refers to the name variable in the Horse class. 
However, using super.name accesses the name variable defined in the Annimal class.
*/