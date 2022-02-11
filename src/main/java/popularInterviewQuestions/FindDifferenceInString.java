package popularInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class FindDifferenceInString {


    public static void main(String[] args) {

        String s = "";
        String t = "y";
        System.out.println("Different character in given strings is : " + findTheDifference(s, t));

    }

    public static char findTheDifference(String s, String t) {

        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) - 1);
        }

        for (char c : map.keySet()) {

            if (map.get(c) != 0) {
                return c;
            }
        }
        return ' ';
    }
}
