import java.util.Scanner;

public class bg {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = sc.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = sc.nextInt();
        int result = firstNumber + secondNumber;
        System.out.println("result is " + result); 

        sc.close();
    }    
}

/*
Here’s a line-by-line breakdown of the provided Java code:

import java.util.Scanner;
This imports the Scanner class from the java.util package. The Scanner class is used to read user input from the console.

public class bg {
This defines a public class named bg. In Java, every program must contain at least one class, 
which serves as the container for the program’s code.

public static void main(String[] args) {
This is the main method, which is the entry point of the program. 
It’s declared static so that it can be called without creating an instance of the class, and it doesn’t return any value (void).

Scanner sc = new Scanner(System.in);
A Scanner object named sc is created to take input from the user. The System.in argument tells the scanner to read input from the console.

System.out.print("Enter first number: ");
This prints the message "Enter first number: " to prompt the user to input a number. 
The print method is used here so that the cursor stays on the same line after the message is printed.

int firstNumber = sc.nextInt();
This reads the next integer input from the user and stores it in the variable firstNumber.

System.out.print("Enter second number: ");
This prints the message "Enter second number: " to prompt the user to input another number.

int secondNumber = sc.nextInt();
This reads the second integer input from the user and stores it in the variable secondNumber.

int result = firstNumber + secondNumber;
This adds the two numbers entered by the user (stored in firstNumber and secondNumber) and stores the result in the variable result.

System.out.println("result is " + result);
This prints the message "result is " followed by the value of result, which is the sum of the two numbers.

sc.close();
This closes the Scanner object to release the associated system resources, indicating that no more input is required.

}
This closes the main method and the class definition, marking the end of the program.
*/