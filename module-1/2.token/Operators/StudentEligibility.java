/*

A program checks a student’s marks. If the marks are greater than or equal to 40 and attendance is above 75%, the student passes; otherwise, the student fails.Use relational and logical operators to check eligibility, the conditional operator to decide pass or fail, and a compound assignment operator to add 5 bonus marks if the student passes.

*/

import java.util.Scanner;

public class StudentEligibility {
    public static void main(String[] args) {

        float marks;
        float attendance;
        boolean isPassed;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        marks = sc.nextFloat();

        System.out.print("Enter attendance: ");
        attendance = sc.nextFloat();

        
        isPassed = (marks >= 40 && attendance > 75);

        marks = isPassed ? marks+5 : marks;


        System.out.println(
            "You are " + (isPassed ? "Passed" : "Failed") + " & Updated marks is: " + marks);
    }
}
