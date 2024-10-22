public class ip {

    public static void main(String[] args) {
        io obj = new io();
        System.out.println(obj.number);
        obj.showMessage();
    }
}

/*
Output:
10
Hello, World!

Explanation: Since number and showMessage() are public, they can be accessed from anywhere. The code will print 10 followed by Hello, World!.
*/