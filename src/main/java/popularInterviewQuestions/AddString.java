package popularInterviewQuestions;

public class AddString {

    //https://leetcode.com/problems/add-strings/
    public static void main(String[] args) {

       String num1 = "11";
       String num2 = "123";

        System.out.println("Added number : "+ findSum(num1,num2));
    }

    public static String findSum(String s1, String s2)
    {
        String ans = "";
        int len = Math.max(s1.length(),s2.length());
        int remaining=0;

        for (int i = 1; i <= len; i++) {

            int sum = 0;

            if(i <= s1.length() && i <= s2.length())
            {
                sum = Integer.parseInt(s1.charAt(s1.length()-i)+"") + Integer.parseInt(s2.charAt(s2.length()-i)+"");
            }
            else if(i > s1.length())
            {
                sum =  Integer.parseInt(s2.charAt(s2.length()-i)+"");
            }
            else if(i > s2.length())
            {
                sum = Integer.parseInt(s1.charAt(s1.length()-i)+"");
            }


            sum = sum+remaining;
            if(sum>=10)
            {
                sum = sum-10;
                remaining = 1;
            }
            else if(sum < 10)
            {
                remaining = 0;
            }
            else
            {
            }
            System.out.println(sum);

            ans = sum + ans;
        }
        if(remaining==0)
            return ans;
        else
            return remaining+ans;
    }
}
