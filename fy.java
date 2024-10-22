// This example shows how to concatenate strings, find the length, and access characters using charAt().

public class fy {
    
    public static void main(String[] args) {
        String firstName = "John";
        String lastName = "Doe";

        // Concatenating strings using concat() method
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println("Full Name: " + fullName); // Output: John Doe

        // Finding the length of the string
        int length = fullName.length();
        System.out.println("Length of Full Name: " + length); // Output: 8

        // Accessing a character at a specific index using charAt()
        char character = fullName.charAt(3);
        System.out.println("Character at index 3: " + character); // Output: n
    
    }
}