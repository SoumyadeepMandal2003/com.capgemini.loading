package Arrays;

// WAJP to find count of elements which are divisible by k.
// 	INPUT :  
// 	int n=7
// 	int[] a=9,-13,8,-7,-8,18,10
// 	int k = 18

// 	OUTPUT: 2





import java.util.Scanner;

public class ArrayQuestions3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 7;
        int[] arr = new int[n];
        System.out.print("Enter " + n + " elements:");
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the value of k:");
        int k = sc.nextInt();
        int count = 0;
        for(int i=0;i<n;++i){
            if(arr[i] % k == 0){
                count++;
            }
        }
        System.out.println("Count of elements divisible by " + k + " is: " + count);
        sc.close();
    }
}