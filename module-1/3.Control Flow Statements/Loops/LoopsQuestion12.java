
/*

Write a program to print the first n numbers in the Fibonacci sequence.
0, 1, 1, 2, 3, 5, 8, 13, ...

*/



import java.util.Scanner;



public class LoopsQuestion12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        if(n==0){
            System.out.println(0);}
        else if(n==1){
            System.out.println("0 1");
        }else{
            System.out.print("0 1 ");
            //logic to print fibonacci numbers
            int a=0;
            int b=1;
            int c;
            for(int j=2;j<n;j++){
                c=a+b;
                System.out.print(c+" ");
                a=b;
                b=c;
            }
        }
        sc.close();
    }
}
