package searchAlgos.binarySearch;

public class FindSmallestLetterThanTarget {

    //https://leetcode.com/problems/find-smallest-letter-greater-than-target/
    public static void main(String[] args) {
        char[] letters = {'e','e','e','e','e','e','e','f','j'};
        char target = 'e';

        System.out.println("Smallest letter thant Target is : "+ nextGreatestLetter(letters,target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {


        int start = 0;
        int end = letters.length-1;

        while(start <= end)
        {
           int middle = (end+start)/2;

             if(target>=letters[middle])
            {
                start = middle+1;
            }
            else
            {
                end=middle-1;
            }

            //Skipping the '=' condition because in both the condition we have to increment the start
        }

        //As letters are wrap around, if target is not in the range then we will always return the first element of array.
        if(start>letters.length-1)
            return letters[0];
        return letters[start];
    }
}
