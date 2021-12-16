package popularInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringCompression {

    //https://leetcode.com/problems/string-compression/submissions/
    public static void main(String[] args) {


        char[] chars = {'a','a','b','b','c','c','c'};

        int n = compress(chars);
        System.out.println("length of new array : "+ n);

    }


    public static int compress(char[] chars) {

        int count = 1;
        int j = 0;
        String s1 = "";

        for (int i = 0; i < chars.length; i++) {

            if(i+1 < chars.length && chars[i]==chars[i+1])
            {
                count++;
            }
            else
            {
                if(count>1 && count<9)
                {
                    chars[j]=chars[i];
                    chars[j+1]= (char)(count+'0');
                    j=j+2;
                }
                else if(count==1)
                {
                    chars[j]=chars[i];
                    j++;
                }
                else
                {
                    chars[j]=chars[i];
                    j++;
                    String sub = count+"";
                    for (int k = 0; k < sub.length(); k++) {
                        chars[j++]=sub.charAt(k);
                    }
                }
                count=1;
            }
        }
        System.out.println(Arrays.toString(chars));
        return j;
    }
}


