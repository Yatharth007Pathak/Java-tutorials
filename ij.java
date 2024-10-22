/*
When a variable is declared as final, it means that its value cannot be changed once it has been assigned. This is similar to a constant.

Key Points for Final Variables:
Once a final variable is initialized, it cannot be reassigned.
final variables must be initialized either at the time of declaration or in the constructor if they are instance variables.
*/


class Example {
    final int MAX_VALUE = 100; // Final variable

    void changeValue() {
        // MAX_VALUE = 200; // This will cause a compilation error
    }
}

public class ij {
    public static void main(String[] args) {
        Example example = new Example();
        System.out.println("Max Value: " + example.MAX_VALUE);
    }
}

/*
The provided Java code demonstrates the use of the final keyword with a variable. 
Below is a breakdown of the code, line by line, explaining its structure and functionality.

Code Breakdown
class Example {
Declares a class named Example.

final int MAX_VALUE = 100; // Final variable
Declares a constant variable MAX_VALUE of type int and initializes it with the value 100. 
The final modifier indicates that once MAX_VALUE is initialized, it cannot be modified.

void changeValue() {
Declares a method named changeValue.

// MAX_VALUE = 200; // This will cause a compilation error
This line is commented out. If it were active, it would attempt to change the value of MAX_VALUE, resulting in a compilation error. 
This illustrates that final variables cannot be reassigned after they are initialized.

}
Closes the changeValue method.

}
Closes the Example class.

Main Class
public class ij {
Declares a public class named ij, which contains the main method.

public static void main(String[] args) {
Declares the main method, which serves as the entry point for the program.

Example example = new Example();
Creates an instance of the Example class named example.

System.out.println("Max Value: " + example.MAX_VALUE);
Prints the value of MAX_VALUE to the console. Since MAX_VALUE is declared as final, its value remains constant at 100.

}
Closes the main method.

}
Closes the ij class.

Explanation of the final Keyword
final int MAX_VALUE: The final keyword indicates that MAX_VALUE is a constant. This means that after its initial assignment to 100, 
its value cannot be changed. Attempting to reassign it within the changeValue method (as shown in the commented line) 
would lead to a compilation error, reinforcing the idea that final variables are immutable.

Use in the Main Method: The program demonstrates the use of the final variable by printing its value. 
This showcases how final variables can be used in a class to maintain constants that should not be altered throughout the program's execution.
*/