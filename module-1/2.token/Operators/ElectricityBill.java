import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units = sc.nextInt();
        boolean commercial = sc.nextBoolean();
        double bill = units * (units > 300 || commercial ? 6 : 4);
        bill += bill * 0.1;
        System.out.println(bill);
    }
}
