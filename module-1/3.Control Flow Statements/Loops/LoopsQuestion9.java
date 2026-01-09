package Loops;

/*

WAP to show factorial a number

**recursion --> S.C. O(n) && T.C. O(n)
**Loops --> S.C. O(1) && T.C. O(n)

*/



import java.util.Scanner;



public class LoopsQuestion9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int fact = 1;
		int num = sc.nextInt();
		
		if(num>0){
			for(int i = num;i>0;i--){
				fact *= i;
			}
		}
		System.out.println(fact);
		sc.close();
	}
	
}