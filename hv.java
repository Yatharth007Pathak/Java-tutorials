// The this keyword can also be used to explicitly call another method of the current object.

class Calculator {
    void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    void calculate() {
        System.out.println("Calculating sum:");
        this.add(5, 10); // Explicitly calling add method
    }
}

public class hv {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.calculate();
    }
}

/*
The code defines a simple Calculator class with methods to add numbers and calculate the sum. 
The this keyword is used in the calculate method to explicitly call the add method of the current instance.

The code consists of two classes: Calculator and hv. Here’s a detailed breakdown of the code.

Calculator Class:
void add(int a, int b) - Defines a method named add that takes two parameters, a and b, of type int. 
This method calculates the sum of a and b and prints it.

System.out.println("Sum: " + (a + b)); - This line prints the result of adding a and b in the format: "Sum: 15" if a = 5 and b = 10.
void calculate() - Defines a method named calculate that is responsible for performing a sum operation.

System.out.println("Calculating sum:"); - Prints a message indicating that the sum is being calculated.
this.add(5, 10); - Calls the add method with arguments 5 and 10 using the this keyword. 
Here, this explicitly refers to the current object and invokes the add method.

hv Class (Main Class):
public class hv { - Defines the public class hv, which contains the main method and serves as the entry point of the program.

public static void main(String[] args) { - Declares the main method where the program execution begins.

Calculator calc = new Calculator(); - Creates an instance of the Calculator class named calc.

calc.calculate(); - Calls the calculate method on the calc object. This triggers the calculation process, 
which first prints "Calculating sum:" and then calls the add method to print "Sum: 15".

} - Closes the main method.

} - Closes the hv class.


Use of the this Keyword in the calculate method:
this.add(5, 10);
The this keyword is used to explicitly call the add method from within the same class. Although using this here is optional, 
it helps improve code readability by clearly indicating that the add method belongs to the current instance of the Calculator class.
In this context, this.add(5, 10) could simply be written as add(5, 10), since both refer to the same method in the current object. 
However, using this makes it explicit that we are invoking an instance method of the current object.
*/