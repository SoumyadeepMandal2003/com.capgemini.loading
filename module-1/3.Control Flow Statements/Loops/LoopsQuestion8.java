

/*

WAP to in which given an integer n, return the number of prime numbers that are strictly less than n.

Example 1:
Input: n = 10
Output: 4

Explaination: There are 4 prime numbers than 10, they are 2, 3, 5, 7.

*/



import java.util.Scanner;



public class LoopsQuestion8{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num;
		boolean isPrime;
		int count = 0;

		System.out.print("Enter a number: ");
		num = sc.nextInt();

		for(int i = 2;i<=num;i++){
			isPrime = true;

			for(int j = 2;j<=i/2;j++){
				if(i%j == 0){
					isPrime = false;
					break;
				}
			}
			if(isPrime)
				count++;
		}

		System.out.println(count);
		sc.close();
	}
}