// String interning is the process by which Java ensures that identical string literals are stored only once in the string pool to save memory.

public class fl {

    public static void main(String[] args) {

        String str1 = "Hello";
        String str2 = new String("Hello");
        String str3 = str2.intern();

        System.out.println(str1 == str2);
        System.out.println(str2 == str3);
        System.out.println(str1 == str3);

    }
}

/*
str1 refers to the literal "Hello" in the string pool.
str2 creates a new String object, which is not placed in the pool automatically.
str3 is assigned str2.intern(), which adds "Hello" to the pool (if it isn't already there) and returns a reference to the pooled string.
Therefore, str1 == str3 returns true, while str1 == str2 returns false because str2 is not a reference from the pool.
*/

/*
Here's a line-by-line breakdown of the code:

public class fl {
Declares a public class named fl.

public static void main(String[] args) {
Defines the main method, which is the entry point for the Java application. 
It is static and can be called without creating an instance of the class.

String str1 = "Hello";
Declares a String variable str1 and initializes it with the value "Hello". This string is stored in the string pool.

String str2 = new String("Hello");
Creates a new String object named str2 using the new keyword. 
This creates a new instance of the string in the heap memory, separate from the string pool.

String str3 = str2.intern();
The intern() method returns a canonical representation of the string. 
It returns a reference from the string pool, ensuring that str3 refers to the pooled version of "Hello".

System.out.println(str1 == str2);
Compares the references of str1 and str2. 
Since str1 refers to the string in the string pool and str2 refers to a separate object in the heap, the result is false.

System.out.println(str2 == str3);
Compares the references of str2 and str3. Since str3 was obtained using the intern() method and refers to the pooled version of "Hello", 
while str2 is the heap instance, the result is also false.

System.out.println(str1 == str3);
Compares the references of str1 and str3. Both str1 and str3 now refer to the same string in the string pool, so the result is true.

}
Closing brace for the main method.

}
Closing brace for the fl class.

str1 == str2 is false because str1 is from the string pool, and str2 is a new object in the heap.
str2 == str3 is false because str2 is in the heap and str3 refers to the string pool.
str1 == str3 is true because both refer to the same string in the pool after interning.
*/