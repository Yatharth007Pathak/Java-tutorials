/*
Object-Oriented Programming (OOP) in Java is a programming paradigm that revolves around the concept of objects and classes. 
which can contain data (attributes) and code (methods). 
It helps organize complex code by making it more modular, reusable, and easier to understand. 
In Java, OOP helps in organizing the program structure by focusing on objects and data rather than logic.
Java is known for its strong support of OOP concepts. Here are the main principles of OOP in Java:

Class: A blueprint for creating objects. It defines properties and behaviors.
Object: An instance of a class. It represents a specific entity with defined properties.
Inheritance: Inheritance allows one class (child class) to inherit the properties and methods of another class (parent class).
Encapsulation: Encapsulation is the bundling of data (variables) and methods that operate on data into a single unit, typically through classes.
Polymorphism: Polymorphism allows methods to have multiple forms. It can be achieved through method overloading or overriding.
Abstraction: Abstraction is the concept of hiding implementation details and showing only essential information.

Access modifiers are used to set access levels for classes, variables, and methods.
public: Accessible from any other class.
private: Accessible only within the class where it is defined.
protected: Accessible within the same package and by subclasses.
default (no modifier): Accessible only within the same package.
*/

class Car {
    String color;  // Attribute to store the color of the car
    int speed;     // Attribute to store the speed of the car

    void accelerate() {  // Method to increase the car's speed
        speed += 10; // Increase speed by 10
        System.out.println("The car is accelerating."); // Print a message indicating the car is accelerating
    }

    void displaySpeed() { // Method to display the current speed of the car
        System.out.println("Current speed: " + speed + " km/h"); // Print the current speed of the car
    }
}

public class hi {
    public static void main(String[] args) {
        Car myCar = new Car();  // Creating an object of class Car named myCar
        myCar.color = "Red"; // Setting the color of myCar to "Red"
        myCar.speed = 100; // Setting the initial speed of myCar to 100
        myCar.accelerate(); // Calling the accelerate method to increase the speed of myCar
        myCar.displaySpeed(); // Calling the displaySpeed method to show the current speed of myCar
    }
}


/*
The Car class defines properties (color, speed) and behaviors (accelerate(), displaySpeed()).
The myCar object is an instance of the Car class.


The given code defines two classes: Car and hi. Below is a line-by-line breakdown of the code:

class Car { - Defines a class named Car.

String color; - Declares an attribute color of type String to represent the car's color.

int speed; - Declares an attribute speed of type int to represent the car's speed.

void accelerate() { - Declares a method named accelerate which modifies the speed attribute.

speed += 10; - Increases the car's speed by 10 units.

System.out.println("The car is accelerating."); - Prints the message "The car is accelerating.".

} - Closes the accelerate method.

void displaySpeed() { - Declares a method named displaySpeed that prints the current speed.

System.out.println("Current speed: " + speed + " km/h"); - Prints the car's current speed with a label.

} - Closes the displaySpeed method.

} - Closes the Car class.

public class hi { - Defines a public class named hi (by convention, class names should start with an uppercase letter).

public static void main(String[] args) { - Defines the main method, the entry point of the program.

Car myCar = new Car(); - Creates an instance of the Car class named myCar.

myCar.color = "Red"; - Sets the color attribute of myCar to "Red".

myCar.speed = 100; - Sets the speed attribute of myCar to 100.

myCar.accelerate(); - Calls the accelerate method on myCar, increasing its speed by 10 and printing the message.

myCar.displaySpeed(); - Calls the displaySpeed method to display the updated speed of myCar.

} - Closes the main method.

} - Closes the hi class.
*/