// Q. You are given a Java program that defines two classes: Employee and Company.
// - The Employee class has attributes for employee ID, name, and salary. It also 
// contains a static method to create new Employee objects and a method to display 
// employee details.
// - The Company class maintains a list of employees and displays their details.	
	
	
// Q. WAJP to convert all the elemets of array into List.

// Q. WAJP to create array which can store different type of data.
// 	= {10,"LPU",'a',null,false,10.5}
	
// Q. WAJP to convert all the elements of List into Array.








import java.util.*;

class Employee {
    private int empId;
    private String name;
    private double salary;

    private Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public static Employee createEmployee(int empId, String name, double salary) {
        return new Employee(empId, name, salary);
    }

    public void displayEmployee() {
        System.out.println("ID: " + empId + ", Name: " + name + ", Salary: " + salary);
    }
}

class Company {
    private List<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void displayAllEmployees() {
        System.out.println("\n--- Company Employee List ---");
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }
}

public class P4 {
    public static void main(String[] args) {

        // ===========================
        // Q1: Employee + Company
        // ===========================
        Company c = new Company();

        Employee e1 = Employee.createEmployee(101, "Amit", 45000);
        Employee e2 = Employee.createEmployee(102, "Riya", 52000);
        Employee e3 = Employee.createEmployee(103, "John", 60000);

        c.addEmployee(e1);
        c.addEmployee(e2);
        c.addEmployee(e3);

        c.displayAllEmployees();


        // ===========================
        // Q2: Convert Array -> List
        // ===========================
        System.out.println("\n--- Array to List ---");
        Integer[] numArr = {10, 20, 30, 40, 50};

        List<Integer> numList = new ArrayList<>(Arrays.asList(numArr));
        System.out.println("Array: " + Arrays.toString(numArr));
        System.out.println("List: " + numList);


        // ===========================
        // Q3: Array storing different type of data
        // ===========================
        System.out.println("\n--- Mixed Type Array ---");
        Object[] mixedArr = {10, "LPU", 'a', null, false, 10.5};

        System.out.println("Mixed Array Elements:");
        for (Object x : mixedArr) {
            System.out.println(x);
        }


        // ===========================
        // Q4: Convert List -> Array
        // ===========================
        System.out.println("\n--- List to Array ---");
        List<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");

        String[] langArr = languages.toArray(new String[0]);

        System.out.println("List: " + languages);
        System.out.println("Array: " + Arrays.toString(langArr));
    }
}
