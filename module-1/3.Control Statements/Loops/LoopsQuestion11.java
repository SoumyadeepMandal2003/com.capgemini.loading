
/*

    Write a Java method clockProblem(int input1, int input2) that simulates a 12-hour analog clock.

	Problem Requirements
	input1 represents the current hour position on a clock (1–12).
	input2 represents the number of jumps/multiplication factor.
	Multiply input1 and input2 to calculate the movement.
	The clock should always stay within 1 to 12.
	If the calculated value exceeds 12, it should wrap around using clock logic.
	If the final calculated position becomes 0, it must be treated as 12.

    Test case 1 : 
	input1 = 3
	input2 = 4
	
	output is  12.
	Test case 2 : 
	input1 = 4
	input2 = 5
	
	output is 8.
	
	Test case 3:
	input1 = 9
	input2 = 7
	
	output is 3.

*/




public class LoopsQuestion11 {

    public static void clockProblem(int input1, int input2) {
        int movement = input1 * input2;
        int finalPosition = movement % 12;
        if (finalPosition == 0) {
            finalPosition = 12;
        }
        System.out.println("Final position on the clock: " + finalPosition);
    }
    public static void main(String[] args) {
        clockProblem(3, 4);
    }
}
