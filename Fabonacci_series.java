 import java.util.*;
public class Fabonacci_series {
    public static int[] printFibb(int n) 
    {
        //Your code here
         int[] fib=new int[n];
         fib[0]=1;
        if(n==1){
            return fib;
        }
        fib[1]=1;
        for(int i=2;i<n;i++){
            fib[i]=fib[i-2]+fib[i-1];
        }
        return fib;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=printFibb(n);
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }
}
