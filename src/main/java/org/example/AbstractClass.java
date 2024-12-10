package org.example;

abstract class Animal {
    abstract void makeSound(); // Abstract method

    void sleep() { // Concrete method
        System.out.println("Sleeping...");
    }
}

class Dog extends Animal {
    void makeSound() {
        System.out.println("Bark");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.makeSound(); // Output: Bark
        myDog.sleep();     // Output: Sleeping...
    }
}

// An abstract class is a class that cannot be instantiated directly. It can contain both abstract methods (without a body) and concrete methods (with a body).
//It is used when you want to provide a common base with shared functionality while allowing specific implementations in subclasses.