// You are given a string that represents the prefix form of a valid mathematical expression. Convert it to its postfix form.

// Example:

// Input: 
// *-A/BC-/AKL
// Output: 
// ABC/-AK/L-*
// Explanation: 
// The above output is its valid postfix form.
import java.util.Stack;

public class PrefixToPostfix {
    static String preToPost(String exp) {
        // code here
          Stack<String> val=new Stack<>();
        for(int i=exp.length()-1;i>=0;i--){
            char ch=exp.charAt(i);
            int ascii=(int)ch;
            if(ascii>=97 && ascii<=122){
                val.push(ch+"");
            }
             else if(ascii>=65 && ascii<=90){
                val.push(ch+"");
            }else{
                String v1=val.pop();
                String v2=val.pop();
                char op=ch;
                String t=v1+v2+op;
                val.push(t);
            }
        }
        return val.peek();
    }
    public static void main(String[] args) {
        String s="*-A/BC-/AKL";
        System.out.println(preToPost(s));
    }
}
