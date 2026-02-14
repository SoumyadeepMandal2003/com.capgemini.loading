package AdvancedJava;

//Write a Java program to:
//        Store integers in an ArrayList
//        Count how many times a given number appears in the list

import java.util.ArrayList;
import java.util.Scanner;



public class ArrayListElementFrequency {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();


        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }


        System.out.print("Enter number to count: ");
        int target = sc.nextInt();

        int count = 0;
        for (int num : list) {
            if (num == target) {
                count++;
            }
        }

        System.out.println("Count of " + target + " is " + count);
        sc.close();
    }
}

