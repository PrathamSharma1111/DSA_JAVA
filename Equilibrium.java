// Given an array A of n non negative numbers. The task is to find the first equilibrium point in an array. Equilibrium point in an array is an index (or position) such that the sum of all elements before that index is same as sum of elements after it.

// Note: Return equilibrium point in 1-based indexing. Return -1 if no such point exists. 

// Example 1:

// Input: 
// n = 5 
// A[] = {1,3,5,2,2} 
// Output: 
// 3 
// Explanation:  
// equilibrium point is at position 3 as sum of elements before it (1+3) = sum of elements after it (2+2). 
// Example 2:

// Input:
// n = 1
// A[] = {1}
// Output: 
// 1
// Explanation:
// Since there's only element hence its only the equilibrium point.
public class Equilibrium {
    public static int equilibriumPoint(long arr[], int n) {

        // Your code here
         int sum =0;
            int left =0;
            for(int i=0; i<n; i++){
                sum+=arr[i];
            }
            for(int i=0; i<n; i++){
                sum-=arr[i];
                if(sum == left){
                    return i+1;
                }
                
                else{
                    left +=arr[i];
                }
            }
        return -1;
    }
    public static void main(String[] args) {
      int  n = 5 ;
long[] A = {1,3,5,2,2} ;
      System.out.println(equilibriumPoint(A,n));
    }
}
