package searchAlgos.binarySearch;

public class SqurtX {

    public static void main(String[] args) {
        int x = 123;
        System.out.println("Squrt of x : "+mySqrt(x));
    }

    public static int mySqrt(int x) {
        int start = 0;
        int end = x;
        long mid = 0;
        while(start <= end){
            mid = (start + end)/2;
            if( mid*mid > x){
                end = (int)mid - 1;
            }
            else if( mid*mid < x){
                start = (int)mid+1;
            }
            else{
                return (int)mid;
            }
        }
        return end;
    }
}
