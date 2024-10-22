// Lambda Expression with Multiple Parameters

@FunctionalInterface
interface Caalculator {
    int add(int a, int b);
}

public class jw {
    public static void main(String[] args) {
        // Lambda expression to implement the add method
        Caalculator add = (a, b) -> a + b;

        // Calling the method
        int result = add.add(5, 3);
        System.out.println("Sum: " + result); // Output: Sum: 8
    }
}

/*
The program defines a functional interface Caalculator with a single abstract method add().
In the main() method, a lambda expression is used to implement the add() method, performing the addition of two integers.
The method is called with the values 5 and 3, resulting in the output Sum: 8 printed to the console.

Here's a line-by-line breakdown of the code:

@FunctionalInterface
This annotation indicates that the Caalculator interface is a functional interface, meaning it contains exactly one abstract method.

interface Caalculator {
Declares a functional interface named Caalculator.

int add(int a, int b);
Defines an abstract method add that takes two int parameters, a and b, and returns an int. 
his method will be implemented using a lambda expression.

}
Ends the Caalculator interface.

public class jw {
Declares a public class named jw, which contains the main() method.

public static void main(String[] args) {
Defines the main() method, which serves as the entry point of the program.

Caalculator add = (a, b) -> a + b;
Creates a variable add of type Caalculator and assigns it a lambda expression that implements the add method. 
The lambda takes two parameters, a and b, and returns their sum (a + b).

int result = add.add(5, 3);
Calls the add method on the add instance with the arguments 5 and 3, storing the result (which is 8) in the variable result.

System.out.println("Sum: " + result);
Prints the value of result to the console, outputting Sum: 8.

}
Ends the main() method.

}
Ends the jw class.
*/