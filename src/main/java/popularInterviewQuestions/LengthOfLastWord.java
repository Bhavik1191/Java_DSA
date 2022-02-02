package popularInterviewQuestions;

public class LengthOfLastWord {


    //https://leetcode.com/problems/length-of-last-word/
    public static void main(String[] args) {

        String s = " ";

        System.out.println("Length of Last word : "+ lengthOfLastWord(s));

    }

    public static int lengthOfLastWord(String s) {


        int count=0;
        boolean flag = false;
        for(int i = s.length()-1; i>=0; i--)
        {

            if(s.charAt(i)== ' ' )
            {
                if (flag == false)
                {
                    System.out.println("do nothing. Just go back to previous character");
                }
                else {
                    break;
                }
            }
            else
            {
                count++;
                flag=true;
            }

        }

        return count;
    }
}
