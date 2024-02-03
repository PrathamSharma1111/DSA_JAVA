// Given an integer n, return the number of prime numbers that are strictly less than n.
// Example 1:
// Input: n = 10
// Output: 4
// Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
// Example 2:
// Input: n = 0
// Output: 0
// Example 3:
// Input: n = 1
// Output: 0
 import java.util.Arrays;

public class CountPrime {
     public static int countPrimes(int n) {
         if(n<2){
            return 0 ;
        }
        boolean isPrime[] = new boolean[n+1];
        Arrays.fill(isPrime , true);  
        isPrime[0] = false;
        isPrime[1] = false;
        for(int i=2 ; i*i<=n ; i++){
            for(int j = 2*i;j<=n;j+=i){
                isPrime[j] = false;
            }
        }
        int count=0;
        for(int i=0;i<n;i++){
            if(isPrime[i]==true){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(countPrimes(n));
    }
}
