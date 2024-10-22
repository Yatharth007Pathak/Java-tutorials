/*
In java, this keyword is used to refer to the current object inside a method or a constructor.
We mostly use this keyword to remove any ambiguity in variable names. 
We can also use this to invoke methods of the current class or to invoke a constructor to the current class
In Java, the this keyword is a reference to the current object—the instance of the class in which it is used. 
It is commonly used in constructors, methods, and setters.
*/

class Book {
    String title;
    double price;

    // Parameterized constructor
    Book(String title, double price) {
        this.title = title;  // 'this.title' refers to the instance variable
        this.price = price;  // 'this.price' refers to the instance variable
    }

    // Method to display book information
    void display() {
        System.out.println("Book Title: " + title);
        System.out.println("Price: $" + price);
    }
}

public class hr {

    public static void main(String[] args) {
        // Creating a Book object using the parameterized constructor
        Book book1 = new Book("Java Programming", 29.99);
        book1.display(); // Output: Book Title: Java Programming, Price: $29.99
    }
}

/*
This example shows how the this keyword helps resolve naming conflicts between instance variables and parameters in a constructor.

Class Book: The class has two attributes: title and price.
It has a parameterized constructor where the parameter names (title and price) are the same as the instance variables.
The this keyword is used to distinguish between the instance variables (this.title and this.price) and the parameters with the same names.

Method display(): This method prints the details of the book.


The code defines two classes: Book and Main. Below is a detailed line-by-line breakdown of the code:

Book Class:
class Book { - Defines a class named Book.

String title; - Declares an attribute title of type String to represent the book's title.

double price; - Declares an attribute price of type double to represent the book's price.

Book(String title, double price) { - Declares a parameterized constructor for the Book class that takes two arguments (title and price).

this.title = title; - Assigns the value of the parameter title to the class attribute title. 
The this keyword is used to differentiate between the parameter and the instance variable.

this.price = price; - Assigns the value of the parameter price to the class attribute price.

} - Closes the parameterized constructor.

void display() { - Declares a method named display that prints the book's information.

System.out.println("Book Title: " + title); - Prints the book's title.

System.out.println("Price: $" + price); - Prints the book's price.

} - Closes the display method.

} - Closes the Book class.

Main Class:
public class Main { - Defines a public class named Main.

public static void main(String[] args) { - Defines the main method, which serves as the entry point for the program.

Book book1 = new Book("Java Programming", 29.99); - Creates an instance book1 of the Book class using the parameterized constructor 
with values: title = "Java Programming" and price = 29.99.

book1.display(); - Calls the display method on book1, which prints:
Book Title: Java Programming
Price: $29.99

} - Closes the main method.

} - Closes the Main class.
*/