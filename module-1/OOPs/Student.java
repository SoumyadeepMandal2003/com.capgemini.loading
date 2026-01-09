package OOPs;

//WAJP to create a static method that return address of a object:-


public class Student{
    String name;
    int rollNumber;

    Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber; 
    }

    public static String addressOfObject(Student s1){
        return "Address of the object is: "+s1;
    }

    public void showDetails(){
        System.out.println("Student name is "+name+" and roll no. is "+rollNumber);
    }
}


class StudentTest {
    public static void main(String[] args){
        Student s1 = new Student("John", 101);
        System.out.println(Student.addressOfObject(s1));
        s1.showDetails();
    }
}
