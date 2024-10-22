// Floyd's Triangle Pattern

public class gi {
    
    public static void main(String[] args) {
        int rows = 5;
        int number = 1;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
    }
}

/*
Here’s a breakdown of the provided Java code, line by line:

public class gi {: This line defines a public class named gi. In Java, every application must have at least one class definition.

public static void main(String[] args) {: This is the main method, which serves as the entry point for the Java application. 

int rows = 5;: This line declares an integer variable named rows and initializes it with the value 5. 
This variable determines the number of rows that will be printed in the pattern.

int number = 1;: This line initializes an integer variable named number to 1. 
This variable will hold the current number to be printed, starting from 1 and incrementing with each printed number.

for (int i = 1; i <= rows; i++) {: This is the outer for loop that iterates through each row of the pattern. 
It starts with i = 1 and continues until i is less than or equal to rows (i.e., 5), incrementing i by 1 in each iteration.

for (int j = 1; j <= i; j++) {: This is the inner for loop that iterates through the columns in the current row. 
It starts with j = 1 and continues until j is less than or equal to i, incrementing j by 1 in each iteration.

System.out.print(number + " ");: This line prints the current value of number, followed by a space. 
This prints the number to the console for the current position in the row.

number++;: This line increments the value of number by 1, preparing it for the next printed number in the next column.

}: This closing brace marks the end of the inner for loop.

System.out.println();: This line moves the cursor to the next line after completing the inner loop, 
allowing the next row of numbers to be printed.

}: This closing brace marks the end of the outer for loop.

}: This closing brace marks the end of the main method.

}: This closing brace marks the end of the class definition.
*/