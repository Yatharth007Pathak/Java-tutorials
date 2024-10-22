abstract class Vehicle_ {
    abstract void start();  // Abstract method

    void stop() {
        System.out.println("Vehicle stopped.");
    }
}

class Bike_ extends Vehicle_ {
    @Override
    void start() {
        System.out.println("Bike started.");
    }
}

public class jh {
    public static void main(String[] args) {
        Bike_ myBike = new Bike_();
        myBike.start();
        myBike.stop();
    }
}

/*
Here's a line-by-line breakdown of the code:

abstract class Vehicle_ {
Defines an abstract class named Vehicle_. Abstract classes are meant to be extended and cannot be instantiated directly.

abstract void start();
Declares an abstract method start() with no body. Subclasses must provide an implementation for this method.

void stop() {
Declares a concrete method stop(), which provides a common behavior that all vehicles can use.

System.out.println("Vehicle stopped.");
Prints "Vehicle stopped." to the console when the stop() method is called.

}
Ends the stop() method.

}
Ends the Vehicle_ class.

class Bike_ extends Vehicle_ {
Defines a class named Bike_ that extends the abstract class Vehicle_. 
This means Bike_ must provide an implementation for the abstract method start().

@Override
Indicates that the start() method overrides the abstract method declared in Vehicle_.

void start() {
Implements the abstract start() method from Vehicle_.

System.out.println("Bike started.");
Prints "Bike started." to the console when the start() method is called.

}
Ends the start() method.

}
Ends the Bike_ class.

public class jh {
Defines a class named jh, which contains the main method.

public static void main(String[] args) {
Defines the main() method, which serves as the entry point of the program.

Bike_ myBike = new Bike_();
Creates an instance of the Bike_ class named myBike. Since Bike_ is a concrete subclass, it can be instantiated.

myBike.start();
Calls the start() method on the myBike object. Prints "Bike started." to the console.

myBike.stop();
Calls the stop() method on the myBike object. Prints "Vehicle stopped." to the console.

}
Ends the main() method.

}
Ends the jh class.


Summary
Vehicle_ is an abstract class representing a generic vehicle.
start() is an abstract method in Vehicle_, implemented by subclasses to define how a specific vehicle starts.
stop() is a concrete method in Vehicle_, providing shared functionality to all vehicles.
Bike_ is a subclass that provides a specific implementation of the start() method.
The main() method creates a Bike_ object and calls both start() and stop() methods to demonstrate the functionality.
*/