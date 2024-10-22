// Method Overloading allows a class to have multiple methods with the same name but different parameters (either in type, number, or both).

public class em {
    
    // Method 1: Adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Adds three integers (Overloaded method)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        em obj = new em();
        System.out.println(obj.add(5, 10));      // Calls the method with two arguments
        System.out.println(obj.add(1, 2, 3));    // Calls the overloaded method with three arguments
    }
}

/*
Here’s a detailed breakdown of the code line by line:

public class em {
This declares a public class named em. It contains methods to perform addition and the main method for execution.

public int add(int a, int b) {
This defines a public method named add that takes two integer parameters, a and b. The method returns the sum of the two integers.

return a + b;
This returns the result of adding a and b to the caller of the method.

public int add(int a, int b, int c) {
This is an overloaded version of the add method, which takes three integer parameters: a, b, and c. 
Method overloading allows multiple methods with the same name but different parameters.

return a + b + c;
This returns the result of adding a, b, and c to the caller of the method.

public static void main(String[] args) {
This is the main method where the program's execution starts. It serves as the entry point for the Java application.

em obj = new em();
This creates an instance of the em class named obj. The instance allows calling non-static methods of the class.

System.out.println(obj.add(5, 10));
This calls the add method with two arguments, 5 and 10, and prints the result (15) to the console.

System.out.println(obj.add(1, 2, 3));
This calls the overloaded add method with three arguments, 1, 2, and 3, and prints the result (6) to the console.
*/