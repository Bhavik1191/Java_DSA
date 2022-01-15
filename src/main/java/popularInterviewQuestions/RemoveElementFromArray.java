package popularInterviewQuestions;

import java.util.Arrays;

public class RemoveElementFromArray {

    //https://leetcode.com/problems/remove-element/
    public static void main(String[] args) {

        int[] nums = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println("Expected number : "+ removeElementLeetecode(nums,val));

    }

    // wrong solution at first go
    public static int removeElement(int[] nums, int val) {

        int match = 0;

        for (int i = 0; i < nums.length; i++) {

            if(nums[i]==val)
            {
                match++;
                int count = i+1;
                try {

                    while (nums[count] == val) {
                        count++;

                    }
                    nums[i] = nums[count];
                }
                catch (ArrayIndexOutOfBoundsException e)
                {
                }
                catch (Exception e)
                {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums.length-match;
    }


    public static int removeElementLeetecode(int[] nums, int val) {

        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[length] = nums[i];
                length++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return length;
    }
}
