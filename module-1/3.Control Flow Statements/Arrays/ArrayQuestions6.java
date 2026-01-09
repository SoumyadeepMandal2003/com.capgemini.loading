package Arrays;


// SmartTracker App – Daily Sales and Weather Insights
// Welcome to the world of SmartTracker, a digital assistant used by small shop owners and local weather stations.
// The app stores and analyzes daily sales and temperature data using arrays — helping users make smarter business and lifestyle decisions.

// Through this scenario, you’ll learn how 1D arrays can make data tracking and analysis efficient, accurate, and automated.

// Background Story
// You’ve been hired as a Java developer for SmartTracker Labs, a startup creating intelligent dashboards for community businesses.
// Your job is to write a Java module that analyzes:

// Shop sales over 7 days
// Temperature patterns for the same week
// Using arrays and methods, you’ll design algorithms that process, search, and update data — much like what real apps do behind the scenes.

// Data Setup
// int[] sales = {120, 80, 150, 90, 200, 75, 110}; // Sales for 7 days (in ₹)
// int[] temperatures = {32, 28, 31, 29, 35, 27, 30}; // Temperatures (°C) for 7 days
// Each array represents a week’s worth of data — from Monday to Sunday.

// Activity 1 – Average Temperature
// Goal: Find the average weekly temperature.
// Use a method to sum all values and divide by the total number of days.

// Expected Output:
// Average Temperature: 30.3°C


// Activity 2 – Hottest and Coldest Day
// Goal: Identify the highest and lowest recorded temperatures.
// Bonus: Try to print which day (e.g., Day 5) had those temperatures.

// Expected Output:
// Highest Temperature: 35°C
// Lowest Temperature: 27°C


// Activity 3 – Count Hot Days
// Goal: Count how many days the temperature was above 30°C.

// Expected Output:
// Number of hot days (>30°C): 3


// Activity 4 – Total and Average Sales
// Goal: Calculate total revenue and average daily sales using array traversal.

// Expected Output:
// Total Sales: 825
// Average Sales: 117.86


// Activity 5 – Record-Breaking Sales
// Goal: Identify the highest and lowest sales of the week and the days they occurred.

// Expected Output:
// Highest Sale: 200 on Day 5
// Lowest Sale: 75 on Day 6


// Activity 6 – Count High-Sales Days
// Goal: Find out how many days had sales above ₹100.

// Expected Output:
// Number of high sales days (>100): 4


// Activity 7 – Search for a Specific Sale
// Goal: Search the array for a specific sale amount (for example, ₹150).
// If found, print which day it occurred.

// Expected Output:
// Sale 150 found on Day 3


// Activity 8 – Update Sales Record
// Goal: Suppose the shop owner updated the sales for Day 2 to ₹95.
// Update the array and display the new value.

// Expected Output:
// Updated sales for Day 2: 95





public class ArrayQuestions6 {

    // Activity 1 – Average Temperature
    public static void avgTemparature(int[] temperatures) {
        int totalTemp = 0;
        for (int temp : temperatures) {
            totalTemp += temp;
        }
        System.out.printf("Average Temperature: %.2f°C", ((totalTemp / (double) temperatures.length)));
        System.out.println();
    }

    // Activity 2 – Hottest and Coldest Day
    public static void hottestAndColdestDay(int[] temperatures) {
        int highestTemp = temperatures[0];
        int lowestTemp = temperatures[0];
        int highestDay = 1;
        int lowestDay = 1;

        for (int i = 1; i < temperatures.length; i++) {
            if (temperatures[i] > highestTemp) {
                highestTemp = temperatures[i];
                highestDay = i + 1;
            }
            if (temperatures[i] < lowestTemp) {
                lowestTemp = temperatures[i];
                lowestDay = i + 1;
            }
        }

        System.out.println("Highest Temperature: " + highestTemp + "°C on Day " + highestDay);
        System.out.println("Lowest Temperature: " + lowestTemp + "°C on Day " + lowestDay);
    }

    //Activity 3 – Count Hot Days
    public static void countHotDays(int[] temperatures) {
        int hotDaysCount = 0;
        for (int temp : temperatures) {
            if (temp > 30) {
                hotDaysCount++;
            }
        }
        System.out.println("Number of hot days (>30°C): " + hotDaysCount);
    }


    //Activity 4 – Total and Average Sales
    public static void totalAndAverageSales(int[] sales) {
        int totalSales = 0;
        for (int sale : sales) {
            totalSales += sale;
        }
        double averageSales = totalSales / (double) sales.length;
        System.out.println("Total Sales: " + totalSales);
        System.out.printf("Average Sales: %.2f", averageSales);
        System.out.println();
    }

    //Activity 5 – Record-Breaking Sales
    public static void recordBreakingSales(int[] sales) {
        int highestSale = sales[0];
        int lowestSale = sales[0];

        for (int i = 1; i < sales.length; i++) {
            if (sales[i] > highestSale) {
                highestSale = sales[i];
            }
            if (sales[i] < lowestSale) {
                lowestSale = sales[i];
            }
        }

        System.out.println("Highest Sale: " + highestSale);
        System.out.println("Lowest Sale: " + lowestSale);
    }

    // Activity 6 – Search for a Specific Sale
    public static void searchSpecificSale(int[] sales, int targetSale) {
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] == targetSale) {
                System.out.println("Sale " + targetSale + " found on Day " + (i + 1));
                return;
            }
        }
        System.out.println("Sale " + targetSale + " not found.");
    }

    //Activity 7 – Update Sales Record
    public static void updateSalesRecord(int[] sales, int day, int newSale) {
        if (day >= 1 && day <= sales.length) {
            sales[day - 1] = newSale;
            System.out.println("Updated sales for Day " + day + ": " + newSale);
        } else {
            System.out.println("Invalid day provided.");
        }
    }

    //Activity 8 – Count High-Sales Days
    public static int countHighSalesDays(int[] sales) {
        int highSalesCount = 0;
        for (int sale : sales) {
            if (sale > 100) {
                highSalesCount++;
            }
        }
        System.out.println("Number of high sales days (>100): " + highSalesCount);
        return highSalesCount;
    }



    public static void main(String[] args){
        // Sales & Temperatures for 7 days
        int[] sales = {120, 80, 150, 90, 200, 75, 110};
        int[] temperatures = {32, 28, 31, 29, 35, 27, 30};

        // Activity 1 – Average Temperature
        avgTemparature(temperatures);
        // Activity 2 – Hottest and Coldest Day
        hottestAndColdestDay(temperatures);
        // Activity 3 – Count Hot Days
        countHotDays(temperatures);
        // Activity 4 – Total and Average Sales
        totalAndAverageSales(sales);
        //Activity 5 – Record-Breaking Sales
        recordBreakingSales(sales);
        // Activity 6 – Search for a Specific Sale
        searchSpecificSale(sales, 150);
        //Activity 7 – Update Sales Record
        updateSalesRecord(sales, 2, 95);
        //Activity 8 – Count High-Sales Days
        // int highSalesCount = 0;



    }
}
