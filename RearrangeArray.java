public class RearrangeArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        rearrangeArray(arr);
        printArray(arr);
    }

    public static void rearrangeArray(int[] arr) {
        int n = arr.length;
        int maxIdx = n - 1;
        int minIdx = 0;
        int maxElement = arr[maxIdx] + 1;

        for (int i = 0; i < n; i++) {
            // If even index, pick maximum element
            if (i % 2 == 0) {
                arr[i] += (arr[maxIdx] % maxElement) * maxElement;
                maxIdx--;
            } else { // If odd index, pick minimum element
                arr[i] += (arr[minIdx] % maxElement) * maxElement;
                minIdx++;
            }
        }

        // Divide all elements by maxElement to get the modified elements
        for (int i = 0; i < n; i++) {
            arr[i] /= maxElement;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
