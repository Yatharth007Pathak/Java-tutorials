// Find the maximum of three numbers using a nested ternary operator

public class cc {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        // Using ternary operator to find the maximum number
        int max = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);

        System.out.println("The maximum number is: " + max);
    }
}

/*
nested ternary operator. Here's how it works:
int max = (a >= b) ? ((a >= c) ? a : c) : ((b >= c) ? b : c);

Breakdown:

First ternary operator: (a >= b) ?
This checks if a is greater than or equal to b.
If true, it then moves to the next part: ((a >= c) ? a : c).
If false, it evaluates the second condition: ((b >= c) ? b : c).

Nested ternary operators:
((a >= c) ? a : c): This checks if a is greater than or equal to c. If true, a is the largest; otherwise, c is the largest.
((b >= c) ? b : c): If the first condition is false, we check if b is greater than or equal to c. 
If true, b is the largest; otherwise, c is the largest.

This is called a nested ternary operator because one ternary operator is placed inside another ternary operator, 
allowing you to handle multiple conditions in a compact way.
*/