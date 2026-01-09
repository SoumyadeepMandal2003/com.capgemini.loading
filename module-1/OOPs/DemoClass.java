package OOPs;

/*
4. Write a Java program that defines a class named DemoClass with the following specifications:

The class should contain two Static Initialization Blocks (SIBs) that print messages when they execute.
The class should contain one Instance Initialization Block (IIB) that prints a message when it executes.
The class should contain one non-static method named displayMessage(), which prints a message when called.
The class should contain two static methods:
staticMethodOne(): Prints a message when called.
staticMethodTwo(): Prints a different message when called.

Inside the main() method, perform the following actions:
Call both static methods directly using the class name.
Create an object of the class, which should trigger the execution of SIBs, IIB, and constructor.
Call the non-static method using the object reference.

-------------------------------------------------------------------------------------
*/


public class DemoClass {
    // Static Initialization Block 1
    static {
        System.out.println("Static Initialization Block 1 executed.");
    }

    // Static Initialization Block 2
    static {
        System.out.println("Static Initialization Block 2 executed.");
    }

    // Instance Initialization Block
    {
        System.out.println("Instance Initialization Block executed.");
    }

    // Non-static method
    void displayMessage() {
        System.out.println("Non-static method displayMessage() called.");
    }

    // Static method 1
    static void staticMethodOne() {
        System.out.println("Static method staticMethodOne() called.");
    }

    // Static method 2
    static void staticMethodTwo() {
        System.out.println("Static method staticMethodTwo() called.");
    }
}

class PS11 {
    public static void main(String[] args) {
        // Calling static methods directly using class name
        DemoClass.staticMethodOne();
        DemoClass.staticMethodTwo();

        // Creating an object of DemoClass
        DemoClass demo = new DemoClass();

        // Calling non-static method using object reference
        demo.displayMessage();
    }
}
