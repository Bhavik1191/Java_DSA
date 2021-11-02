package SearchAlgos.Linear;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String name = "bhavik";
        char target = 'b';

        System.out.println("Input array : "+ Arrays.toString(name.toCharArray()));
        System.out.println("From using For loop : "+isCharPresent(name,target));
        System.out.println("From using For Each loop : "+isCharPresent2(name,target));
    }

    // With using For loop
    private static boolean isCharPresent(String name,char target) {

        for (int i = 0; i < name.length(); i++) {
            if(target == name.charAt(i))
                return true;
        }
        return false;
    }


    // With usage of For Each loop
    private static boolean isCharPresent2(String name,char target) {

        for (char ch : name.toCharArray()) {
            if(target == ch)
                return true;
        }
        return false;
    }
}
