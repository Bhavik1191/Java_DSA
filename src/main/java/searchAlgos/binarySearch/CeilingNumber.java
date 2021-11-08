package searchAlgos.binarySearch;

public class CeilingNumber {

    public static void main(String[] args) {
        int[] arr = {1,4,7,9,13,14,16,18};
        int target = 17;

        System.out.println("Ceiling of the given number is : "+ getCeilingNumber(arr, target,0,arr.length-1 ));
    }

    private static int getCeilingNumber(int[] arr, int target,int start, int end) {

        int middle = 0;
        int last = 0;

        while (start <= end)
        {
            middle = end-start/2;
            if(target>arr[middle])
            {
                start = middle+1;
                last = arr[start];
            }
            else if(target==arr[middle])
            {
                return arr[middle];
            }
            else
            {
                end = middle-1;
                last = arr[middle];
            }
        }
        return arr[start];
    }
}
