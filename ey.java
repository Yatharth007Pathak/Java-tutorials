/*
Parameters can be of various types, including:
Primitive Types: int, double, char, boolean, etc.
Reference Types: Any class type (e.g., String, Array, custom objects).
*/

public class ey {
    
    // Method with multiple types of parameters
    public void displayInfo(String name, int age, double salary) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        ey example = new ey();

        // Calling the method with different types of parameters
        example.displayInfo("Alice", 30, 75000.50);
        example.displayInfo("Bob", 25, 60000.00);
    }
}

/*
Here’s a detailed breakdown of the code line by line:

public class ey {
This declares a public class named ey. This class contains methods for displaying user information.

public void displayInfo(String name, int age, double salary) {
This defines a public instance method named displayInfo. It takes three parameters: 
name (of type String), age (of type int), and salary (of type double). The method does not return any value, indicated by the void return type.

System.out.println("Name: " + name);
This line prints the name of the person to the console in the format "Name: [name]", 
where [name] is replaced with the value of the name parameter.

System.out.println("Age: " + age);
This line prints the age of the person to the console in the format "Age: [age]", where [age] is replaced with the value of the age parameter.

System.out.println("Salary: " + salary);
This line prints the salary of the person to the console in the format "Salary: [salary]",
 where [salary] is replaced with the value of the salary parameter.

}
This closing brace indicates the end of the displayInfo method.

public static void main(String[] args) {
This is the main method, which serves as the entry point for the Java application. Execution of the program begins here.

ey example = new ey();
This line creates a new instance of the ey class named example. This object will be used to call the instance method displayInfo.

example.displayInfo("Alice", 30, 75000.50);
This line calls the displayInfo method on the example object, passing "Alice", 30, and 75000.50 as arguments. It prints the output.

}
This closing brace indicates the end of the main method.

}
This closing brace indicates the end of the ey class.
*/