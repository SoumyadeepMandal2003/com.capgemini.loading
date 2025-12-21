import java.util.Scanner;

public class BankWithdrawal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = sc.nextDouble();
        boolean active = sc.nextBoolean();
        double amount = sc.nextDouble();
        boolean allow = balance > 0 && active;
        balance -= allow ? amount : 0;
        System.out.println(allow ? "Withdrawn " + balance : "Denied " + balance);
    }
}
