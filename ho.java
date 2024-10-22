/*
Constructors

Constructors are invoked implicitly when you instantiate objects.

The two rules for creating a constructor are:
a. The name of the constructor should be the same as the class.
b. A Java constructor must not have a return type.

If a class doesn't have a constructor, the Java compiler automatically creates a default constructor during run-time. 
The default constructor initializes instance variables with default values.
Default Constructor - a constructor that is automatically created by the Java compiler if it is not explicitly defined.

A constructor cannot be abstract or static or final. A constructor can be overloaded but can not be overridden.

Constructors initialize object attributes.
They must have the same name as the class and no return type.
You can overload constructors to provide different ways to initialize objects.
Constructors can call other constructors in the same class.
*/


class Car_ {
    String brand;
    int year;

    // Default constructor
    Car_() {
        brand = "Unknown";
        year = 0;
    }

    // Parameterized constructor
    Car_(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    // Display car information
    void display() {
        System.out.println("Car Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class ho {
    public static void main(String[] args) {
        // Using the default constructor
        Car_ car1 = new Car_();
        car1.display(); // Outputs: Unknown and 0

        // Using the parameterized constructor
        Car_ car2 = new Car_("Toyota", 2022);
        car2.display(); // Outputs: Toyota and 2022
    }
}

/*
The Car_ class represents a car with two attributes, brand and year, and provides two constructors—one default and 
one parameterized—to initialize these attributes. It also has a display method to print the car's information. 
The ho class creates two car objects: car1 using the default constructor, and car2 using the parameterized constructor. 
The display method is then used to print information about each car.

The code defines two classes: Car_ and ho. Below is a detailed line-by-line breakdown of the code:

class Car_ { - Defines a class named Car_.

String brand; - Declares an attribute brand of type String to represent the car's brand.

int year; - Declares an attribute year of type int to represent the car's manufacturing year.

Car_() { - Declares a default constructor for the Car_ class.

brand = "Unknown"; - Sets the brand attribute to "Unknown" by default.

year = 0; - Sets the year attribute to 0 by default.

} - Closes the default constructor.

Car_(String brand, int year) { - Declares a parameterized constructor for the Car_ class that takes two arguments (brand and year).

this.brand = brand; - Assigns the value of the parameter brand to the class attribute brand. 
The this keyword is used to differentiate between the parameter and the attribute.

this.year = year; - Assigns the value of the parameter year to the class attribute year.

} - Closes the parameterized constructor.

void display() { - Declares a method named display that outputs information about the car.

System.out.println("Car Brand: " + brand); - Prints the car's brand.

System.out.println("Year: " + year); - Prints the car's manufacturing year.

} - Closes the display method.

} - Closes the Car_ class.

public class ho { - Defines a public class named ho.

public static void main(String[] args) { - Defines the main method, which serves as the entry point for the program.

Car_ car1 = new Car_(); - Creates an instance car1 of the Car_ class using the default constructor.

car1.display(); - Calls the display method on car1, which prints:
Car Brand: Unknown
Year: 0
since the default constructor was used.

Car_ car2 = new Car_("Toyota", 2022); - Creates an instance car2 of the Car_ class 
using the parameterized constructor with brand "Toyota" and year 2022.

car2.display(); - Calls the display method on car2, which prints:
Car Brand: Toyota
Year: 2022
since the parameterized constructor was used.

} - Closes the main method.

} - Closes the ho class.
*/