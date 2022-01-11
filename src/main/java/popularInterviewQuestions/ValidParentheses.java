package popularInterviewQuestions;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {

        String s = "{([{}])()}";

       // System.out.println(isValid(s));
        System.out.println(isValidWithStack(s));


    }

    private static boolean isValidWithStack(String s) {

        Stack<Character> stack = new Stack<>();

        for (Character c : s.toCharArray()) {

            if(c =='{' || c == '[' || c == '(')
            {
                stack.push(c);
            }
            else if(c == '}' && !stack.isEmpty() && stack.peek() == '{')
            {
                stack.pop();
            }
            else if(c == ']' && !stack.isEmpty() && stack.peek() == '[')
            {
                stack.pop();
            }
            else if(c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            }
            else
            {
                stack.push(c);
            }
        }

       if(stack.isEmpty())
           return true;
       else
           return false;
    }


    // First thought to get solution but it was wrong.
    // Then after seeing videos and blogs came to the conclusion with Stack
    public static boolean isValid(String s) {
        int cu=0;
        int ro=0;
        int sq=0;


        for(int i=0; i<s.length(); i++)
        {

            if(cu<0 || ro<0 || sq<0)
                return false;

            String braces = s.charAt(i)+"";


            if(braces.equalsIgnoreCase("{"))
            {
                cu++;
            }
            else if(braces.equalsIgnoreCase("}"))
            {
                if(i> 0 && i<s.length() && s.charAt(i-1)!='{')
                {
                    if(ro>0 || sq>0)
                        return false;
                }
                cu--;
            }
            else if(braces.equalsIgnoreCase("("))
            {
                ro++;
            }
            else if(braces.equalsIgnoreCase(")"))
            {
                if(i> 0 && i<s.length() && s.charAt(i-1)!='(')
                {
                    if(cu>0 || sq>0)
                        return false;
                }
                ro--;
            }
            else if(braces.equalsIgnoreCase("["))
            {
                sq++;
            }
            else
            {
                if(i> 0 && i<s.length() && s.charAt(i-1)!='[')
                {
                    if(ro>0 || cu>0)
                        return false;
                }
            }
        }

        if(ro==0 && sq==0 && cu==0)
            return true;
        return false;
    }
}