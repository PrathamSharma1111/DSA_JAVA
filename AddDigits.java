// Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

 

// Example 1:

// Input: num = 38
// Output: 2
// Explanation: The process is
// 38 --> 3 + 8 --> 11
// 11 --> 1 + 1 --> 2 
// Since 2 has only one digit, return it.
// Example 2:

// Input: num = 0
// Output: 0
public class AddDigits {
    public  static int addDigits(int n) {
        int s=0;
       while(n!=0 ){
           s+=n%10;
           n=n/10;
           if(s>9 && n==0){
               n=s;
               s=0;
           }
       }
       return s;
   }
   public static void main(String[] args) {
    int num = 38;
    System.out.println(addDigits(num));
   }
}
