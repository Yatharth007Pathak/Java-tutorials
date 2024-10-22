public class ej {
    
    // A method that takes two integers and returns their sum
    public int add(int a, int b) {
        int sum = a + b; // Adding the two numbers
        return sum;      // Returning the result
    }

    public static void main(String[] args) {
        ej obj = new ej(); // Creating an object of the class

        // Calling the add method and storing the result
        int result = obj.add(5, 10);

        // Printing the result
        System.out.println("The sum is: " + result);
    }
}

/*
Here’s a detailed breakdown of the code line by line:

public class ej {
This declares a public class named ej. It contains methods that provide specific functionalities.

public int add(int a, int b) {
This defines a public method named add that takes two integer parameters, a and b. 
The method returns an integer value representing the sum of the two arguments.

int sum = a + b;
This line calculates the sum of the parameters a and b and stores the result in the variable sum.

return sum;
This returns the value of sum to the caller of the add method.

public static void main(String[] args) {
This is the main method where the execution of the program begins. It is the entry point of the Java application.

ej obj = new ej();
This creates an instance of the ej class named obj. The instance is used to call non-static methods of the class.

int result = obj.add(5, 10);
This calls the add method of the obj instance, passing 5 and 10 as arguments. The return value (15) is stored in the variable result.

System.out.println("The sum is: " + result);
This prints the string "The sum is: " followed by the value of result to the console.
*/