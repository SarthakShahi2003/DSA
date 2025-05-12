public class Kadanes_algo {

    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += nums[j];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum is: " + result);
    }
}

// optimal approach(Kadanes Algo)

// import java.util.*;

// public class Main {
//     public static long maxSubarraySum(int[] arr, int n) {
//         long maxi = Long.MIN_VALUE; // maximum sum
//         long sum = 0;

//         for (int i = 0; i < n; i++) {

//             sum += arr[i];

//             if (sum > maxi) {
//                 maxi = sum;
//             }

//             // If sum < 0: discard the sum calculated
//             if (sum < 0) {
//                 sum = 0;
//             }
//         }

//         // To consider the sum of the empty subarray
//         // uncomment the following check:

//         //if (maxi < 0) maxi = 0;

//         return maxi;
//     }

//     public static void main(String args[]) {
//         int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4};
//         int n = arr.length;
//         long maxSum = maxSubarraySum(arr, n);
//         System.out.println("The maximum subarray sum is: " + maxSum);

//     }

// }

