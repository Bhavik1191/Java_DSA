package sortingAlgos;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {

        int[] arr = {2,1,4,2,7,5,6};
        arr = insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] insertionSort(int[] arr) {

        for (int i = 0; i < arr.length-1 ; i++) {

            //j will start from i+1 and travers through 1st index of the array by decrementing 1
            // if at any point of time, j > j-1 then we will break it because we know that left part is already sorted
            // We just need to put jth element into the right place of left side array which is already sorted
            for (int j = i+1; j >0 ; j--) {

                if(arr[j]<arr[j-1])
                {
                    swap(arr,j,j-1);
                }
                else
                {
                    break;
                }
            }
        }
        return arr;
    }

    private static int[] swap(int[]arr, int ind1, int ind2)
    {
        int temp = arr[ind1];
        arr[ind1]=arr[ind2];
        arr[ind2]=temp;
        return arr;
    }
}
