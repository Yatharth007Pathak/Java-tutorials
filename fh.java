/*
There are two main ways to create a String in Java:

Using String Literals
String greeting = "Hello, World!";
This is the most common way to create a String. When you use double quotes, Java automatically creates a String object for you.

Using the new Keyword
String greeting = new String("Hello, World!");
This explicitly creates a new String object. Generally, using literals is preferred for simplicity and better memory management.
*/


/*
In Java, strings are stored in a special memory area known as the String Pool. Java uses the String class to handle strings, 
and because strings are so frequently used, their storage is optimized to be both memory-efficient and performant. 
Here’s a detailed look at how strings are stored in Java:

1. String Pool / String Intern Pool -> It is a region of the Java heap memory where strings are stored. 
When you create a string using a literal, Java first checks if an equivalent string already exists in the pool. 
If it does, the reference to the existing string is returned. If not, a new string is created and placed in the pool.
Example:
String str1 = "Hello";
String str2 = "Hello";
In the above example, the literal "Hello" is created once in the string pool.
When str1 is created, "Hello" is added to the pool.
When str2 is assigned "Hello", Java reuses the existing string from the pool.
As a result, str1 == str2 returns true because both str1 and str2 refer to the same object in the string pool.

2. String Interning -> Process by which Java ensures that identical string literals are stored only once in the string pool to save memory.
Example:
String str1 = "Hello";
String str2 = new String("Hello");
String str3 = str2.intern();
str1 refers to the literal "Hello" in the string pool.
str2 creates a new String object, which is not placed in the pool automatically.
str3 is assigned str2.intern(), which adds "Hello" to the pool (if it isn't already there) and returns a reference to the pooled string.
Therefore, str1 == str3 returns true, while str1 == str2 returns false because str2 is not a reference from the pool.

3. Creating Strings Using new Keyword -> When you create a string using the new keyword, a new String object is created in the heap, 
regardless of whether the same string already exists in the pool.
Example:
String str1 = "Hello"; // Stored in the string pool
String str2 = new String("Hello"); // A new object in heap memory
Here, str1 points to the "Hello" in the pool, while str2 points to a different String object in the heap memory.
Therefore, str1 == str2 will be false, but str1.equals(str2) will be true because the content is the same.

4. Immutability and Storage Efficiency -> Strings in Java are immutable, meaning that once they are created, their value cannot be changed. 
This immutability is a key reason why Java uses a string pool:
Memory Efficiency: Instead of creating multiple identical strings, Java reuses strings from the pool, which reduces memory usage.
Security and Safety: Strings cannot be changed once they are shared, providing a level of safety, especially in multi-threaded applications.

5. Memory Layout of Strings -> Strings are objects in Java, so each String object contains:
A character array that holds the string data (char[] value).
Additional fields like hash for caching the hash code and fields for storing length.
When you create a String using a literal, it goes to the string pool.
When you use new String(), the new object is stored in the heap and, optionally, the pool reference can be used via interning.

6. Garbage Collection -> If a string is not referenced anymore, it becomes eligible for garbage collection. 
The string pool helps reduce the overhead on garbage collection since pooled strings are usually shared 
and are less frequently discarded compared to strings created dynamically.
*/

public class fh {

    public static void main(String[] args) {
        
        String God = "Vishnu";
        String god = new String("Shiva");

        System.out.println(God);
        System.out.println(god);

    }
}

/*
Here's a line-by-line breakdown of the code:

public class fh {
This line declares a public class named fh, which will contain the methods for the program.

public static void main(String[] args) {
This line defines the main method, which is the entry point for the Java application. 
It is static, meaning it can be called without creating an instance of the class.

String God = "Vishnu";
This line declares a String variable named God and assigns it the value "Vishnu". This creates a string literal in the string pool.

String god = new String("Shiva");
This line declares another String variable named god and initializes it with the value "Shiva" using the new keyword. 
This creates a new String object in the heap memory.

System.out.println(God);
This line prints the value of the God variable to the console. The output will be: Vishnu

System.out.println(god);
This line prints the value of the god variable to the console. The output will be: Shiva

}
This closing brace indicates the end of the main method.

}
This closing brace indicates the end of the fh class.
*/