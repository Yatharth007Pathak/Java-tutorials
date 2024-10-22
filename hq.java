// Student class demonstrating constructors
class Student {
    String name;
    int rollNumber;
    String course;

    // Default constructor
    Student() {
        name = "Unknown";
        rollNumber = 0;
        course = "Not Assigned";
    }

    // Parameterized constructor
    Student(String name, int rollNumber, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    // Display student information
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
        System.out.println();
    }
}

public class hq {

    public static void main(String[] args) {
        // Creating Student object using default constructor
        Student student1 = new Student();
        student1.displayInfo(); // Outputs default values

        // Creating Student object using parameterized constructor
        Student student2 = new Student("Alice", 101, "Computer Science");
        student2.displayInfo(); // Outputs specified values

        // Creating another Student object using parameterized constructor
        Student student3 = new Student("Bob", 102, "Mathematics");
        student3.displayInfo(); // Outputs specified values
    }
}

/*
The Student class represents a student with three attributes: name, rollNumber, and course. 
It has two constructors: a default constructor, which initializes the attributes to default values ("Unknown", 0, and "Not Assigned"), 
and a parameterized constructor that allows setting specific values for each attribute. The displayInfo method prints the student's details.
The Main class creates three Student objects:
student1 is created using the default constructor, resulting in the default values being printed.
student2 is created using the parameterized constructor with the name "Alice", roll number 101, and course "Computer Science".
student3 is created using the parameterized constructor with the name "Bob", roll number 102, and course "Mathematics".
The displayInfo method is used for each student object to print their respective details.


The code defines two classes: Student and Main. Below is a detailed line-by-line breakdown of the code:

Student Class:
class Student { - Defines a class named Student.

String name; - Declares an attribute name of type String to represent the student's name.

int rollNumber; - Declares an attribute rollNumber of type int to represent the student's roll number.

String course; - Declares an attribute course of type String to represent the student's course.

Student() { - Declares a default constructor for the Student class.

name = "Unknown"; - Sets the name attribute to "Unknown" by default.

rollNumber = 0; - Sets the rollNumber attribute to 0 by default.

course = "Not Assigned"; - Sets the course attribute to "Not Assigned" by default.

} - Closes the default constructor.

Student(String name, int rollNumber, String course) { - Declares a parameterized constructor for the Student class 
that takes three arguments (name, rollNumber, course).

this.name = name; - Assigns the value of the parameter name to the class attribute name. 
The this keyword is used to differentiate between the parameter and the attribute.

this.rollNumber = rollNumber; - Assigns the value of the parameter rollNumber to the class attribute rollNumber.

this.course = course; - Assigns the value of the parameter course to the class attribute course.

} - Closes the parameterized constructor.

void displayInfo() { - Declares a method named displayInfo to print the student's information.

System.out.println("Name: " + name); - Prints the student's name.

System.out.println("Roll Number: " + rollNumber); - Prints the student's roll number.

System.out.println("Course: " + course); - Prints the student's course.

System.out.println(); - Adds an empty line for better output formatting.

} - Closes the displayInfo method.

} - Closes the Student class.

Main Class:
public class Main { - Defines a public class named Main.

public static void main(String[] args) { - Defines the main method, which serves as the entry point for the program.

Student student1 = new Student(); - Creates an instance student1 of the Student class using the default constructor.

student1.displayInfo(); - Calls the displayInfo method on student1, which prints:
Name: Unknown
Roll Number: 0
Course: Not Assigned

Student student2 = new Student("Alice", 101, "Computer Science"); - Creates an instance student2 of the Student class 
using the parameterized constructor with values: name = "Alice", rollNumber = 101, course = "Computer Science".

student2.displayInfo(); - Calls the displayInfo method on student2, which prints:
Name: Alice
Roll Number: 101
Course: Computer Science

Student student3 = new Student("Bob", 102, "Mathematics"); - Creates an instance student3 of the Student class using the 
parameterized constructor with values: name = "Bob", rollNumber = 102, course = "Mathematics".

student3.displayInfo(); - Calls the displayInfo method on student3, which prints:
Name: Bob
Roll Number: 102
Course: Mathematics

} - Closes the main method.

} - Closes the Main class.
*/