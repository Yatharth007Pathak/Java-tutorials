/*
Object class is present in java.lang package. Every class in Java is directly or indirectly derived from the OBject class.
If a class does not extend any other class then it is a direct child class of Object and if extends another class then it is indirectly derived.
Therefore the Object class methods are available to all Java classes.In Java, the Object class is the root class of the Java class hierarchy. 

Key Features of the Object Class

Common Methods: The Object class provides several methods that are commonly used in object manipulation:
equals(Object obj): Compares this object with the specified object for equality.
hashCode(): Returns a hash code value for the object.
toString(): Returns a string representation of the object.
getClass(): Returns the runtime class of the object.
clone(): Creates and returns a copy of the object (requires the class to implement the Cloneable interface).
finalize(): Called by the garbage collector when there are no more references to the object.

Inheritance: Since every class inherits from Object, any object in Java can be treated as instance of Object, allowing for polymorphic behavior.

Object Reference: You can declare a variable of type Object and assign it any object of any class, enabling a general way to handle objects.
*/

class Personn {
    String name;

    Personn(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "'}";
    }
}

public class ka {
    public static void main(String[] args) {
        Personn person1 = new Personn("Alice");
        Personn person2 = new Personn("Bob");

        // Using Object methods
        System.out.println(person1.toString());  // Output: Person{name='Alice'}
        System.out.println(person1.equals(person2)); // Output: false

        // Using Object's hashCode method
        System.out.println(person1.hashCode());
    }
}

/*
Here’s a line-by-line breakdown of the code:

class Personn {
Declares a class named Personn.

String name;
Declares an instance variable name of type String, which will store the name of the person.

Personn(String name) {
Defines a constructor for the Personn class that takes one parameter, name.

this.name = name;
Assigns the value of the parameter name to the instance variable this.name. This allows each Personn object to have its own name.

@Override
Indicates that the following method is overriding a method from the superclass (in this case, the toString() method from the Object class).

public String toString() {
Defines a method named toString that returns a String representation of the Personn object.

return "Person{name='" + name + "'}";
Constructs a string representation of the Personn object in format Person{name='Alice'} or Person{name='Bob'} based on the name of the object.

}
Ends the toString() method.

}
ends the Personn class.

public class ka {
Declares a public class named ka, which contains the main() method.

public static void main(String[] args) {
Defines the main() method, which serves as the entry point of the program.

Personn person1 = new Personn("Alice");
Creates a new Personn object named person1 with the name "Alice". This object is stored in heap memory.

Personn person2 = new Personn("Bob");
Creates another Personn object named person2 with the name "Bob". This object is also stored in heap memory.

System.out.println(person1.toString());
Calls the toString() method on person1 and prints the result to the console. This outputs: Person{name='Alice'}.

System.out.println(person1.equals(person2));
Calls the equals() method on person1, passing person2 as an argument. Since the two objects have different names, this will output false.

System.out.println(person1.hashCode());
Calls the hashCode() method on person1 and prints the hash code of the person1 object to the console. 
The output will be an integer value representing the hash code.

}
Ends the main() method.

}
Ends the ka class.
*/