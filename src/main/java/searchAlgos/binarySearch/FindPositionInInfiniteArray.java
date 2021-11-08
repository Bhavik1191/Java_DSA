package searchAlgos.binarySearch;

public class FindPositionInInfiniteArray {

    //https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10,11,11,11,12,13,14,15,16,17,18,19};
        int target  = 10;

        System.out.println("Position of target in given array is : "+ findIndexAtInfinite(arr,target));
    }

    private static int findIndexAtInfinite(int[] arr, int target) {

        //As we don't know the length of an input array we can just take bunch by bunch from the given array
        //Now question is how we decide the bunch of an array

        //So for that we will start with 2 element array and then we will double the bunch size


        Boolean element_found = false;
        int start = 0;
        int end = 1;
        int index = -1;

        while (element_found==false)
        {
            if(target<=arr[end] && target>=arr[start])
            {
                element_found = true;
                index = findIndex(arr,target,start,end);
            }
            else {
                int temp = start;
                start=end+1;
                end = start + (end-temp)*2;  //Here we are increasing the array sixe after every occurrence of loop if element not found in range.
            }
        }
        return index;
    }

    private static int findIndex(int[] arr, int target,int start, int end)
    {

        while (start<=end)
        {
            int mid = start + (end-start)/2;

            if(target==arr[mid])
                return mid;
            else if(target<arr[mid])
                end = mid-1;
            else
                start=mid+1;
        }
        return -1;
    }
}
