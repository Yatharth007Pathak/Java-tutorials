public class af {
    
    public static void main(String[] args) {

        int age = 20;
        double marks = 96.8;
        float pi = 3.14f;
        char letter = 'A';

        System.out.println(age);
        System.out.println(marks);
        System.out.println(pi);
        System.out.println(letter);
    }
}



/*
Rules for naming variables in java:-
Java is case-sensitive. Hence, age and AGE are two different variables.
Variables must start with either a letter or underscore or a dollar sign.
Variable names can't use whitespace.
Variable names cannot be a keyword.
*/

/*
Here's a line-by-line explanation of the code:

public class af {
This line declares a public class named af. 
In Java, the class is a blueprint for creating objects and public means this class can be accessed from other classes.

public static void main(String[] args) {
This line defines the main method, which is the entry point of any Java application. 
public means the method can be accessed from outside the class, static means the method belongs to the class rather than an instance, 
void indicates the method does not return a value, and String[] args is an array of String objects used for command-line arguments.

int age = 20;
This line declares an integer variable named age and initializes it with the value 20. 
The int keyword specifies that the variable will hold integer values.

double marks = 96.8;
This line declares a variable named marks of type double and initializes it with the value 96.8. 
The double type is used for decimal values with double precision.

float pi = 3.14f;
This line declares a variable named pi of type float and initializes it with the value 3.14. 
The f suffix is used to specify that the number is a float rather than a double, as float has single precision.

char letter = 'A';
This line declares a variable named letter of type char and initializes it with the character 'A'. 
The char type is used to store a single character.

System.out.println(age);
This line prints the value of the age variable (20) to the console, followed by a new line.

System.out.println(marks);
This line prints the value of the marks variable (96.8) to the console, followed by a new line.

System.out.println(pi);
This line prints the value of the pi variable (3.14) to the console, followed by a new line.

System.out.println(letter);
This line prints the value of the letter variable ('A') to the console, followed by a new line.

}
This closing brace signifies the end of the main method.

}
This closing brace signifies the end of the af class.
*/