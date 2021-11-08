package searchAlgos.binarySearch;

import java.util.Arrays;


public class FirstAndLastOccurence {

    //https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/submissions/
    public static void main(String[] args) {
        int[] nums = {5,7,7,7,7,8,8,9};
        int target = 10;
        System.out.println("First and Last occurrence of target is : "+ Arrays.toString(searchRange(nums,target)));
    }

    public static int[] searchRange(int[] nums, int target) {

        //As we need same value at first and last occurrence, we need to do binary search 2 times for both indexes.

        int[] ans = {-1,-1};

        ans[0] = findIndex(nums,target,true);
        ans[1] = findIndex(nums,target,false);

        return ans;
    }

    private static int findIndex(int[] nums, int target, boolean firstIndex) {

        int st = 0;
        int en = nums.length-1;
        int ans = -1;

        while (st<=en)
        {
            int mid = st + (en-st)/2;

            if(target<nums[mid])
            {
                en=mid-1;
            }
            else if(target>nums[mid])
            {
                st=mid+1;
            }
            else
            {
                //Potential answer is found. But as we need to first and last occurrence we will see more if same numbers are present or not
                ans = mid;
                if(firstIndex) //If want to find first index then will see on the left side of an array
                {
                    en=mid-1;
                }
                else //If want to find last index then will see on the right side of an array
                {
                    st=mid+1;
                }
            }
        }
        return ans;
    }
}

