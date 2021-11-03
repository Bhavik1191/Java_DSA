package SearchAlgos.Linear;

import sun.lwawt.macosx.CSystemTray;

public class PrintEvenDigits {

    //https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {

        int[] nums = {22, 55, 66,4,999,0,6666};
        int evenDigits = findEvenDigits(nums);
        System.out.println("Even digits in giver array are : "+ evenDigits);
    }

    private static int findEvenDigits(int[] nums) {
        int count = 0;
        for (int num:nums) {
            if(isEvenDigits(num))
                count++;
        }
        return count;
    }

    /**
     * Return true if the given number's digits are even
     * @param num
     * @return
     */
    private static boolean isEvenDigits(int num) {

        //1st- Identify how many digits are present
        int digits = numberOfDigitsWithNum(num);
        int digits2 = numberOfDigitsWithString(num);
        int digits3 = numberOfDigitsWithMath(num);

        //2nd - Verify if the digits are even or odd
        if(digits3 % 2 == 0 )
            return true;
        return false;
    }

    // Get digit count with converting it to String
    private static int numberOfDigitsWithString(int num) {
        String numbers = num+"";
        return numbers.length();
    }

    // Get digit count with dividing number by 10
    private static int numberOfDigitsWithNum(int num) {
        int digits = 0;

        while (num<0){
            digits++;
            digits = digits/10;
        }
        return digits;
    }

    // Get digit count with Math.log10 function
    private static int numberOfDigitsWithMath(int num) {
        return (int)(Math.log10(num))+1;
    }
}
