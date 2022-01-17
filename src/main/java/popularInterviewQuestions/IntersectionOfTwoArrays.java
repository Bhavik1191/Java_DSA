package popularInterviewQuestions;

import com.sun.tools.javac.util.ArrayUtils;

import java.util.*;
public class IntersectionOfTwoArrays {

    //https://leetcode.com/problems/intersection-of-two-arrays/
    public static void main(String[] args) {

        int[] nums1 = {7,7};
        int[] nums2 = {7,7};

        System.out.println("Intersection of 2 arrays : "+ Arrays.toString(intersection(nums1,nums2)));
    }


    public static int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> ans = new HashSet<>();
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {

            set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {

            if(set.contains(nums2[i]))
            {
                ans.add(nums2[i]);

            }
        }
        System.out.println(ans);

        return ans.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
