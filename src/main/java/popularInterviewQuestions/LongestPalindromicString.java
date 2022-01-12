package popularInterviewQuestions;

public class LongestPalindromicString {

    //https://leetcode.com/problems/longest-palindromic-substring/
    public static void main(String[] args) {

        String s = "lddlfgffgfld";
        String ans = longestPalindrome(s);
        System.out.println("Final ans : " +longestPalindrome(s));
        System.out.println("Final ans with Leetecode ans : " +longesWithLeeteCodeAnswer(s));
    }

    public static String longesWithLeeteCodeAnswer(String s)
    {

        if(s.length()<1 || s ==null)
            return s;

        int start = 0;
        int end = 0;

        for(int i =0 ; i<s.length(); i++)
        {


            int len1 = expandFromMiddle(s,i,i);
            int len2 = expandFromMiddle(s,i,i+1);
            int len = Math.max(len1, len2);

            if(len > end-start)
            {
                start = i - (len-1)/2;
                end = i + len/2;
            }

        }

        return s.substring(start, end+1);

    }

    public static int expandFromMiddle(String s, int left, int right)
    {


        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }

        return right - left -1;

    }

    private static String longestPalindrome(String s) {

        int max_count = 0;
        String ans="";
        for (int i = 0; i < s.length(); i++) {

            for (int j = i+1; j <= s.length(); j++) {
                String sub = s.substring(i,j);
                System.out.println(sub);
                StringBuilder s1 = new StringBuilder();
                s1.append(sub);

                if(sub.equalsIgnoreCase(String.valueOf(s1.reverse())))
                {
                    if(sub.length()>max_count)
                    {
                        max_count = sub.length();
                        ans = sub;
                    }
                }
            }
        }
        return ans;
    }
}
