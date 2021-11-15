package popularInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharInString {

    // Find the duplicate char in String and its occurrances

    /**
     * string = "xhmavcarahe" o/p = h:2 a:3
     * 
     */
    
    public static void main(String[] args) {

        String input = "xhmavcarahe";
        findDuplicateAndOcc1(input);
    }

    /**
     * As we need output as char and its occurances let's take HashMap for that
     * Let's iterate through string and add every character in Hashmap key with value 1.
     * If key is already exist then increase value by 1
     * @param input
     */
    private static void findDuplicateAndOcc1(String input) {

        //First verify if string is empty or null
        if(input==null || input.isEmpty())
            return;

        Map<Character,Integer> map = new HashMap<>();

        for (char c:input.toCharArray()) {

            if (map.containsKey(c))
            {
                map.put(c,map.get(c)+1); // increase current value by 1
            }
            else {
                map.put(c,1);
            }
        }


        //now we have map that contains every char's occurances
        //print those whos occurrances greater than 1

        for(Map.Entry<Character,Integer> m : map.entrySet())
        {
            if(m.getValue()>1)
            {
                System.out.println(m.getKey()+ " : " + m.getValue());
            }
        }

    }
}
