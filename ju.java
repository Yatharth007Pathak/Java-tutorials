// The Predicate<T> functional interface is used to represent a boolean-valued function. It is often used for filtering or evaluating conditions.

import java.util.function.Predicate;

public class ju {
    public static void main(String[] args) {
        // Predicate to check if a number is even
        Predicate<Integer> isEven = (num) -> num % 2 == 0;

        // Test the predicate
        System.out.println(isEven.test(4));  // Output: true
        System.out.println(isEven.test(7));  // Output: false
    }
}

/*
The program demonstrates the use of the Predicate functional interface to check if a number is even.
A lambda expression is used to define the logic for the predicate.
The test() method is called with different numbers, and the results (whether each number is even or not) are printed to the console.

Here's a line-by-line breakdown of the code:

import java.util.function.Predicate;
Imports the Predicate interface from the java.util.function package. 
This interface represents a single argument function that returns a boolean value.

public class Main {
Declares a public class named Main, which contains the main() method.

public static void main(String[] args) {
Defines the main() method, which serves as the entry point of the program.

Predicate<Integer> isEven = (num) -> num % 2 == 0;
Creates a Predicate instance named isEven that takes an Integer as input.
The lambda expression (num) -> num % 2 == 0 defines the logic to check if the number is even: 
it returns true if num is divisible by 2 (even) and false otherwise.

System.out.println(isEven.test(4));
Calls the test() method on the isEven predicate with the argument 4. Since 4 is even, this line prints true to the console.

System.out.println(isEven.test(7));
Calls the test() method on the isEven predicate with the argument 7. Since 7 is odd, this line prints false to the console.

}
Ends the main() method.

}
Ends the Main class.
*/