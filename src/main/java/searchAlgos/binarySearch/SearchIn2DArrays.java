package searchAlgos.binarySearch;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
                {10,11,12}
        };

        int target = 12;

        System.out.println("Target element's index is : "+ Arrays.toString(binarySearchIn2D(a,target)));
    }

    private static int[] binarySearchIn2D(int[][] a, int target) {

        //let's first start with first row and last column

        int row = 0;
        int col = a[row].length-1;

        while (row<=a.length-1 && col >=0)
        {
            if(a[row][col] == target)
            {
                return new int[]{row,col};
            }
            else if(a[row][col] > target)
            {
                col--;
            }
            else
            {
                row++;
            }
        }
        return new int[]{-1,-1};
    }
}

