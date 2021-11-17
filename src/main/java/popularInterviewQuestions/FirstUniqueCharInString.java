package popularInterviewQuestions;

import java.util.HashMap;

public class FirstUniqueCharInString {

    //https://leetcode.com/problems/first-unique-character-in-a-string/
    public static void main(String[] args) {

        String s = "eetcode";
        int index = firstUniqChar(s);

        System.out.println("First unique char's index is : "+ index);

    }

    public static int firstUniqChar(String s) {

        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        int n = s.length();
        // build hash map : character and how often it appears
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }

        // find the index
        for (int i = 0; i < n; i++) {
            if (count.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }
}
