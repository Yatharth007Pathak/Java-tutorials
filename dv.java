// We can also use the for-each loop for arrays of other types like String

public class dv {
    
    public static void main(String[] args) {
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // Using for-each loop to iterate over the array
        System.out.println("Fruits in the array:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    
    }
}

/*
Here’s a line-by-line breakdown of the provided Java code:

public class ForEachStringExample {
Defines a public class named ForEachStringExample. In Java, a class is a blueprint for creating objects.

public static void main(String[] args) {
Declares the main method, which is the entry point of the Java program. 
It is public (accessible from anywhere), static (can be invoked without creating an instance of the class), and does not return a value (void). 
The String[] args parameter allows for command-line arguments.

String[] fruits = {"Apple", "Banana", "Cherry"};
Declares and initializes a String array named fruits with the values "Apple", "Banana", and "Cherry". 
The size of the array is determined by the number of elements provided (3 elements in this case).

System.out.println("Fruits in the array:");
Prints the string "Fruits in the array:" to the console, indicating that the following output will list the fruit names stored in the array.

for (String fruit : fruits) {
Begins a for-each loop that iterates over the elements of the fruits array. 
In each iteration, the variable fruit holds the value of the current element (a fruit name).

System.out.println(fruit);
Inside the for-each loop, this line prints the current element (fruit) of the fruits array to the console. 
It prints each fruit name one by one.

}
Closes the for-each loop.

}
Closes the main method.

}
Closes the class definition.
*/