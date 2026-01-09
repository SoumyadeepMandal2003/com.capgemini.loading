package Loops;

import java.util.Scanner;

/*

Print digits of given number
Print even digits of given number
Print prime digits of given number
Sum of all digits
Product of (even digit sum) and (odd digit sum)
Smallest digit
Largest digit
Second smallest digit
Second largest digit

Logic used:
- while loop
- % 10 to extract digit
- / 10 to remove digit

*/

public class DigitPrograms{

    
    static void printDigits(int n) {
        while (n > 0) {
            System.out.println(n % 10);
            n /= 10;
        }
    }

    
    static void printEvenDigits(int n) {
        while (n > 0) {
            int d = n % 10;
            if (d % 2 == 0)
                System.out.println(d);
            n /= 10;
        }
    }

    
    static void printPrimeDigits(int n) {
        while (n > 0) {
            int d = n % 10;
            if (d == 2 || d == 3 || d == 5 || d == 7)
                System.out.println(d);
            n /= 10;
        }
    }

    
    static void sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);
    }

    
    static void productEvenOddSum(int n) {
        int evenSum = 0, oddSum = 0;
        while (n > 0) {
            int d = n % 10;
            if (d % 2 == 0)
                evenSum += d;
            else
                oddSum += d;
            n /= 10;
        }
        System.out.println(evenSum * oddSum);
    }

    
    static void smallestDigit(int n) {
        int min = 9;
        while (n > 0) {
            int d = n % 10;
            if (d < min)
                min = d;
            n /= 10;
        }
        System.out.println(min);
    }

    
    static void largestDigit(int n) {
        int max = 0;
        while (n > 0) {
            int d = n % 10;
            if (d > max)
                max = d;
            n /= 10;
        }
        System.out.println(max);
    }


    static void secondSmallestDigit(int n) {
        int min1 = 9, min2 = 9;
        while (n > 0) {
            int d = n % 10;
            if (d < min1) {
                min2 = min1;
                min1 = d;
            } else if (d < min2 && d != min1) {
                min2 = d;
            }
            n /= 10;
        }
        System.out.println(min2);
    }

    
    static void secondLargestDigit(int n) {
        int max1 = 0, max2 = 0;
        while (n > 0) {
            int d = n % 10;
            if (d > max1) {
                max2 = max1;
                max1 = d;
            } else if (d > max2 && d != max1) {
                max2 = d;
            }
            n /= 10;
        }
        System.out.println(max2);
    }

    
    @SuppressWarnings("ConvertToTryWithResources")
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        
        printDigits(n);
        printEvenDigits(n);
        printPrimeDigits(n);
        sumOfDigits(n);
        productEvenOddSum(n);
        smallestDigit(n);
        largestDigit(n);
        secondSmallestDigit(n);
        secondLargestDigit(n);
        sc.close();
    }
}
