package Arrays;

// ----------------------------------------------------- Array -----------------------------------------------------------------------

// WAJP to print even elements from the given array.
// WAJP to print odd elements from the given array.
// WAJP to print prime elements from the given array.
// WAJP to print perfect number elements from the given array.
// WAJP to find sum of all elements from the given array.
// WAJP to find product of all elements from the given array.
// WAJP to find smallest element from the given array without sorting.
// WAJP to find largest element from the given array without sorting.
// WAJP to find second smallest element from the given array without sorting.
// WAJP to find second largest element from the given array without sorting.
// WAJP to find third smallest element from the given array without sorting.
// WAJP to find third largest element from the given array without sorting.
// WAJP to merge two arrays without using Collection.
// WAJP to find union of two arrays without using Collection.
// WAJP to find intersection of two arrays without using Collection.
// WAJP to print occurrence of each element in the array without using Map.
// WAJP to find unique elements from the array without using Collection and Map.
// WAJP to find duplicate elements (elements occurring more than once) from the array without using Collection and Map.

// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------



public class ArrayQuestions1 {

    static int[] arr = {1,2,3,4,5,6,6,7,8,9,10,28,5};

    public static void evenElem() {
        for (int num : arr)
            if (num % 2 == 0)
                System.out.print(num + " ");
        System.out.println();
    }

    public static void oddElem() {
        for (int num : arr)
            if (num % 2 != 0)
                System.out.print(num + " ");
        System.out.println();
    }

    public static void primeElem() {
        for (int n : arr) {
            if (n < 2) continue;
            int count = 0;
            for (int i = 1; i <= n; i++)
                if (n % i == 0) count++;
            if (count == 2)
                System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void perfectElem() {
        for (int n : arr) {
            int sum = 0;
            for (int i = 1; i < n; i++)
                if (n % i == 0) sum += i;
            if (sum == n)
                System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void sumElem() {
        int sum = 0;
        for (int n : arr) sum += n;
        System.out.println(sum);
    }

    public static void productElem() {
        int prod = 1;
        for (int n : arr) prod *= n;
        System.out.println(prod);
    }

    public static void smallest() {
        int min = arr[0];
        for (int n : arr)
            if (n < min) min = n;
        System.out.println(min);
    }

    public static void largest() {
        int max = arr[0];
        for (int n : arr)
            if (n > max) max = n;
        System.out.println(max);
    }

    public static void secondSmallest() {
        int min = Integer.MAX_VALUE, smin = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n < min) {
                smin = min;
                min = n;
            } else if (n < smin && n != min) {
                smin = n;
            }
        }
        System.out.println(smin);
    }

    public static void secondLargest() {
        int max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > max) {
                smax = max;
                max = n;
            } else if (n > smax && n != max) {
                smax = n;
            }
        }
        System.out.println(smax);
    }

    public static void thirdSmallest() {
        int a = Integer.MAX_VALUE, b = Integer.MAX_VALUE, c = Integer.MAX_VALUE;
        for (int n : arr) {
            if (n < a) {
                c = b; b = a; a = n;
            } else if (n < b && n != a) {
                c = b; b = n;
            } else if (n < c && n != a && n != b) {
                c = n;
            }
        }
        System.out.println(c);
    }

    public static void thirdLargest() {
        int a = Integer.MIN_VALUE, b = Integer.MIN_VALUE, c = Integer.MIN_VALUE;
        for (int n : arr) {
            if (n > a) {
                c = b; b = a; a = n;
            } else if (n > b && n != a) {
                c = b; b = n;
            } else if (n > c && n != a && n != b) {
                c = n;
            }
        }
        System.out.println(c);
    }

    public static void occurrence() {
        boolean[] visited = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (visited[i]) continue;
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(arr[i] + " -> " + count);
        }
    }

    public static void uniqueElem() {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++)
                if (arr[i] == arr[j]) count++;
            if (count == 1)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void duplicateElem() {
        boolean[] printed = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (printed[i]) continue;
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    printed[j] = true;
                }
            }
            if (count > 1)
                System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        evenElem();
        oddElem();
        primeElem();
        perfectElem();
        sumElem();
        productElem();
        smallest();
        largest();
        secondSmallest();
        secondLargest();
        thirdSmallest();
        thirdLargest();
        occurrence();
        uniqueElem();
        duplicateElem();
    }
}
