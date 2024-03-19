// Given an unsorted array arr[] of size n having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.

 

// Example 1:

// Input : 
// n = 8
// arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
// Output : 
// 1  3  2  11  6  -1  -7  -5

// Example 2:

// Input : 
// n = 8
// arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
// Output :
// 7  9  10  11  -5  -3  -4  -1
public class MoveAllNegative {
    public static void segregateElements(int arr[], int n)
    {
        // Your code goes here
        int[] A = new int[n];  
        int j=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                A[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<0){
                A[j]=arr[i];
                j++;
            }
        }
        for(int i=0;i<n;i++)
            arr[i] = A[i];
        
    }
    public static void main(String[] args) {
      int  n = 8;
      int arr[] = {1, -1, 3, 2, -7, -5, 11, 6 };
      segregateElements(arr, n);
      for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
      }
    }
}
