package popularInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortedArray {


    //https://leetcode.com/problems/merge-sorted-array/submissions/
    public static void main(String[] args) {
        int[] a = {1,2,4,5,7,9,16};
        int[] b = {2,6,8,9,10,11,12};

        System.out.println(combine(a,b));
    }

    private static List<Integer> combine(int[] a, int[] b) {

        List<Integer> ans = new ArrayList<>();
        int j = 0;
        int k = 0;

        while (j< a.length && k< b.length) {

            if (a[j] <= b[k]) {
                ans.add(a[j]);
                j++;
            } else {
                ans.add(b[k]);
                k++;
            }
        }


        if(j <a.length)
        {
            while (j < a.length)
            {
                ans.add(a[j]);
                j++;
            }
        }

        if(k< b.length)
        {
            while (k < b.length)
            {
                ans.add(b[k]);
                k++;
            }
        }

        for (int i = 0; i < a.length; i++) {
            a[i]=ans.get(i);
        }

        System.out.println(Arrays.toString(a));
        return ans;

    }

}
