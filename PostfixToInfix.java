// You are given a string that represents the postfix form of a valid mathematical expression. Convert it to its infix form.

// Example:

// Input:
// ab*c+ 
// Output: 
// ((a*b)+c)
// Explanation: 
// The above output is its valid infix form.
import java.util.Stack;

public class PostfixToInfix {
    static String postToInfix(String exp) {
          // code here
        Stack<String> val=new Stack<>();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            int ascii=(int)ch;
            if(ascii>=97 && ascii<=122){
                val.push(ch+"");
            }
             else if(ascii>=65 && ascii<=90){
                val.push(ch+"");
            }else{
                String v2=val.pop();
                String v1=val.pop();
                char op=ch;
                String t="("+v1+op+v2+")";
                val.push(t);
            }
        }
        return val.peek();
    }
    public static void main(String[] args) {
        String S="ab*c+";
        System.out.println(postToInfix(S));
    }
}
