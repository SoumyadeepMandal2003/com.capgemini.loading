package Methods_Logic;

/*

WAP to create Calculator class consist 4 methods

1. Add 3 Variables

2. Multiply 3 Values

3. Subtract 2 Variables

4. Add 2 Variables

*/







public class PS1 {
    public static void main(String[] args) {
        addThreeVariables(10, 15 , 25);
        subtractTwoVariables((50), 25);
        multiplyThreeValues(2, 4, 6);
    }
    

    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome to the Java Programming.");
    }

    public static void addThreeVariables(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum of three variables: " + sum);
    }

    public static void multiplyThreeValues(int x, int y, int z) {
        int product = x * y * z;
        System.out.println("Product of three values: " + product);
    }
    public static void subtractTwoVariables(int p, int q) {
        int difference = p - q;
        System.out.println("Difference of two variables: " + difference);
    }
}
