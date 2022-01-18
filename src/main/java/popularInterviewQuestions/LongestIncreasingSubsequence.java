package popularInterviewQuestions;

public class LongestIncreasingSubsequence {


    //https://leetcode.com/problems/longest-increasing-subsequence/
    public static void main(String[] args) {

        int[] nums = {0,1,0,3,2,3};
        System.out.println("Longest increasing subsequence : "+ lengthOfLIS(nums));
    }


    public static int lengthOfLIS(int[] nums) {

        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            int temp = 1;
            int value = nums[i];
            for (int j = i+1; j < nums.length; j++) {

                if(value < nums[j])
                {
                    temp++;
                    value=nums[j];
                }
            }
            count = Math.max(count,temp);
        }
        return count;
    }


    public static int lengthOfLISWithDP(int[] nums)
    {



        return 0;
    }
}
