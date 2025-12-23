/*
WAP to print factorial of all numbers from 1 to 10.
WAP 
*/
public class LoopsQuestion10 {
    public static void printFactorial1() {
        for (int i = 1; i <= 10; i++) {
            int factorial = 1;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            System.out.println("Factorial of " + i + " is: " + factorial);
        }
    }

    public static void printFactorial2() {
        for (int i = 10; i >= 1; i--) {
            if(i % 2 != 0) {
            int factorial = 1;
            int j = i;
            while (j >= 1) {
                factorial *= j;
                j--;
            }
            System.out.println("Factorial of " + i + " is: " + factorial);
            }
        }
    }




    public static void main(String[] args) {
        printFactorial1();
        printFactorial2();

    }
}