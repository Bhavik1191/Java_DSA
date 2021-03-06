package searchAlgos.linearSearch;

public class LinearSearchExample {

    public static void main(String[] args)
    {
        // Search given number in
        int[] a = {1,6,3,7,9};
        int value = 0;

        int index = findIndex( a,  value);
        System.out.println(index);
    }

    //Search in the array : Return the index if item found
    //Return -1 if item not found
    public static int findIndex(int[] array, int expectedValue)
    {
        for(int i =0; i<array.length; i++)
        {
            if(array[i]==expectedValue)
                return i;
        }
        return -1;
    }
}
