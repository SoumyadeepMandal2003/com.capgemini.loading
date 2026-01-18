// Write a Java program that performs the following operations on an ArrayList of Strings:
// - Create an ArrayList named cities.
// - Add the following city names to the list: "Delhi", "Mumbai", "Chennai", "Kolkata".
// - Insert the city "Bangalore" at index 2.
// - Display all the cities in the list.
// - Check whether the city "Mumbai" exists in the list and print a message:
// 	If found, print: "Mumbai is present in the list."
// 	Otherwise, print: "Mumbai is not present in the list."
// - Sort the list of cities in alphabetical order and display the sorted list.
// - Clear the list and print the final size of the ArrayList.



import java.util.ArrayList;
import java.util.Collections;

public class P2 {
    public static void main(String[] args) {
        // Create an ArrayList named cities
        ArrayList<String> cities = new ArrayList<>();

        // Add city names to the list
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Chennai");
        cities.add("Kolkata");

        // Insert "Bangalore" at index 2
        cities.add(2, "Bangalore");

        // Display all the cities in the list
        System.out.println("Cities in the list: " + cities);

        // Check whether "Mumbai" exists in the list
        if (cities.contains("Mumbai")) {
            System.out.println("Mumbai is present in the list.");
        } else {
            System.out.println("Mumbai is not present in the list.");
        }

        // Sort the list of cities in alphabetical order
        Collections.sort(cities);
        System.out.println("Sorted cities: " + cities);

        // Clear the list and print the final size
        cities.clear();
        System.out.println("Final size of the ArrayList after clearing: " + cities.size());
    }
}