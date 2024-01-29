import java.util.Arrays;

public class Missing_number {
    public static int missingNumber(int array[], int n) {
        // Your Code Here
        int i;
        Arrays.sort(array);
        for( i=0;i<n-1;i++) {
                  if(array[i]!=i+1) {
                      return i+1;
                  }
        }
        return i+1;
    }

    public static void main(String[] args) {
        int[] arr={1,3,4,5,6};
        int n=arr.length;
        int num=missingNumber(arr,n);
        System.out.println(num);
    }
}
