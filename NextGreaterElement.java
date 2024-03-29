import java.util.Stack;

public class NextGreaterElement {
     public static long[] nextLargerElement(long[] arr, int n)
    { 
        // Your code here
          Stack<Long> stack=new Stack<>();
        long [] res=new long[n];
        for(int i=n-1;i>=0;i--){
            while(stack.size()>0 && stack.peek()<=arr[i]){
                stack.pop();
            }
            if(stack.size()==0)
            res[i]=-1;
            else
            res[i]=stack.peek();
            
            stack.push(arr[i]);
        }
        return res;

    } 
    public static void main(String[] args) {
        long[] arr={1,2,1};
        int n=arr.length;
        long[] res=nextLargerElement(arr, n);
        for(int i=0;i<res.length;i++){
        System.out.print(res[i]+" ");
        }
    }
}
