// We can loop through an array using a for loop or an enhanced for loop.

public class dl {

    public static void main(String[] args) {

        int[] moreNumbers = {1, 2, 3};
        
        // Traditional for loop
        for (int i = 0; i < moreNumbers.length; i++) {
            System.out.println(moreNumbers[i]);
        }

        // Enhanced for loop
        for (int number : moreNumbers) {
            System.out.println(number);
        }

    }
}

/*
Here’s a line-by-line breakdown of the provided Java code:

public class dk {
Defines a public class named dk. In Java, classes are used as templates for creating objects.

public static void main(String[] args) {
Declares the main method, which is the entry point of the Java application. It is public (accessible from anywhere), 
static (can be called without creating an instance of the class), and does not return a value (void). 
The String[] args parameter allows for command-line arguments.

int[] moreNumbers = {1, 2, 3};
Declares and initializes an integer array named moreNumbers with three elements: 1, 2, and 3.

// Traditional for loop
A comment indicating that the following code block uses a traditional for loop.

for (int i = 0; i < moreNumbers.length; i++) {
Starts a traditional for loop. 
It initializes the loop variable i to 0 and continues as long as i is less than the length of the moreNumbers array.

System.out.println(moreNumbers[i]);
Inside the for loop, this line prints the element at index i of the moreNumbers array to the console.

}
Closes the traditional for loop that iterates through the elements of the moreNumbers array.

// Enhanced for loop
A comment indicating that the following code block uses an enhanced for loop (for-each loop).

for (int number : moreNumbers) {
Begins an enhanced for loop that iterates over each element in the moreNumbers array. In this loop, each element is referred to as number.

System.out.println(number);
Inside the enhanced for loop, this line prints the current element (number) to the console.

}
Closes the enhanced for loop that prints the elements of the moreNumbers array.

}
Closes the main method.

}
Closes the class definition.
*/