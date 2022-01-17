package popularInterviewQuestions;

public class IsSubsequence {

    public static void main(String[] args) {

        String s = "";
        String t = "";

        System.out.println(isSubsequence(s,t));
    }

    public static boolean isSubsequence(String s, String t) {

        int len = Math.max(s.length(),t.length());

        int j = 0;
        int k=0;

        for (int i = 0; i < len; i++) {

            if(j<s.length() && k<t.length() && s.charAt(j)==t.charAt(k))
            {
                j++;
                k++;
            }
            else
            {
                k++;
            }
        }
        if(j<s.length())
            return false;
        else
            return true;
    }
}
