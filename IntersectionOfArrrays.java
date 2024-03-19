// Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

 

// Example 1:

// Input: nums1 = [1,2,2,1], nums2 = [2,2]
// Output: [2]
// Example 2:

// Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
// Output: [9,4]
// Explanation: [4,9] is also accepted.
 
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArrrays {
     public static int[] intersection(int[] nums1, int[] nums2) {
        
        Set<Integer> set = new HashSet<>();
        for(int e : nums1) {
            set.add(e);
        }

        Set<Integer> set2 = new HashSet<>();
        for(int e : nums2) {
            set2.add(e);
        }

        set.retainAll(set2);
        int ans[] = new int[set.size()];
        int index = 0;
        for(int e : set) {
            ans[index] = e;
            index++;
        }
        return ans;
    }
    public static void main(String[] args) {
       int[] nums1 = {1,2,2,1}, nums2 = {2,2};
       int[] ans=intersection(nums1, nums2);
       for (int index = 0; index < ans.length; index++) {
        System.out.println(ans[index]+" ");
       }
    }
}
