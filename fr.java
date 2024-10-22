/*
Java's String class provides many useful methods for manipulating strings. Here are some commonly used ones:

length(): Returns the length of the string.
charAt(index): Returns the character at the specified index.
substring(start, end): Returns a substring from the start index to the end index (exclusive).
contains(CharSequence): Checks if the string contains the specified sequence of characters.
equals(Object): Compares two strings for equality.
equalsIgnoreCase(String): Compares two strings, ignoring case differences.
toUpperCase(): Converts the string to uppercase
toLowerCase(): Converts the string to lowercase.
concat(String): Concatenates the specified string to the end of this string.
replace(char oldChar, char newChar): Replaces occurrences of the specified character with a new character.
replace(String oldStr, String newStr): Replaces occurrences of the specified string with a new string.
trim(): Removes leading and trailing spaces.
split(String regex): Splits the string based on the specified regular expression and returns an array of strings.
*/

import java.util.Arrays;

public class fr {

    public static void main(String[] args) {
        
        String str = "Hello";
        int length = str.length();
        System.out.println(length);

        char ch = str.charAt(1); // Outputs: 'e'
        System.out.println(ch);

        String subStr = str.substring(1, 4); // Outputs: "ell"
        System.out.println(subStr);

        boolean hasHello = str.contains("ell"); // Outputs: true
        System.out.println(hasHello);

        String str2 = "Hello";
        boolean isEqual = str.equals(str2); // Outputs: true
        System.out.println(isEqual);

        boolean isEqualIgnoreCase = str.equalsIgnoreCase("hello"); // Outputs: true
        System.out.println(isEqualIgnoreCase);

        String upperStr = str.toUpperCase(); // Outputs: "HELLO"
        System.out.println(upperStr);

        String lowerStr = str.toLowerCase(); // Outputs: "hello"
        System.out.println(lowerStr);

        String greeting = str.concat(", World!"); // Outputs: "Hello, World!"
        System.out.println(greeting);

        String replacedStr = str.replace('e', 'a'); // Outputs: "Hallo"
        System.out.println(replacedStr);

        String ReplacedStr = str.replace("Hello", "Namaste"); // Output: "Namaste"
        System.out.println(ReplacedStr);

        String spacedStr = "   Hello   ";
        String trimmedStr = spacedStr.trim(); // Outputs: "Hello"
        System.out.println(trimmedStr);

        String csv = "one,two,three";
        String[] parts = csv.split(","); // Outputs: ["one", "two", "three"]
        System.out.println(Arrays.toString(parts));
        
    }
}