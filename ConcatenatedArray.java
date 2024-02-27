import java.util.Arrays;

public class ConcatenatedArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1};
        int[] ans = getConcatenatedArray(nums);
        System.out.println(Arrays.toString(ans)); // [1, 2, 1, 1, 2, 1]
    }

    public static int[] getConcatenatedArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        // Copy elements from nums to ans
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }
}
