package popularInterviewQuestions;

import java.util.Locale;

public class validPalindrome {

    //https://leetcode.com/problems/valid-palindrome/
    public static void main(String[] args) {

        String s = "., f  >";
        System.out.println("Is given string valid palindrome : " + isPalindrome(s));

    }

    public static boolean isPalindrome(String s) {

        int i = 0;
        int j = s.length()-1;
        Boolean flag = true;

        while(i<=j)
        {

            while(i<s.length()-1 && !isAlphaNum(s.charAt(i)))
            {
                i++;
            }

            while(j>0 &&!isAlphaNum(s.charAt(j)))
            {
                j--;
            }

            if(i<j && s.toUpperCase(Locale.ROOT).charAt(i) != s.toUpperCase(Locale.ROOT).charAt(j))
            {
                flag=false;
                break;
            }

            i++;
            j--;
        }
        return flag;
    }

    static boolean  isAlphaNum(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
}
