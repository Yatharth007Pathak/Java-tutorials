public class hk {

    public static void main(String[] args) {
        Complex num1 = new Complex(); // Creating an instance of Complex named num1
        num1.a = 3; // Assigning the value 3 to the real part (a)
        num1.b = 5; // Assigning the value 5 to the imaginary part (b)
        num1.print(); // Calling the print method to display the complex number
    }
}

class Complex {
    int a, b; // Variables to store real part (a) and imaginary part (b) of the complex number

    void print() { // Method to print the complex number
        System.out.println(a + " + " + b + "i"); // Print the complex number in a + bi format
    }
}


/*
The hk class creates an object num1 of the Complex class, assigns values to its real (a) and imaginary (b) parts, 
and then calls the print method to display the complex number in the form of "3 + 5i". 
The Complex class represents a complex number with two attributes and provides a method to print the complex number in a readable format.

The code defines two classes: hk and Complex. Below is a line-by-line breakdown of the code:

public class hk { - Defines a public class named hk.

public static void main(String[] args) { - Defines the main method, which serves as the entry point for the program.

Complex num1 = new Complex(); - Creates an instance of the Complex class named num1.

num1.a = 3; - Sets the attribute a of num1 to 3, representing the real part of the complex number.

num1.b = 5; - Sets the attribute b of num1 to 5, representing the imaginary part of the complex number.

num1.print(); - Calls the print method on num1 to print the complex number in a standard format.

} - Closes the main method.

} - Closes the hk class.

class Complex { - Defines a class named Complex.

int a, b; - Declares two attributes: a and b of type int. a represents the real part and b represents the imaginary part of a complex number.

void print() { - Declares a method named print that outputs the complex number in the form of "a + bi".

System.out.println(a + " + " + b + "i"); - Prints the value of the complex number in a standard format.

} - Closes the print method.

} - Closes the Complex class.
*/