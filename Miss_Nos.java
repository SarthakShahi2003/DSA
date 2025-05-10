public class Miss_Nos {
    public static int Missing_Nos(int []arr){
        for(int i=0;i<arr.length;i++){
                if(arr[i+1]-arr[i]>=2){
                    return arr[i]+1;
                }
        }

        return 0;
    }
        
        public static void main(String[] args) {
            int []arr={1,2,3,4,5,6,7,9};

            int missing=Missing_Nos(arr);
            
                System.out.println("The Final array is:-"+missing);
            
            
        }
    }
    /*
        2nd Approach(Better One)


        class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        
        // Step 1: Calculate expected sum of first n natural numbers
        int expectedSum = n * (n + 1) / 2;
        
        // Step 2: Calculate actual sum from the array
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            actualSum = actualSum + nums[i];  // beginner-friendly form
        }

        // Step 3: Missing number is the difference
        return expectedSum - actualSum;
    }
}

     */


