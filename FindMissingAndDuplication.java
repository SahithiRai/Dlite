public class FindMissingAndDuplicate {
    public static void main(String[] args) {
        int[] arr1 = {4, 3, 2, 7, 8, 2, 1, 5};
        int[] arr2 = {3, 1, 3};

        int[] result1 = findMissingAndDuplicate(arr1);
        System.out.println("Missing number: " + result1[0] + ", Duplicate number: " + result1[1]);

        int[] result2 = findMissingAndDuplicate(arr2);
        System.out.println("Missing number: " + result2[0] + ", Duplicate number: " + result2[1]);
    }

    public static int[] findMissingAndDuplicate(int[] arr) {
        int[] result = new int[2];
        int n = arr.length;

        // Calculate sum of elements and sum of squares
        long sum = (n * (n + 1)) / 2;
        long sumOfSquares = (n * (n + 1) * (2 * n + 1)) / 6;
        
        for (int num : arr) {
            sum -= num;
            sumOfSquares -= (long)num * num;
        }

        // Now, sum = A - B, and sumOfSquares = A^2 - B^2 = (A + B)(A - B)
        // We can use these equations to find A and B
        long sumDiff = sum;
        long sumSquaresDiff = sumOfSquares;
        
        // Calculate A + B
        long sumAB = sumSquaresDiff / sumDiff;

        // Now, we have A + B and A - B, we can find A and B
        int missingNumber = (int) ((sumAB + sumDiff) / 2);
        int duplicateNumber = (int) (sumAB - missingNumber);

        result[0] = missingNumber;
        result[1] = duplicateNumber;

        return result;
    }
}
