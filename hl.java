/*
Method Overloading

Two or more methods can have the same name inside the same class if they accept different arguments. 
This feature is known as method overloading or compiletime polymorphism.
Method overloading is achieved by either: changing the number of arguments or changing the data type of arguments.
It is not method overloading if we only change the return type of methods. There must be differences in the number of parameters
*/

public class hl {

    public static void main(String[] args) {
       
        Greet obj = new Greet();
        obj.greetings();
        obj.greetings("Yatharth");
        obj.greetings("Pathak", 7);
    }    
}

class Greet {

    void greetings() {
        System.out.println("Hello, Good Morning");
    }

    void greetings(String name) {
        System.out.println("Hello " + name + ", Good Morning");
    }

    void greetings(String name, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Hello " + name + ", Good Morning");
        }
    }

}

/*
the hl class creates an object obj of the Greet class and calls three overloaded versions of the greetings method. 
The first version prints a general greeting, the second version prints a personalized greeting for the name "Yatharth", 
and the third version prints a personalized greeting for the name "Pathak" seven times. 
The Greet class defines these methods to showcase method overloading, where multiple methods share the same name but differ in their parameters.

The provided code defines two classes: hl and Greet. Here's a detailed line-by-line breakdown of the code:

public class hl { - Defines a public class named hl.

public static void main(String[] args) { - Defines the main method, which serves as the entry point for the program.

Greet obj = new Greet(); - Creates an instance of the Greet class named obj.

obj.greetings(); - Calls the first overloaded greetings method with no arguments, which prints a generic greeting message.

obj.greetings("Yatharth"); - Calls the second overloaded greetings method, passing the name "Yatharth", 
which prints a personalized greeting message.

obj.greetings("Pathak", 7); - Calls the third overloaded greetings method, passing the name "Pathak" and the number 7. 
This method prints the personalized greeting message seven times in a loop.

} - Closes the main method.

} - Closes the hl class.

class Greet { - Defines a class named Greet.

void greetings() { - Declares the first greetings method with no parameters that outputs a standard greeting.

System.out.println("Hello, Good Morning"); - Prints the message "Hello, Good Morning".

} - Closes the first greetings method.

void greetings(String name) { - Declares the second greetings method that takes a String parameter name.

System.out.println("Hello " + name + ", Good Morning"); - Prints a personalized greeting message using the provided name.

} - Closes the second greetings method.

void greetings(String name, int count) { - Declares the third greetings method that takes a String parameter name and an int parameter count.

for (int i = 0; i < count; i++) { - Starts a loop that iterates count times.

System.out.println("Hello " + name + ", Good Morning"); - 
Prints a personalized greeting message using the provided name for each iteration of the loop.

} - Closes the loop.

} - Closes the third greetings method.

} - Closes the Greet class.
*/