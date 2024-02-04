// Given an array of N strings, find the longest common prefix among all strings present in the array.


// Example 1:

// Input:
// N = 4
// arr[] = {geeksforgeeks, geeks, geek,
//          geezer}
// Output: gee
// Explanation: "gee" is the longest common
// prefix in all the given strings.
// Example 2:

// Input: 
// N = 2
// arr[] = {hello, world}
// Output: -1
// Explanation: There's no common prefix
// in the given strings.
public class longestCommonPrefixInArray {
  static  String longestCommonPrefix(String arr[], int n){
        // code here
        String CommonPrefix = arr[0];
        for(int i=1;i<n;i++){
            int x=0;
            String cp="";
            while(x<CommonPrefix.length() && x<arr[i].length() && CommonPrefix.charAt(x)==arr[i].charAt(x)){
                
                cp+=arr[i].charAt(x);
                x++;
            }
            // System.out.println(cp);
            if(cp.equals(CommonPrefix)==false){
                    CommonPrefix = cp;
                }
        }
        return (CommonPrefix=="")?"-1":CommonPrefix;
    }
    public static void main(String[] args) {
        int N = 4;
        String[] arr = {"geeksforgeeks", "geeks", "geek",
                  "geezer"};
         System.out.println(longestCommonPrefix(arr,N));         
    }
}
