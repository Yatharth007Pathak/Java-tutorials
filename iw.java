/*
Encapsulation is the bundling of data (variables) and methods that operate on the data into a single unit, typically through classes.
It prevents outer classes from accessing and changing fields and methods of a clas. This also helps to achieve data hiding.
Getter and setter methods are used to access private fields.
*/

class Person_ {
    private String name;
    private int age;

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

public class iw {
    public static void main(String[] args) {
        Person_ p = new Person_();
        p.setName("John");
        p.setAge(25);
        System.out.println(p.getName() + " is " + p.getAge() + " years old.");
    }
}

/*
Here's a pointwise breakdown for each line:

class Person_ {
Defines a public class named Person_.

private String name;
Declares a private field name of type String, which stores the name of the person.

private int age;
Declares a private field age of type int, which stores the age of the person.

public String getName() {
Begins the definition of a public method getName() that returns the value of name.

return name;
Returns the current value of the name field.

}
Ends the getName() method.

public void setName(String name) {
Begins the definition of a public method setName() that accepts a String parameter and sets the value of name.

this.name = name;
Assigns the given parameter name to the instance variable name.

}
Ends the setName() method.

public int getAge() {
Begins the definition of a public method getAge() that returns the value of age.

return age;
Returns the current value of the age field.

}
Ends the getAge() method.

public void setAge(int age) {
Begins the definition of a public method setAge() that accepts an int parameter and sets the value of age.

if (age > 0) {
Checks if the given age is greater than zero to ensure that the age is valid.

this.age = age;
If the age is valid, assigns the given age value to the instance variable age.

}
Ends the if statement block.

}
Ends the setAge() method.

}
Ends the Person_ class.

public class iw {
Defines a public class named iw.

public static void main(String[] args) {
Defines the main method, the entry point of the Java application.

Person_ p = new Person_();
Creates a new instance of the Person_ class and assigns it to the reference variable p.

p.setName("John");
Calls the setName() method on p to set the name to "John".

p.setAge(25);
Calls the setAge() method on p to set the age to 25.

System.out.println(p.getName() + " is " + p.getAge() + " years old.");
Prints the message "John is 25 years old." by concatenating the values returned from getName() and getAge().

}
Ends the main method.

}
Ends the iw class.
*/