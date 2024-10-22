/*
Static Nested Classes
A static nested class is a nested class that is declared static. 
It can access static variables and methods of the outer class but cannot access instance variables and methods directly.
*/

class Outer {
    static int outerStaticVar = 10;

    static class Nested {
        void display() {
            System.out.println("Outer Static Variable: " + outerStaticVar);
        }
    }
}

public class jd {
    public static void main(String[] args) {
        Outer.Nested nested = new Outer.Nested(); // Create an instance of the static nested class
        nested.display(); // Output: Outer Static Variable: 10
    }
}

/*
The Nested class can access the static variable outerStaticVar of the Outer class.


Here’s a pointwise breakdown of the provided Java code, line by line:

class Outer {
Defines a public class named Outer.

static int outerStaticVar = 10;
Declares a static variable outerStaticVar of type int and initializes it to 10. 
This variable is associated with the Outer class rather than any instance of the class.

static class Nested {
Defines a static nested class named Nested within the Outer class. This class can access static members of the outer class directly.

void display() {
Begins the definition of a method named display() within the Nested class. This method does not return a value.

System.out.println("Outer Static Variable: " + outerStaticVar);
Prints the message "Outer Static Variable: " followed by the value of outerStaticVar, which is 10.

}
Ends the display() method.

}
Ends the Nested class.

public class jd {
Defines a public class named jd.

public static void main(String[] args) {
Defines the main method, which serves as the entry point for the Java application.

Outer.Nested nested = new Outer.Nested();
Creates an instance of the static nested class Nested using the syntax Outer.Nested, since Nested is a static nested class.

nested.display();
Calls the display() method on the nested instance, which prints "Outer Static Variable: 10".

}
Ends the main method.

}
Ends the jd class.
*/