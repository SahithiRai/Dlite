import java.util.Arrays;

public class PartitionArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(canPartition(nums)); // Should print true
    }

    public static boolean canPartition(int[] nums) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        Arrays.sort(nums);

        int target = sum / 2;

        boolean[] dp = new boolean[target + 1];
        dp[0] = true;

        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] |= dp[j - num];
            }
        }

        return dp[target] && sum % 2 == 0;
    }
}
