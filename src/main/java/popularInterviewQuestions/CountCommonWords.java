package popularInterviewQuestions;

import java.util.HashMap;

public class CountCommonWords {

    public static void main(String[] args) {


        String[] words1 = {"b","bb","bbb","a","a"};
        String[] words2 = {"aa","aaa",};

        System.out.println("Common occurance : " + countCommonWords(words1,words2) );

    }



    public static int countCommonWords(String[] words1, String[] words2)
    {
        HashMap<String, Integer> map = new HashMap<>();


        for(int i = 0 ; i < words1.length; i++)
        {
            map.put(words1[i], map.getOrDefault(words1[i],0)+1);
        }


        for(String s : map.keySet())
        {
            if(map.get(s) > 1)
            {
                map.put(s,-1);
            }
        }

        for(int i = 0; i < words2.length; i++)
        {
            map.put(words2[i], map.getOrDefault(words2[i],0)-1);
        }


        System.out.println(map);
        int count = 0;
        for(String s : map.keySet())
        {
            if(map.get(s) == 0)
            {
                count++;
            }
        }

        return count;
    }
}
