/*
super is a special keyword in java that is used to refer to the instance of the immediate parent class.

The super keyword in Java is used to refer to the immediate superclass of the current object. 
It can be used in various contexts, including calling superclass methods, accessing superclass constructors, and accessing superclass variables.

Use of super keyword in java:
It is used to refer to an instance variable of the immediate parent class.
It is used to invoke a method of the immediate parent class.
It is used to invoke a constructor of immediate parent class.
*/

class Vehicles {
    int wheelsCount; 
    void start() { 
        System.out.println("Vehicle is starting"); 
    }
}

class Cycle extends Vehicles {
    void start() { 
        super.start();
        System.out.println("Cycle is starting");
    }
}

public class ib {
    public static void main(String[] args) {
        Cycle myCycle = new Cycle(); 
        myCycle.wheelsCount = 2;
        myCycle.start();
    }
}

/*
Here’s a detailed breakdown:

Vehicles Class (Superclass):
class Vehicles { - Declares a base class named Vehicles.
int wheelsCount; - Defines an integer attribute wheelsCount that stores the number of wheels a vehicle has.
void start() { - Declares a method named start that prints a message when the vehicle starts.
System.out.println("Vehicle is starting"); - Prints "Vehicle is starting" to the console when the start method is called.
} - Closes the Vehicles class.

Cycle Class (Subclass):
class Cycle extends Vehicles { - Declares a class named Cycle that inherits from the Vehicles class using the extends keyword.
void start() { - Declares a method named start that overrides the start method from the Vehicles class.
super.start(); - Calls the start method of the superclass (Vehicles). 
This allows the Cycle class to execute the functionality of the start method in Vehicles before adding its own specific behavior.
System.out.println("Cycle is starting"); - Prints "Cycle is starting" to the console after calling the superclass's start method.
} - Closes the Cycle class.

ib Class (Main Class):
public class ib { - Declares a class named ib that contains the main method.
public static void main(String[] args) { - Declares the main method, which is the entry point of the program.
Cycle myCycle = new Cycle(); - Creates an instance of the Cycle class named myCycle.
myCycle.wheelsCount = 2; - Sets the wheelsCount attribute of myCycle to 2. This attribute is inherited from the Vehicles class.
myCycle.start(); - Calls the start method on the myCycle object. 
This will invoke the overridden start method in Cycle class, which first calls the superclass's start method and then prints its own message.
} - Closes the main method.
} - Closes the ib class.

Output of the Code:
Vehicle is starting
Cycle is starting

Explanation:
Inheritance: The Cycle class inherits the wheelsCount attribute from the Vehicles class, allowing it to use this attribute directly.
Method Overriding: The Cycle class overrides the start method from the Vehicles class. 
When the start method is called on a Cycle object, the overridden version in the Cycle class is executed.
Use of super: The super keyword is used to call the start method of the superclass (Vehicles). 
This allows the Cycle class to execute the behavior defined in Vehicles before adding its own behavior. 
It helps maintain the functionality of the superclass while allowing the subclass to extend or modify that functionality.
*/