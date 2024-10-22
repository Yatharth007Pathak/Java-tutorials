// Pascal's Triangle Pattern

public class gh {
    
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 0; i < rows; i++) {
            int number = 1;
            System.out.printf("%" + (rows - i) * 2 + "s", "");
            for (int j = 0; j <= i; j++) {
                System.out.printf("%4d", number);
                number = number * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

/*
Here’s a breakdown of the provided Java code, line by line:

public class gh {: This line defines a public class named gh. In Java, every application must have at least one class definition.

public static void main(String[] args) {: This is the main method, which serves as the entry point for the Java application. 

int rows = 5;: This line declares an integer variable named rows and initializes it with the value 5. 
This variable determines the number of rows for the Pascal's Triangle that will be printed.

for (int i = 0; i < rows; i++) {: This is the outer for loop that iterates through each row of the triangle. 
It starts with i = 0 and continues until i is less than rows (i.e., 5), incrementing i by 1 in each iteration.

int number = 1;: This line initializes an integer variable named number to 1. 
This variable will hold the value of the current element in the row of Pascal's Triangle.

System.out.printf("%" + (rows - i) * 2 + "s", "");: This line prints leading spaces to center-align the numbers in the triangle. 
The number of spaces printed is calculated based on the current row i to create a pyramid shape.

for (int j = 0; j <= i; j++) {: This is the inner for loop that iterates through the elements of the current row of the triangle. 
It starts with j = 0 and continues until j is less than or equal to i, incrementing j by 1 in each iteration.

System.out.printf("%4d", number);: This line prints the current value of number, formatted to occupy 4 character spaces. 
This helps align the numbers neatly in columns.

number = number * (i - j) / (j + 1);: This line updates the value of number to compute the next element in the current row of Pascal's Triangle.
The formula used here is derived from the properties of binomial coefficients:

It multiplies the current number by (i - j) and then divides by (j + 1) to obtain the next number in the row.
}: This closing brace marks the end of the inner for loop.

System.out.println();: This line moves the cursor to the next line after completing the inner loop, 
allowing the next row of Pascal's Triangle to be printed.

}: This closing brace marks the end of the outer for loop.

}: This closing brace marks the end of the main method.

}: This closing brace marks the end of the class definition.
*/