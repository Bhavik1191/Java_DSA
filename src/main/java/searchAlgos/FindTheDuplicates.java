package searchAlgos;

import java.util.Arrays;
import java.util.HashMap;

public class FindTheDuplicates {

    //https://leetcode.com/problems/find-the-duplicate-number/
    public static void main(String[] args) {
        int [] nums = {3,2,1,4,3};
        int ans = findDuplicateNum(nums);
        int ans1 = findDuplicateNumWithMap(nums);
        int ans2 = findDuplicateNumWithMap(nums);
        System.out.println(ans + " " + ans1+ " "+ans2);
    }

    //Try with Hashmap - Put value of num with count
    //If count is greater than 1 then that's the ans
    private static int findDuplicateNumWithMap(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int ans2 = 0;

        for(int ele : nums)
        {
            if(map.get(ele)==null) {
                map.put(ele, 1);
            }
            else{
                ans2=ele;
                break;
            }
        }
        return ans2;
    }


    // First solution comes to mind is, iterate a loop i & j on same loop
    private static int findDuplicateNum(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {

                if(nums[i] == nums[j])
                    return nums[i];
            }

        }
        return -1;
    }


    private static int findDuplicateWithSort(int[] nums)
    {
        Arrays.sort(nums);
        for (int i = 0; i <nums.length ; i++) {
            if(nums[i]==nums[i+1]) {
                return nums[i];
            }
        }
        return -1;
    }
}
