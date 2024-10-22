// Program that declares and initializes an integer array, assigns values to specific indices, and prints the values of elements to the console.

public class ds {
    
    public static void main(String[] args) {
        
        // Declare an integer array named 'age'
        int age[];  
        
        // Initialize the array with a capacity of 5 elements
        age = new int[5];  

        // Assign values to the first two elements of the array
        age[0] = 5;  
        age[1] = 7;  

        // Print the value of the first element (5)
        System.out.println(age[0]);  
        
        // Print the value of the second element (7)
        System.out.println(age[1]);  
        
        // Print the value of the third element (default value, which is 0)
        System.out.println(age[2]); 

        // Print the length of age array (5)
        System.out.println(age.length);
    }
}


/*
Here’s a line-by-line breakdown of the provided Java code:

public class ds {
Defines a public class named ds. In Java, classes serve as blueprints for creating objects.

public static void main(String[] args) {
Declares the main method, which is the entry point of the Java program. 
It is public (accessible from anywhere), static (can be called without creating an instance of the class), and does not return a value (void). 
The String[] args parameter allows for command-line arguments.

int age[];
Declares an integer array named age. At this point, the array is not yet initialized and does not hold any values.

age = new int[5];
Initializes the age array with a capacity of 5 elements. All elements in the array are automatically initialized to their default value of 0.

age[0] = 5;
Assigns the value 5 to the first element of the age array (index 0).

age[1] = 7;
Assigns the value 7 to the second element of the age array (index 1).

System.out.println(age[0]);
Prints the value of the first element of the age array (which is 5) to the console.

System.out.println(age[1]);
Prints the value of the second element of the age array (which is 7) to the console.

System.out.println(age[2]);
Prints the value of the third element of the age array (which has not been assigned a value). 
Since it is not explicitly set, it retains its default value of 0. This line will print 0 to the console.

System.out.println(age.length);
Prints the length of age array (which is 5) to the console.

}
Closes the main method.

}
Closes the class definition.
*/