package OOPs.relationships;

/******************************************************************************

IS-A Relationship (Inheritance Relationship) in Java

One class inherits the properties and behaviors of another class.
eg. Dog IS-A Animal.

Achieved by:
1. Using 'extends' keyword to inherit from a superclass.
2. Overriding methods to provide specific implementations in the subclass.

*******************************************************************************/

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}

public class InheritanceRelation {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}