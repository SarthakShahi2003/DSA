public class TwoSumVarTwo {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2]; // array to store the indices

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i; // store first index
                    result[1] = j; // store second index
                    return result; // return the result array
                }
            }
        }

        // if no such pair found, return -1, -1
        result[0] = -1;
        result[1] = -1;
        return result;
    }
     public static void main(String[] args) {
        TwoSumVarTwo obj = new TwoSumVarTwo();
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(nums, target);

        if (result[0] != -1) {
            System.out.println("Indices: " + result[0] + ", " + result[1]);
        } else {
            System.out.println("No valid pair found.");
        }
    }
}
