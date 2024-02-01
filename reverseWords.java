// Given a String S, reverse the string without reversing its individual words. Words are separated by dots.

// Example 1:

// Input:
// S = i.like.this.program.very.much
// Output: much.very.program.this.like.i
// Explanation: After reversing the whole
// string(not individual words), the input
// string becomes
// much.very.program.this.like.i
// Example 2:

// Input:
// S = pqr.mno
// Output: mno.pqr
// Explanation: After reversing the whole
// string , the input string becomes
// mno.pqr
public class reverseWords {
    static String reverseWords(String S)
    {
        // code here 
        String s="";
        String[] arr=S.split("\\.");
        for(int i=arr.length-1;i>=0;i--){
            if(i==0){
            s=s+arr[i];
            }else {
               s=s+arr[i]+"."; 
            }
        }
        return s;
    }
    public static void main(String[] args) {
      String  S = "i.like.this.program.very.much";
      String S2=reverseWords(S);
       System.out.println(S2);
    }
}
