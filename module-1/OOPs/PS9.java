package OOPs;


/*2. Write a Java program that performs the following tasks:
Create a class Employee with three attributes: id, name, and sal (salary).
Implement a parameterized constructor to initialize these attributes.
Create a non-static method printDetails() to display employee details.
In the main() method:
Create an 4 Employee object

---------------------------------------------------------------------*/



class EmployeePS9 {
    int id;
    String name;
    double sal;

    // Parameterized constructor
    EmployeePS9(int id, String name, double sal) {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }

    // Non-static method to print employee details
    void printDetails() {
        System.out.println("Employee ID: " + id + ", Name: " + name + ", Salary: " + sal);
    }
}



public class PS9 {
    public static void main(String[] args) {
        // Creating Employee objects
        EmployeePS9 emp1 = new EmployeePS9(101, "Sumit", 50000);
        EmployeePS9 emp2 = new EmployeePS9(102, "Harsh", 60000);
        EmployeePS9 emp3 = new EmployeePS9(103, "Kunal", 55000);
        EmployeePS9 emp4 = new EmployeePS9(104, "Prithviraj", 70000);

        // Printing employee details
        emp1.printDetails();
        emp2.printDetails();
        emp3.printDetails();
        emp4.printDetails();
    }
}
