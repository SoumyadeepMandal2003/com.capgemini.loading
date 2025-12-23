/*

WAP to print numbers from the range using Do-While Loop

-111 to -101

123 to 113

5 to -5

-10 to 0


WAP to print characters from the range

s to l

T to Z

*/





public class LoopsQuestion3{

	public static void print1(){
		int i = -111;
		do{
			System.out.print(i + " ");
			i++;
		}while(i<-100);

	System.out.println();

	}

	public static void print2(){
		int i = 123;
		do{
			System.out.print(i + " ");
			i--;
		}while(i>112);
	System.out.println();
	
	}

	public static void print3(){
		int i = 5;
		do{
			System.out.print(i + " ");
			i--;
		}while(i>-6);
	System.out.println();
	}

	public static void print4(){
		int i = -10;
		do{
			System.out.print(i + " ");
			i++;
		}while(i<=0);
	System.out.println();
	}

	public static void print5(){
		char i = 's';
		do{
			System.out.print(i + " ");
			i--;
		}while(i>='l');
	System.out.println();
	}


	public static void print6(){
		char i = 'T';
		do{
			System.out.print(i + " ");
			i++;
		}while(i<='Z');
	System.out.println();
	}


	public static void main(String[] args){
		print1();
		print2();
		print3();
		print4();
		print5();
		print6();
	}
}