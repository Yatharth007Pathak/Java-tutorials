/*
Method Overriding

If a subclass provides the specific implementation of the method that has been declared by one of its parent class, 
it is known as method overriding or runtime polymorphism.

Hence, we can achieve polymorphism in java with the help of inheritance.

*/

class Vehicles {
    int wheelsCount; 
    void start() { 
        System.out.println("Vehicle is starting"); 
    }
}

class Cycle extends Vehicles {
    void start() { 
        System.out.println("Cycle is starting");
    }
}

public class hy {
    public static void main(String[] args) {
        Cycle myCycle = new Cycle(); 
        myCycle.wheelsCount = 2;
        myCycle.start();
    }
}

/*
The code demonstrates the concept of inheritance and method overriding in Java:
The Cycle class inherits the wheelsCount attribute from Vehicles.
The Cycle class provides its own implementation of the start method, which overrides the one in Vehicles. 
This allows the Cycle class to define a more specific behavior when starting, while still having access to shared properties like wheelsCount. 
This feature is key to achieving polymorphism in object-oriented programming.


Here’s a detailed breakdown:

Vehicles Class:
class Vehicles { - Declares a base class named Vehicles.
int wheelsCount; - Defines an integer attribute wheelsCount that stores the number of wheels a vehicle has.
void start() { - Declares a method named start that prints a message when the vehicle starts.
System.out.println("Vehicle is starting"); - Prints "Vehicle is starting" to the console when the start method is called.
} - Closes the Vehicles class.

Cycle Class:
class Cycle extends Vehicles { - Declares a class named Cycle that inherits from the Vehicles class using the extends keyword.
void start() { - Declares a method named start that overrides the start method from the Vehicles class. 
Method overriding allows the Cycle class to provide its own implementation of the start method.
System.out.println("Cycle is starting"); - Prints "Cycle is starting" to the console when the start method is called on a Cycle object.
} - Closes the Cycle class.

hy Class (Main Class):
public class hy { - Declares a class named hy that contains the main method.
public static void main(String[] args) { - Declares the main method, which is the entry point of the program.
Cycle myCycle = new Cycle(); - Creates an instance of the Cycle class named myCycle.
myCycle.wheelsCount = 2; - Sets the wheelsCount attribute of myCycle to 2. This attribute is inherited from the Vehicles class.
myCycle.start(); - Calls the start method on the myCycle object. 
Since the Cycle class overrides the start method from Vehicles, this line will call the overridden version and print "Cycle is starting".
} - Closes the main method.
} - Closes the hy class.

Output of the Code:
Cycle is starting

Explanation:
Inheritance: The Cycle class inherits from the Vehicles class, meaning it can use all non-private members of Vehicles, such as wheelsCount.
Method Overriding: The Cycle class overrides the start method of Vehicles. 
When myCycle.start() is called, the overridden version in the Cycle class is executed, not the version in Vehicles.
*/