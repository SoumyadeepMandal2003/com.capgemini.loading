package OOPs;

/*
A mobile phone can be initialized with default settings or custom settings.

Create class Mobile with:
	•	String brand
	•	int storage
	•	boolean is5G

Requirements:
	1.	Default constructor sets:
	•	brand = “Unknown”
	•	storage = 64
	•	is5G = false
	2.	Parameterized constructor sets all values.
	3.	Use this() to chain constructors.

*/


public class PS6 {

    public static void main(String[] args) {

        // Using default constructor
        Mobile m1 = new Mobile();

        // Using parameterized constructor
        Mobile m2 = new Mobile("Samsung", 128, true);

        System.out.println("Mobile 1 Details:");
        m1.display();

        System.out.println("Mobile 2 Details:");
        m2.display();
    }
}

class Mobile {

    String brand;
    int storage;
    boolean is5G;

    // Default constructor (calls parameterized constructor)
    Mobile() {
        this("Unknown", 64, false);   // constructor chaining
    }

    // Parameterized constructor
    Mobile(String brand, int storage, boolean is5G) {
        this.brand = brand;
        this.storage = storage;
        this.is5G = is5G;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Storage: " + storage + "GB");
        System.out.println("5G Supported: " + is5G);
        System.out.println();
    }
}
