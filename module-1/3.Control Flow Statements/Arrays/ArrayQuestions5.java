
package Arrays;



//int[] arr = {37, 823, 122, 2322, 6017};
//int k = 2;
// Output: 2322
// Explain: Occurance of digit 2 in each number:
// in 37: 0
// in 823: 2




public class ArrayQuestions5 {
    public static int occuranceOfDigit(int num,int k){
        int count = 0;
        while(num>0){
            int lastDigit = num%10;
            if(lastDigit == k){
                count++;
            }
            num = num/10;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {37, 823, 122, 2322, 6017};
         int count = 0;
        int maxCount = 0;
        int k = 2;
        for(int i=0;i<arr.length;i++){
            count = occuranceOfDigit(arr[i],k);
            if(count > maxCount){
                maxCount = count;
            }
        }
        maxCount = Math.max(maxCount,count);
        System.out.println(maxCount);
    }
}

