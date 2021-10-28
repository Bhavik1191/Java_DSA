package SortingAlgos;

import java.util.Arrays;

public class MergeSortExample {

    public static void main(String[] args)
    {
        //Sort the given integer array with Merge sort method
        int[] a = {6,5,8,1,3,0};
        mergeSort(a);

       System.out.println(Arrays.toString((a)));
    }

    private static void mergeSort(int[] array) {

        if(array.length<2)
            return;

        //First divide array till the single element left

        int middle = array.length/2;

        // Left array declaration and assigning the values
        int[] left = new int[middle];
        for(int i =0; i<middle; i++)
            left[i]=array[i];



        // Right array declaration and assigning the values
        int[] right = new int[array.length-middle];
        for(int i =middle; i<array.length; i++)
            right[i-middle]=array[i];

        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        mergeSort(left);
        mergeSort(right);

        mergeArray(left,right,array);
    }

    private static void mergeArray(int[] left, int[] right, int[] result) {

        //merge the array in to main array


        int i =0;
        int j =0;
        int k =0;

        while (i<left.length && j<right.length)
        {
            if(left[i]<right[j])
                result[k++]=left[i++];
            else
                result[k++]=right[j++];
        }

        //If any of the array (Left or Right) is not complete
        // Then add them as it is in the result array
        while (i<left.length)
            result[k++]=left[i++];

        while (j<right.length)
            result[k++]=right[j++];
    }
}
