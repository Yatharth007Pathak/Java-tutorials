/*
A method declared as final cannot be overridden by subclasses. 
This is useful when you want to maintain the behavior of a method and prevent any modifications.

Key Points for Final Methods:
Final methods prevent method overriding, ensuring that the implementation remains consistent across subclasses.
*/

class Animall {
    final void sound() {
        System.out.println("Some generic sound");
    }
}

class Leopard extends Animall {
    // void sound() { // This will cause a compilation error
    //     System.out.println("Roar");
    // }
}

public class ik {
    public static void main(String[] args) {
        Leopard newLeopard = new Leopard();
        newLeopard.sound(); // Output: Some generic sound
    }
}

/*
}
ChatGPT said:
ChatGPT
The provided Java code demonstrates the use of the final keyword in the context of method overriding. 
Below is a breakdown of the code, explaining its structure and functionality.

Code Breakdown
class Animall {
Declares a class named Animall.

final void sound() {
Declares a method named sound that is marked as final. This means that this method cannot be overridden in any subclass.

System.out.println("Some generic sound");
Inside the sound method, this line prints the message "Some generic sound" to the console.

}
Closes the Animall class.

Subclass Definition
class Leopard extends Animall {
Declares a class named Leopard that extends the Animall class. By extending Animall, the Leopard class inherits its properties and methods.

// void sound() { // This will cause a compilation error
This line is commented out. If it were active, it would attempt to override the sound method inherited from Animall, 
which is not allowed because the sound method is declared as final. This would result in a compilation error.

// System.out.println("Roar");
Another commented line that would print "Roar" if the method were allowed to override the sound method.

// }
Closing brace for the commented-out sound method.

}
Closes the Leopard class.

Main Class
public class ik {
Declares a public class named ik, which contains the main method.

public static void main(String[] args) {
Declares the main method, which serves as the entry point for the program.

Leopard newLeopard = new Leopard();
Creates an instance of the Leopard class named newLeopard.

newLeopard.sound(); // Output: Some generic sound
Calls the sound method on the newLeopard object. Since the sound method in the Animall class is final, 
the method from Animall is invoked, printing "Some generic sound" to the console.

}
Closes the main method.

}
Closes the ik class.

Explanation of the final Keyword
final void sound(): The final keyword indicates that the sound method cannot be overridden in any subclass. 
This is useful when you want to provide a method implementation that should remain unchanged in any derived classes.

Effect on Subclass: In the Leopard class, if the commented-out sound method were to be uncommented, 
it would lead to a compilation error because the sound method is declared as final in the Animall class. 
Therefore, the Leopard class inherits the sound method without the ability to modify it.
*/