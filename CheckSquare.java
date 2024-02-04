// Given a positive integer N, check if it is a perfect square or not.
// Note: Try to solve the question using only addition and subtraction operation.

 

// Example 1:

// Input:
// N = 35
// Output:
// 0
// Explanation:
// 35 is not a perfect 
// square.
 

// Example 2:

// Input:
// N = 49
// Output:
// 1
// Explanation:
// 49 is a perfect
// square.
public class CheckSquare {
    static int checkPerfectSquare(int N){
        // code here
         int s=0,e=N;
        while(s<=e){
            int mid=(s+e)/2;
            int val=mid*mid;
            if(val==N){
                return 1;
            }else if(val<N){
                s=mid+1;
            }else{
                e=mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int N=36;
        int res=checkPerfectSquare(N);
        if(res==0){
            System.out.println("Not a Perfect Square");
        }else{
            System.out.println("Perfect Square");
        }
    }
}
