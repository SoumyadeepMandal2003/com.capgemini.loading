import java.util.Scanner;

public class PStatement2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int pID=0,age,choice,discount=0;
		String pName="", travelMedium="", selectedClass = "", bookingStatus = "";
		double bFare = 0d, multiplier = 0d, totalFare = 0d;
		boolean isGovEmployee = false;


		System.out.print("Passenger Name: ");
		pName = sc.nextLine();
		System.out.print("Age: ");
		age = sc.nextInt();
		sc.nextLine();
		System.out.print("Government Employee(T/F): ");
		isGovEmployee = sc.nextBoolean();
		System.out.print("Base Fare: ");
		bFare = sc.nextDouble();
		

		if(age<5){
			System.out.println("Free Ticket - No Booking Required");
			sc.close();
			return;
		}else if(age>80){
			System.out.println("Medical Clearance Required");
			sc.close();
			return;
		}else{
			System.out.print("Select Medium(Bus,Train,Flight): ");
			travelMedium = sc.next();

			switch(travelMedium){
			case "Bus":
				System.out.print("Select Choice(1.Sleeper, 2.Seater): ");
				choice = sc.nextInt();
				switch(choice){
					case 1:
						selectedClass = "Sleeper";
						multiplier = 1.2d;
						break;
					case 2:
						selectedClass = "Seater";
						multiplier = 1.0d;
						break;
				}
				break;
			case "Train":
				System.out.print("Select Choice(1.Sleeper, 2.Seater, 3.AC): ");
				choice = sc.nextInt();
				switch(choice){
					case 1:
						selectedClass = "General";
						multiplier = 1.0d;
						
						break;
					case 2:
						selectedClass = "Sleeper";
						multiplier = 1.3d;
						break;
					case 3:
						selectedClass = "AC";
						multiplier = 1.6d;
						break;
				}
				break;
			case "Flight":
				System.out.print("Select Choice(1.Economy, 2.Business): ");
				choice = sc.nextInt();
				switch(choice){
					case 1:
						selectedClass = "Economy";
						multiplier = 2.5d;
						break;
					case 2:
						selectedClass = "Business";
						multiplier = 3.5d;
						break;
				}
				break;
			}

			totalFare = bFare * multiplier;

			if(age>=60){
				discount = 30;
			}else if(isGovEmployee){
				discount = 15;
			}else if(age>5 && age<12){
				discount = 50;
			}else{
				discount = 0;
			}

			totalFare -= (totalFare*(discount/100.0));

			if(totalFare>=10000){
				if(travelMedium.equals("Flight")){
					bookingStatus = "Confirmed";
				}else{
					bookingStatus = "Waiting List";
				}
			}else{
				bookingStatus = "Confirmed";
			}

		}

		System.out.println("Passenger ID: "+pID);
		System.out.println("Name: "+pName);
		System.out.println("Travel Type: "+travelMedium);
		System.out.println("Class: "+selectedClass);
		System.out.println("Base fare: "+bFare);
		System.out.println("Final Fare: "+totalFare);
		System.out.println("Discount Applied: "+discount+"%");
		System.out.println("Booking Status: "+bookingStatus);

		sc.close();
	}
}