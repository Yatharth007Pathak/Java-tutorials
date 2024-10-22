/*
Heap memory is a portion of memory used for dynamic memory allocation, storing objects, and allows for global access but is slower and larger.
When you create an object using the new keyword, memory is allocated in the heap. It is managed by the garbage collector.
This area is used to store objects and class instances. Heap Memory is used for dynamic memory allocation. 

Key Characteristics of Heap Memory:
Dynamic Memory Allocation: Objects are allocated memory at runtime. You can create an object and allocate memory whenever you need it.
Garbage Collection: The JVM manages heap memory, and unused objects are automatically removed by the garbage collector, which frees up memory.
Global Access: Objects in the heap are accessible from anywhere in the application, 
as they are referenced by their references (pointers) in the stack or other objects.
Larger Size: The heap is typically larger than the stack, allowing for the storage of large objects and complex data structures.
Slower Access: Accessing data in the heap is slower compared to the stack because it involves dereferencing pointers.
*/


public class jx {
    
    public static void main(String[] args) {
        // Object creation allocates memory in the heap
        String str = new String("Hello, Heap!");
        System.out.println(str);
    }
}

/*
The program defines a class jx with a main() method.
Inside the main() method, a String object is created in the heap with the value "Hello, Heap!".
The program prints this value to the console, resulting in the output Hello, Heap!.


Here's a line-by-line breakdown of the code:

public class jx {
Declares a public class named jx.

public static void main(String[] args) {
Defines the main() method, which serves as the entry point of the program.

String str = new String("Hello, Heap!");
Creates a new String object in the heap memory with the value "Hello, Heap!". The reference to this object is assigned to the variable str.

System.out.println(str);
Prints the value of the str variable to the console. This line outputs: Hello, Heap!.

}
Ends the main() method.

}
Ends the jx class.
*/