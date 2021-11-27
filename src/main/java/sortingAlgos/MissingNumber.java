package sortingAlgos;

public class MissingNumber {

    //https://leetcode.com/problems/missing-number/
    public static void main(String[] args) {

        int[] arr = {0};
        int missingNumber = missingNumber(arr);
        System.out.println(missingNumber);
    }

    public static int missingNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            while (i != nums[i] && nums[i]!=nums.length)
            {
                swap(nums,i,nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if(i != nums[i])
                return i;
        }
        return  nums.length;
    }

    private static int[] swap(int[]arr, int ind1, int ind2)
    {
        int temp = arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
        return arr;
    }
}
