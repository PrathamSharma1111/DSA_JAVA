// Given two sorted arrays arr1 and arr2 of size N and M respectively and an element K. The task is to find the element that would be at the kth position of the final sorted array.
 

// Example 1:

// Input:
// arr1[] = {2, 3, 6, 7, 9}
// arr2[] = {1, 4, 8, 10}
// k = 5
// Output:
// 6
// Explanation:
// The final sorted array would be -
// 1, 2, 3, 4, 6, 7, 8, 9, 10
// The 5th element of this array is 6.
// Example 2:
// Input:
// arr1[] = {100, 112, 256, 349, 770}
// arr2[] = {72, 86, 113, 119, 265, 445, 892}
// k = 7
// Output:
// 256
// Explanation:
// Final sorted array is - 72, 86, 100, 112,
// 113, 119, 256, 265, 349, 445, 770, 892
// 7th element of this array is 256.

import java.util.Arrays;

public class KthElement {
    public static long kthElement( int arr1[], int arr2[], int n, int m, int k) {
        
        int[] arr=new int[n+m];
        int j=0;
        for(int i=0;i<n;i++){
           arr[j++]=arr1[i]; 
        }
         for(int i=0;i<m;i++){
           arr[j++]=arr2[i]; 
        }
        Arrays.sort(arr);
        return (long)arr[k-1];
    }
    public static void main(String args[]){
      int  arr1[] = {2, 3, 6, 7, 9};
      int arr2[] = {1, 4, 8, 10};
        int k = 5;
        int n=arr1.length;
        int m=arr2.length;
        System.out.println(kthElement(arr1,arr2,n,m,k));
    }
}
