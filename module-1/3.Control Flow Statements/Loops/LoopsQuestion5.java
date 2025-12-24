/*

WAP to check if given char is

Uppercase Vowel
Uppercase Consonant
Lowercase Vowel
Lowercase Consonant


If the given char is Uppercase Vowel, print numbers from the range 10 to 20 using do while Loop

If the given char is Lowercase Vowel, print numbers from the range -10 to -20 using while loop

If the given char is Uppercase consonant, print numbers from the range 25 to 15 using for loop

If the given char is Lowercase consonant, print numbers from the range -25 to -15 using for loop


WAP to print even numbers from the range 1 to 20.
WAP to print numbers which are divisible by 7 from the range of 100 to 50.
WAP to print sum of all numbers from 1 to 10.
WAP to print products of all numbers from 1 to 10.

*/



public class LoopsQuestion5{

	public static void print1(){
		char ch = 'I';
		if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
			int num = 10;
			do{
				System.out.print(num + " ");
				num++;
			}while(num<=20);
		}
		System.out.println();
	}


	public static void print2(){
		char ch = 'i';
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
			int num = -10;
			while(num>=-20){
				System.out.print(num + " ");
				num--;
			}
		}
		System.out.println();
	}

	public static void print3(){
		char ch = 'Y';
		if((ch>'A' && ch<'Z') && (ch != 'A' || ch != 'E' || ch != 'I' || ch != 'O' || ch != 'U')){
			for(int num = 25;num>=15;num--){
				System.out.print(num + " ");
				;
			}
		}
		System.out.println();
	}

	public static void print4(){
		char ch = 'y';
		if((ch>'a' && ch<'z') && (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u')){
			for(int num = -25;num<=-15;num++){
				System.out.print(num + " ");
				;
			}
		}
		System.out.println();
	}

	public static void main(String[] args){

		print1();
		print2();
		print3();
		print4();
	}
}