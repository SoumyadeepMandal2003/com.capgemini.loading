import java.util.Scanner;

public class EmployeeIncrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rating = sc.nextInt();
        int experience = sc.nextInt();
        boolean discipline = sc.nextBoolean();
        double salary = sc.nextDouble();
        boolean eligible = (rating > 4 || experience > 5) && !discipline;
        salary += eligible ? 5000 : 0;
        System.out.println(eligible ? salary : salary);
    }
}
