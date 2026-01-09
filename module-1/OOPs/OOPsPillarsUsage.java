package OOPs;

/*
Q1. Write a Java program to create a class called Person with private instance variables name, age. and country. Provide public getter and setter methods to access and modify these variables.
------------------------------------------------------------------------------------------

Q2. Write a Java program to create a class called Employee with private instance variables employee_id, employee_name, and employee_salary. Provide public getter and setter methods to access and modify the id and name variables, but provide a getter method for the salary variable that returns a formatted string.
------------------------------------------------------------------------------------------
*/



class Person {
    private String name;
    private int age;
    private String country;

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for country
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}

class Employee {
    private int employee_id;
    private String employee_name;
    private double employee_salary;

    // Getter and Setter for employee_id
    public int getEmployeeId() {
        return employee_id;
    }

    public void setEmployeeId(int employee_id) {
        this.employee_id = employee_id;
    }

    // Getter and Setter for employee_name
    public String getEmployeeName() {
        return employee_name;
    }

    public void setEmployeeName(String employee_name) {
        this.employee_name = employee_name;
    }

    // Getter for employee_salary with formatted string
    public String getEmployeeSalary() {
        return String.format("Salary: %.2f", employee_salary);
    }

    // Setter for employee_salary
    public void setEmployeeSalary(double employee_salary) {
        this.employee_salary = employee_salary;
    }
}
public class OOPsPillarsUsage {
    public static void main(String[] args) {
        // Testing Person class
        Person person = new Person();
        person.setName("Alice");
        person.setAge(30);
        person.setCountry("USA");

        System.out.println("Person Details:");
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Country: " + person.getCountry());

        // Testing Employee class
        Employee employee = new Employee();
        employee.setEmployeeId(101);
        employee.setEmployeeName("Bob");
        employee.setEmployeeSalary(75000);

        System.out.println("\nEmployee Details:");
        System.out.println("ID: " + employee.getEmployeeId());
        System.out.println("Name: " + employee.getEmployeeName());
        System.out.println(employee.getEmployeeSalary());
    }
}
