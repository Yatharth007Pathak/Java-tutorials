/*
Java's String class provides a wide variety of methods to perform different operations on strings. 
Here are some additional and useful methods that are part of the Java String class, along with examples to understand how they work:

startsWith(String prefix): Checks if the string starts with the given prefix.
endsWith(String suffix): Checks if the string ends with the given suffix.
indexOf(int ch): Returns the index of the first occurrence of the specified character.
indexOf(String str): Returns the index of the first occurrence of the specified substring.
lastIndexOf(int ch): Returns the index of the last occurrence of the specified character.
lastIndexOf(String str): Returns the index of the last occurrence of the specified substring.
isEmpty(): Checks if the string is empty (length is 0).
isBlank(): Checks if the string is empty or contains only white spaces.
matches(String regex): Tests if the string matches the given regular expression.
replaceFirst(String regex, String replacement): Replaces the first substring that matches the given regular expression.
replaceAll(String regex, String replacement): Replaces each substring of the string that matches the given regular expression 
with the specified replacement.
*/

public class ft {

    public static void main(String[] args) {
        
        String str = "Hello World";
        boolean startsWith = str.startsWith("Hello"); // Outputs: true
        System.out.println(startsWith);

        boolean endsWith = str.endsWith("World"); // Outputs: true
        System.out.println(endsWith);

        int index1 = str.indexOf('o'); // Outputs: 4
        System.out.println(index1);
        
        int index2 = str.indexOf("World"); // Outputs: 6
        System.out.println(index2);

        int lastIndex = str.lastIndexOf('o'); // Outputs: 7
        System.out.println(lastIndex);

        String emptyStr = "";
        boolean isEmpty = emptyStr.isEmpty(); // Outputs: true
        System.out.println(isEmpty);

        String blankStr = "   ";
        boolean isBlank = blankStr.isBlank(); // Outputs: true
        System.out.println(isBlank);

        String email = "example@domain.com";
        boolean isEmail = email.matches("\\w+@\\w+\\.\\w+"); // Outputs: true
        System.out.println(isEmail);
        
        String replacedFirst = str.replaceFirst("l", "x"); // Outputs: "Hexlo World"
        System.out.println(replacedFirst);

        String replaced = str.replaceAll("l", "x"); // Outputs: "Hexxo Worxd"
        System.out.println(replaced);

    }   
}