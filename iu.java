/*
Protected
Keyword: protected
Scope: Accessible within the same package and by subclasses (even if they are in different packages).
Usage: Used when you want to provide access to subclasses while restricting access to non-subclass code outside the package.
*/

public class iu {
    protected void showProtectedMessage() {
        System.out.println("This is a protected message.");
    }
}

class iv extends ir {
    public void callParentMessage() {
        showProtectedMessage();
    }
}

// The showProtectedMessage() method is accessible by the iv class because it extends iu, even if iv is in a different package.