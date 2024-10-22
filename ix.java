/*
Encapsulation is the process of wrapping data (attributes) and methods into a single unit (class). 
It is used to restrict direct access to some of an object's components and control how data is modified, 
which can be achieved using access modifiers like private, public, and protected. 
*/

class BankAccount {
    private double balance;  // Private attribute, only accessible through methods

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class ix {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        System.out.println("Balance: " + account.getBalance());
    }
}

/*
Here's a pointwise breakdown of the provided Java code, line by line:

class BankAccount {
Defines a public class named BankAccount.

private double balance;
Declares a private attribute balance of type double, which stores the balance of the bank account. 
\This attribute is only accessible through public methods.

public void deposit(double amount) {
Begins the definition of a public method deposit() that accepts a double parameter amount, representing the amount to be deposited.

if (amount > 0) {
Checks if the amount to be deposited is greater than zero to ensure that only positive amounts are added.

balance += amount;
If the condition is met, adds the amount to the current balance.

}
Ends the if statement block.

}
Ends the deposit() method.

public double getBalance() {
Begins the definition of a public method getBalance() that returns the current value of balance.

return balance;
Returns the value of the balance attribute.

}
Ends the getBalance() method.

}
Ends the BankAccount class.

public class ix {
Defines a public class named ix.

public static void main(String[] args) {
Defines the main method, which serves as the entry point for the Java application.

BankAccount account = new BankAccount();
Creates a new instance of the BankAccount class and assigns it to the reference variable account.

account.deposit(1000);
Calls the deposit() method on the account instance to deposit 1000 into the account.

System.out.println("Balance: " + account.getBalance());
Prints the message "Balance: " followed by the current balance returned from the getBalance() method.

}
Ends the main method.

}
Ends the ix class.
*/