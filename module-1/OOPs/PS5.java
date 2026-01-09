package OOPs;

/*

A company stores employee details along with address information.
Question
Create classes:
	1. Address → city
	2. Employee → id, Address address
Add:
	parameterized constructor
	copy constructor that performs shallow copy
Steps:
	1	Create employee emp1
	2	Create emp2 using copy constructor
	3	Change city via emp2
	4	Print city of both employees
    
*/




public class PS5 {

    public static void main(String[] args) {

        Address addr = new Address("Kolkata");

        // Step 1: Create emp1
        EmployeePS5 emp1 = new EmployeePS5(101, addr);

        // Step 2: Create emp2 using copy constructor (shallow copy)
        EmployeePS5 emp2 = new EmployeePS5(emp1);

        // Step 3: Change city using emp2
        emp2.address.city = "Delhi";

        // Step 4: Print city of both employees
        System.out.println("Employee 1 City: " + emp1.address.city);
        System.out.println("Employee 2 City: " + emp2.address.city);
    }
}

class Address {
    String city;

    // Parameterized constructor
    Address(String city) {
        this.city = city;
    }
}

class EmployeePS5 {
    int id;
    Address address;

    // Parameterized constructor
    EmployeePS5(int id, Address address) {
        this.id = id;
        this.address = address;
    }

    // Copy constructor (SHALLOW COPY)
    EmployeePS5(EmployeePS5 e) {
        this.id = e.id;
        this.address = e.address; // same reference → shallow copy
    }
}
