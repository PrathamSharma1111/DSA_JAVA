// Given string S representing a postfix expression, the task is to evaluate the expression and find the final value. Operators will only include the basic arithmetic operators like *, /, + and -.

 

// Example 1:

// Input: S = "231*+9-"
// Output: -4
// Explanation:
// After solving the given expression, 
// we have -4 as result.
// Example 2:

// Input: S = "123+*8-"
// Output: -3
// Explanation:
// After solving the given postfix 
// expression, we have -3 as result.
import java.util.Stack;

public class EvaluationOfPostfix {
    public static int evaluatePostFix(String S)
    {
        // Your code here
           Stack<Integer> val=new Stack<>();
        for(int i=0;i<S.length();i++){
            char ch=S.charAt(i);
            int ascii=(int)ch;
            if(ascii>=48 && ascii<=57){
                val.push(ascii-48);
            }else{
                int v2=val.pop();
                int v1=val.pop();
                if(ch=='+')val.push(v1+v2);
                if(ch=='-')val.push(v1-v2);
                if(ch=='*')val.push(v1*v2);
                if(ch=='/')val.push(v1/v2);
            }
        }
        return val.peek();
    }
    public static void main(String[] args) {
      String  S = "231*+9-";
      System.out.println(evaluatePostFix(S));
    }
}
