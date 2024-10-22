/*
The super keyword can also be used to call a constructor of the superclass from the subclass constructor. 
This is particularly useful when you want to initialize the superclass part of the subclass.
*/

class Animal_ {
    Animal_() {
        System.out.println("Animal created");
    }
}

class Sheep extends Animal {
    Sheep() {
        super(); // Calls the superclass constructor
        System.out.println("Sheep created");
    }
}

public class id {
    public static void main(String[] args) {
        Sheep mySheep = new Sheep();
    }
}


/*
Here's a detailed breakdown of the code:

Animal_ Class (Superclass):
class Animal_ { - Declares a class named Animal_.
Animal_() { - Defines the constructor for the Animal_ class.
System.out.println("Animal created"); - This line prints "Animal created" to the console when an object of the Animal_ class is instantiated.
} - Closes the Animal_ class.

Sheep Class (Subclass):
class Sheep extends Animal_ { - Declares a class named Sheep that inherits from the Animal_ class using the extends keyword.
Sheep() { - Defines the constructor for the Sheep class.
super(); - Calls the constructor of the superclass (Animal_). This is necessary to ensure that the superclass's initialization code is 
executed before the subclass's constructor code. This line invokes the Animal_ constructor, leading to the output from that constructor.
System.out.println("Sheep created"); - This line prints "Sheep created" to the console after the superclass's constructor has been executed.
} - Closes the Sheep class.
id Class (Main Class):

public class id { - Declares a class named id that contains the main method.
public static void main(String[] args) { - Declares the main method, which serves as the entry point of the program.
Sheep mySheep = new Sheep(); - Creates an instance of the Sheep class named mySheep. 
This line triggers the execution of the Sheep constructor, which in turn calls the Animal_ constructor due to the super() call.
} - Closes the main method.
} - Closes the id class.

Output of the Code:
When the program is run, the output will be:
Animal created
Sheep created

Explanation:
Constructor Chaining: When an instance of Sheep is created, the Sheep constructor is called. 
The first action in the Sheep constructor is the call to super(), which invokes the constructor of the Animal_ class. 
This ensures that any initialization code in the superclass constructor is executed before the subclass constructor continues its own execution.
Inheritance: The Sheep class inherits from the Animal_ class, meaning it can utilize its properties and methods. 
In this example, the Sheep class does not add new properties or methods, 
but it demonstrates how to extend the functionality of the base class through constructor chaining.
*/