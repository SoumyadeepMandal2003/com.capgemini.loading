// check if a number is Disarium Number
//A program is said to be a Disarium number if the sum of its digits powered with their respective positions is equal to the number itself.
// eg. 175
// 1^1 + 7^2 + 5^3 = 1 + 49 + 125 = 175


class isDisarium {
    public static void main(String[] args) {
        int num = 175;
        int originalNum = num;
        int sum = 0;
        String numStr = Integer.toString(num);
        int length = numStr.length();

        for (int i = 0; i < length; i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            sum += Math.pow(digit, i + 1);
        }

        if (sum == originalNum) {
            System.out.println(originalNum + " is a Disarium Number.");
        } else {
            System.out.println(originalNum + " is not a Disarium Number.");
        }
    }
}