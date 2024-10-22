/*
A package is simaply a container that goups related types (Java classes, interfaces, enumerations,and annotations)
Java packages are a way to organize or group related classes and interfaces into namespaces. 
They help in organizing the code, manage large codebases, preventing naming conflicts and controlling access.
Packages serve multiple purposes, including grouping classes, controlling access, and making it easier to locate and use classes.

Key Concepts of Java Packages
Package Declaration: A package is declared at the beginning of a Java source file using the package keyword.
Importing Packages: Classes from packages can be imported into other classes using the import statement.
Access Control: Packages provide a way to control access to classes, methods, and variables, allowing for encapsulation and modularization.

Types of Packages ->
Built-in Packages: These are provided by Java and include commonly used classes. Examples are:
java.lang: Contains fundamental classes like String, Math, System, etc. This package is automatically imported.
java.util: Contains utility classes like ArrayList, HashMap, and Date.
java.io: Provides classes for input and output through data streams, serialization, etc.
java.net: Contains classes for networking applications.

User-defined Packages: Developers can create their own packages to organize or group related classes and interfaces.

Summary of Java Packages
Organization: Packages help organize related classes and interfaces.
Namespace Management: They prevent naming conflicts between classes.
Access Control: Packages provide access control, allowing classes to specify who can access their members.
Reusability: Packages facilitate the reuse of code and libraries across projects.


Creating a package ->
To create a package in Java, we use the keyword package at the top of your Java source file. Java use file system directories to store packages.
package mypackage;
public class MyClass {
    // Class code here
}

Compiling a Package ->
To compile a Java file in a package, we need to use the -d option with javac to specify the destination for the package directory structure.
javac -d . MyClass.java

Importing a package ->
Java has an import statement that allows us to import an entire package, or use only certain classes and interfaces defined in the package.
import java.util.*; // Imports all classes from java.util
import java.util.ArrayList; // Imports only ArrayList class

In Java, the import statement is written directly after the package statement (if it exists) and before the class definition.
package package.name;
import package.ClassName; // only import a Class
class MyClass {
    // body
}

Access Control ->
Java provides access control through modifiers like public, protected, default (no modifier), and private. 
These modifiers determine the visibility of classes and members across different packages.
*/