package SearchAlgos;

public class BinarySearchExample {

    public static void main(String[] args)
    {
        // Search given number in
        int[] a = {1,3,6,7,8,9};
        int value = 4;

        int index = findIndexViaBinarySearch( a,  value, 0,a.length-1);
        System.out.println(index);
    }

    private static int findIndexViaBinarySearch(int[] array, int expectedValue, int start, int end) {

        if(start>end)
            return -1;

        int middle = (start+end)/2;
        if(expectedValue==array[middle])
        {
            return middle;
        }
        else if(expectedValue<array[middle])
        {
            return findIndexViaBinarySearch(array,expectedValue,start,middle-1);
        }
        else
        {
            return findIndexViaBinarySearch(array,expectedValue,middle+1,end);
        }
    }
}
