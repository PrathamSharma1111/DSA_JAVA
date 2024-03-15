// Given an array A of N integers. You have to find whether a combination of four elements in the array whose sum is equal to a given value X exists or not.
 

// Example 1:

// Input:
// N = 6
// A[] = {1, 5, 1, 0, 6, 0}
// X = 7
// Output:
// 1

// Explantion:
// 1, 5, 1, 0 are the four elements which makes sum 7.
import java.util.Arrays;

public class FourElements {
   static  boolean find4Numbers(int A[], int n, int X) 
    {
        if(n<4)
       return false;
      
      
      
      Arrays.sort(A);
       
       
       for(int i=0;i<=n-4;i++){
           for(int j=i+1;j<=n-3;j++){
               int low=j+1;
               int high=n-1;
               while(low<high){
                   int sum=A[low]+A[high]+A[i]+A[j];
                   if(sum==X)
                   return true;
                   else if(sum<X)
                   low++;
                   else 
                   high--;
               }
           }
       }
       return false;
    }
    public static void main(String[] args) {
     int   N = 6;
      int[] A= {1, 5, 1, 0, 6, 0};
       int  X = 7;
       System.out.println(find4Numbers(A, N, X));
    }
}
