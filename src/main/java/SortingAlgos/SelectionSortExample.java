package SortingAlgos;

import java.util.Arrays;

public class SelectionSortExample {

    public static void main(String[] args)
    {
        //Sort the given integer array with Selection sort method
        int[] a = {6,4,7,20,6,9};
        System.out.println(Arrays.toString(selectionSort(a)));
    }

    private static int[] selectionSort(int[] array) {

        int minIndex = 0;

        for(int i =0; i<array.length;i++)
        {
            minIndex = i;

            for(int j=i; j<array.length; j++)
            {
                if(array[j]<array[minIndex])
                    minIndex=j;
            }
            int temp = array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;
        }
        return array;
    }
}
