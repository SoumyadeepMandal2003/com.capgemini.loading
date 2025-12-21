import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean user = sc.nextBoolean();
        boolean pass = sc.nextBoolean();
        boolean locked = sc.nextBoolean();
        int attempts = sc.nextInt();
        boolean login = user && pass && !locked;
        attempts += login ? 0 : 1;
        locked = attempts >= 3 ? true : locked;
        System.out.println(locked);
    }
}
