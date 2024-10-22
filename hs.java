/*
In constructors or methods, the this keyword can be used to refer to the current object's instance variables, 
especially when there is a name conflict between instance variables and parameters.
*/

class Pupil {
    String name;
    int rollNumber;

    // Constructor with parameters having the same name as instance variables
    Pupil(String name, int rollNumber) {
        this.name = name;         // 'this.name' refers to the instance variable
        this.rollNumber = rollNumber; // 'this.rollNumber' refers to the instance variable
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
    }
}

public class hs {

    public static void main(String[] args) {
        Pupil pupil = new Pupil("Alice", 101);
        pupil.display(); // Output: Name: Alice, Roll Number: 101
    }
}

/*
The this keyword is a reference to the current object within a class. 
It is used primarily for distinguishing between instance variables and parameters that have the same name.
In the Pupil class constructor:
The constructor takes parameters named name and rollNumber.
The instance variables of the class also have the same names: name and rollNumber.
To avoid ambiguity, the this keyword is used. this.name refers to the instance variable name of the current object, 
while name (without this) refers to the parameter passed to the constructor.

Using this ensures that the correct instance variables are assigned the values of the parameters. Without this, 
the compiler would be unable to distinguish between the parameter and the instance variable, leading to incorrect behavior or logic errors.

In this example, this.name = name; sets the instance variable name of the current Pupil object to the value of the constructor parameter name. 
Similarly, this.rollNumber = rollNumber; sets the instance variable rollNumber to the parameter value.


Breakdown of the Code

Pupil Class
Attributes:
String name; - Declares an attribute name of type String to represent the pupil's name.
int rollNumber; - Declares an attribute rollNumber of type int to represent the pupil's roll number.

Constructor with Parameters:
Pupil(String name, int rollNumber) - Declares a parameterized constructor for the Pupil class that takes two parameters (name and rollNumber).
this.name = name; - Assigns the value of the parameter name to the instance variable name. 
Here, this is used to refer to the current object's attribute.
this.rollNumber = rollNumber; - Assigns the value of the parameter rollNumber to the instance variable rollNumber. 
The this keyword helps distinguish the instance variable from the parameter.

display Method:
void display() - Declares a method to print the pupil's information.
System.out.println("Name: " + name); - Prints the pupil's name.
System.out.println("Roll Number: " + rollNumber); - Prints the pupil's roll number.

Main Class
main Method:
Pupil pupil = new Pupil("Alice", 101); - Creates an instance of the Pupil class named pupil using the parameterized constructor with values: 
name = "Alice" and rollNumber = 101.
pupil.display(); - Calls the display method on pupil to print:
Name: Alice
Roll Number: 101
*/