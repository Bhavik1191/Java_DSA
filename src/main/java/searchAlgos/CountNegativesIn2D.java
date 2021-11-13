package searchAlgos;

public class CountNegativesIn2D {

    public static void main(String[] args) {
        int[][] grid = {{5,1,0},
                        {-5,-5,-5}};

        System.out.println("Total Negative numbers are : "+countNegatives(grid));
    }

    public static int countNegatives(int[][] grid) {

        int row = 0;
        int col = grid[row].length-1;
        int negativeCount = 0;

        while(row <= grid.length-1 && col >= 0)
        {
            if(grid[row][col] <= -1)
            {
                negativeCount++;
                negativeCount = negativeCount + (grid.length-1-row);
                col --;
            }
            else
            {
                row++;
            }
        }
        return negativeCount;
    }
}
