/*
IndexOutOfBoundsException in Java is a runtime exception that occurs when trying to access an invalid index in an array,string, or collection 
(like an ArrayList). This happens if the index is either negative or greater than or equal to the size of the array or collection

Common Causes ->
Accessing an array index that is out of bounds:
The index must be within the valid range: 0 to array.length - 1.

Accessing an index in a String:
Similar to arrays, the index in a string should be between 0 and string.length() - 1.

Accessing an invalid index in a collection:
For collections like ArrayList, the valid range is 0 to list.size() - 1.

Key Points
Arrays: If you try to access an index greater than array.length - 1 or less than 0, an ArrayIndexOutOfBoundsException will be thrown.
Strings: If you try to access an invalid character index, a StringIndexOutOfBoundsException will be thrown.
Collections: For collections like ArrayList, trying to access an invalid index results in an IndexOutOfBoundsException.
*/

public class ed {
    
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        try {
            // Attempt to access an invalid index
            System.out.println(numbers[5]); // Array length is 5, valid indices are 0 to 4
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}

/*
Here’s a detailed breakdown of the code line by line:

public class ed {
This declares a public class named ed. It defines the behavior and structure of the program.

public static void main(String[] args) {
This is the main method where the execution of the program starts. The method is required for any standalone Java application.

int[] numbers = {1, 2, 3, 4, 5};
This declares and initializes a 1D integer array named numbers. The array contains 5 elements: {1, 2, 3, 4, 5}. 
The valid indices for this array range from 0 to 4.

try {
This begins a try block, which is used to handle any potential exceptions that might occur within the block.

System.out.println(numbers[5]);
This attempts to print the value at index 5 in the numbers array. 
However, since the array has only 5 elements (with indices from 0 to 4), accessing index 5 will cause an ArrayIndexOutOfBoundsException.

} catch (ArrayIndexOutOfBoundsException e) {
This catch block handles the ArrayIndexOutOfBoundsException that occurs when trying to access an invalid index. 
If such an exception is thrown in the try block, the program jumps to this block.

System.out.println("Caught an ArrayIndexOutOfBoundsException: " + e.getMessage());
This prints a message to the console indicating that an ArrayIndexOutOfBoundsException was caught. 
The method e.getMessage() returns a description of the exception, which typically contains details about the invalid index.
*/