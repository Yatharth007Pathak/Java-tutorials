/*
Strings in Java are immutable, which means once a String object is created, its value cannot be changed. 
Any method that modifies a string will actually create a new String object rather than modifying the original one.
*/

public class fj {

    public static void main(String[] args) {
        
        String original = "Hello";
        String modified = original.concat(", World!");
        System.out.println(original); // Outputs: "Hello"
        System.out.println(modified); // Outputs: "Hello, World!"
 
    }
}

/*
Here's a line-by-line breakdown of the code:

public class fj {
This line declares a public class named fj.

public static void main(String[] args) {
This line defines the main method, which is the entry point for the Java application. 
It is static, meaning it can be called without creating an instance of the class.

String original = "Hello";
This line declares a String variable named original and initializes it with the value "Hello".

String modified = original.concat(", World!");
This line creates a new String by calling the concat method on the original string, which appends the string ", World!" to it. 
The result is stored in a new variable named modified. 
Since strings are immutable, the concat method does not change the original string; it returns a new string instead.

System.out.println(original);
This line prints the value of original to the console. Since the original string is unchanged, the output will be: Hello

System.out.println(modified);
This line prints the value of modified to the console, which contains the concatenated result: Hello, World!

}
This closing brace indicates the end of the main method.

}
This closing brace indicates the end of the fj class.
*/