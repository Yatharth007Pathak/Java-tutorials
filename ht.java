/*
The this() keyword can also be used to call another constructor in the same class. 
This helps to reduce code duplication by reusing existing constructors.
*/

class Bike {
    String brand;
    int year;

    // Default constructor
    Bike() {
        this("Unknown", 0); // Calls the parameterized constructor
    }

    // Parameterized constructor
    Bike(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    void display() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Year: " + year);
    }
}

public class ht {
    public static void main(String[] args) {
        Bike bike1 = new Bike(); // Uses default constructor
        bike1.display(); // Output: Bike Brand: Unknown, Year: 0
    }
}

/*
In the given code, the this keyword is used for two purposes: 
to call another constructor within the same class and to refer to the instance variables of the current object.

Code Breakdown

The code defines two classes: Bike and Main.

Bike Class
Attributes:
String brand; - Declares an attribute brand of type String to represent the bike's brand.
int year; - Declares an attribute year of type int to represent the bike's manufacturing year.

Default Constructor:
Bike() {
    this("Unknown", 0); // Calls the parameterized constructor
}
The default constructor does not have any parameters.
Instead of setting default values directly, it calls the parameterized constructor using this("Unknown", 0).
This ensures code reuse by using the same logic to initialize the brand and year attributes.

Parameterized Constructor:
Bike(String brand, int year) {
    this.brand = brand;
    this.year = year;
}
This constructor takes two parameters: brand and year.
this.brand = brand; - The this keyword is used to refer to the instance variable brand of the current Bike object.
this.year = year; - The this keyword is used to refer to the instance variable year of the current object.

display Method:
void display() {
    System.out.println("Bike Brand: " + brand);
    System.out.println("Year: " + year);
}
Prints the bike's brand and year.

Main Class
main Method:
public static void main(String[] args) {
    Bike bike1 = new Bike(); // Uses default constructor
    bike1.display(); // Output: Bike Brand: Unknown, Year: 0
}
Creates an instance bike1 of the Bike class using the default constructor.
Calls the display method on bike1, which prints:
Bike Brand: Unknown
Year: 0


Explanation of the this Keyword

1. Calling Another Constructor (this(...)):
In the default constructor:
Bike() {
    this("Unknown", 0); // Calls the parameterized constructor
}
Here, this("Unknown", 0) is used to call the parameterized constructor from within the default constructor.
This is called "constructor chaining" and helps reduce code duplication by reusing the logic of initializing the object's attributes.
By doing this, the default constructor reuses the parameterized constructor to set default values (brand = "Unknown" and year = 0).

2. Referring to Instance Variables (this.attribute):
In the parameterized constructor:
Bike(String brand, int year) {
    this.brand = brand;
    this.year = year;
}
this.brand refers to the instance variable brand of the current object, while brand (without this) refers to the constructor parameter.
Similarly, this.year refers to the instance variable year of the current object.
The this keyword is used to differentiate between the parameter and the instance variable when they have the same name.
*/