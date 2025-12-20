/*
WAP to check given no. is divisible by 7 or not??
WAP to check given number divisible by both 3 and 5 or not??
WAP to check input is vowel or consonent??
WAP to check given number is digit or not??
WAP to check a given char is uppercase lowercase digit or special.
WAP to check character is Uppercase Vowel, Uppercase Consonent, Lowercase Vowel, Lowercase Consonent.
WAP to check given number positive negative or zero.
WAP to find Max from three numbers.
WAP to check Min from three numbers.
*/




import java.util.Scanner;

public class IfElseQuestions {

    static void divisibleBy7(Scanner sc) {
        System.out.print("Enter number for divisible by 7: ");
        int n = sc.nextInt();
        System.out.println(n % 7 == 0 ? "Divisible by 7" : "Not divisible by 7");
    }

    static void divisibleBy3And5(Scanner sc) {
        System.out.print("Enter number for divisible by 3 and 5: ");
        int n = sc.nextInt();
        System.out.println(n % 3 == 0 && n % 5 == 0
                ? "Divisible by both 3 and 5"
                : "Not divisible by both");
    }

    static void vowelOrConsonant(Scanner sc) {
        System.out.print("Enter character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            System.out.println("Vowel");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("Consonant");
        else
            System.out.println("Invalid input");
    }

    static void digitOrNot(Scanner sc) {
        System.out.print("Enter character to check digit: ");
        char ch = sc.next().charAt(0);

        System.out.println(ch >= '0' && ch <= '9' ? "Digit" : "Not a digit");
    }

    static void upperLowerDigitSpecial(Scanner sc) {
        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z')
            System.out.println("Uppercase Letter");
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("Lowercase Letter");
        else if (ch >= '0' && ch <= '9')
            System.out.println("Digit");
        else
            System.out.println("Special Character");
    }

    static void vowelConsonantByCase(Scanner sc) {
        System.out.print("Enter alphabet: ");
        char ch = sc.next().charAt(0);

        if (ch >= 'A' && ch <= 'Z') {
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
                System.out.println("Uppercase Vowel");
            else
                System.out.println("Uppercase Consonant");
        }
        else if (ch >= 'a' && ch <= 'z') {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
                System.out.println("Lowercase Vowel");
            else
                System.out.println("Lowercase Consonant");
        }
        else {
            System.out.println("Not an alphabet");
        }
    }


    static void positiveNegativeOrZero(Scanner sc) {
        System.out.print("Enter number to check positive/negative/zero: ");
        int n = sc.nextInt();

        if (n > 0)
            System.out.println("Positive Number");
        else if (n < 0)
            System.out.println("Negative Number");
        else
            System.out.println("Zero");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        divisibleBy7(sc);
        divisibleBy3And5(sc);
        vowelOrConsonant(sc);
        digitOrNot(sc);
        upperLowerDigitSpecial(sc);
        vowelConsonantByCase(sc);
    }
}
	