/*
The String class equals() method compares the original content of the string. It compares values of string for equality.
String class provides the following two methodds:

public boolean equals(Object another) compares thre string to the specified object.
public boolean equalsIgnoreCase(String another) compares the string to another string, ignoring case.
*/

public class fm {

    public static void main(String[] args) {
        
        String name = "yp";
        String sameName = "yp";
        String newName = new String("yp");
   
        System.out.println(name == sameName);
        System.out.println(sameName == newName);
        System.out.println(name == newName);

        System.out.println();

        System.out.println(name.equals(sameName));
        System.out.println(sameName.equals(newName));
        System.out.println(name.equals(newName));

    }   
}

/*
he code demonstrates the differences between reference comparison (using ==) and content comparison (using equals()) 
in Java, particularly when dealing with string literals and explicitly created string objects.

Here's a breakdown of the provided Java code:

public class fm {: This line defines a public class named fm. In Java, every application must have at least one class definition.

public static void main(String[] args) {: This is the main method, which serves as the entry point for the Java application. 
The method is public (accessible from anywhere), static (can be called without creating an instance of the class), 
and takes an array of String arguments.

String name = "yp";: This line declares a string variable named name and initializes it with the value "yp". 
In Java, string literals are stored in the string pool.

String sameName = "yp";: Here, another string variable, sameName, is declared and initialized with the same string literal "yp". 
Since it’s the same literal as name, both refer to the same object in the string pool.

String newName = new String("yp");: This line creates a new string object using the new keyword. 
Although it contains the same characters as name and sameName, it is a different object in memory.

System.out.println(name == sameName);: This line compares the references of name and sameName using the == operator. 
Since both reference the same string object in the pool, it prints true.

System.out.println(sameName == newName);: Here, it compares sameName with newName using ==.
Since newName is a new object created in memory, this comparison results in false.

System.out.println(name == newName);: This line compares name and newName using ==. 
Again, since they are different objects (one from the string pool and one created with new), it prints false.

System.out.println();: This line prints a blank line for better readability of the output.

System.out.println(name.equals(sameName));: This line uses the equals() method to compare the contents of name and sameName.
Since they have the same value, it prints true.

System.out.println(sameName.equals(newName));: This line compares sameName and newName using the equals() method. 
Despite newName being a different object, it contains the same characters, so it prints true.

System.out.println(name.equals(newName));: Similar to the previous comparisons, this line checks if the contents of name and newName are equal.
As both strings contain "yp", it prints true.

}: This closing brace marks the end of the main method.

}: This closing brace marks the end of the class definition.
*/