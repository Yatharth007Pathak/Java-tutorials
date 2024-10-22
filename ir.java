public class ir {

    public static void main(String[] args) {
        iq obj = new iq();
        System.out.println(obj.secret); // Error
        obj.displaySecret();            // Error
    }
}

/*
Output:
Compilation error: secret and displaySecret() are both private, meaning they cannot be accessed from outside the iq. 
The compiler will generate an error like:

error: secret has private access in iq
error: displaySecret() has private access in iq
*/