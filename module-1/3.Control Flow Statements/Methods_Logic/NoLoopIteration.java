package Methods_Logic;




public class NoLoopIteration {

    // WAP to print all numbers from 1 to 1000 without using any loop.

    public static void printNumbers1(int start) {
        if (start <= 1000) {
            System.out.println(start);
            printNumbers1(start++);
        }
    }



    //WAP to print odds from 500 to 50 w/o loop

    public static void printNumbers2(int start){
        if(start>=50){
            if(start%2!=0){
                System.out.println(start);
            }
            printNumbers2(--start);
        }
    }


    //WAP to sum of all numbers from 1 to 5 w/o loop

     public static int sumNumbers(int n){
        if(n==1){
            return 1;
        }
        return n + sumNumbers(n-1);
     }

    public static void main(String[] args){
        // printNumbers1(1);
        // printNumbers2(500);
        System.out.println("Sum is: " + sumNumbers(5));
    }
}
