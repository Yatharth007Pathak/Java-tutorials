public class it {

    public static void main(String[] args) {
        is obj = new is();
        obj.showInfo();
    }    
}

/*
Output:
Package-private method.

Explanation: Since showInfo() is default (no access modifier specified), it can be accessed by other classes in the same package. 
If we try to access MyClass or showInfo() from a different package, a compilation error will occur.
*/