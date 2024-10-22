/*
Access modifiers in Java define the accessibility (visibility) or scope of classes, methods, interfaces, constructors and variables. 
They help control how the members of a class can be accessed from other classes and packages. Java provides 4 main types of access modifiers:

Modifier          class          package          subclass          world (other packages)
public             Yes             Yes               Yes                    Yes
protected          Yes             Yes               Yes                    No
default            Yes             Yes               No                     No
private            Yes             No                No                     No

When to Use Which Modifier
Public: When you want a class, method, or variable to be accessible from anywhere.
Private: When you need to restrict access completely to a class member.
Protected: When you need to allow access to subclasses, but not to unrelated classes.
Default: When you need package-level access but don’t want to expose members publicly.

Access modifiers are essential in implementing encapsulation, 
one of the core principles of object-oriented programming, which helps to maintain code security and integrity.
*/


// Public class can be accessed from anywhere
public class in {

    public static void main(String[] args) {
        ExampleClass example = new ExampleClass();

        // Accessing public member
        System.out.println("Public Variable: " + example.publicVar);
        example.publicMethod();

        // Accessing protected member (within the same package)
        System.out.println("Protected Variable: " + example.protectedVar);
        example.protectedMethod();

        // Accessing default (package-private) member (within the same package)
        System.out.println("Default Variable: " + example.defaultVar);
        example.defaultMethod();

        // Accessing private member (within the same class, so can't access directly)
        // System.out.println("Private Variable: " + example.privateVar); // Uncommenting this will give an error
        example.showPrivateMember();
    }
}

// Class with different access modifiers
class ExampleClass {
    public int publicVar = 10;
    protected int protectedVar = 20;
    int defaultVar = 30; // Default access modifier
    private int privateVar = 40;

    // Public method
    public void publicMethod() {
        System.out.println("Public Method called");
    }

    // Protected method
    protected void protectedMethod() {
        System.out.println("Protected Method called");
    }

    // Default method
    void defaultMethod() {
        System.out.println("Default Method called");
    }

    // Private method, only accessible within the class itself
    private void privateMethod() {
        System.out.println("Private Method called");
    }

    // Method to demonstrate accessing a private member
    public void showPrivateMember() {
        System.out.println("Private Variable: " + privateVar);
        privateMethod(); // Accessing private method within the class
    }
}

/*
The code demonstrates how different access modifiers affect the accessibility of variables and methods.
Summary of Access Modifiers
public: Members are accessible from any class.
protected: Members are accessible within the same package and by subclasses.
Default (Package-Private): Members are accessible within the same package only.
private: Members are accessible only within the class they are defined in.

Code Breakdown

public class in:
This is a public class named in. Public classes can be accessed from any other class in the project.

public static void main(String[] args):
This is the entry point of the Java program.
The main method is used to create an instance of ExampleClass and demonstrate the use of its members.

Creating an instance of ExampleClass:
ExampleClass example = new ExampleClass(); creates an instance named example.

Accessing Members of ExampleClass:

Public Member:
System.out.println("Public Variable: " + example.publicVar);
example.publicMethod();
Both the public variable (publicVar) and the public method (publicMethod()) are accessible here because they are declared as public.

Protected Member:
System.out.println("Protected Variable: " + example.protectedVar);
example.protectedMethod();
The protected variable (protectedVar) and the protected method (protectedMethod()) are accessible because we are in the same package 
as the class ExampleClass. In Java, protected members are accessible in subclasses and other classes within the same package.

Default (Package-Private) Member:
System.out.println("Default Variable: " + example.defaultVar);
example.defaultMethod();
The default variable (defaultVar) and method (defaultMethod()) are accessible within the same package.

Private Member:
The line // System.out.println("Private Variable: " + example.privateVar); is commented out because 
trying to access the privateVar directly from outside the class would result in a compilation error.
Instead, the method example.showPrivateMember() is called, which is a public method that prints the value of 
privateVar and calls the private method (privateMethod()). Private members are accessible only within the class in which they are declared.

Class ExampleClass with Different Access Modifiers

public int publicVar = 10;:
This is a public variable. It can be accessed from anywhere in the program, provided the class ExampleClass is accessible.

protected int protectedVar = 20;:
This is a protected variable, accessible within the same package and by subclasses of ExampleClass.

int defaultVar = 30;:
This is a default (package-private) variable. It can only be accessed by classes in the same package.

private int privateVar = 40;:
This is a private variable, accessible only within ExampleClass.

Methods in ExampleClass

Public Method (publicMethod()):
A public method that prints "Public Method called".

Protected Method (protectedMethod()):
A protected method that prints "Protected Method called".

Default Method (defaultMethod()):
A package-private method that prints "Default Method called".

Private Method (privateMethod()):
A private method that prints "Private Method called".
It is only accessible within the ExampleClass itself.

Public Method (showPrivateMember()):
This method is used to demonstrate accessing private members.
It prints the value of privateVar and calls the private method privateMethod().
*/