// Given a stack, the task is to sort it such that the top of the stack has the greatest element.

// Example 1:

// Input:
// Stack: 3 2 1
// Output: 3 2 1
// Example 2:

// Input:
// Stack: 11 2 32 3 41
// Output: 41 32 11 3 2
import java.util.Stack;

public class SortStack{
    	public static Stack<Integer> sort(Stack<Integer> s)
	{
		//add code here.
		int n = s.size();
		
		if(n == 0){
		    return s;
		}
		
		int curr = s.pop();
		
		Stack<Integer> sorted = sort(s);
		
		Stack<Integer> temp = new Stack<>();
		
		while(!sorted.isEmpty() && sorted.peek() > curr){
		    temp.push(sorted.pop());
		}
		
		sorted.push(curr);
		
		while(!temp.isEmpty()){
		    sorted.push(temp.pop());
		}
		
		return sorted;
	}
    public static void main(String[] args) {
        Stack<Integer> S=new Stack<>();
        S.push(11);
        S.push(1);
        S.push(17);
        S.push(4);
        S.push(8);
        S.push(2);
        Stack<Integer> result=sort(S);
        System.out.println(result);
    }
}