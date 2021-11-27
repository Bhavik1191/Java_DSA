package sortingAlgos;

import java.util.ArrayList;
import java.util.List;

public class AllDisappearedNumbers {

    //https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
    public static void main(String[] args) {
        
        int[] nums = {4,3,2,7,7,2,3,1};
        List<Integer> disappearedNum1 = findDisappearedNumbers1(nums);
        List<Integer> disappearedNum2 = findDisappearedNumbers2(nums);
        System.out.println(disappearedNum1.toString());
        System.out.println(disappearedNum2.toString());

    }

    //Try with intialize new array
    //Add value in new array
    // And in last find the value which is not present
    private static List<Integer> findDisappearedNumbers2(int[] nums) {

        int map[] = new int[nums.length+1];

        for(int i : nums) {

            map[i] = map[i] + 1;
        }//If map[i] doesn't exists, it takes default 0

        List<Integer> result = new ArrayList<Integer>();

        for(int i=1;i<=nums.length;i++) {
            //check if there is any 0
            if(map[i]==0)
                result.add(i);
        }

        return result;
    }


    public static List<Integer> findDisappearedNumbers1(int[] nums) {

        List<Integer> disappearedNum = new ArrayList<>();


        for (int i = 0; i < nums.length; i++) {

            while (nums[i] != nums[nums[i]-1] )
            {
                swap(nums,i,nums[i]-1);
            }
        }


        for (int i = 0; i < nums.length; i++) {

            if(nums[i] != i+1)
                disappearedNum.add(i+1);
        }
        
        return disappearedNum;

    }

    private static int[] swap(int[]arr, int ind1, int ind2)
    {
        int temp = arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
        return arr;
    }
}
