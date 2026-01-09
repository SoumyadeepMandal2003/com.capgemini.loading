package OOPs;

/*
3. Write a Java program to demonstrate method overloading by defining both static and non-static methods with the same name but different parameter lists. Your program should include the following:

A class named OverloadingExample containing:

A static method named display() that takes an int parameter and prints a message.
A static method named display() that takes a String parameter and prints a message.
A non-static method named display() that takes two parameters: an int and a double, and prints a message.
A non-static method named display() that takes no parameters and prints a default message. 

---------------------------------------------------------------------------------------
*/

class OverloadingExample {

    // Static method with int parameter
    public static void display(int number) {
        System.out.println("Static method called with int: " + number);
    }

    // Static method with String parameter
    public static void display(String text) {
        System.out.println("Static method called with String: " + text);
    }

    // Non-static method with int and double parameters
    public void display(int number, double decimal) {
        System.out.println("Non-static method called with int and double: " + number + ", " + decimal);
    }

    // Non-static method with no parameters
    public void display() {
        System.out.println("Non-static method called with no parameters.");
    }
}


public class PS10 {
    public static void main(String[] args) {
        // Calling static methods
        OverloadingExample.display(10);
        OverloadingExample.display("Hello");

        // Creating an object to call non-static methods
        OverloadingExample example = new OverloadingExample();
        example.display(5, 3.14);
        example.display();
    }
}
