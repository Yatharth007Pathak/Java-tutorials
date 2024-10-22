public class ax {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // Using ternary operator to find the larger number
        int max = (a > b) ? a : b;

        System.out.println("The larger number is: " + max);
    }
}

/*

In Java, the conditional (ternary) operator is a shorthand way of writing simple if-else statements. 
It's the only operator in Java that takes three operands. 
It allows you to evaluate a boolean expression and return one of two values depending on whether the expression is true or false.

Syntax:
condition ? expression1 : expression2;
condition: A boolean expression that evaluates to either true or false.
expression1: The result if the condition is true.
expression2: The result if the condition is false.

How It Works:
If the condition is true, expression1 is executed, and its result is returned.
If the condition is false, expression2 is executed, and its result is returned.

Key Points:
The conditional (ternary) operator is a compact and concise alternative to an if-else statement.
It is mainly used for simple conditions where a quick decision between two values is needed.
It improves readability for straightforward conditions but may reduce clarity if overused or for complex conditions.
*/