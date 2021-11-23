package searchAlgos.binarySearch;

public class SearchInRotatedArrayDuplicates {
    public static void main(String[] args) {
        int[] arr ={1,1,1,1,1,1,2,1,1,1};
        int target = 2;

        System.out.println("ans is :  " + search(arr,target));

    }


    public static int search(int[] nums, int target) {

        // Find pivot first - max number in array
        // if mid < mid +1 ==> mid
        // if mid < mid-1 ==> mid-1
        //if start > mid ==> search in st to mid-1 only. Because after mid all will be lesser than mid
        // if start < mid ==> search in mid+1 to end only. Before mid all will be lesser than mid



        int pivot = findPivot(nums);


        /**
         * In case of finding rotation counts of an array. Just add the pivot+1
         * Pivot is the highest number in array so the we can understand that pivot's position shows the rotation count
         * if pivot=-1 then array is not rotated
         *
         * rotation count = pivot+1;
         */

        //if pivot not found then its not rotated sorted array
        //So apply normal binary search in full array

        if(pivot == -1)
        {
            return binarySearch(nums,target,0,nums.length-1);
        }

        // if target < start ==> search in pivot+1 to end
        // else search in start to pivot-1

        if(target==nums[pivot])
        {
            return pivot;
        }
        else if(target < nums[0])
        {
            return binarySearch(nums,target,pivot+1,nums.length-1);
        }
        else
        {
            return binarySearch(nums,target,0,pivot-1);
        }
    }

    //Finding pivot
    public static int findPivot(int[] nums)
    {
        int start = 0;
        int end = nums.length-1;
        int mid=0;

        while(start<=end)
        {
             mid = start + (end-start)/2;

            if(mid<end && nums[mid] > nums[mid+1])  // adding min<end to avoid ArrayIndexOutOfBound
            {
                return mid;
            }

           if(mid>start && nums[mid] < nums[mid-1]) // adding min>start to avoid ArrayIndexOutOfBound
            {
                return mid-1;
            }

             if(nums[start]==nums[mid])
            {
                end=mid-1;
            }
             else if (nums[start]>nums[mid])
             {
                 end=mid-1;
             }
            else
            {
                start=mid+1;
            }

        }
        return -1;
    }

    //Normal Binary search with start and end index
    public static int binarySearch(int[] mountainArr, int target, int start, int end)
    {

        while(start<=end)
        {
            int middle = start + (end-start)/2;

            if (target == mountainArr[middle])
            {
                return middle;
            }
            else if (target > mountainArr[middle]){
                start = middle+1;
            }
            else{
                end = middle -1 ;
            }
        }
        return -1;
    }

}
