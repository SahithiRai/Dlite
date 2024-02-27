public class FirstLastOccurrences {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 4, 5, 6};
        int x = 2;

        int[] occurrences = findFirstAndLastOccurrences(arr, x);
        System.out.println("First occurrence of " + x + ": " + occurrences[0]);
        System.out.println("Last occurrence of " + x + ": " + occurrences[1]);
    }

    public static int[] findFirstAndLastOccurrences(int[] arr, int x) {
        int[] result = {-1, -1};

        // Find the first occurrence of x
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                result[0] = mid;
                high = mid - 1; // Continue searching on the left side
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Find the last occurrence of x
        low = 0;
        high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x) {
                result[1] = mid;
                low = mid + 1; // Continue searching on the right side
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return result;
    }
}
