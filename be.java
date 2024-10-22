/*
In Java, the Scanner class is used to get user input, and it belongs to the java.util package. 
It is commonly used for reading input from various sources like the console, files, or streams. 
In order to use Scanner, we need to import java.util.Scanner package.
The Scanner class is versatile and can also read input from files or other streams 
by passing a File object or InputStream to the Scanner constructor.

It is recommended to close the scanner object once the input is taken using the close() method.
*/

import java.util.Scanner;

public class be {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is: " + age);

        sc.close();
    }    
}

/*
Here’s a line-by-line breakdown of the code:

import java.util.Scanner;
This line imports the Scanner class from the java.util package, which allows the program to take user input from the console.

public class be {
The code defines a public class named be. In Java, every program must have at least one class, and this is where the execution starts.

public static void main(String[] args) {
This is the main method, where the program begins execution. It’s static so that it can run without creating an instance of the class, 
and void indicates it doesn’t return any value.

Scanner sc = new Scanner(System.in);
A Scanner object sc is created to read input from the console (System.in). This object will be used to take the user's input.

System.out.println("Enter your age: ");
This prints the prompt "Enter your age: " to the console, asking the user to input their age in the next line.

int age = sc.nextInt();
This line reads the next integer input provided by the user using the Scanner object and stores it in the variable age.

System.out.println("Your age is: " + age);
This prints the message "Your age is: " followed by the value stored in the age variable, showing the user the inputted age.

sc.close();
This closes the Scanner object to prevent resource leaks, indicating the end of input operations.

}
This marks the end of the main method and the class.
*/