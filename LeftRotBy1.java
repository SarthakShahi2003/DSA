public class LeftRotBy1 {
    public static void rotate(int []arr1,int n){
        int temp=arr1[0];
        for(int i=0;i<n-1;i++){
            arr1[i]=arr1[i+1];
    }
            arr1[n-1]=temp;
    }
    public static void main(String[] args) {
        int []arr1={1,2,3,4,5,6};
        int n=arr1.length;
      
        rotate(arr1, n);
        for(int i=0;i<n;i++){
        System.out.print(arr1[i]);
        }
    }
}
