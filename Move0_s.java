public class Move0_s {

        public void moveZeroes(int[] nums) {
            int j = 0;
            
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] != 0) {
                    if (i != j) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                    }
                    j++;
                }
            }
        }
        public static void main(String[] args) {
            Move0_s solution = new Move0_s();

            // 2. Define the input array nums
            int[] nums = {0, 1, 0, 3, 12};
    
            // 3. Call the method to move zeroes
            solution.moveZeroes(nums);
    
            // 4. Print the updated array
            for (int i = 0; i < nums.length; i++) {
                System.out.print(nums[i] + " ");
            }
        }
    
}
