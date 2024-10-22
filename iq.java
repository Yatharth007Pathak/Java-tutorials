/*
Private
Keyword: private
Scope: Accessible only within the same class.
Usage: Typically used for data hiding. Fields that should not be accessible from outside the class are marked as private.
*/


public class iq {
    private int secret = 42;

    private void displaySecret() {
        System.out.println("Secret number: " + secret);
    }
}

// The secret variable and displaySecret() method can only be accessed within iq itself.