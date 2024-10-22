/*
Conditional statements in Java are used to control the flow of a program by making decisions based on certain conditions. 
These statements allow a program to execute different code blocks depending on whether a condition is true or false. 
Java offers several types of conditional statements:
if       if-else       else if       Nested if       switch       Ternary operator

Conditional statements guide the flow of execution based on different conditions.
They are used to make decisions in the program, enabling different outputs or behaviors depending on the inputs or states at runtime.

if: Executes a block of code if the specified condition is true.
if-else: Executes one block of code if the condition is true and another block if the condition is false.
else if: Tests multiple conditions in sequence, executing a block if its condition is true, after failing previous ones.
Nested if: An if statement inside another if statement, allowing multiple layers of conditions.
switch: Executes different blocks of code based on the value of a variable or expression, (an alternative to multiple if-else statements.)
Ternary operator: A shorthand for if-else that returns one of two values based on a condition, written as condition ? trueValue : falseValue.
*/

public class bs {

    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int day = 3;

        // if statement
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        // if-else statement
        if (x > 15) {
            System.out.println("x is greater than 15");
        } else {
            System.out.println("x is less than or equal to 15");
        }

        // else if statement
        if (x > 15) {
            System.out.println("x is greater than 15");
        } else if (x == 10) {
            System.out.println("x is equal to 10");
        } else {
            System.out.println("x is less than 10");
        }

        // Nested if statement
        if (x == 10) {
            if (y == 20) {
                System.out.println("x is 10 and y is 20");
            }
        }

        // switch statement
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }

        // Ternary operator
        int a = 5, b = 10;
        int max = (a > b) ? a : b;
        System.out.println("The maximum value is: " + max);
    }
}

/*
Here’s a line-by-line breakdown of the Java code demonstrating various conditional statements:

1. Basic structure
public class bs {
This defines a public class named bs, the container for the program.
public static void main(String[] args) {
The main method, where program execution begins.

2. Variable Initialization
int x = 10; int y = 20; int day = 3;
Three integer variables x, y, and day are initialized with values 10, 20, and 3, respectively.

3. If statement
if (x > 5) {
This checks if x is greater than 5. Since x = 10, the condition is true, and the program prints:
x is greater than 5.

4. If-else statement
if (x > 15) {
This checks if x is greater than 15. Since x = 10, the condition is false, so the program prints:
x is less than or equal to 15 (the else part is executed).

5. Else-if statement
if (x > 15) {
This checks if x is greater than 15, which is false. else if (x == 10) {
Then it checks if x equals 10, which is true. The program prints:
x is equal to 10.

6. Nested if statement
if (x == 10) {
This checks if x equals 10, which is true. if (y == 20) {
Inside the outer if, this checks if y equals 20, which is also true. The program prints:
x is 10 and y is 20.

7. Switch statement
switch (day) {
The switch statement evaluates the value of day (which is 3). case 3:
When day equals 3, it prints:
Wednesday.
The break statement ends the switch execution after the correct case is found.

8. Ternary operator
int max = (a > b) ? a : b;
This uses the ternary operator to find the maximum of a and b. Since b = 10 is greater than a = 5, the value of max becomes b.
The program prints:
The maximum value is: 10.

Summary of Output:
x is greater than 5
x is less than or equal to 15
x is equal to 10
x is 10 and y is 20
Wednesday
The maximum value is: 10
*/