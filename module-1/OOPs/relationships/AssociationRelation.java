package OOPs.relationships;

/******************************************************************************
HAS-A Relationship (Association Relationship) in Java

One class contains/owns the reference of another class/data members.

Achieved by:
1. Creating object of one class inside another class(as INSTANCE VARIABLE).
2. Using reference variable of one class inside another class.


Types:1. Aggregation (Weak Association)
   - The contained class can exist independently of the container class.
    - Example: Car HAS-A Music-Player. A "Music-Player" class contains "Car" objects. Car can exist without the Music-Player.

    2. Composition (Strong Association)
    - The contained class cannot exist independently of the container class.
    - Example: Car HAS-A Engine "Car" class contains an "Engine" object. The engine cannot exist without the car.

*******************************************************************************/
class Address{
    String city;
    String state;
    
    Address(String city, String state){
        this.city = city;
        this.state = state;
    }
    
    void displayDetails(){
        System.out.println("Address: "+state+" ( "+city+" )");
    }
}
class Student{
    String name;
    int rollNumber;
    
    Student(String name, int rollNumber){
        this.name = name;
        this.rollNumber = rollNumber;
    }
    
    Address add = new Address("Malda","West Bengal");
    
    public void showDetails(){
        System.out.println("Name: "+name);
        System.out.println("Roll No: "+rollNumber);
        add.displayDetails();
    }
}
public class AssociationRelation
{
	public static void main(String[] args) {
		Student st1 = new Student("Soumyadeep",12);
		st1.showDetails();
	}
}
