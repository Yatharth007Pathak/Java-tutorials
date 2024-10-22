/*
Calling a method in Java involves invoking it to execute the code defined within that method.

Instance Methods: Called on an object. Requires creating an instance of the class.
Static Methods: Called on the class itself. No instance is needed.
Methods with Parameters: Call them by passing the required arguments.
Methods with Return Values: Call them and store the returned value in a variable.
*/

public class er {

    public static void main(String[] args) {
        
        System.out.println(1);
        System.out.println(2);
        greet();
        System.out.println(3);
        System.out.println(4);
    }

    static void greet() {
        System.out.println(5);
        System.out.println("Hello!");
        System.out.println(6);
    }
    
}

/*
Here’s a detailed breakdown of the code line by line:

public class er {
This declares a public class named er. This class contains the main method and a static method called greet.

public static void main(String[] args) {
This is the main method, which serves as the entry point for the Java application. The execution of the program begins here.

System.out.println(1);
This line prints the integer 1 to the console.

System.out.println(2);
This line prints the integer 2 to the console.

greet();
This calls the static method greet, which is defined later in the class. When this method is called, execution jumps to the greet method.

System.out.println(3);
This line will execute after the greet method has finished executing, printing the integer 3 to the console.

System.out.println(4);
This line prints the integer 4 to the console.

static void greet() {
This defines a static method named greet. This method does not take any parameters and does not return any value.

System.out.println(5);
This line prints the integer 5 to the console when the greet method is called.

System.out.println("Hello!");
This line prints the string "Hello!" to the console.

System.out.println(6);
This line prints the integer 6 to the console.

}
This closing brace indicates the end of the greet method.

}
This closing brace indicates the end of the er class.
*/