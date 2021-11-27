package sortingAlgos;

import java.util.Arrays;

public class SetMismatch {

    //https://leetcode.com/problems/set-mismatch/
    public static void main(String[] args) {

        int[] nums = {1,1};
        System.out.println(Arrays.toString(findErrorNums(nums)));

    }

    //Apply cyclic sort to Sort
    public static int[] findErrorNums(int[] nums) {

        int i = 0;
        int[] ans = new int[2];

        while (i < nums.length)
        {
            if(nums[i] != nums[nums[i]-1])
            {
                swap(nums,i,nums[i]-1);
            }
            else
            {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if(nums[j] != j+1)
            {
                ans[0] = nums[j];
                ans[1] = j+1;
            }
        }
    return ans;
    }

    //Just return the missing value and the index at which duplicate is present
    private static int[] swap(int[]arr, int ind1, int ind2)
    {
        int temp = arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
        return arr;
    }
}
