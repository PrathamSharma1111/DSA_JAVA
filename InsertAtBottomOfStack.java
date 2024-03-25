// You are given a stack st of n integers and an element x. You have to insert x at the bottom of the given stack. 

// Note: Everywhere in this problem, the bottommost element of the stack is shown first while priniting the stack.

// Example 1:

// Input:
// n = 5
// x = 2
// st = {4,3,2,1,8}
// Output:
// {2,4,3,2,1,8}
// Explanation:
// After insertion of 2, the final stack will be {2,4,3,2,1,8}.
// Example 2:

// Input:
// n = 3
// x = 4
// st = {5,3,1}
// Output:
// {4,5,3,1}
// Explanation:
// After insertion of 4, the final stack will be {4,5,3,1}.
import java.util.Stack;

public class InsertAtBottomOfStack {
     public static Stack<Integer> insertAtBottom(Stack<Integer> st, int x) {
         Stack<Integer> rt=new Stack<>();
        while(st.size()>0){
            rt.push(st.pop());
        }
        st.push(x);
        while(rt.size()>0){
            st.push(rt.pop());
        }
        return st;
    }
    public static void main(String[] args) {
      int  x = 4;
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(3);
        st.push(2);
        st.push(1);
        Stack<Integer> result=insertAtBottom(st,x);
        System.out.println(result);
    }
}
