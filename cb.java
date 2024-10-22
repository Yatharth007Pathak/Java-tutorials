// Find the maximum of three numbers using nested if statements

public class cb {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        int max;

        // Using nested if to find the maximum number
        if (a >= b) {
            if (a >= c) {
                max = a;  // a is greater than or equal to both b and c
            } else {
                max = c;  // c is greater than a but a is greater than or equal to b
            }
        } else {
            if (b >= c) {
                max = b;  // b is greater than or equal to both a and c
            } else {
                max = c;  // c is greater than b but b is greater than a
            }
        }

        System.out.println("The maximum number is: " + max);
    }
}