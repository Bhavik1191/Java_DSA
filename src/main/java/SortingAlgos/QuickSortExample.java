package SortingAlgos;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Arrays;

public class QuickSortExample {

    public static void main(String[] args) {
        //Sort the given integer array with Merge sort method
        int[] a = {6,2,8,1,3,3};

        quickSort(a,0,a.length-1);
        System.out.println(Arrays.toString(a));
    }

    private static void quickSort(int[] a, int st, int en) {

        if(st>=en)
            return;

        int boundary = partition(a,st,en);

        //sort left array
        quickSort(a,st,boundary-1);

        //sort right array
        quickSort(a,boundary+1,en);
    }


    private static int partition(int[] array, int st, int en) {

        int pivot = array[en];
        int boun = st-1;

        for(int i=st; i<=en;i++)
        {
            if(array[i]<=pivot)
            {
                    boun++;
                    int temp = array[i];
                    array[i]=array[boun];
                    array[boun]=temp;
            }
        }
        return boun;
    }
}
