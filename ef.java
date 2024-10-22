// When using ArrayList or other collections, an IndexOutOfBoundsException occurs if you try to access an element at an invalid index.

import java.util.ArrayList;

public class ef {
    
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");

        try {
            // Attempt to access an invalid index
            System.out.println(list.get(2)); // Valid indices are 0 and 1
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
        }
    }
}

/*
Here's a detailed breakdown of the code:

import java.util.ArrayList;
This imports the ArrayList class from the java.util package, which allows the use of dynamic arrays (resizable arrays) in Java.

public class ef {
This declares a public class named ef, which contains the main logic of the program.

public static void main(String[] args) {
This is the main method, the entry point of the program where execution begins.

ArrayList<String> list = new ArrayList<>();
This creates a new ArrayList of String type named list. The ArrayList can dynamically grow as elements are added.

list.add("Apple");
This adds the string "Apple" to the list. Now, the ArrayList contains one element: {"Apple"}.

list.add("Banana");
This adds the string "Banana" to the list. Now, the ArrayList contains two elements: {"Apple", "Banana"}.

try {
This starts a try block, which is used to handle potential exceptions that may occur within this block of code.

System.out.println(list.get(2));
This tries to access the element at index 2 of the ArrayList. Since the list has only two elements, 
with valid indices 0 and 1, trying to access index 2 will throw an IndexOutOfBoundsException.

} catch (IndexOutOfBoundsException e) {
This catch block catches the IndexOutOfBoundsException that occurs when an invalid index is accessed in the ArrayList. 
If this exception is thrown, the program jumps to this block to handle it.

System.out.println("Caught an IndexOutOfBoundsException: " + e.getMessage());
This prints a message indicating that an IndexOutOfBoundsException was caught. 
The method e.getMessage() returns a message describing the exception, typically stating the invalid index.
*/