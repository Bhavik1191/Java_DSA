package searchAlgos.linearSearch;

import java.util.Arrays;

public class FindMinMax {
    public static void main(String[] args) {
        int[] a = {1,5,8,19,68,-7,-10,-10,5};

        System.out.println("Input array : "+ Arrays.toString(a));
        System.out.println("Minimum value is : "+ findMin(a));
        System.out.println("Maximum value is : "+ findMax(a));
    }

    //Take 1 reference variable as Max number
    //Then iterate each element of the array and compare with Reference variable
    //If array element is max than the reference variable then change the reference
    private static Integer findMax(int[] array) {

        // Value should be greater or equal to Integer.MIN_VALUE
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max)
                max=array[i];
        }
        return max;
    }

    //Take 1 reference variable as Min number
    //Then iterate each element of the array and compare with Reference variable
    //If array element is min than the reference variable then change the reference
    private static Integer findMin(int[] array) {

        // Value should be greater or equal to Integer.MAX_VALUE
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min)
                min=array[i];
        }
        return min;
    }
}