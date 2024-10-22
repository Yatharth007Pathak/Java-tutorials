/*
Method overloading in Java allows a class to have more than one method with the same name but different parameter lists. 
This feature enables us to define multiple versions of a method that perform similar but slightly different tasks based on the input parameters.
Here are the key concepts and examples related to method overloading:

Key Concepts of Method Overloading
Same Method Name: All overloaded methods must have the same name.
Different Parameters: Overloaded methods must differ in the number of parameters, the types of parameters, or the order of parameters.
Return Type: The return type can be different, but it alone is not sufficient to distinguish overloaded methods. The parameter list must differ.
*/

class AreaCalculator {

    // Method to calculate area of a rectangle
    double area(double length, double width) {
        return length * width;
    }

    // Method to calculate area of a square
    double area(double side) {
        return side * side;
    }

    // Method to calculate area of a circle
    double area(double radius, boolean isCircle) {
        if (isCircle) {
            return Math.PI * radius * radius; 
        }
        return 0;
    }
}

public class hm {
    
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();
        
        double rectangleArea = calculator.area(5.0, 3.0); // Calls rectangle method
        double squareArea = calculator.area(4.0); // Calls square method
        double circleArea = calculator.area(2.0, true); // Calls circle method

        System.out.println("Area of rectangle: " + rectangleArea); // Output: Area of rectangle: 15.0
        System.out.println("Area of square: " + squareArea); // Output: Area of square: 16.0
        System.out.println("Area of circle: " + circleArea); // Output: Area of circle: 12.566370614359172
    }
}
