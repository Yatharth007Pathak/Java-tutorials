// Input 3 numbers and find maximum number

import java.util.Scanner;

public class bz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for three numbers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Finding the maximum using if-else
        int max;

        if (num1 >= num2 && num1 >= num3) {
            max = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            max = num2;
        } else {
            max = num3;
        }

        scanner.close();

        // Output the maximum number
        System.out.println("The maximum number is: " + max);
    }
}
