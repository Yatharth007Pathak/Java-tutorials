/*
Method parameters are variables that are used to pass information into methods in Java. 
They allow you to provide input values to methods, enabling them to perform operations based on those values. 
Here’s a detailed overview of method parameters, including types, examples, and key concepts.

Types of Method Parameters
Formal Parameters: These are the parameters defined in the method signature. 
They act as placeholders for the values that will be passed when the method is called.
Actual Parameters (Arguments): These are the actual values passed to the method when it is called.
*/

public class ew {

    public static void average(int a, int b) {
        int avg = (a+b)/2;
        System.out.println("The average is " + avg);        
    }

    public static void main(String[] args) {
        average(4, 6);
        System.out.println("HI");
        average(2, 7);
    }
    
}

/*
Here’s a detailed breakdown of the code line by line:

public class ew {
This declares a public class named ew. This class contains methods that perform calculations and output results.

public static void average(int a, int b) {
This defines a public static method named average that takes two parameters of type int, named a and b. 
The method does not return any value, indicated by the void return type.

int avg = (a + b) / 2;
Inside the average method, this line calculates the average of the two integers a and b by adding them together and dividing by 2. 
The result is stored in the variable avg.

System.out.println("The average is " + avg);
This line prints the calculated average to the console in the format "The average is [value]". It concatenates the string with the value of avg.

}
This closing brace indicates the end of the average method.

public static void main(String[] args) {
This is the main method, which serves as the entry point for the Java application. The execution of the program begins here.

average(4, 6);
This line calls the average method with the arguments 4 and 6. 
The method computes the average (which is 5) and prints "The average is 5" to the console.

System.out.println("HI");
This line prints the string "HI" to the console.

average(2, 7);
This line calls the average method again, this time with the arguments 2 and 7. 
The method computes the average (which is 4) and prints "The average is 4" to the console.

}
This closing brace indicates the end of the main method.

}
This closing brace indicates the end of the ew class.
*/