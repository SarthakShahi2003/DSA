public class ArrayisSorted {

    public static boolean Issorted(int []arr,int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String[] args) {
        
        int []arr={5,6,7,8,9,10};
        int n=5;
        System.out.println(Issorted(arr,n));
    

    }
}