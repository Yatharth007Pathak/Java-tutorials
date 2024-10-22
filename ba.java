class Animal {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    public void sound() {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class ba {
    
    public static void main(String[] args) {
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();

        if (animal1 instanceof Dog) {
            ((Dog) animal1).sound();  // Output: Dog barks
        }

        if (animal2 instanceof Cat) {
            ((Cat) animal2).sound();  // Output: Cat meows
        }
    }
}

/*
The instanceof operator is often used in polymorphic situations to check the actual type of an object before 
performing a type-specific operation. It helps ensure type safety when casting objects.
*/