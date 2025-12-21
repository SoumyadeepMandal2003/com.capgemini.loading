import java.util.Scanner;

public class OnlineStoreDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double bill = sc.nextDouble();
        boolean premium = sc.nextBoolean();
        boolean firstTime = sc.nextBoolean();
        boolean discount = (bill > 2000 && premium) || !firstTime;
        bill -= discount ? 200 : 0;
        System.out.println(bill);
    }
}
