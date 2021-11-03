package SearchAlgos.Linear;

public class FindMaxWealth {
    //https://leetcode.com/problems/richest-customer-wealth/submissions/
    public static void main(String[] args) {
            int[][] accounts = {{1,5},{7,3},{3,5}};
            //[[1,5],[7,3],[3,5]]
        System.out.println("Maximum wealth is : "+maximumWealth(accounts));
    }

    static int maximumWealth(int[][] accounts) {

        int max_wealth = 0;

        for(int row=0; row<accounts.length; row++)
        {
            int sum = 0;
            for(int col=0; col<accounts[row].length; col++)
            {
                sum = sum + accounts[row][col];
            }
            if(sum >=max_wealth)
                max_wealth=sum;
        }
        return max_wealth;
    }
}
