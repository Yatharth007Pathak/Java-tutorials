public class iv {

    public static void main(String[] args) {
        Child obj = new Child();
        obj.callParentMessage();
    }
}

/*
Output:
This is a protected message.

Explanation: Since showProtectedMessage() is protected, it is accessible within the iv class because iv extends iu. 
The code will print This is a protected message..
If we try to access showProtectedMessage() directly from another class that does not extend iu 
(even if they are in the same package), a compilation error will occur.
*/