/*
When defining a method, you specify the parameters inside the parentheses. Each parameter must have a type and a name. 
You can have multiple parameters separated by commas.
*/

public class ex {

    // Method with parameters
    public void printSum(int a, int b) { // 'a' and 'b' are formal parameters
        int sum = a + b; // Perform operation
        System.out.println("The sum is: " + sum);
    }

    public static void main(String[] args) {
        ex example = new ex(); // Create an instance

        // Calling the method with actual parameters
        example.printSum(5, 10); // 5 and 10 are actual parameters
        example.printSum(20, 30); // 20 and 30 are actual parameters
    }
}

/*
Here’s a detailed breakdown of the code line by line:

public class ex {
This declares a public class named ex. This class contains methods for performing operations and printing results.

public void printSum(int a, int b) {
This defines a public instance method named printSum that takes two parameters of type int, named a and b. 
The method does not return any value, indicated by the void return type.

int sum = a + b;
Inside the printSum method, this line calculates the sum of the two integers a and b, and stores the result in a variable named sum.

System.out.println("The sum is: " + sum);
This line prints the calculated sum to the console in the format "The sum is: [value]". It concatenates the string with the value of sum.

}
This closing brace indicates the end of the printSum method.

public static void main(String[] args) {
This is the main method, which serves as the entry point for the Java application. Execution of the program begins here.

ex example = new ex();
This line creates a new instance of the ex class named example. This object will be used to call the instance method printSum.

example.printSum(5, 10);
This line calls the printSum method on the example object, passing 5 and 10 as arguments. 
The method calculates the sum (which is 15) and prints "The sum is: 15" to the console.

example.printSum(20, 30);
This line calls the printSum method again, this time with the arguments 20 and 30. 
The method calculates the sum (which is 50) and prints "The sum is: 50" to the console.

}
This closing brace indicates the end of the main method.

}
This closing brace indicates the end of the ex class.
*/