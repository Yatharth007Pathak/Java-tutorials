/*
Stack memory is used for static memory allocation, storing method execution context, and local variables, providing faster access but
with limited scope and size. and is the area where method execution occurs. It stores local variables, method parameters, and return addresses.

Key Characteristics of Stack Memory:
Static Memory Allocation: Memory is allocated and deallocated in a last-in, first-out (LIFO) manner. 
When a method is called, a new block is created on the stack, and when the method returns, that block is removed.
Limited Size: Stack memory is smaller compared to heap memory. 
The size of the stack is generally predetermined and can lead to a stack overflow error if it exceeds its limit (e.g., due to deep recursion).
Fast Access: Accessing data in the stack is faster than in the heap because the memory management follows the LIFO principle, 
making it easier to retrieve method calls and local variables.
Scope Limitations: Variables stored in the stack are local to the method that created them. 
Once the method execution is complete, the stack frame is removed, and the memory is reclaimed.
*/

public class jy {
    public static void main(String[] args) {
        int num = 10; // num is stored in the stack
        display(num); // Method call, creates a new stack frame
    }

    static void display(int number) {
        System.out.println("Number: " + number); // number is also in the stack
    }
}

/*
The program defines a class jy with a main() method and a static method display().
In the main() method, an integer variable num is created and initialized with the value 10.
The display() method is called with num as an argument, creating a new stack frame.
The display() method prints the value of number, which is the parameter received from num, resulting in the output Number: 10.


Here's a line-by-line breakdown of the code:

public class jy {
Declares a public class named jy.

public static void main(String[] args) {
Defines the main() method, which serves as the entry point of the program.

int num = 10; // num is stored in the stack
Declares an integer variable num and initializes it with the value 10. This variable is stored in the stack memory.

display(num); // Method call, creates a new stack frame
Calls the display method, passing num as an argument. This action creates a new stack frame for the method call, 
where the method's local variables will be stored.

static void display(int number) {
Defines a static method named display that takes one parameter, number, of type int.

System.out.println("Number: " + number); // number is also in the stack
Prints the value of the number parameter to the console. This value is also stored in the stack memory, 
specific to the display method's stack frame.

}
Ends the display method.

}
Ends the main() method.

}
Ends the jy class.
*/