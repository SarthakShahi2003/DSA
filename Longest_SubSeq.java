import java.util.Arrays;

public class Longest_SubSeq {
    public static int longestConsecutive(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        Arrays.sort(nums);
        int last_smaller = Integer.MIN_VALUE;
        int curr_count = 1;
        int longest = 1;

        for (int i = 0; i < n; i++) {
            if (nums[i] - 1 == last_smaller) {
                curr_count++;
                last_smaller = nums[i];
            } else if (nums[i] != last_smaller) {
                curr_count = 1;
                last_smaller = nums[i];
            }
            longest = Math.max(longest, curr_count);
        }

        return longest;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        int result = longestConsecutive(nums);
        System.out.println("The longest consecutive sequence is: " + result);
    }
}
