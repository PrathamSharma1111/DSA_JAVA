// You are given a string S, the task is to reverse the string using stack.

 

// Example 1:


// Input: S="GeeksforGeeks"
// Output: skeeGrofskeeG
import java.util.Stack;

public class ReverseStringUsingStack {
     public static String reverse(String S){
        //code here
         Stack<Character> s = new Stack<>();
        for(int i=0; i<S.length(); i++) {
            s.push(S.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()) {
            sb.append(s.pop());
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String S="GeeksforGeeks";
        System.out.println(reverse(S));
    }
}
