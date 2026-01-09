package Methods_Logic;

/*

WAP to check if a number is a part of Fibonacci series or not?? if yes return true else false

*/






public class PS3{

    public static boolean isFibonacci(int num) {
        if (num<1)
            return false;
        else{
            int a = 0, b = 1, sum = 0;
            while (sum < num) {
                sum = a + b;
                if(num == sum)
                    return true;
                a = b;
                b = sum;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        if(isFibonacci(16))
            System.out.println("Number is in Fibonacci Sequence");
        else{
            System.out.println("Number is not in Fibonacci Sequence");
        }
    }
}
