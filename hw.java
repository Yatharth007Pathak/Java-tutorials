/*
Inheritance is a mechanism in which one class acquires the properties (fields) and behaviors (methods) of another class. 
It helps in reusing code and establishing a relationship between classes.
Inheritance Promotes code reuse and establishes a parent-child relationship.
The extends keyword in Java is used to create a subclass of a class or to implement inheritance.

Superclass: The class being inherited from (also known as parent class).
Subclass: The class that inherits from the superclass (also known as child class).
*/

class Vehicle {
    int wheelsCount; // Attribute to store the number of wheels of the vehicle
    void start() { // Method to start the vehicle
        System.out.println("Vehicle starting..."); // Print a message indicating the vehicle is starting
    }
}

class Truck extends Vehicle {
    void ringBell() { // Method specific to the Truck class for ringing the horn
        System.out.println("Truck Horn ringing..."); // Print a message indicating the truck horn is ringing
    }
}

public class hw {
    public static void main(String[] args) {
        Truck myTruck = new Truck(); // Creating an object of the Truck class named myTruck
        myTruck.wheelsCount = 8; // Setting the number of wheels for myTruck to 8
        myTruck.start(); // Calling the start method inherited from Vehicle
        myTruck.ringBell(); // Calling the ringBell method in the Truck class
    }
}

/*
The code demonstrates inheritance in Java, where the Truck class inherits from the Vehicle class. The Truck object can access the 
attributes and methods of the Vehicle class, such as wheelsCount and start, while also having its own specific method, ringBell. 
This allows for code reuse and extending the functionality of the base class.


The code defines two classes: Vehicle and Truck, where Truck inherits from Vehicle. 
Here’s a breakdown of the code line-by-line and an explanation of the output:

Vehicle Class:
class Vehicle { - Declares a class named Vehicle that serves as the base class.
int wheelsCount; - Defines an integer attribute named wheelsCount that represents the number of wheels the vehicle has.
void start() { - Declares a method named start that prints a message indicating the vehicle is starting.
System.out.println("Vehicle starting..."); - Prints "Vehicle starting..." when the start method is called.
} - Closes the Vehicle class.

Truck Class:
class Truck extends Vehicle { - Declares a class named Truck that inherits from Vehicle using the extends keyword.
void ringBell() { - Declares a method named ringBell to simulate the action of ringing the truck horn.
System.out.println("Truck Horn ringing..."); - Prints "Truck Horn ringing..." when the ringBell method is called.
} - Closes the Truck class.

hw Class (Main Class):
public class hw { - Declares the main class named hw that contains the main method.
public static void main(String[] args) { - Declares the main method, which is the entry point of the program.
Truck myTruck = new Truck(); - Creates an instance of the Truck class named myTruck.
myTruck.wheelsCount = 8; - Sets the wheelsCount attribute of myTruck to 8. This attribute is inherited from the Vehicle class.
myTruck.start(); - Calls the start method on the myTruck object. Since Truck inherits from Vehicle, this method is available to myTruck. The output is "Vehicle starting...".
myTruck.ringBell(); - Calls the ringBell method on the myTruck object. This method prints "Truck Horn ringing...".
} - Closes the main method.
} - Closes the hw class.

Output of the Code:
Vehicle starting...
Truck Horn ringing...

Explanation:
The Truck class inherits the wheelsCount attribute and the start method from the Vehicle class.
In the main method, we create an instance of Truck, which allows us to call both the start method 
(from the Vehicle class) and the ringBell method (specific to the Truck class).
When myTruck.start() is called, the output is "Vehicle starting..." since the start method is inherited from Vehicle.
When myTruck.ringBell() is called, the output is "Truck Horn ringing...".
*/