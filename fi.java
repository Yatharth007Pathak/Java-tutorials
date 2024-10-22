/*
String objects are immutable.
Immutable simply means unmodifiable or unchangeable. Once a String object is created its data or state can't be changed.
*/

public class fi {

    public static void main(String[] args) {
        
        String name = "Yatharth";
        name = "Pathak";

        System.out.println(name);

    }
}

/*
Here's a line-by-line breakdown of the code:

public class fi {
This line declares a public class named fi, which will contain the methods for the program.

public static void main(String[] args) {
This line defines the main method, which is the entry point for the Java application. 
It is static, meaning it can be called without creating an instance of the class.

String name = "Yatharth";
This line declares a String variable named name and initializes it with the value "Yatharth". OR
A new String object "Yatharth" is created, and the name reference points to it.

name = "Pathak";
This line assigns a new value "Pathak" to the name variable, replacing the previous value "Yatharth". OR
A new String object "Pathak" is created, and the reference name is updated to point to this new object instead of "Yatharth". 
The original "Yatharth" string remains unchanged in memory (until garbage collection), but the reference name now points to "Pathak".

System.out.println(name);
This line prints the current value of the name variable to the console. The output will be: Pathak

}
This closing brace indicates the end of the main method.

}
This closing brace indicates the end of the fi class.

When we say that strings are immutable, it means that once a String object is created, it cannot be modified. 
However, what happens in your code is not modifying the original string but rather reassigning the name reference to point to a new string.
*/