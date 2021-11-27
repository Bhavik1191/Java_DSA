package popularInterviewQuestions;

import java.util.Arrays;

public class KokoEatingBanana {

    //https://leetcode.com/problems/koko-eating-bananas/
    public static void main(String[] args) {

        int[] piles = {3,6,7,11};
        int h = 4;

        int banana = minEatingSpeed(piles,h);
        System.out.println(banana);
    }

    public static int minEatingSpeed(int[] piles, int h) {

        if(piles.length == h)
        {
            return maxElement(piles);
        }

        return -1;
    }

    private static int maxElement(int[] piles) {

        Arrays.sort(piles);
        return piles[piles.length-1];
    }
}
