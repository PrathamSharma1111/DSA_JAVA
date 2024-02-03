// Given an array A containing 2*N+2 positive numbers, out of which 2*N numbers exist in pairs whereas the other two number occur exactly once and are distinct. Find the other two numbers. Return in increasing order.

// Example 1:

// Input: 
// N = 2
// arr[] = {1, 2, 3, 2, 1, 4}
// Output:
// 3 4 
// Explanation:
// 3 and 4 occur exactly once.
// Example 2:

// Input:
// N = 1
// arr[] = {2, 1, 3, 2}
// Output:
// 1 3
// Explanation:
// 1 3 occur exactly once.
import java.util.Arrays;
import java.util.HashMap;

public class NonRepeatingNumber {
    public static int[] singleNumber(int[] nums)
    {
        // Code here
         HashMap<Integer,Integer> hm= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int[] ans = new int[2];
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(hm.get(nums[i])==1){
                ans[j++]=nums[i];
            }
        }
        Arrays.sort(ans);
        return ans;
    }
    public static void main(String[] args) {
     int   N = 2;
     int arr[] = {1, 2, 3, 2, 1, 4};
     int result[]=singleNumber(arr);
     for(int i=0;i<result.length;i++){
         System.out.print(result[i]+" ");
     }
    }
}
