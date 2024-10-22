import java.util.Scanner;

public class fq {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        String firstName = sc.nextLine();

        System.out.println("Enter your last name: ");
        String lastName = sc.nextLine();

        System.out.println("Your full name is " + firstName + " " + lastName);

    }   
}

/*
Here’s a breakdown of the provided Java code, line by line:

import java.util.Scanner;: This line imports the Scanner class from the java.util package, 
allowing the program to read input from the user via the console.

public class fq {: This line defines a public class named fq. In Java, each application must have at least one class definition.

public static void main(String[] args) {: This is the main method, which serves as the entry point for the Java application. 
The method is declared as public (accessible from anywhere), static (can be called without creating an instance of the class),
 and it takes an array of String arguments.

Scanner sc = new Scanner(System.in);: This line creates a new Scanner object named sc, 
which is initialized to read input from the standard input stream (usually the keyboard).

System.out.println("Enter your first name: ");: This line prints the prompt "Enter your first name: " to the console, 
instructing the user to provide their first name.

String firstName = sc.nextLine();: This line reads a line of text input from the user (first name) and stores it in the variable firstName.

System.out.println("Enter your last name: ");: This line prints the prompt "Enter your last name: " to the console, 
instructing the user to provide their last name.

String lastName = sc.nextLine();: This line reads another line of text input from the user (last name) and stores it in the variable lastName.

System.out.println("Your full name is " + firstName + " " + lastName);: 
This line concatenates the strings "Your full name is ", firstName, a space, and lastName, and prints the full name to the console.

}: This closing brace marks the end of the main method.

}: This closing brace marks the end of the class definition.
*/