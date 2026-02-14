package AdvancedJava;

//Write a Java program to:
//        Create an ArrayList of student names
//        Add at least 5 names
//        Display all names using a loop

import java.util.ArrayList;

public class StudentNameLists {
    public static void main(String[] args){
        ArrayList<String> arr1 = new ArrayList<>();
        arr1.add("Soumyadeep");
        arr1.add("Asutosh");
        arr1.add("Sree Sai");
        arr1.add("Pramodh");
        arr1.add("Nitish");

        for(int i=0;i<arr1.toArray().length;++i){
            System.out.println(arr1.get(i));
        }
    }
}
