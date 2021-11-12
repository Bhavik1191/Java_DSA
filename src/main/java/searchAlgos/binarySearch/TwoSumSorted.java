package searchAlgos.binarySearch;

import java.util.Arrays;

public class TwoSumSorted {
    //https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
    public static void main(String[] args) {

        int[] nums = {2,7,11,15};
        int target = 9;

        System.out.println("Array of index for the given sum is : "+ Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum(int[] numbers, int target) {
        int ans[] = {-1,-1};

        int rightIndex = numbers.length-1;
        int leftIndex = 0;

        while(leftIndex<=rightIndex)
        {
          int sum = numbers[leftIndex]+numbers[rightIndex];

          if(sum==target)
          {
              ans[0]=leftIndex+1;
              ans[1]=rightIndex+1;
              break;
          }
          else if(sum > target)
          {
              rightIndex--;
          }
          else
          {
              leftIndex++;
          }
        }
        return ans;
    }
}
