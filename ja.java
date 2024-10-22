/*
Static variables
• Only a single copy of the static variable is created and shared among all the instances of the class.
• Because it is a class-level variable, memory allocation of such variables only happens once when the class is loaded in the memory.
• If an object modifies the value of a static variable, the change is reflected across all objects.
• Static variables can be used in any type of method: static or non-static.
• Non-static variables cannot be used inside static methods. It will thro a compile-time error.

*/

class Counter_ {
    static int count = 0; // Static variable

    Counter_() {
        count++; // Increment count for every new instance
    }
}

public class ja {
    public static void main(String[] args) {
        new Counter_();
        new Counter_();
        new Counter_();
        System.out.println("Total Count: " + Counter_.count); // Output: Total Count: 3
    }
}

/*
The count variable is static, so it is shared across all instances of the Counter_ class. 
Each time a new instance is created, the count increases.


Here’s a pointwise breakdown of the provided Java code, line by line:

class Counter_ {
Defines a public class named Counter_.

static int count = 0;
Declares a static variable count of type int, initialized to 0. 
This variable is shared across all instances of the class and keeps track of the number of instances created.

Counter_() {
Defines a constructor for the Counter_ class. This constructor is called when a new instance of the class is created.

count++;
Increments the static variable count by 1 each time a new instance of Counter_ is created.

}
Ends the constructor for the Counter_ class.

}
Ends the Counter_ class.

public class ja {
Defines a public class named ja.

public static void main(String[] args) {
Defines the main method, which serves as the entry point for the Java application.

new Counter_();
Creates a new instance of the Counter_ class, which calls the constructor and increments count to 1.

new Counter_();
Creates another new instance of the Counter_ class, which calls the constructor and increments count to 2.

new Counter_();
Creates yet another new instance of the Counter_ class, which calls the constructor and increments count to 3.

System.out.println("Total Count: " + Counter_.count);
Prints the message "Total Count: " followed by the current value of the count variable, which is 3 after creating three instances of Counter_.

}
Ends the main method.

}
Ends the ja class.
*/ 