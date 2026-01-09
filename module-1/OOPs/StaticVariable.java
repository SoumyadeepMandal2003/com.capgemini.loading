package OOPs;

class StaticVariable {

    // static variable
    static int a = 10;

    // static block
    static {
        System.out.println("Static block executed");
        System.out.println("a = " + a);
    }

    // static method
    static void display() {
        System.out.println("Static method called");
        System.out.println("a = " + a);
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        display();
    }
}
