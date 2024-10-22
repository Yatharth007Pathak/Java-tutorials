/*
Default (Package-Private)
No Keyword: This is the default modifier when no access modifier is specified.
Scope: Accessible within the same package.
Usage: Often used when you want access within the same package but not from outside it.
*/

class is {
    void showInfo() {
        System.out.println("Package-private method.");
    }
}

// The is and its method showInfo() can be accessed by any other class within the same package, but not from outside the package.