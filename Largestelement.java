public class Largestelement {
    public static int largest(int arr[], int n)
    {
        int l=Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
            if(arr[i]>l) l=arr[i];
        }
        return l;
    }
    public static void main(String[] args) {
        int arr[]={3,5,7,1,9,1};
        int n=arr.length;
        int largestElement=largest(arr,n);
        System.out.println(largestElement);
    }
}
