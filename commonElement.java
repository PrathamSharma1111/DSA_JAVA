// Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
// Note: can you take care of the duplicates without using any additional Data Structure?

// Example 1:

// Input:
// n1 = 6; A = {1, 5, 10, 20, 40, 80}
// n2 = 5; B = {6, 7, 20, 80, 100}
// n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
// Output: 20 80
// Explanation: 20 and 80 are the only
// common elements in A, B and C.
import java.util.ArrayList;

public class commonElement {
   static  ArrayList<Integer> commonElements(int a[], int b[], int c[], int n1, int n2, int n3) 
    {
        // code here 
         ArrayList<Integer> ans=new ArrayList<>();int prev=Integer.MIN_VALUE;
        for(int i=0,j=0,k=0;i<n1&&j<n2&&k<n3;)
        { 
            if(a[i]==b[j]&&a[i]==c[k]){ 
                if(prev!=a[i])
                {
                   ans.add(a[i]);
                   prev=a[i];
                }
                
                i++;j++;k++;
            }
            else if(a[i]<b[j]) i++;
            else if(b[j]<c[k]) j++;
            else k++;
        }
        return ans;
    }
    public static void main(String[] args) {
      int  n1 = 6; int[] A = {1, 5, 10, 20, 40, 80};
       int  n2 = 5;int[] B = {6, 7, 20, 80, 100};
      int  n3 = 8; int[] C = {3, 4, 15, 20, 30, 70, 80, 120};
      ArrayList<Integer> res=commonElements(A,B,C,n1,n2,n3);

      for(int i=0;i<res.size();i++){
        System.out.print(res.get(i)+" ");
      }
    }
}
