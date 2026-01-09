//Find the average of largest and smallest numbers in an unsorted integer array
//Eg. Input: [1, 4, 3, 2]
//    Output: 2.5
//Explanation: The largest number is 4 and the smallest number is 1. Their average is (4 + 1) / 2 = 2.5

package Arrays;





public class ArrayQuestions4 {
    public static void findMaxAndMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        double average = (min + max) / 2.0;
        System.out.println("The average of largest and smallest numbers is: " + average);
    }
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 2};
        findMaxAndMin(arr);
    }
    
}
