package popularInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class LongestString {


    public static void main(String[] args) {

        String s1 = "pwwkew";
        System.out.println("Longest unique string :" + longestr(s1));
        System.out.println("Longest unique string :" + longestr1(s1));
    }


    //understand more on this approach
    private static int longestr1(String s1) {

        int n = s1.length();
        if (n<=1) return n;

        int start = 0, max = 1;
        Map<Character, Integer> map = new HashMap<>();

        for (int i=0;i<n;i++) {
            char ch = s1.charAt(i);
            if (map.containsKey(ch)) {
                max = Math.max(max,i-start);
                int ind = map.get(ch);
                start = Math.max(ind+1, start);
            }
            map.put(ch, i);
        }
        max = Math.max(max,n-start);

        return max;
    }

    public static String longestr(String s) {

        /**
         * 1. take string from all chars till end
         */

        Map<Character, Integer> charMap;

        String ans = "";

        for (int i = 0; i < s.length(); i++) {
            String innerLoop = "";
            charMap = new HashMap<>();
            for (int j = i; j < s.length(); j++) {

                if (charMap.containsKey(s.charAt(j))) {
                    break;
                } else {
                    charMap.put(s.charAt(j), 0);
                    innerLoop = innerLoop + s.charAt(j);
                }
            }

            if (ans.length() < innerLoop.length()) {
                ans = innerLoop;
            }
        }
        return ans;
    }
}

