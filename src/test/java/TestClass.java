import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestClass {

    /**
    a = 33433
    b = 433242
    find a+b?
     */

    /**
     * a = [1,2,4,5,7,9]
     * b = [2,6,8,9,10]
     * c= []
     * @param args
     */

    public static void main(String[] args) {


        String c = "999";
        String d = "9999";


        int[] a = {1,2,4,5,7,9,16};
        int[] b = {2,6,8,9,10,11,12};
//        System.out.println(findSum(c,d));
        System.out.println(combine(a,b));


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

    //yash.zanwar@phonepe.com
    public static List<Integer> combine(int[] a, int[] b)
    {
        List<Integer> ans = new ArrayList<>();
        int j = 0;
        int k = 0;

        while (j< a.length && k< b.length) {

            if (a[j] <= b[k]) {
                ans.add(a[j]);
                j++;
            } else {
                ans.add(b[k]);
                k++;
            }
        }


            if(j <a.length)
            {
                while (j < a.length)
                {
                    ans.add(a[j]);
                    j++;
                }
            }

            if(k< b.length)
            {
                while (k < b.length)
                {
                    ans.add(b[k]);
                    k++;
                }
            }

        for (int i = 0; i < a.length; i++) {
            a[i]=ans.get(i);
        }

        System.out.println(Arrays.toString(a));
        return ans;
    }
}
