/*
In Java, String is an important class used to represent sequences of characters. 
In Java, String is basically an object that represents a sequence of char values. An aray of characters works same as Java string.
Strings are immutable, meaning that once created, their values cannot be changed. 
Here's a detailed overview of String in Java, covering creation, methods, and examples of common operations.

Strings in Java are objects that represent sequences of characters.
Strings are immutable; methods that modify a string return a new string.
Common methods include length(), charAt(), substring(), equals(), and concat().
Use StringBuilder or StringBuffer for mutable strings to improve efficiency.

Strings are stored in a String Pool to save memory and improve performance.
String literals are automatically added to the pool, while strings created with the new keyword are stored in the heap.
Java uses string interning to ensure that identical strings share the same reference, thus enhancing memory efficiency.
Strings are immutable, which makes them thread-safe and suitable for pooling.
*/

public class fg {

    public static void main(String[] args) {
        
        String name = "Laxman";
        char naam[] = {'R', 'a', 'm'};

        System.out.println(name);
        System.out.println(naam);
    
    }
}

/*
The program defines a class fg with a main method that prints a String variable (name) and a character array (naam) to the console. 
The character array naam is printed as a string.

Here's a line-by-line breakdown of the code:

public class fg {
This line declares a public class named fg, which will contain the methods for the program.

public static void main(String[] args) {
This line defines the main method, which is the entry point for the Java application. 
It is static, meaning it can be called without creating an instance of the class.

String name = "Laxman";
This line declares a String variable named name and assigns it the value "Laxman".

char naam[] = {'R', 'a', 'm'};
This line declares a character array named naam and initializes it with the characters 'R', 'a', 'm'.

System.out.println(name);
This line prints the value of the name variable to the console. The output will be: Laxman

System.out.println(naam);
This line prints the character array naam to the console. 
Java's System.out.println method can automatically convert character arrays to a String, so the output will be: Ram

}
This closing brace indicates the end of the main method.

}
This closing brace indicates the end of the fg class.
*/