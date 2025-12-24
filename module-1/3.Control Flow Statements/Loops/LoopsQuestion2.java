/*

WAP to print characters from the range

A to M

x to m

*/




public class LoopsQuestion2{

	public static void print1(){
		char i = 'A';
		while(i<='M'){
			System.out.println(i + " ");
			i++;
		}
	System.out.println();		
	}

	public static void print2(){
		char i = 'x';
		while(i>='m'){
			System.out.println(i + " ");
			i--;
		}
	System.out.println();
	}

	public static void main(String[] args){
		print1();
		print2();
	}
}