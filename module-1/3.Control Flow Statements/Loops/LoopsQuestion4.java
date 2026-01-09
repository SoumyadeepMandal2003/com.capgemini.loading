package Loops;

/*

WAP to print char from range using for loop

1111 to 1121
1234 to 1223
-1111  to -1121
-1234 to -1223

and also

d to j
m to e
z to t
r to x


*/






public class LoopsQuestion4{

	public static void print1(){
		for(int i = 1111; i<1122; i++){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void print2(){
		for(int i = 1234; i>1222; i--){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void print3(){
		for(int i = -1111; i>=-1121; i--){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void print4(){
		for(int i = -1234; i<=-1223; i++){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void print5(){
		for(char i = 'd'; i<'k'; i++){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void print6(){
		for(char i = 'm'; i>'d'; i--){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void print7(){
		for(char i = 'z'; i>='t'; i--){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void print8(){
		for(char i = 'r'; i<='x'; i++){
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args){
		print1();
		print2();
		print3();
		print4();
		print5();
		print6();
		print7();
		print8();
	}
}