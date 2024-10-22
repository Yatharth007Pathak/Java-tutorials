/*
else if Statement
The else if statement is used when multiple conditions need to be checked. 
If the first if condition is false, it checks the next condition with else if. This can be repeated for multiple conditions.

Syntax:
if (condition1) {
    // Code if condition1 is true
} else if (condition2) {
    // Code if condition2 is true
} else {
    // Code if both conditions are false
}
*/

public class bv {
    
    public static void main(String[] args) {
        int x = 10;

        // Check multiple conditions
        if (x > 15) {
            System.out.println("x is greater than 15");
        } else if (x == 10) {
            System.out.println("x is equal to 10");
        } else {
            System.out.println("x is less than 10");
        }
    }
}

/*
Here’s a breakdown of the Java code that checks multiple conditions using if, else if, and else statements:

public class bv {
This defines a public class named bv, which is the container for the program.

public static void main(String[] args) {
This is the main method, the entry point where the program begins execution. 
The method is static so it can be run without creating an object of the class.

int x = 10;
A variable x is declared and initialized with the value 10.

if (x > 15) {
This is the first condition in the if statement. It checks whether x is greater than 15.

If x is greater than 15, the program will print "x is greater than 15".
In this case, x is 10, so this condition is false, and the program skips to the next condition.

else if (x == 10) {
This checks the second condition, whether x is equal to 10.
Since x is indeed 10, this condition is true, and the program executes the statement inside this block, printing "x is equal to 10".

else {
This block of code is executed if none of the previous conditions are true.
Since the second condition was true, this block is skipped in this execution.

System.out.println("x is equal to 10");
The program prints "x is equal to 10" because the condition x == 10 is true.

}
This closes the main method and the class definition.

Output:
Since x is equal to 10, the output will be:
x is equal to 10.

Explanation:
The code checks three conditions:
If x is greater than 15 (which it’s not).
If x is equal to 10 (which is true).
If neither of the above conditions is true, it will execute the else block (which is skipped in this case).
*/