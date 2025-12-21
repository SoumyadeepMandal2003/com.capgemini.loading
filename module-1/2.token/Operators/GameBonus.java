import java.util.Scanner;

public class GameBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        boolean onTime = sc.nextBoolean();
        boolean cheats = sc.nextBoolean();
        boolean bonus = score > 100 && onTime && !cheats;
        score += bonus ? 50 : 0;
        System.out.println(score);
    }
}
