package searchAlgos.binarySearch;

public class ArrangeCoins {

    //https://leetcode.com/problems/arranging-coins/
    public static void main(String[] args) {

        int coins = 8;
        int linearAns = ansFromLinearSearch(coins);
        int binaryAns = ansFromBinarySearch(coins);
        System.out.println("Complete number of rows : "+ linearAns);
        System.out.println("Complete number of rows : "+ binaryAns);
    }

    private static int ansFromBinarySearch(int coins) {

        int left = 0;
        int right = coins;

        while(left<=right)
        {
            long mid = left + (right-left)/2;
            long coinUsed = mid * (mid+1)/2;

            if(coinUsed == coins)
            {
                return (int)mid;
            }


            if(coins < coinUsed)
            {
                right = (int)mid -1;
            }
            else
            {
                left = (int)mid+1;
            }
        }
        return (int)right;
    }

    // First comes in mind
    private static int ansFromLinearSearch(int coins) {
        int i;

        for(i=1; i<=coins; i++)
        {
            coins=coins-i;
        }
        return i-1;
    }
}
