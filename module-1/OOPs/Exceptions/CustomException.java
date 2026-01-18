package OOPs.Exceptions;


class NotEligibleException extends Exception {
    public NotEligibleException(String message) {
        System.out.println(message);
    }
}

public class CustomException {
    public static void main(String[] args) {
        System.out.println("Main Started");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        try {
            eligibleForVoting(age);
        } catch (NotEligibleException e) {
            e.printStackTrace();
        }
        System.out.println("Program Ended");
    }
    public static void eligibleForVoting(int age) throws NotEligibleException {
        if (age >= 18) {
            throw new NotEligibleException("You are eligible for voting");
        } else {
            throw new NotEligibleException("You are not eligible for voting, you must be at least 18 years old.");
        }
    }
}
