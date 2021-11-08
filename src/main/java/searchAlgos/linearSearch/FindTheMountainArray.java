package searchAlgos.linearSearch;

public class FindTheMountainArray {
    public static void main(String[] args) {

        int[] arr = {0,1,0};
        System.out.println("Mountain array size is : "+peakIndexInMountainArray(arr));
    }

    public static int peakIndexInMountainArray(int[] arr) {

        int ans = 0;
        for(int i=0; i<arr.length-1; i++)
        {
            if(arr[i]<arr[i+1])
            {
                ans++;
            }
        }
        return ans;
    }
}
