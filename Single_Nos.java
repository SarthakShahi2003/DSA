public class Single_Nos {
    public static int Single(int[]arr){
        int result=0;
        for(int i=0;i<arr.length;i++){
            result=result^arr[i];
        }
        return result;
    }
    public static void main(String[] args) {
        int []arr={1,2,1,2,4};
        int ans=Single(arr);
        System.out.println("The Single Digit is:-"+ans);
    }
}
