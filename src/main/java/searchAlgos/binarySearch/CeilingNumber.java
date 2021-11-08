package searchAlgos.binarySearch;

public class CeilingNumber {

    /**
     *
     * Ceiling number - Smallest number in the array which is greater than or equal to the Target number
     * Floor number - Highest number in the array which is smaller than or equal to Target number
     * @param args
     */
    public static void main(String[] args) {

        int[] arr = {2,4,7,9,13,14,16,18};
        int target = 0;


        System.out.println("Ceiling of the given number is : "+ getCeilingNumber(arr, target,0,arr.length-1 ));
    }

    private static int getCeilingNumber(int[] arr, int target,int start, int end) {

        int middle = 0;
        int last = 0;

        //what if target is greater than greatest number in array
        if(target>arr[arr.length-1])
            return -1;


        while (start <= end)
        {
            middle = end-start/2;
            if(target>arr[middle])
            {
                start = middle+1;
            }
            else if(target==arr[middle])
            {
                return arr[middle];
            }
            else
            {
                end = middle-1;
            }
        }
        return arr[start];
    }
}
