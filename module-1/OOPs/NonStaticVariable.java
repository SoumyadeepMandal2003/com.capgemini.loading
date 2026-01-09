package OOPs;

class NonStaticVariable {

    // non-static variable
    int x = 10;

    // non-static block
    {
        System.out.println("Non-static block executed");
        System.out.println("x = " + x);
    }

    // constructor
    NonStaticVariable() {
        System.out.println("Constructor executed");
    }

    // non-static method
    void display() {
        System.out.println("Non-static method called");
        System.out.println("x = " + x);
    }

    public static void main(String[] args) {
        System.out.println("Main method started");

        NonStaticVariable obj = new NonStaticVariable();
        obj.display();
    }
}

