import java.util.Scanner;

public class PStatement1{
	public static void main(String[] a){
		Scanner sc = new Scanner(System.in);
		int eID, choice, dept;
		String name, role = "", department = "", accessLevel;
		double baseSalary,finalSalary,allowance = 0d;

		System.out.print("Enter ID: ");
		eID = sc.nextInt();
		sc.nextLine();
		System.out.print("Employee Name: ");
		name = sc.nextLine();
		System.out.print("Basic Salary: ");
		baseSalary = sc.nextDouble();
		System.out.print("Select Choice(1.IT, 2.HR, 3.Finance): ");
		choice = sc.nextInt();


		switch(choice){
		case 1:
			department = "IT";
			System.out.print("Select Dept(1.Developer, 2.Tester): ");
			dept = sc.nextInt();
			switch(dept){
			case 1:
				allowance = 30d;
				break;
			case 2:
				allowance = 25d;
				role = "Tester";
				break;
			}
			break;
		case 2:
			department = "HR";
			System.out.print("Select Dept(1.Recruiter, 2.Payroll): ");
			dept = sc.nextInt();
			switch(dept){
			case 1:
				allowance = 20d;
				role = "Recruiter";
				break;
			case 2:
				allowance = 22d;
				role = "Payroll";
				break;
			}
			break;
		case 3:
			department = "Finance";
			System.out.print("Select Dept(1.Accountant, 2.Auditor): ");
			dept = sc.nextInt();
			switch(dept){
			case 1:
				allowance = 28d;
				role = "Accountant";
				break;
			case 2:
				allowance = 26d;
				role = "Auditor";
				break;
			}
			break;
		}

		finalSalary = baseSalary + (baseSalary*(allowance/100));

		if(finalSalary>=60000 && department.equals("IT")){
			accessLevel = "Admin Access";
		}else if(finalSalary>=60000 && department.equals("IT")){
			accessLevel = "Manager Access";
		}else{
			accessLevel = "Employee Access";
		}


		System.out.println("Employee ID: "+eID);
		System.out.println("Name: "+name);
		System.out.println("Department: "+department);
		System.out.println("Role: "+role);
		System.out.println("Basic Salary: "+baseSalary);
		System.out.println("Final Salary: "+finalSalary);
		System.out.println("Access Level: "+accessLevel);

		sc.close();
	}
}