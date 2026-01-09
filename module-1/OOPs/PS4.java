package OOPs;

/*
Create a Java class named Student with the following requirements:

1.Instance Variables:
    1️⃣int id
    2️⃣String name
    3️⃣int[] marks (size = 3)

2.Then Create:
    A parameterized constructor to initialize all instance variables.
    A copy constructor that creates a deep copy of a Student object.

3.In the Main Method :
    Create one Student object using the parameterized constructor.
    Create another Student object using the copy constructor.
    Modify the marks of the copied object.
    Print details of both objects.

4.Condition:
    Ensure that changes made to the copied object do not affect the original object.

*/




public class PS4 {

    int id;
    String name;
    int[] marks;

    // Parameterized Constructor
    PS4(int id, String name, int[] marks) {
        this.id = id;
        this.name = name;

        // Deep copy of array
        this.marks = new int[marks.length];
        for (int i = 0; i < marks.length; i++) {
            this.marks[i] = marks[i];
        }
    }

    // Copy Constructor (Deep Copy)
    PS4(PS4 s) {
        this.id = s.id;
        this.name = s.name;

        this.marks = new int[s.marks.length];
        for (int i = 0; i < s.marks.length; i++) {
            this.marks[i] = s.marks[i];
        }
    }

    void display() {
        System.out.print("ID: " + id + ", Name: " + name + ", Marks: ");
        for (int m : marks) {
            System.out.print(m + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        int[] marks = {85, 90, 95};

        // Original object
        PS4 s1 = new PS4(101, "Rahul", marks);

        // Copied object
        PS4 s2 = new PS4(s1);

        // Modify copied object's marks
        s2.marks[0] = 50;

        System.out.println("Original Student:");
        s1.display();

        System.out.println("Copied Student:");
        s2.display();
    }
}
