/*
Method overloading enhances code readability and allows for more flexible and reusable methods. 
It is a fundamental feature of object-oriented programming in Java. 
By providing multiple methods with the same name but different signatures, you can create intuitive and cohesive APIs for your classes.

Points to Note
Different Number of Parameters: You can have methods with the same name but a different number of parameters. 
For example, area(double length, double width) and area(double side).

Different Types of Parameters: You can also overload methods based on the types of parameters. 
For instance, if you have an int version and a double version of a method.

Order of Parameters: You can change the order of parameter types to create overloaded methods. 
For example, a method with parameters (int, double) is different from a method with parameters (double, int).
*/

class Display {
    void show(int number) {
        System.out.println("Integer: " + number);
    }

    void show(double number) {
        System.out.println("Double: " + number);
    }

    void show(String message) {
        System.out.println("String: " + message);
    }
}

public class hn {
    public static void main(String[] args) {
        Display display = new Display();
        
        display.show(10); // Calls show(int)
        display.show(5.5); // Calls show(double)
        display.show("Hello"); // Calls show(String)
    }
}
