/*
In Java, String comparison can be done in two different ways:

Using ==: Checks if both references point to the same memory location.
Using .equals(): Checks if the actual content of the strings is equal.
*/

public class fo {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = "Hello";
        String str3 = new String("Hello");

        System.out.println(str1 == str2);         // Outputs: true (both point to the same object in the string pool)
        System.out.println(str1.equals(str3));    // Outputs: true (content is the same)

    }
}