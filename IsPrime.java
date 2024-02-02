public class IsPrime {
    static int isPrime(int n){
        // code here
         if(n<=1){
            return 0;
        }
        
        int count=0;
        for(int div=2;div*div <= n; div++){
            if(n%div==0){
                count++;
                break;
            }
        
        }
        if (count==0){
            return 1;
        }
        else
             return 0;
    }
    public static void main(String[] args) {
        int n=11;
        System.out.println(isPrime(n));
    }
}
