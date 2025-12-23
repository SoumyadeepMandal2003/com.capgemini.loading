/*
WAP to print numbers from range

1. -123 to 129
2. 79 to 84
3. -110 to -100
4. 0 to -9

by using while loop.
*/


public class LoopsQuestion1{

	public static void print1(){
		int i = -123;
		while(i<=129){
			System.out.print(i + " ");
			i++;
		}
	System.out.println();		
	}

	public static void print2(){
		int i = 79;
		while(i<=84){
			System.out.print(i + " ");
			i++;
		}
	System.out.println();		
	}

	public static void print3(){
		int i = -110;
		while(i<=-100){
			System.out.println(i + " ");
			i++;
		}
	System.out.println();		
	}

	public static void print4(){
		int i = 0;
		while(i>-10){
			System.out.println(i + " ");
			i--;
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