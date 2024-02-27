public class MissingNumber {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 5};
        int[] arr2 = {6, 1, 2, 8, 3, 4, 7, 10, 5};

        System.out.println("Missing element in arr1: " + findMissingNumber(arr1, 5));
        System.out.println("Missing element in arr2: " + findMissingNumber(arr2, 10));
    }

    public static int findMissingNumber(int[] arr, int N) {
        int expectedSum = N * (N + 1) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
