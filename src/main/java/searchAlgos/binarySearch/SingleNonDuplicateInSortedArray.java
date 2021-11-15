package searchAlgos.binarySearch;

public class SingleNonDuplicateInSortedArray {

    //https://leetcode.com/problems/single-element-in-a-sorted-array/
    public static void main(String[] args) {

        int[] arr = {1, 8, 8};

        System.out.println("Int number is : " + singleNonDuplicate(arr, 0, arr.length - 1));
    }

    /**
     * There is only one single element is present in the array
     * So ideally if we put all elements in pair it would be, 1st ele is on even position and 2nd ele is on odd position
     * Ex [1,1,2,2]
     *
     * Our first approach is find the number is 1st element of pair or 2nd.
     * Then based on the position below scenarios take place.
     *
     * If first element is in even pos. ----> Left side is in correct format. Need to check in Right
     * If first element is in odd pos. ----> Left side is not in correct format. Need to check in Left
     *
     * If Second element is in odd pos. ----> Left side is in correct format. Need to check in Right
     * If Second element is in even pos. ----> Left side is not in correct format. Need to check in Left
     *
     * @param nums
     * @param start
     * @param end
     * @return
     */


    public static int singleNonDuplicate(int[] nums, int start, int end) {

        while (start < end) {
            int mid = start + (end - start) / 2;

            // If middle element does not have any pair then we can return middle element
            if (mid > start && mid < end && nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) {
                return nums[mid];
            }

            // If middle is matching with right element then mid is the 1st element of pair
            if (nums[mid] == nums[mid + 1]) {


                // if 1st element is in odd position... we need to check in left
                // if the 1st element is in even position... we need to check in right
                if (mid % 2 != 0) {
                    end = mid;
                } else {
                    start = mid +2;
                }
            }
            // else middle is matching with left element then mid is the 2nd element of pair
            else
                {
                // if 2nd element is in the odd position... we need to check in right
                // if 2nd element is in even position.... we need to check in left
                if (mid % 2 != 0) {
                    start = mid+1;
                } else {
                    end=mid-2;
                }
            }
        }
        return nums[start];
    }
}
