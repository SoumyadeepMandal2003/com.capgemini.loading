import java.util.Scanner;

public class StoreReorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int stock = sc.nextInt();
        boolean fast = sc.nextBoolean();
        boolean discontinued = sc.nextBoolean();
        boolean reorder = (stock < 10 || fast) && !discontinued;
        stock += reorder ? 50 : 0;
        System.out.println(stock);
    }
}
