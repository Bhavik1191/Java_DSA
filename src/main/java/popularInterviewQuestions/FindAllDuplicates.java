package popularInterviewQuestions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAllDuplicates {

    public static void main(String[] args) {

        int[] arr = {1};

        System.out.println(findDuplicates(arr));



    }

    public static  List<Integer> findDuplicates(int[] nums) {

        List<Integer> ans = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int ele: nums) {
            map.put(ele,map.getOrDefault(ele,0)+1);
        }

        for (int ele : map.keySet()) {

            if(map.get(ele) > 1)
                ans.add(ele);
        }

        return ans;
    }
}
