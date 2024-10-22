public class fn {

    public static void main(String[] args) {
        
        String name = "yatharth";
        String newName = new String("YATHARTH");

        System.out.println(name.equalsIgnoreCase(newName));
        System.out.println(name.equals(newName));

    }
}

/*
The code demonstrates the use of equalsIgnoreCase() and equals() methods in Java. 
The first method ignores case differences and returns true, while the second method is case-sensitive and returns false. 
This illustrates how string comparison can vary based on the method used, particularly regarding case sensitivity.

Here’s a breakdown of the provided Java code, line by line:

public class fn {: This line defines a public class named fn. In Java, each application must have at least one class definition.

public static void main(String[] args) {: This is the main method, which serves as the entry point for the Java application. 
The method is declared as public (accessible from anywhere), static (can be called without creating an instance of the class), 
and it takes an array of String arguments.

String name = "yatharth";: This line declares a string variable named name and initializes it with the value "yatharth". 
In Java, string literals are stored in the string pool.

String newName = new String("YATHARTH");: This line creates a new string object named newName using the new keyword, initialized
with the value "YATHARTH". This creates a distinct object in memory, even though it has the same characters as name but in a different case.

System.out.println(name.equalsIgnoreCase(newName));: This line compares the contents of name and newName using the equalsIgnoreCase() method. 
This method ignores case differences when comparing the two strings. 
Since "yatharth" and "YATHARTH" are equivalent when case is ignored, it prints true.

System.out.println(name.equals(newName));: This line uses the equals() method to compare the contents of name and newName. 
Since this method is case-sensitive and "yatharth" is not equal to "YATHARTH", it prints false.

}: This closing brace marks the end of the main method.

}: This closing brace marks the end of the class definition.
*/