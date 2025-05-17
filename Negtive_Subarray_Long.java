public class Negtive_Subarray_Long {
    public static int NegAndPos(int []arr,int n,int k){

    int length=0;
        for(int i=0;i<n;i++){
            long sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                
            if(sum==k)
                length=Math.max(length, j-i+1);
            
            }
        }
        
        return length;

    }
    public static void main(String[] args) {
        int arr[]={1,-1,1};
        int n=arr.length;
        int k=1;
        int ans=NegAndPos(arr, n, k);
        System.out.println("The Longest Subarray is of Length:- "+ans);
    }
}
