package SortingAlgos;

import java.util.Arrays;

public class BubbleSortExample {

    public static void main(String[] args)
    {
        //Sort the given integer array with Bubble sort method
        int[] a = {6};
        System.out.println(Arrays.toString(bubbleSort(a)));
    }

    public static int[] bubbleSort(int[] array)
    {

        for(int i =0; i<array.length; i++)
        {
            for(int j=1; j<array.length-i; j++)
            {
                if(array[j-1]>array[j])
                {
                    //swap the variable
                    int temp = array[j-1];
                    array[j-1]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
}
