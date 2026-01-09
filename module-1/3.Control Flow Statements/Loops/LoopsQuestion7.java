package Loops;

/*

WAP in which

user variable
count variable

for loop
	if condition
		count++
if count value is 2
	so the given num is prime
else not a prime

*/


import java.util.Scanner;

public class LoopsQuestion7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n;
		int count = 0;

		System.out.print("Enter a number: ");
		n = sc.nextInt();

		for(int i = 1;i<=n;i++){
			if(n%i == 0){
				count++;
			}
		}

		if(count==2){
			System.out.println("Given Number is Prime");
		}else{
			System.out.println("Given number is not prime");
		}
		sc.close();
	}
}