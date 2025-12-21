import java.util.Scanner;

public class TrafficFineSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int speed = sc.nextInt();
        int limit = sc.nextInt();
        boolean emergency = sc.nextBoolean();
        int fine = sc.nextInt();
        boolean apply = speed > limit && !emergency;
        fine += apply ? 500 : 0;
        System.out.println(fine);
    }
}
