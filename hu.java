// The this keyword can also be used to return the current object from a method, which is particularly useful for method chaining. 

class Person {
    String name;

    Person setName(String name) {
        this.name = name;
        return this; // Returning the current object for chaining
    }

    void printName() {
        System.out.println("Name: " + name);
    }
}

public class hu {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Bob").printName(); // Output: Name: Bob
    }
}

/*
The code defines two classes: Person and hu. Below is a detailed line-by-line breakdown of the code.

Person Class:
String name; - Declares an attribute name of type String to represent the person's name.

Person setName(String name) - Defines a method named setName that takes a parameter name of type String. 
This method returns an instance of the Person class (specifically, the current object). This allows for method chaining.

this.name = name; - Assigns the value of the parameter name to the instance variable name. 
The this keyword is used to refer to the instance variable of the current object, distinguishing it from the method parameter.

return this; - Returns the current instance of the Person object. 
This allows method chaining, meaning multiple methods can be called on the same object in a single statement.

void printName() - Defines a method named printName that prints the person's name.

System.out.println("Name: " + name); - Prints the person's name in the format: "Name: Bob".

hu Class (Main Class):
public class hu { - Defines a public class named hu (which acts as the main class).

public static void main(String[] args) { - Defines the main method, which is the entry point for program execution.

Person person = new Person(); - Creates an instance of the Person class named person.

person.setName("Bob").printName(); - Calls the setName method on the person object with the argument "Bob", and then immediately calls the 
printName method on the same object. This is possible due to the return this in the setName method, enabling chaining. 
The output will be: Name: Bob

} - Closes the main method.

} - Closes the hu class.



Use of the this Keyword in the setName method:

this.name = name;
this is used to refer to the instance variable name of the current Person object. 
It is necessary because the parameter name has the same name as the instance variable. 
Without this, it would be unclear whether the method is referring to the parameter or the instance variable.

return this;
this refers to the current Person object, which is returned by the setName method. 
This allows the caller to chain another method call to the object without writing a separate line of code. 
In this case, setName("Bob") returns the person object, enabling .printName() to be called on the same line.
*/