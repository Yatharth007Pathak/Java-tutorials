/*
This program initializes an array of strings (names) with the names "Ram", "Lakshman", "Bharat", and "Shatrughan". 
It uses two types of loops to print these names:
For loop: Prints each name with the prefix "Name is ".
For-each loop: Prints each name without a prefix.
*/

public class dw {

    public static void main(String[] args) {
        
        String names[] = {"Ram", "Lakshman", "Bharat", "Shatrughan"};

        for (int i = 0; i< names.length; i++) {
            System.out.println("Name is " + names[i]);
        }

        for (String name : names) {
            System.out.println(name);
        }

    }
}

/*
Here’s a line-by-line breakdown of the provided Java code:

public class dw {
Defines a public class named dw. In Java, classes serve as the blueprint for creating objects.

public static void main(String[] args) {
Declares the main method, which is the entry point of the Java program. 
It is public (accessible from anywhere), static (can be invoked without creating an instance of the class), and does not return a value (void). 
The String[] args parameter allows for command-line arguments.

String names[] = {"Ram", "Lakshman", "Bharat", "Shatrughan"};
Declares and initializes a String array named names with the values "Ram", "Lakshman", "Bharat", and "Shatrughan". 
This array contains 4 elements.

for (int i = 0; i< names.length; i++) {
Begins a traditional for loop that iterates over the names array. 
The loop variable i starts at 0 and increments by 1 in each iteration until it reaches the length of the array (4 elements in this case). 
The names.length ensures that the loop runs exactly 4 times, corresponding to the number of elements.

System.out.println("Name is " + names[i]);
Inside the loop, this line prints "Name is " followed by the current element of the names array (names[i]). 
This prints each name in the array along with the prefix "Name is".

}
Closes the traditional for loop.

for (String name : names) {
Begins a for-each loop that iterates over the names array. 
In each iteration, the variable name holds the value of the current element (a name from the array).

System.out.println(name);
Inside the for-each loop, this line prints the current element (name) of the names array to the console without any prefix. 
It prints each name one by one.

}
Closes the for-each loop.

}
Closes the main method.

}
Closes the class definition.
*/