// Given a string without spaces, the task is to remove duplicates from it.

// Note: The original order of characters must be kept the same. 

// Example 1:

// Input: S = "zvvo"
// Output: "zvo"
// Explanation: Only keep the first
// occurrence
// Example 2:

// Input: S = "gfg"
// Output: gf
// Explanation: Only keep the first
// occurrence
import java.util.HashSet;

public class RemoveDuplicates {
     static String removeDups(String S) {
        // code here
          HashSet<Character> s = new HashSet<>();
        String str = "";
        
        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            if(s.add(c)) {
                str += c;
            }
        }
                  return str;
    }
    public static void main(String[] args) {
      String  S = "gfg";
      System.out.println(removeDups(S));
    }
}
