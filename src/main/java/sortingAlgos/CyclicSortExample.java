package sortingAlgos;

import java.util.Arrays;

public class CyclicSortExample {

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4};
        arr = cyclicSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static int[] cyclicSort(int[] arr) {

        for (int i = 0; i < arr.length ; i++) {

            //Just find the correct index of element and then swap it with correct index
            //Now new element came to this index. So check correct index of that element and if not then swap it
            //Repeat until you get the correct element at correct index
            //After that increment the loop

            while (i != arr[i]-1)
            {
                swap(arr,i,arr[i]-1 );
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
