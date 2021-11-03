package searchAlgos.binarySearch;

public class BinarySearchExample {

    public static void main(String[] args) {
        int[] a = {44,35,35,33,11,9,6,2};
        int target = 0;

        System.out.println("Index of target number is : "+findIndexOf(a,target));

    }

    private static int findIndexOf(int[] array, int target) {
        int start = 0;
        int end = array.length-1;

        // checking if array is sorted in Ascending or descending order.
        boolean ascending;
        if(array[end]>=array[start])
            ascending=true;
        else ascending=false;

        while (start<=end)
        {
         //   int middle = (start+end)/2;  // might be possible that (start+end) gives error if array is of large number

          int middle = start + (end-start)/2;

            if(array[middle]==target)
                return middle;
            else if(target>array[middle])
                if(ascending)
                    start = middle+1;
                else
                    end=middle-1;
            else
                if(ascending)
                    end = middle-1;
                else
                    start=start+1;
        }
        return -1;
    }
}
