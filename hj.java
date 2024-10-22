/*
Class is a blueprint which defines some properties and behaviours. 
An object is an instance of a class which has those properties and behaviours attached.

A class is not allocated memory when it is defined. An object is allocated memory when it is created.
Class is a logical entity whereas objects are physical etities. 
A class is declared only once. On the other hand, we can create multiple objects of a class.
A class is a way to arrange data and behaviour information. It is a template that must be implemented by its objects.
A class can also be seen as a user-defined data type where any object of defined data type has some predefined properties and behaviours.

A class is a non-primitive (or user-defined) data type in programming. 
Primitive data types are built-in and fundamental types provided by a language, such as integers, booleans, and characters. 
Non-primitive types, (classes, structures, and arrays) are derived from primitive types and allow us to define more complex data structures.
Classes allow us to create objects, encapsulating data (attributes) and behavior (methods).
*/

public class hj {

    public static void main(String[] args) {

        Dog_ d1 = new Dog_(); // Creating an instance of Dog_ named d1
        d1.name = "Courage"; // Assigning the name "Courage" to the dog
        d1.bark(); // Calling the bark method for d1
        
        Dog_ d2 = new Dog_(); // Creating another instance of Dog_ named d2
        d2.name = "Shiro"; // Assigning the name "Shiro" to the dog
        d2.walk(); // Calling the walk method for d2
        
    }
}

class Dog_ {

    String name; // Variable to store the dog's name

    void walk() { // Method for the dog to walk
        System.out.println(name + " is walking"); // Print a message indicating the dog is walking
    }

    void bark() { // Method for the dog to bark
        System.out.println(name + " is barking"); // Print a message indicating the dog is barking
    }
}


/*
The hj class creates two Dog_ objects (d1 and d2), assigns names to them, and then calls different methods to display what each dog is doing. 
The Dog_ class contains two methods, walk and bark, which respectively output the dog's name along with appropriate messages.

The code consists of two classes: hj and Dog_. Here's a detailed line-by-line breakdown:

public class hj { - Defines a public class named hj.

public static void main(String[] args) { - Defines the main method, which serves as the entry point for the program.

Dog_ d1 = new Dog_(); - Creates an instance of the Dog_ class named d1.

d1.name = "Courage"; - Sets the name attribute of d1 to "Courage".

d1.bark(); - Calls the bark method on d1, which prints the message "<name> is barking" for d1.

Dog_ d2 = new Dog_(); - Creates another instance of the Dog_ class named d2.

d2.name = "Shiro"; - Sets the name attribute of d2 to "Shiro".

d2.walk(); - Calls the walk method on d2, which prints the message "<name> is walking" for d2.

} - Closes the main method.

} - Closes the hj class.

class Dog_ { - Defines a class named Dog_.

String name; - Declares an attribute name of type String to represent the dog's name.

void walk() { - Declares a method named walk that outputs a walking message for the dog.

System.out.println(name + " is walking"); - Prints the message containing the dog's name followed by "is walking".

} - Closes the walk method.

void bark() { - Declares a method named bark that outputs a barking message for the dog.

System.out.println(name + " is barking"); - Prints the message containing the dog's name followed by "is barking".

} - Closes the bark method.

} - Closes the Dog_ class.

In summary, the hj class creates two Dog_ objects (d1 and d2
*/