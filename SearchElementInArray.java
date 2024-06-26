// Given an integer array and another integer element. The task is to find if the given element is present in array or not.

// Example 1:

// Input:
// n = 4
// arr[] = {1,2,3,4}
// x = 3
// Output: 2
// Explanation: There is one test case 
// with array as {1, 2, 3 4} and element 
// to be searched as 3.  Since 3 is 
// present at index 2, output is 2.
// Example 2:

// Input:
// n = 5
// arr[] = {1,2,3,4,5}
// x = 5
// Output: 4
// Explanation: For array elements 
// {1,2,3,4,5} element to be searched 
// is 5 and it is at index 4. So, the 
// output is 4.
public class SearchElementInArray {
    static int search(int arr[], int N, int X)
    {
        
        // Your code here
        int l=-1;
        // Your code here
        for(int i=0;i<N;i++){
            if(arr[i]==X){
                l=i;
                break;
            }
        }
        return l;
        
    }
    public static void main(String[] args) {
      int  n = 4;
        int arr[] = {1,2,3,4};
        int x = 3;
        System.out.println(search(arr,n,x));
    }
}
