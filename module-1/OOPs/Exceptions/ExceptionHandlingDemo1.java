package OOPs.Exceptions;

import java.util.Scanner;

public class ExceptionHandlingDemo1 {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter first number: ");
            int a = sc.nextInt();
            System.out.print("Enter second number: ");
            int b = sc.nextInt();
            int result = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Handled");
        }finally {
            System.err.println("Finally Block Executed");
            sc.close();
            System.out.println("Scanner closed");
        }

        System.out.println("Program ended");
    }
}
