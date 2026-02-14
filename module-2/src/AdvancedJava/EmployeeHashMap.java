package AdvancedJava;

//Write a Java program to:
//        Store employee ID and name using HashMap
//        Display all employee details


import java.util.HashMap;
import java.util.Map;


public class EmployeeHashMap {

    public static void main(String[] args) {


        HashMap<Integer, String> employees = new HashMap<>();


        employees.put(101, "Amit");
        employees.put(102, "Neha");
        employees.put(103, "Rahul");
        employees.put(104, "Sneha");


        System.out.println("Employee Details:");
        for (Map.Entry<Integer, String> entry : employees.entrySet()) {
            System.out.println("Employee ID: " + entry.getKey() +
                    ", Name: " + entry.getValue());
        }
    }
}
