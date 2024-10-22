/*
Data Hiding is a fundamental concept in OOP that restricts direct access to the internal state of an object. This is primarily achieved 
through encapsulation, where the object's attributes are kept private and can only be accessed or modified through public methods. 
This mechanism protects the integrity of the data and ensures that it cannot be altered unexpectedly by other parts of the program.

Key Points of Data Hiding
Encapsulation: By encapsulating data, we can control how it is accessed and modified. 
We can provide public methods (getters and setters) to allow controlled access to the private data.
Access Modifiers: Use access modifiers like private, protected, and public to restrict access to class members.

private: Only accessible within the class itself.
protected: Accessible within the same package and by subclasses.
public: Accessible from any other class.

Control: Data hiding allows us to control how the data is accessed and modified. This can prevent invalid data states.
*/

class Person__ {
    // Private variable to hide data
    private int age;

    // Method to set age
    public void setAge(int age) {
        if (age >= 0) { // Ensuring age is not negative
            this.age = age;
        } else {
            System.out.println("Age cannot be negative.");
        }
    }

    // Method to get age
    public int getAge() {
        return age;
    }
}

public class iy {
    public static void main(String[] args) {
        Person__ person = new Person__(); // Creating an instance of Person
        
        // Setting age using setter method
        person.setAge(25);
        System.out.println("Age: " + person.getAge()); // Getting age using getter method

        // Attempting to set a negative age
        person.setAge(-5); // Should print a message
        System.out.println("Age after trying to set negative value: " + person.getAge());
    }
}

/*
Here’s a pointwise breakdown of the provided Java code, line by line:

class Person__ {
Defines a public class named Person__.

private int age;
Declares a private variable age of type int, which stores the age of the person. This variable is only accessible through public methods.

public void setAge(int age) {
Begins the definition of a public method setAge() that accepts an int parameter age, which represents the age to be set.

if (age >= 0) {
Checks if the provided age is greater than or equal to zero to ensure that only valid (non-negative) age values can be assigned.

this.age = age;
If the condition is met, assigns the provided age value to the instance variable age.

}
Ends the if statement block.

else {
Begins the else block, which executes if the condition in the if statement is false.

System.out.println("Age cannot be negative.");
Prints a message indicating that the age cannot be negative.

}
Ends the else block.

}
Ends the setAge() method.

public int getAge() {
Begins the definition of a public method getAge() that returns the current value of age.

return age;
Returns the value of the age variable.

}
Ends the getAge() method.

}
Ends the Person__ class.

public class iy {
Defines a public class named iy.

public static void main(String[] args) {
Defines the main method, which serves as the entry point for the Java application.

Person__ person = new Person__();
Creates a new instance of the Person__ class and assigns it to the reference variable person.

person.setAge(25);
Calls the setAge() method on the person instance to set the age to 25.

System.out.println("Age: " + person.getAge());
Prints the message "Age: " followed by the current age returned from the getAge() method.

person.setAge(-5);
Attempts to call the setAge() method with a value of -5, which is invalid and should trigger the error message.

System.out.println("Age after trying to set negative value: " + person.getAge());
Prints the message "Age after trying to set negative value: " followed by the current age returned from the getAge() method, 
which should still be 25.

}
Ends the main method.

}
Ends the iy class.
*/