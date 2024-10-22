/*
The final keyword in Java is a non-access modifier that can be applied to variables, methods, and classes, 
providing specific constraints in each case. final keyword is used to define entities that cannot be changed or modified.

final variable: variable with final keyword cannot be assigned again.
final method: method with final keyword cannot be overridden by its subclasses.
final class: class with final keywordsw cannot be extended or inherited from other classes.

Summary of the final Keyword
Final Variables: Once assigned, their value cannot be changed.
Final Methods: Cannot be overridden by subclasses, ensuring consistent behavior.
Final Classes: Cannot be subclassed, preventing inheritance.

Use Cases
Immutable Objects: Use final variables to create constants and immutable objects.
Security and Design: Use final methods and classes to enforce security and maintain design integrity.
Performance: Final methods can sometimes lead to performance improvements because 
the compiler can make optimizations knowing that the method cannot be overridden.
*/

// Final class
final class Constants {
    // Final variable
    public static final double PI = 3.14159;

    // Final method
    public final void displayPi() {
        System.out.println("Value of PI: " + PI);
    }
}

// This class cannot extend Constants because it's declared final
class Calculator_ {
    // Method to calculate the area of a circle using the final PI value
    public double areaOfCircle(double radius) {
        return Constants.PI * radius * radius;
    }
}

public class ii {
    public static void main(String[] args) {
        Calculator_ calculator = new Calculator_();
        
        // Displaying the value of PI using the final method
        Constants constants = new Constants();
        constants.displayPi(); // Output: Value of PI: 3.14159

        // Calculating the area of a circle with radius 5
        double radius = 5.0;
        double area = calculator.areaOfCircle(radius);
        System.out.println("Area of the circle: " + area); // Output: Area of the circle: 78.53975
    }
}

/*
Final Class: The class Constants is declared as final, which means it cannot be subclassed.
Final Variable: The variable PI is declared as public static final, meaning it is a constant that cannot be changed.
Final Method: The method displayPi() is declared as final, which means it cannot be overridden by any subclass.
Calculator Class: The Calculator class uses the PI constant from the Constants class to calculate the area of a circle.
Main Class: In the main method, an instance of Calculator is created, and the area of a circle with a radius of 5 is calculated and displayed.

Here's a breakdown of the code line by line, explaining its structure and functionality:

Constants Class
final class Constants {
Declares a class named Constants that is marked as final. This means that no other class can extend Constants, preventing inheritance.

public static final double PI = 3.14159;
Declares a constant variable PI of type double that is public, static, and final. 
Being public means it can be accessed from other classes, static means it belongs to the class itself rather than any instance, 
and final indicates that the value cannot be changed after initialization.

public final void displayPi() {
Declares a method displayPi that is public and final. 
he final modifier prevents this method from being overridden by any subclass (though there cannot be subclasses since the class is final).

System.out.println("Value of PI: " + PI);
Prints the value of PI to the console.

}
Closes the displayPi method.

}
Closes the Constants class.

Calculator_ Class
class Calculator_ {
Declares a class named Calculator_ which is not final, allowing other classes to extend it.

public double areaOfCircle(double radius) {
Declares a method named areaOfCircle that takes a double parameter radius and returns a double. This method calculates the area of a circle.

return Constants.PI * radius * radius;
Calculates the area using the formula 𝜋 × radius^2 and returns the result. It accesses the constant PI from the Constants class.

}
Closes the areaOfCircle method.

}
Closes the Calculator_ class.

ii Class (Main Class)
public class ii {
Declares a public class named ii, which contains the main method.

public static void main(String[] args) {
Declares the main method, which is the entry point of the program.

Calculator_ calculator = new Calculator_();
Creates an instance of the Calculator_ class.

Constants constants = new Constants();
Creates an instance of the Constants class to access its methods.

constants.displayPi(); // Output: Value of PI: 3.14159
Calls the displayPi method on the constants object, which prints the value of PI.

double radius = 5.0;
Declares a double variable radius and initializes it with the value 5.0.

double area = calculator.areaOfCircle(radius);
Calls the areaOfCircle method on the calculator object with radius as the argument. 
This calculates the area of a circle with radius 5.0 using the constant PI.

System.out.println("Area of the circle: " + area); // Output: Area of the circle: 78.53975
Prints the calculated area to the console.

}
Closes the main method.

}
Closes the ii class.


Explanation of the final Keyword
final class Constants: This prevents any other class from extending Constants, 
ensuring that its properties and methods cannot be modified or inherited.
public static final double PI: The final modifier ensures that the value of PI is constant and cannot be changed after it's initialized. 
This is useful for defining constants that should remain the same throughout the application.
public final void displayPi(): The final modifier on this method indicates that it cannot be overridden in any subclass. 
This is relevant here because the Constants class cannot be subclassed at all.
Use in Calculator_: The Calculator_ class uses the constant PI from the Constants class to calculate the area of a circle,
demonstrating how the final variable can be shared across different classes without being modified.
*/