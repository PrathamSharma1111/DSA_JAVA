// Given an unsorted array Arr of size N of positive integers. One number 'A' from set {1, 2,....,N} is missing and one number 'B' occurs twice in array. Find these two numbers.

// Example 1:

// Input:
// N = 2
// Arr[] = {2, 2}
// Output: 2 1
// Explanation: Repeating number is 2 and 
// smallest positive missing number is 1.
// Example 2:

// Input:
// N = 3
// Arr[] = {1, 3, 3}
// Output: 3 2
// Explanation: Repeating number is 3 and 
// smallest positive missing number is 2.
import java.util.HashSet;

public class missingAndRepeating {
   static int[]  findTwoElement(int nums[], int n) {
         HashSet<Integer> set = new HashSet<>();
        int expectedSum = n * (n + 1) / 2; // Sum of natural numbers from 1 to n
        int actualSum = 0;
        int repeatingElement = -1;

        for (int num=0;num<n;num++) {
            if (!set.add(nums[num])) {
                repeatingElement = nums[num];
            }
            actualSum += nums[num];
        }

        int missingElement = expectedSum - actualSum + repeatingElement;

      int[] arr=new int[2];
        arr[0]=repeatingElement;
        arr[1]=missingElement;
    return arr;
    }
    public static void main(String[] args) {
        int[] arr={1, 3, 3};
        int n=arr.length;
        int[] result=findTwoElement(arr,n);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }

}
