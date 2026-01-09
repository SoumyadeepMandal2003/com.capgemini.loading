package OOPs.relationships;

class Address {
    String city;
    String state;
    public Address(String city, String state) {
        this.city = city;
        this.state = state;
    }


}

class Student{
    int id;
    String name;
    double marks;
    Address address;
    public Student(int id, String name, double marks, Address address) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.address = address;
    }
}


public class PS1{
    public static void main(String[] args) {
        Address addr = new Address("Mumbai", "Maharashtra");
        Student student = new Student(101, "Rohit", 85.5, addr);
        System.out.println("Student Name: " + student.name);
        System.out.println("City: " + student.address.city);
        System.out.println("State: " + student.address.state);
    }
}
