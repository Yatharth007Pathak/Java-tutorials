/*
In Java, constructors are special methods used to initialize objects. They have the same name as the class and do not have a return type. 
Constructors are called when an object of a class is created, allowing you to set initial values for object attributes. 

Default Constructor: A constructor with no parameters.
If no constructor is defined in a class, Java automatically provides a default constructor that initializes object attributes 
with default values (zero for numeric types, null for object references, and false for boolean).

Parameterized Constructor: A constructor that takes parameters to initialize object attributes with specific values.

Constructor Overloading: We can have multiple constructors in a class with different parameter lists. This is known as constructor overloading.
*/

class Tiger {
    String name;
    int age;

    // Default constructor
    Tiger() {
        name = "Unnamed Tiger";
        age = 0;
    }

    // Parameterized constructor
    Tiger(String tigerName) {
        name = tigerName;
        age = 0;
    }

    // Another parameterized constructor
    Tiger(String tigerName, int tigerAge) {
        name = tigerName;
        age = tigerAge;
    }

    // Method to display tiger details
    void display() {
        System.out.println("Tiger Name: " + name + ", Age: " + age);
    }
}

public class hp {

    public static void main(String[] args) {

        // Using the default constructor
        Tiger tiger1 = new Tiger();
        tiger1.display();

        // Using the parameterized constructor with one parameter
        Tiger tiger2 = new Tiger("Shera");
        tiger2.display();

        // Using the parameterized constructor with two parameters
        Tiger tiger3 = new Tiger("Raja", 7);
        tiger3.display();
    }
}

/*
The Tiger class represents a tiger with attributes name and age, and has three constructors: 
a default constructor, a parameterized constructor with one parameter (tigerName), 
and a parameterized constructor with two parameters (tigerName and tigerAge). The display method prints the tiger's details.
The hp class creates three instances of the Tiger class using different constructors:
tiger1 uses the default constructor, setting the name to "Unnamed Tiger" and age to 0.
tiger2 uses the parameterized constructor with one argument, setting the name to "Shera" and age to 0.
tiger3 uses the parameterized constructor with two arguments, setting the name to "Raja" and age to 7.
The display method is called on each instance to print the details of the respective tiger.


The code defines two classes: Tiger and hp. Below is a detailed line-by-line breakdown:

Tiger Class:
class Tiger { - Defines a class named Tiger.

String name; - Declares an attribute name of type String to represent the tiger's name.

int age; - Declares an attribute age of type int to represent the tiger's age.

Tiger() { - Declares a default constructor for the Tiger class.

name = "Unnamed Tiger"; - Sets the name attribute to "Unnamed Tiger" by default.

age = 0; - Sets the age attribute to 0 by default.

} - Closes the default constructor.

Tiger(String tigerName) { - Declares a parameterized constructor that takes one argument (tigerName).

name = tigerName; - Assigns the value of tigerName to the class attribute name.

age = 0; - Sets the age attribute to 0 by default.

} - Closes the parameterized constructor.

Tiger(String tigerName, int tigerAge) { - Declares another parameterized constructor that takes two arguments (tigerName and tigerAge).

name = tigerName; - Assigns the value of tigerName to the class attribute name.

age = tigerAge; - Assigns the value of tigerAge to the class attribute age.

} - Closes the parameterized constructor.

void display() { - Declares a method named display to print the tiger's details.

System.out.println("Tiger Name: " + name + ", Age: " + age); - Prints the name and age of the tiger.

} - Closes the display method.

} - Closes the Tiger class.

hp Class:
public class hp { - Defines a public class named hp.

public static void main(String[] args) { - Defines the main method, which serves as the entry point for the program.

Tiger tiger1 = new Tiger(); - Creates an instance of Tiger named tiger1 using the default constructor.

tiger1.display(); - Calls the display method on tiger1, which prints:
Tiger Name: Unnamed Tiger, Age: 0

Tiger tiger2 = new Tiger("Shera"); - Creates an instance of Tiger named tiger2 using parameterized constructor with one argument (tigerName).

tiger2.display(); - Calls the display method on tiger2, which prints:
Tiger Name: Shera, Age: 0

Tiger tiger3 = new Tiger("Raja", 7); - Creates an instance of Tiger named tiger3 using 
the parameterized constructor with two arguments (tigerName and tigerAge).

tiger3.display(); - Calls the display method on tiger3, which prints:
Tiger Name: Raja, Age: 7

} - Closes the main method.

} - Closes the hp class.
*/