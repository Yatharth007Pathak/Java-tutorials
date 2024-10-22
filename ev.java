//  Calling Methods with Return Values: If a method returns a value, you can store the result in a variable when calling it.

public class ev {

    // Method that returns an integer value
    public int add(int a, int b) {
        return a + b; // Return the sum of a and b
    }

    public static void main(String[] args) {
        // Creating an object of ReturnValueExample
        ev example = new ev();

        // Calling the method and storing the return value
        int sum = example.add(5, 10);

        // Printing the return value
        System.out.println("The sum is: " + sum);
    }
}

/*
Here's a detailed breakdown of the code line by line:

public class ev {
This declares a public class named ev. This class contains methods and the main function.

// Method that returns an integer value
This is a comment indicating that the following method is designed to return an integer value.

public int add(int a, int b) {
This defines a public instance method named add that takes two parameters, both of type int (named a and b). 
The method has a return type of int, meaning it will return an integer value.

return a + b;
This line calculates the sum of the parameters a and b, then returns the result to the caller of the method.

}
This closing brace indicates the end of the add method.

public static void main(String[] args) {
This is the main method, which serves as the entry point for the Java application. Execution of the program begins here.

// Creating an object of ReturnValueExample
This is a comment that indicates the next line creates an instance of the class.

ev example = new ev();
This line creates a new object of the ev class named example. This object will be used to call the add method.

// Calling the method and storing the return value
This is a comment indicating that the following line will call the add method and store its return value.

int sum = example.add(5, 10);
This line calls the add method on the example object, passing 5 and 10 as arguments. 
The return value (the sum of 5 and 10, which is 15) is stored in the variable sum.

// Printing the return value
This is a comment that indicates the next line will print the value of sum.

System.out.println("The sum is: " + sum);
This line prints the message "The sum is: " followed by the value of sum (which is 15) to the console.

}
This closing brace indicates the end of the main method.

}
This closing brace indicates the end of the ev class.
*/