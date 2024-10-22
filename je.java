/*
In Java, a static block is a block of code that is executed when the class is loaded into memory. 
Static blocks in Java are a powerful feature for class-level initialization. 
It is used for initializing static variables or performing other setup tasks that need to happen only once. 
Static blocks are executed in the order they appear in the code, and they run before any static methods or instance methods.

Key Characteristics of Static Blocks:
They are defined using the static keyword.
They can contain code for initialization that can throw exceptions.
A class can have multiple static blocks, which will be executed in the order they are defined.
They are executed when the class is loaded, before any instances of the class are created or any static methods are called.

Use Cases for Static Blocks:
Initialization of Static Variables: When you need to perform complex initialization of static variables that cannot be done in a single line.
Static Data Structures: Setting up static collections or arrays that require more than simple assignments.
Loading Configuration Settings: Reading configuration data from files or environment variables during class loading.
*/

class Configuration {
    // Static variables
    static String url;
    static String username;
    static String password;

    // Static block for initialization
    static {
        System.out.println("Static block executed: Initializing configuration settings.");
        url = "jdbc:mysql://localhost:3306/mydb";
        username = "admin";
        password = "password123";
    }

    // Method to display the configuration
    static void displayConfig() {
        System.out.println("Database URL: " + url);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}

public class je {
    public static void main(String[] args) {
        // Accessing static method
        Configuration.displayConfig();
    }
}

/*
Here’s a pointwise breakdown of the provided Java code, line by line:

class Configuration {
Defines a public class named Configuration.

static String url;
Declares a static variable url of type String, which will hold the database URL.

static String username;
Declares a static variable username of type String, which will hold the database username.

static String password;
Declares a static variable password of type String, which will hold the database password.

static {
Begins a static initialization block, which is executed when the class is loaded.

System.out.println("Static block executed: Initializing configuration settings.");
Prints the message indicating that the static block is being executed and the configuration settings are being initialized.

url = "jdbc:mysql://localhost:3306/mydb";
Initializes the url variable with the value "jdbc:mysql://localhost:3306/mydb".

username = "admin";
Initializes the username variable with the value "admin".

password = "password123";
Initializes the password variable with the value "password123".

}
Ends the static initialization block.

static void displayConfig() {
Begins the definition of a static method named displayConfig() that displays the configuration settings.

System.out.println("Database URL: " + url);
Prints the message "Database URL: " followed by the value of the url variable.

System.out.println("Username: " + username);
Prints the message "Username: " followed by the value of the username variable.

System.out.println("Password: " + password);
Prints the message "Password: " followed by the value of the password variable.

}
Ends the displayConfig() method.

}
Ends the Configuration class.

public class je {
Defines a public class named je.

public static void main(String[] args) {
Defines the main method, which serves as the entry point for the Java application.

Configuration.displayConfig();
Calls the static method displayConfig() from the Configuration class to display the configuration settings.

}
Ends the main method.

}
Ends the je class.
*/