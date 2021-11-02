package SearchAlgos.Linear;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] a = {
                {21,6,3},
                {4,6,6,8,9},
                {-8,-10,55,0},
                {1}
        };

        int target = 0;
        System.out.println("Target element found : "+ searchIn2d(a, target));
    }

    // 2D array becomes from Row and Columns.
    // Travers each row and then traverse every columns from each row
    private static boolean searchIn2d(int[][] array, int target) {

        for(int row=0; row<array.length; row++)
        {
            for(int col=0; col<array[row].length; col++)
            {
                if(array[row][col]==target) {
                    System.out.println(Arrays.toString(new int[]{row, col}));
                    return true;
                }
            }
        }
        return false;
    }
}
