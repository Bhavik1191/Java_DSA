package searchAlgos.binarySearch;

//https://leetcode.com/problems/split-array-largest-sum/
public class SplitArrayLargestSum {

    public static void main(String[] args) {

        int[] arr = {1,4,4,};
        int m = 3;

        System.out.println("Max num : "+ splitArray(arr,m));
    }

    public static int splitArray(int[] nums, int m) {

        // Part -1 : understand the question
        // We need to find a sum of max amongst the lowest in all possible combination of max
        /**
         * for example arr = [3,4,1,2]  and m=2
         * case 1 : [3] & [4,1,2] ==> max sum : 7
         * case 2 : [3,4] & [1,2] ==> max sum : 7
         * case 3 : [3,4,1] & [2] ==> max sum : 8
         *
         * Ans is : 7
         */

        // Part 2 : How can we get the solution
        /**
         *
         * Just trying to find range
         * Partition m can be 1 to N where N can be number of elements in array
         *
         * case 1 : m = 1 ==> Sum of all the elements in array
         * Ex : [3,4,1,2] max = 10 ==> Ans is : 10
         *
         * case 2: m=N ==> Highest element in the array
         * Ex : [3,4,1,2] ==> [3],[4],[1],[2] max is 4 ==> Ans is : 4
         *
         * So here we have minimum ans = 4 and maximum ans = 10
         * No matter what is the value of m, your ans lies in min to max
         *
         * Now we have range of [min, max] ==> [4,10]
         * We will apply binary search on this range to find the ans
         */



        int start =0;
        int end =0;

        for (int i = 0; i < nums.length; i++) {
            start=Math.max(start,nums[i]);  //in the end of loop this will contain the max element from the array
            end += nums[i];
        }

        //Part 3 : Binary search on min to max value of possible ans
        /**
         * Here we are not applying binary search based on index but it is based on values.
         *
         * So in our case : start = 4 & end =10
         * mid = (s+e)/2 ==> (4+10)/2 ==> 7
         *
         * Now try to split the array with mid as max sum and find how many pieces
         * Ex : [3,4] & [1,2] ==> total pieces are 2
         * Here if I add [3,4,1] in same array then it becomes 8. Sum of part can not exceed the mid.
         *
         * now if pieces <= m then it looks like individual sum is large. Because in problem it given to divide in m array.
         * So we will try to reduce the sum
         *
         * if pieces >= m then we will try to increase the sum.
         *
         * In pur case m = 2 so so pieces <= m is true so we need to reduce the sum.
         * e = mid;
         *
         * mid = (s+e)/2 ==> (4+7)/2 ==> 5
         * Split the array according to new mid
         * [3],[4],[1,2] ==> pieces =3 & m=2
         *
         * So we need to increase the mid
         * s = mid+1
         * mid = (6+7)/2 ==> 6
         * Split the array according to new mid
         * [3],[4],[1,2] ==> pieces = 3 and m =2
         *
         * So we need to increase the mid
         * s = mid+1
         * Now this is the exit condition.
         * Here s=e=7
         *
         * When Start & End both are equal then that is the sum we are looking for
         *
         */



        //binary search

        while (start<end)
        {
            int mid = start + (end-start)/2;

            //calculate how many pieces you can divide this in with this max sum

            int sum =0;
            int pieces = 1;

            for (int num:nums) {

                if (sum + num > mid) {
                    //you can not add num in this sub array so make new one
                    //Say you add this num in new subarray then it will be sum=num
                    sum = num;
                    pieces++;
                } else {
                    sum += num;
                }
            }

            if(pieces>m)
            {
                start=mid+1;
            }
            else {
                end=mid;
            }
        }
        return end;  //start==end so return anything

    }
}
