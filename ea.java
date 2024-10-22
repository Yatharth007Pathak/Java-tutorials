public class ea {
    
    public static void main(String[] args) {
        
        int[][] marks = new int[4][3]; // Creates a 4x3 array

        marks[0][0] = 12;
        marks[0][1] = 81;
        marks[0][2] = 38;

        marks[1][0] = 28;
        marks[1][1] = 65;
        marks[1][2] = 44;
        
        marks[2][0] = 36;
        marks[2][1] = 89;
        marks[2][2] = 76;

        marks[3][0] = 98;
        marks[3][1] = 67;
        marks[3][2] = 52;

        System.out.println(marks[2][1]);
        System.out.println(marks[1][4]);

    }
}

/*
Here’s a breakdown of your code line by line:

public class ea {
This defines a public class named ea. A class in Java is a template for creating objects and containing methods.

public static void main(String[] args) {
This is the main method, the entry point of the Java program. The main method is called when the program starts execution.

int[][] marks = new int[4][3];
This creates a 2D integer array named marks with 4 rows and 3 columns. 
All elements of this array are initialized to 0 by default since it's an integer array.

marks[0][0] = 12;
Assigns the value 12 to the first row, first column of the marks array.

marks[0][1] = 81;
Assigns the value 81 to the first row, second column.

marks[0][2] = 38;
Assigns the value 38 to the first row, third column.

marks[1][0] = 28;
Assigns the value 28 to the second row, first column.

marks[1][1] = 65;
Assigns the value 65 to the second row, second column.

marks[1][2] = 44;
Assigns the value 44 to the second row, third column.

marks[2][0] = 36;
Assigns the value 36 to the third row, first column.

marks[2][1] = 89;
Assigns the value 89 to the third row, second column.

marks[2][2] = 76;
Assigns the value 76 to the third row, third column.

marks[3][0] = 98;
Assigns the value 98 to the fourth row, first column.

marks[3][1] = 67;
Assigns the value 67 to the fourth row, second column.

marks[3][2] = 52;
Assigns the value 52 to the fourth row, third column.

System.out.println(marks[2][1]);
This prints the value at the third row, second column of the marks array. In this case, it will print 89.

System.out.println(marks[1][4]);
This attempts to print the value at the second row, fifth column (marks[1][4]). 
Since the array only has 3 columns (index ranges from 0 to 2), this will cause an ArrayIndexOutOfBoundsException.
*/