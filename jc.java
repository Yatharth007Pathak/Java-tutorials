/*
Static Blocks
Static blocks are used for static initialization of a class. They are executed when the class is loaded into memory.
*/

class Database {
    static String connectionString;

    static {
        connectionString = "jdbc:mysql://localhost:3306/mydb"; // Static block for initialization
    }
}

public class jc {
    public static void main(String[] args) {
        System.out.println("Connection String: " + Database.connectionString); // Output: Connection String: jdbc:mysql://localhost:3306/mydb
    }
}

/*
The static block initializes the connectionString variable when the Database class is loaded.


Here’s a pointwise breakdown of the provided Java code, line by line:

class Database {
Defines a public class named Database.

static String connectionString;
Declares a static variable connectionString of type String, which will hold the database connection string.

static {
Begins a static initialization block, which is executed when the class is loaded.

connectionString = "jdbc:mysql://localhost:3306/mydb";
Initializes the connectionString variable with the value "jdbc:mysql://localhost:3306/mydb".

}
Ends the static initialization block.

}
Ends the Database class.

public class jc {
Defines a public class named jc.

public static void main(String[] args) {
Defines the main method, which serves as the entry point for the Java application.

System.out.println("Connection String: " + Database.connectionString);
Prints the message "Connection String: " followed by the value of connectionString from the Database class, 
which is "jdbc:mysql://localhost:3306/mydb".

}
Ends the main method.

}
Ends the jc class.
*/