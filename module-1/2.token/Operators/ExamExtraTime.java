import java.util.Scanner;

public class ExamExtraTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean challenged = sc.nextBoolean();
        int attendance = sc.nextInt();
        boolean approval = sc.nextBoolean();
        int time = sc.nextInt();
        boolean extra = challenged || (attendance < 60 && approval);
        time += extra ? 30 : 0;
        System.out.println(time);
    }
}
