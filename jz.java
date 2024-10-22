/*
Comparison Between Heap Memory and Stack Memory
Feature                   Heap Memory                                         Stack Memory
Allocation	              Dynamic memory allocation	                          Static memory allocation
Storage	                  Objects and class instances	                      Local variables, method parameters
Size  	                  Generally larger	                                  Generally smaller
Access Speed	          Slower	                                          Faster
Garbage Collection	      Yes                                                 No
Lifetime	              Objects remain until garbage collected              Limited to method execution
Scope       	          Global (accessible from anywhere)	                  Local (accessible within method only)

Java handles memory management automatically through garbage collection, which helps reclaim heap memory by removing unreachable objects. 
However, understanding the implications of heap and stack memory is essential for efficient programming, 
as improper management can lead to memory leaks, stack overflow errors, or performance issues.
*/

class Persson {
    // Instance variables (stored in heap memory)
    String name;
    int age;

    // Constructor to initialize the Persson object
    public Persson(String name, int age) {
        this.name = name; // 'name' is stored in heap
        this.age = age;   // 'age' is stored in heap
    }

    // Method to display person's information
    public void displayInfo(String greeting) { // 'greeting' is a parameter stored in stack
        System.out.println(greeting + ", I am " + name + " and I am " + age + " years old.");
    }
}

public class jz {
    public static void main(String[] args) {
        // Local variable 'greeting' (stored in stack memory)
        String greeting = "Hello"; 
        
        // Creating a Person object (allocated in heap memory)
        Persson person = new Persson("Alice", 30); 
        
        // Calling method which uses stack memory for local variables
        person.displayInfo(greeting); // Output: Hello, I am Alice and I am 30 years old.
    }
}
    
/*
Explanation

Heap Memory Usage:
The Person class has instance variables name and age. These variables are stored in the heap because they belong to the Person object 
created with new Person(...). The Person object itself (person) is also stored in the heap.

Stack Memory Usage:
The greeting variable in the main method is a local variable and is stored in the stack memory.
The displayInfo method has a parameter greeting, which is also stored in the stack memory during the method execution.

Method Invocation:
When person.displayInfo(greeting) is called, a new stack frame is created for the displayInfo method. 
Inside this frame, the greeting parameter and the method's local variables (if any) are allocated in the stack.


Here's a line-by-line breakdown of the code:

class Persson {
Declares a class named Persson.

String name;
Declares an instance variable name of type String.

int age;
Declares an instance variable age of type int.

public Persson(String name, int age) {
Defines a constructor for the Persson class that takes two parameters: name and age.

this.name = name; // 'name' is stored in heap
Assigns the parameter name to the instance variable this.name. The instance variable is stored in heap memory.

this.age = age; // 'age' is stored in heap
Assigns the parameter age to the instance variable this.age. This instance variable is also stored in heap memory.

public void displayInfo(String greeting) {
Defines a method displayInfo that takes a String parameter greeting. This parameter will be stored in the stack.

System.out.println(greeting + ", I am " + name + " and I am " + age + " years old.");
Prints a message to the console that includes the greeting, the name, and the age of the person.

}
Ends the displayInfo method.

public class jz {
Declares a public class named jz, which contains the main() method.

public static void main(String[] args) {
Defines the main() method, which serves as the entry point of the program.

String greeting = "Hello";
Declares a local variable greeting and initializes it with the value "Hello". This variable is stored in the stack memory.

Persson person = new Persson("Alice", 30);
Creates a new Persson object using the constructor, passing the values "Alice" and 30 for the name and age, respectively. 
The object is allocated in heap memory.

person.displayInfo(greeting);
Calls the displayInfo method on the person object, passing the greeting variable as an argument. 
This results in the output: Hello, I am Alice and I am 30 years old.

}
Ends the main() method.

}
Ends the jz class.
*/