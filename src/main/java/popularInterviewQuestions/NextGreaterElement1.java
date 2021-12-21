package popularInterviewQuestions;

import java.util.Arrays;

public class NextGreaterElement1 {

    //https://leetcode.com/problems/next-greater-element-i/
    public static void main(String[] args) {


        int[] inp1 = {1};
        int[] inp2 = {1};

        System.out.println("output arr : "+ Arrays.toString(nextGreaterElement(inp1,inp2)));


    }


    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {

        int[] ans = new int[nums1.length];

        for(int i = 0; i<nums1.length; i++)
        {

            int index = search(nums2, nums1[i]);

            int j=index;
            while ( j <nums2.length)
            {
                if(j+1<nums2.length && nums2[index]<nums2[j+1])
                {
                    ans[i]=nums2[j+1];
                    break;
                }
                else
                {
                    ans[i]= -1;
                    j++;
                }
            }

        }
        return ans;
    }

    private static int search(int[] arr, int target) {

        for (int i = 0; i<arr.length; i++)
        {
            if(target==arr[i])
                return i;
        }
        return -1;
    }


}
