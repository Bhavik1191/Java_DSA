package sortingAlgos;

import com.sun.istack.internal.NotNull;
import com.sun.istack.internal.Nullable;

import java.util.Arrays;

public class SelectionSortExample {

    public static void main(String[] args)
    {
        //Sort the given integer array with Selection sort method
        int[] a = {6,4,2,2,5,7,20,6,9};
        System.out.println(Arrays.toString(selectionSort(a)));
    }

    /**
     * Select the minElement and put it in minIndex
     * @param array
     * @return
     */
    private static int[] selectionSort(int[] array) {

        int minIndex = 0;

        for(int i =0; i<array.length;i++)
        {
            minIndex = i;
            Arrays.sort(array);

            //Finding minElement everytime and assign it to minIndex
            for(int j=i+1; j<array.length; j++)
            {
                if(array[j]<array[minIndex])
                    minIndex=j;
            }

            //Once you get the minIndex swap that element with current element
            int temp = array[minIndex];
            array[minIndex]=array[i];
            array[i]=temp;
        }
        return array;
    }
}
