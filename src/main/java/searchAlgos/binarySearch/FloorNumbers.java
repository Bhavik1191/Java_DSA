package searchAlgos.binarySearch;

public class FloorNumbers {

        public static void main(String[] args) {

            int[] arr = {2,4,7,9,13,14,16,18};
            int target = 1;


            System.out.println("Ceiling of the given number is : "+ getFloorNumber(arr, target,0,arr.length-1 ));
        }

        private static int getFloorNumber(int[] arr, int target,int start, int end) {

            int middle = 0;

            //what if target is lesser than least number in array
            if(target<arr[0])
                return -1;

            while (start <= end)
            {
                middle = (end+start)/2;
                if(target>arr[middle])
                {
                    start = middle+1;
                }
                else if(target==arr[middle])
                {
                    return arr[middle];
                }
                else
                {
                    end = middle-1;
                }
            }
            return arr[end];
        }
}
