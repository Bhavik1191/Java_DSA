package searchAlgos.binarySearch;

public class FindInMountainArr {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,4,3,2,1};
        int target = 4;

        System.out.println("Smallest index of target in Mountain array is : "+ ans(arr,target));

    }

    public static int ans(int[] mountainArr, int target)
    {
        //First divide the array in asc and desc
        // apply binaary search in asc with tartget
        // apply binary search in ddesc with target

        int peak = findPeak(mountainArr);

        int ascIndex = binarySearch(mountainArr,target,0, peak,true);

        if(ascIndex!=-1)
        {
            return ascIndex;
        }
        return binarySearch(mountainArr,target,peak+1, mountainArr.length-1,false);
    }

    public static int findPeak(int[] mountainArr)
    {
        int start = 0;
        int end = mountainArr.length-1;

        while(start<end)
        {
            int middle = start + (end-start)/2;

            if(mountainArr[middle]>mountainArr[middle+1])
            {
                end = middle;
            }
            else
            {
                start = start+1;
            }
        }
        return start;
    }

    public static int binarySearch(int[] mountainArr, int target, int start, int end, boolean isAsc)
    {


        while(start<=end)
        {
            int middle = start + (end-start)/2;

            if (target == mountainArr[middle])
            {
                return middle;
            }
            else if (target > mountainArr[middle]){
                if(isAsc)
                {
                    start = middle+1;
                }
                else
                {
                    end = middle-1;
                }

            }
            else{
                if(isAsc)
                {
                    end = middle -1 ;
                }
                else
                {
                    start = middle + 1;
                }
            }
        }
        return -1;
    }
}
