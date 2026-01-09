package Methods_Logic;

/*

WAP that performs mutiple math operations using methods:

1.Find maximum : method findMax(int a, int b, int c)

2.Check Prime : method isPrime(int num) - checks if the number is prime or not

3.Find Min : method findMin(int a,int b, int c) takes three integers and returns smallest numbers

4.Fibonacci Calculations: method fibonacci(int n) that takes an integer n integer and return nth Fibonacci number


In the main method, call each of these functions with appropriate test values and diplay the result.

*/





import java.util.Scanner;

public class PS2 {

    
    static int findMax(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    
    static boolean isPrime(int num) {
        if (num <= 1)
            return false;

        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0)
                count++;
        }
        return count == 2;
    }

    
    static int findMin(int a, int b, int c) {
        int min = a;
        if (b < min) min = b;
        if (c < min) min = c;
        return min;
    }

    
    static int fibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter three numbers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        System.out.println("Maximum: " + findMax(x, y, z));
        System.out.println("Minimum: " + findMin(x, y, z));

        
        System.out.print("Enter a number to check prime: ");
        int num = sc.nextInt();
        System.out.println(isPrime(num) ? "Prime Number" : "Not a Prime Number");

        
        System.out.print("Enter n for Fibonacci: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci number at position " + n + " is: " + fibonacci(n));

        sc.close();
    }
}

