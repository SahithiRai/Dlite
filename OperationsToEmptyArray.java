import java.util.Arrays;

public class OperationsToEmptyArray {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2};
        int operations = minOperations(nums);
        System.out.println("Number of operations: " + operations);
    }

    public static int minOperations(int[] nums) {
        int operations = 0;
        int minIndex = findMinIndex(nums);

        while (nums.length > 0) {
            if (minIndex == 0) {
                // If the first element has the smallest value, remove it
                nums = Arrays.copyOfRange(nums, 1, nums.length);
            } else {
                // Otherwise, put the first element at the end of the array
                int firstElement = nums[0];
                nums = Arrays.copyOfRange(nums, 1, nums.length);
                nums = Arrays.copyOf(nums, nums.length + 1);
                nums[nums.length - 1] = firstElement;
            }

            // Recalculate the index of the minimum element
            minIndex = findMinIndex(nums);
            operations++;
        }

        return operations;
    }

    public static int findMinIndex(int[] nums) {
        int minIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
}
