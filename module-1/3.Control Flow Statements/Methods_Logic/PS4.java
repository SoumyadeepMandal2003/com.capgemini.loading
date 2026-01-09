package Methods_Logic;

/*

WAJP that uses only parameterized methods (no logic in main) to analyze a given number.
Implement these methods:

1. int reverseNumber(int num)
This method takes an integer as input and returns the reverse of the given number.

2. boolean isPalindrome(int num, int reversed)
This method checks whether the given number is a palindrome.
It returns true if the original number and its reversed value are the same; otherwise, it returns false.

3. boolean isStrongNumber(int num)
This method checks whether the given number is a Strong Number.
A number is called a Strong Number if the sum of the factorials of its digits is equal to the original number.

4.int countPrimeDigits(int num)
This method counts and returns the number of prime digits present in the given number.
(Prime digits are: 2, 3, 5, 7)

5. void numberReport(int num)
This method calls all the above methods and displays the following details:

Reverse of the number

Whether the number is a Palindrome

Whether the number is a Strong Number

Count of prime digits in the number

*/



import java.util.Scanner;

public class PS4 {

    // 1. Reverse Number
    static int reverseNumber(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }

    // 2. Check Palindrome
    static boolean isPalindrome(int num, int reversed) {
        return num == reversed;
    }

    // 3. Check Strong Number
    static boolean isStrongNumber(int num) {
        int temp = num;
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == num;
    }

    static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // 4. Count Prime Digits
    static int countPrimeDigits(int num) {
        int count = 0;

        while (num > 0) {
            int digit = num % 10;
            if (isPrime(digit)) {
                count++;
            }
            num /= 10;
        }
        return count;
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    // 5. Number Report
    static void numberReport(int num) {
        int reversed = reverseNumber(num);

        System.out.println("Reverse of the number: " + reversed);
        System.out.println("Palindrome: " + isPalindrome(num, reversed));
        System.out.println("Strong Number: " + isStrongNumber(num));
        System.out.println("Count of Prime Digits: " + countPrimeDigits(num));
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        numberReport(num);
        sc.close();
    }
}
