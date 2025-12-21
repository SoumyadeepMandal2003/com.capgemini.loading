import java.util.Scanner;

/*
WAP to check the grade of a student using Switch-Case
WAP to perform Arithmetic Operations of User Choice using Switch-Case
WAP to display an employee designation based on the department and role selected by user
*/

public class SwitchCaseQuestions{
public static void gradeCheck(Scanner sc){
	System.out.print("Enter Grade: ");
		char ch = sc.next().charAt(0);
		switch(ch){
		case 'A':
			System.out.println("Excellent");break;
		case 'B':
			System.out.println("Good");break;
		case 'C':
			System.out.println("Fair");break;
		case 'D':
			System.out.println("Pass");break;
		case 'E':
			System.out.println("Fail");break;
		default:
			System.out.println("You chose wrong Grade");break;
		}

		System.out.println("We are out of Switch Case Statement");
}


public static void arithOps(Scanner sc) {

    int choice, count;
    double a, b, c, d, result;

    System.out.println("Choose Operation:");
    System.out.println("1. Addition");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Division");

    choice = sc.nextInt();

    switch (choice) {

        case 1:
            System.out.print("Enter number of variables 2 || 3 || 4 : ");
            count = sc.nextInt();

            if (count == 2) {
                a = sc.nextDouble();
                b = sc.nextDouble();
                result = a + b;
            } else if (count == 3) {
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();
                result = a + b + c;
            } else if (count == 4) {
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();
                d = sc.nextDouble();
                result = a + b + c + d;
            } else {
                System.out.println("Invalid count");
                return;
            }
            System.out.println("Result = " + result);
            break;

        case 2:
            System.out.print("Enter number of variables 2 || 3 || 4 : ");
            count = sc.nextInt();

            if (count == 2) {
                a = sc.nextDouble();
                b = sc.nextDouble();
                result = a - b;
            } else if (count == 3) {
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();
                result = a - b - c;
            } else if (count == 4) {
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();
                d = sc.nextDouble();
                result = a - b - c - d;
            } else {
                System.out.println("Invalid count");
                return;
            }
            System.out.println("Result = " + result);
            break;

        case 3:
            System.out.print("Enter number of variables 2 || 3 || 4 : ");
            count = sc.nextInt();

            if (count == 2) {
                a = sc.nextDouble();
                b = sc.nextDouble();
                result = a * b;
            } else if (count == 3) {
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();
                result = a * b * c;
            } else if (count == 4) {
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();
                d = sc.nextDouble();
                result = a * b * c * d;
            } else {
                System.out.println("Invalid count");
                return;
            }
            System.out.println("Result = " + result);
            break;

        case 4:
            a = sc.nextDouble();
            b = sc.nextDouble();

            if (b == 0) {
                System.out.println("Division by zero not allowed");
            } else {
                result = a / b;
                System.out.println("Result = " + result);
            }
            break;

        default:
            System.out.println("Invalid operation");
    }
}


public static void employeeDesignation(Scanner sc) {

    String dept;

    System.out.println("Choose Operation:");
    System.out.print(" IT || HR || Finance || Operations :");
    dept = sc.next();

    switch (dept) {

        case "IT":
        	System.out.println("Software Developer");
        	System.out.println("Tester");
        	System.out.println("Dev Ops");
        	break;
        case "HR":
        	System.out.println("Recruiter");
        	System.out.println("HR Executive");
        	System.out.println("Payroll Officer");
        	break;
        case "Finance":
        	System.out.println("Accountant");
        	System.out.println("Finance Analyst");
        	System.out.println("Auditor");
        	break;
        case "Operations":
        	System.out.println("Operation Executive");
        	System.out.println("Team Lead");
        	System.out.println("Manager");
        	break;
        default:
            System.out.println("Invalid Department");
    }
    System.out.println("Out of Switch Statement");
}




	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		gradeCheck(sc);
		arithOps(sc);
		employeeDesignation(sc);
	}
}