package OOPs;

/*1. Write a Java program to create a Laptop class that demonstrates constructor chaining using this().

Requirements:

The Laptop class should have three instance variables:
brand (String)
ramSize (int)
price (double)

Implement the following constructors using constructor chaining (this()):

Default constructor that sets default values ("Unknown", 8GB, 50000.0).
Constructor with only brand (calls the default constructor).
Constructor with brand and ramSize (calls the constructor with brand).
Constructor with all three fields (brand, ramSize, price) --(the final constructor)--.

Create a printDetails() method to display laptop details.

In main(), create different Laptop objects using all constructors and print their details.*/


class Laptop {

    String brand;
    int ramSize;
    double price;

    // 1. Default constructor
    Laptop() {
        this("Unknown", 8, 50000.0);
    }

    // 2. Constructor with brand
    Laptop(String brand) {
        this(brand, 8, 50000.0);
    }

    // 3. Constructor with brand and ramSize
    Laptop(String brand, int ramSize) {
        this(brand, ramSize, 50000.0);
    }

    // 4. Constructor with all fields
    Laptop(String brand, int ramSize, double price) {
        this.brand = brand;
        this.ramSize = ramSize;
        this.price = price;
    }

    // Method to print laptop details
    void printDetails() {
        System.out.println("Brand: " + brand + ", RAM Size: " + ramSize + "GB, Price: " + price);
    }
}

public class PS8 {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop();
        Laptop laptop2 = new Laptop("Dell");
        Laptop laptop3 = new Laptop("HP", 16);
        Laptop laptop4 = new Laptop("Apple", 32, 150000.0);

        laptop1.printDetails();
        laptop2.printDetails();
        laptop3.printDetails();
        laptop4.printDetails();

    }
}
