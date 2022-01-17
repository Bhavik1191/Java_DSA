package popularInterviewQuestions;

import java.util.*;

public class ThreeSumArray {

    //https://leetcode.com/problems/3sum/
    public static void main(String[] args) {

        int[] a = {-1,0,1,2,-1,-4};
        System.out.println("all the triplets with 0 sum : "+ threeSum(a));
        System.out.println("all the triplets with 0 sum : "+ get3sum(a));

    }

    //Bruit force with 3 for loops : Longer time
    public static  List<List<Integer>> get3sum(int[] nums)
    {

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k < nums.length; k++) {

                    System.out.println(nums[i] + " " + nums[j]+ " " +nums[k]);
                    if( nums[i]+nums[j]+nums[k]==0 )
                    {
                        List<Integer> temp = new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[k]));
                        Collections.sort(temp);
                        if (ans.contains(temp)==false)
                        {
                            ans.add(temp);
                        }
                        //ans.add(new ArrayList<Integer>(Arrays.asList(nums[i],nums[j],nums[k])));
                    }
                }
            }
        }
        return ans;
    }

    public static List<List<Integer>> threeSum(int[] nums)
    {

        // to avoid duplicate
        HashSet<List<Integer>> set = new HashSet<>();

        //Sorting array to make easy solution
        Arrays.sort(nums);



        for (int i = 0; i < nums.length-1; i++) {

            int j = i+1;
            int k = nums.length-1;

            while (j<k) {


                if (nums[i] + nums[j] + nums[k] == 0) {
                    List<Integer> temp = new ArrayList<>(Arrays.asList(nums[i],nums[j],nums[k]));

                    if(set.contains(temp)==false)
                        set.add(temp);

                    j++;
                    k--;
                }

                else if(nums[i] + nums[j] + nums[k] > 0)
                {
                    k--;
                }

                else
                {
                    j++;
                }
            }
        }

        return new ArrayList<>(set);
    }


}
