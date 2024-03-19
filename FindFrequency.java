// Given an Array Arr of N positive integers and an integer X. Return the frequency of X in the array.

 

// Example 1:

// Input:
// N = 5
// Arr = {1, 1, 1, 1, 1}
// X = 1
// Output: 
// 5
// Explanation: Frequency of 1 is 5.

// Example 2:

// Input:
// N = 6
// Arr = {1, 2, 3, 3, 2, 1}
// X = 2
// Output: 
// 2
// Explanation: Frequency of 2 is 2.
public class FindFrequency {
    static int findFrequency(int Arr[], int X){
        int count =0;
     for(int i=0; i<Arr.length;i++){
         
         if(Arr[i] == X){
             count++;
         }
     }
     return count;
 }
 public static void main(String[] args) {
  int  N = 5;
    int[] Arr = {1, 1, 1, 1, 1};
    int X = 1;
    System.out.println(findFrequency(Arr,X));
 }
}
