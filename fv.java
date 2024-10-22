/*
toCharArray(): Converts the string into a character array.
valueOf() (Static Method): Returns the string representation of the specified value (e.g., int, float, boolean).
join(CharSequence delimiter, CharSequence... elements): Joins the given elements into a single string with the specified delimiter.
compareTo(String anotherString): Compares two strings lexicographically. 
Returns 0 if equal, a negative value if this string is lexicographically less, or a positive value if greater.
compareToIgnoreCase(String anotherString): Compares two strings lexicographically, ignoring case differences.
contains(CharSequence s): Checks if the string contains the specified character sequence.
getBytes(): Encodes the string into a sequence of bytes using the platform's default charset.
regionMatches(int toffset, String other, int ooffset, int len): Tests if two string regions are equal.
substring(int beginIndex): Returns a new string that is a substring of this string, from beginIndex to the end.
substring(int beginIndex, int endIndex): Returns a new string that is a substring of this string, between beginIndex and endIndex.
repeat(int count) (Java 11 and later): Returns a new string consisting of the string repeated count times.
*/

import java.util.Arrays;

public class fv {

    public static void main(String[] args) {
        
        String str = "Hello World";
        char[] charArray = str.toCharArray(); // Outputs: ['H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd']
        for(char chari: charArray) {
            System.out.println(chari);
        }

        String intStr = String.valueOf(123); // Outputs: "123"
        String boolStr = String.valueOf(true); // Outputs: "true"
        System.out.println(intStr);
        System.out.println(boolStr);

        String joined = String.join(", ", "One", "Two", "Three"); // Outputs: "One, Two, Three"
        System.out.println(joined);

        String str1 = "Apple";
        String str2 = "Banana";
        int comparison = str1.compareTo(str2); // Outputs: negative value since "Apple" is less than "Banana"
        System.out.println(comparison);

        String str3 = "apple";
        int comparisonIgnoreCase = str1.compareToIgnoreCase(str3); // Outputs: 0
        System.out.println(comparisonIgnoreCase);

        boolean containsWord = str.contains("World"); // Outputs: true
        System.out.println(containsWord);

        byte[] bytes = str.getBytes(); // Outputs: [72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100]
        System.out.println(Arrays.toString(bytes));

        String str4 = "Hello Universe";
        boolean regionMatches = str.regionMatches(0, str4, 0, 5); // Outputs: true
        System.out.println(regionMatches);

        String subStr1 = str.substring(6); // Outputs: "World"
        System.out.println(subStr1);

        String subStr2 = str.substring(0, 5); // Outputs: "Hello"
        System.out.println(subStr2);

        String repeated = str.repeat(3); // Outputs: "Hello WorldHello WorldHello World"
        System.out.println(repeated);

    }
}