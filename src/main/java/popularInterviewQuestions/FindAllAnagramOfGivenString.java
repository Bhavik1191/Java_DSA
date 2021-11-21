package popularInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagramOfGivenString {

    //https://leetcode.com/problems/find-all-anagrams-in-a-string/

    /**
     * Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
     * @param args
     */
    public static void main(String[] args) {

        String input = "aa";
        String target = "a";

        System.out.println("All anagram start at indexes : "+findAnagrams(input,target));

    }


    public static List<Integer> findAnagrams(String input, String target) {

        List<Integer> ans = new ArrayList<>();

        for(int i = 0; i<=input.length()-1; i++)
        {
            if(i+target.length() > input.length())
            {
                break;
            }
            String sub = input.substring(i,i+target.length());

            if(isAnagram(sub,target))
                ans.add(i);
        }
        return ans;
    }

    public static boolean isAnagram(String s1, String s2)
    {
        int[] alphabates = new int[127];

        for(char c : s1.toCharArray())
            alphabates[c]++;


        for(char c : s2.toCharArray())
            alphabates[c]--;

        for (int a :alphabates) {
            if (a != 0)
                return false;
        }
        return true;
    }
}
