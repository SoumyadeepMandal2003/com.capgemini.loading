package OOPs;

public class PS3 {
    int id;
    String name;

    //parameterized constructor
    public PS3(int id, String name) {
        this.id = id;
        this.name = name;
    }
    //copy constructor
    public PS3(PS3 obj) {
        this.id = obj.id;
        this.name = obj.name;
    }

    //main method
    public static void main(String[] args) {
        System.out.println("Main method started");
        PS3 ref1 = new PS3(101, "Rohit");
        System.out.println("ID: " + ref1.id + ", Name: " + ref1.name);

        System.out.println("After copy constructor:");
        PS3 ref2 = new PS3(ref1);
        System.out.println("ID: " + ref2.id + ", Name: " + ref2.name);
    }
}
