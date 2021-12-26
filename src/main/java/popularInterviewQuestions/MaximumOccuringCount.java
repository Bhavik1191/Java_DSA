package popularInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccuringCount {

    public static void main(String[] args) {

        String input = "testvffgmskeoeoeeo";

        System.out.println("Maximum occuring char is : "+ getMaxOccurChar(input));
    }

    private static Character getMaxOccurChar(String input) {

        Map<Character,Integer> map = new HashMap<>();
        Character ans = null;

        int count=0;

        for (int i = 0; i < input.length(); i++) {
            map.put(input.charAt(i), map.getOrDefault(input.charAt(i),0)+1);

            if(count < map.get(input.charAt(i)))
            {
                count=map.get(input.charAt(i));
                ans = input.charAt(i);
            }
        }

        System.out.println(map);
        System.out.println("total count of char : "+ count);
        return ans;
    }
}
